package com.temerev.wontfix

import java.util.UUID

import com.temerev.wontfix.fix44._
import com.temerev.wontfix.fix44.messages._
import org.threeten.bp._
import scala.scalajs.js.JSApp

object TestApp extends JSApp {
  override def main(): Unit = {
    val mdRequest = Fix(
      MsgType -> MarketDataRequest,
      MDReqID -> UUID.randomUUID().toString,
      SubscriptionRequestType -> 1, // snapshot + updates
      MarketDepth -> 0,
      MDUpdateType -> 0, // full refresh
      NoMDEntryTypes -> FixGroup(
        Fix(MDEntryType -> 0), Fix(MDEntryType -> 1)
      ),
      NoRelatedSym -> FixGroup(
        Fix(SecurityID -> 4001, SecurityIDSource -> 8),
        Fix(SecurityID -> 4002, SecurityIDSource -> 8),
        Fix(SecurityID -> 4004, SecurityIDSource -> 8)
      ),
      Price -> 72.014,
      TransactTime -> Instant.now
    )
    println(mdRequest)
    println(new String(mdRequest.toBytes))
    println(mdRequest.getGroup(NoRelatedSym, 1).getInt(SecurityID))
    println(mdRequest.getDouble(Price))
  }
}
