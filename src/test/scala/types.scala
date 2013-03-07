package com.miriamlaurel.wontfix.test.types

import org.scalatest.FunSuite
import com.miriamlaurel.wontfix.types._
import com.miriamlaurel.wontfix.structure._
import java.text.SimpleDateFormat
import xml.XML
import com.miriamlaurel.wontfix.dictionary.FixDictionary
import com.miriamlaurel.wontfix.parse.Parser
import java.util.{Date, TimeZone}
import com.miriamlaurel.wontfix.structure.FixComponent
import com.miriamlaurel.wontfix.versions.fix50.OrdType

class FixTypesSuite extends FunSuite {

  private val sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS")
  sdf.setTimeZone(TimeZone.getTimeZone("UTC"))
  private val someDate = sdf.parse("2011-07-26 19:22:00.273")

  private val instrument =  FixField(55, "EUR/USD")

  private val quotes = FixGroup(268,
    List(FixField(269, '0'), FixField(270, Price("1.40546")), FixField(271, Qty("1000000"))),
    List(FixField(269, '1'), FixField(270, Price("1.40550")), FixField(271, Qty("1000000")))
  )
  private val timestamp = FixField(52, UTCTimestamp(someDate))
  private val snapshot = FixComponent(timestamp, instrument, quotes)

  private val raw = Seq[FixField](timestamp, FixField(55, "EUR/USD"), FixField(268, 2),
    FixField(269, '0'), FixField(270, Price("1.40546")), FixField(271, Qty("1000000")),
    FixField(269, '1'), FixField(270, Price("1.40550")), FixField(271, Qty("1000000"))
  )

  private val dict = new FixDictionary(XML.load(this.getClass.getResource("/FIX50.xml")))

  test("some simple equality tests") {
    assert(FixInteger(42) === FixInteger(42))
    assert(FixChar('f') === FixChar('f'))
    assert(Country("US") === Country("US"))
    assert(FixFloat("3.14") === FixFloat("3.14")) // we _must_ be able to compare floats like this
    assert(Price("1.12030") === Price("1.1203"))
    val now = new Date
    val now2 = new Date(now.getTime)
    assert(UTCTimestamp(now) === UTCTimestamp(now2))
  }

  test("complex FIX structure flattens correctly") {
    assert ("52=20110726-19:22:00.273 | 55=EUR/USD | 268=2 | 269=0 | 270=1.40546 | 271=1000000 | 269=1 | 270=1.40550 | 271=1000000" ===
      snapshot.toString)
  }

  test("timezone serialization") {
    val ts = TZTimestamp(someDate, TimeZone.getTimeZone("GMT+3:00"))
    assert(ts === TZTimestamp(ts.toBytes))
    val tzTime = TZTimeOnly(18, 7, 36, TimeZone.getTimeZone("GMT+1"))
    assert(tzTime === TZTimeOnly(tzTime.toBytes))
  }
  
  test("FIX dictionary") {
    assert(dict.isGroupTag(TagNum(73)))
    assert(!dict.isGroupTag(TagNum(52)))
    assert(dict.getAllowedTags(TagNum(73)) === Set(848, 120, 544, 21, 1, 77, 44,
      59, 529, 1080, 110, 160, 1081, 376, 60, 81, 590, 121, 11, 377, 54, 1133, 229,
      849, 75, 775, 1090, 117, 70, 192, 114, 423, 40, 355, 583, 354, 1092, 854, 100,
      581, 427, 582, 660, 64, 528, 494, 526, 140, 847, 193, 1091, 1089, 99, 63, 589,
      635, 126, 67, 168, 23, 203, 640, 401, 18, 210, 58, 15, 591, 432, 111).map(TagNum(_)))
  }

  test("FIX sequence parse") {
    val parser = new Parser(dict)
    val parsed = parser.parse(raw)
    val s = snapshot
    assert(parsed === s)
  }

  test("Construction: typed fields only") {
    import com.miriamlaurel.wontfix.versions.fix50._
/*
    val quote = FixMessage(QuoteRequest,
      OrdType.FOREX_MARKET,
      QuoteReqID("rff-297800023114"),
      QuoteID("QPN209897199991"),
      BidPx(BigDecimal("1.23456")),
      OfferPx(BigDecimal("1.23457")),
      FixField(9000, "DB-FX"))
*/
    val mdr = FixMessage(MarketDataRequest,
      MDReqID("jpm-66349827688"),
      SubscriptionRequestType.SNAPSHOT_PLUS_UPDATES,
      MarketDepth(0),
      MDUpdateType.FULL_REFRESH,
      AggregatedBook(true),
      FixGroup(NoMDEntries.FIELD, List(MDEntryType.BID), List(MDEntryType.OFFER)),
      FixGroup(NoRelatedSym.FIELD, List(Symbol("EUR/USD"))),
      FixField(10001, "custom")
    )
    assert(mdr.body.toString ===
      "262=jpm-66349827688 | 263=1 | 264=0 | 265=0 | 266=Y | 268=2 | 269=0 | 269=1 | 146=1 | 55=EUR/USD | 10001=custom")
  }
}