package com.miriamlaurel.wontfix.network

import akka.actor.{IOManager, Actor, IO}
import java.net.InetSocketAddress
import akka.util.ByteString
import com.miriamlaurel.wontfix.codec.FixCodec
import com.miriamlaurel.wontfix.dictionary.FixDictionary
import xml.XML

object FixIteratees {

  val codec = new FixCodec("FIXT.1.1", new FixDictionary(XML.load(this.getClass.getResource("/FIX50.xml"))))
  val BEGIN_TAG = ByteString("8")
  val SOH = ByteString(1)

  def readMessage = for {
    junk <- IO.takeUntil(BEGIN_TAG)
    versionTag <- IO.takeUntil(SOH)
    bodyLengthTag <- IO.takeUntil(SOH)
    length = getIntValue(bodyLengthTag)
    body <- IO.take(length)
    checksumTag <- IO.takeUntil(SOH)
  } yield codec.decode(body)

  private def getIntValue(field: ByteString): Int = field.splitAt(1)._2.toString().toInt

}

class FixServer(port: Int) extends Actor {
  val state = IO.IterateeRef.Map.async[IO.Handle]()(context.dispatcher)

  override def preStart {
    IOManager(context.system).listen(new InetSocketAddress(port))
  }

  def receive = {
    case IO.NewClient(server) => {
      val socket = server.accept()
      state(socket).flatMap(_ => FixServer.processRequest(socket))
    }
  }
}

object FixServer {
  def processRequest(socket: IO.SocketHandle): IO.Iteratee[Unit] = ???
}