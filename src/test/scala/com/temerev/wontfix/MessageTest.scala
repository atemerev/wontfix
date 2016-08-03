package com.temerev.wontfix

import java.util.UUID

import org.scalatest.FunSuite
import com.temerev.wontfix.fix44._
import com.temerev.wontfix.fix44.messages._

class MessageTest extends FunSuite {
  test("market data request construction") {
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
      Price -> 72.014
    )
    println(mdRequest)
  }
}
