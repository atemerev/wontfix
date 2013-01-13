package com.miriamlaurel.wontfix.network

import akka.actor._
import akka.util.ByteString
import java.net.InetSocketAddress
import com.miriamlaurel.wontfix.codec.FixCodec
import com.miriamlaurel.wontfix.dictionary.FixDictionary
import com.miriamlaurel.wontfix.parse.Parser
import com.miriamlaurel.wontfix.structure.FixMessage

object FixConstants {
  val LF = ByteString("\n")
  val SOH = ByteString(1)
  val BEGIN_TAG = ByteString("8")
  val EOM = SOH ++ ByteString("10=")
}

object FixIteratees {
  import FixConstants._

  val codec = new FixCodec("FIXT.1.1", new FixDictionary("FIX50.xml"))
  val parser = new Parser(codec.dictionary)

  def readMessage = for {
    junk ← IO.takeUntil(SOH)
    version ← IO peek 1 flatMap {
      case BEGIN_TAG ⇒ IO takeUntil(SOH)
      case _  => sys.error("Not implemented")
    }
    bodyLength ← IO.takeUntil(SOH)
    msgType ← IO.takeUntil(SOH)
    rest ← IO.takeUntil(EOM)
  } yield {
    val versionTag = codec.parseField(version)
    val msgTypeTag = codec.parseField(msgType)
    val fields = ascii(rest).split(1.toChar).map(field => codec.parseField(ByteString(field)))
    FixMessage(msgTypeTag.value.toString, parser.parse(fields))
  }

  def readRequest2 = for(line ← IO takeUntil LF) yield ascii(line)
  def ascii(bytes: ByteString): String = bytes.decodeString("US-ASCII").trim
}

class FixAcceptor(port: Int) extends Actor {

  val state = IO.IterateeRef.Map.async[IO.Handle]()(context.dispatcher)

  override def preStart {
    IOManager(context.system) listen new InetSocketAddress(port)
  }

  def receive = {
    case IO.NewClient(server) ⇒
      val socket = server.accept()
      state(socket) flatMap (_ ⇒ FixAcceptor.processRequest(socket))

    case IO.Read(socket, bytes) ⇒
      state(socket)(IO Chunk bytes)

    case IO.Closed(socket, cause) ⇒
      state(socket)(IO.EOF)
      state -= socket
  }
}

object FixAcceptor {
  import FixIteratees._

  def processRequest(socket: IO.SocketHandle): IO.Iteratee[Unit] =
    IO repeat {
      for {
        request ← readRequest2
      } yield {
        socket write ByteString(request.toString.reverse).compact
      }
    }
}

object Main extends App {
  val system = ActorSystem()
  val server = system.actorOf(Props(new FixAcceptor(8099)))
}
