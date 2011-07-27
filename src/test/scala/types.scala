package com.miriamlaurel.wontfix.test.types

import org.scalatest.FunSuite
import com.miriamlaurel.wontfix.numbers.Decimal
import com.miriamlaurel.wontfix.types._
import com.miriamlaurel.wontfix.structure._
import java.text.SimpleDateFormat
import java.util.TimeZone

class FixTypesSuite extends FunSuite {

  private val sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS")
  sdf.setTimeZone(TimeZone.getTimeZone("UTC"))
  private val someDate = sdf.parse("2011-07-26 19:22:00.273")

  test("complex FIX structure flattens correctly") {
    val instrument = FixStructure(
      FixField(55, "EUR/USD")
    )
    val quotes = FixRepeatingGroup(268,
      List(FixField(269, '0'), FixField(270, Price("1.40546")), FixField(271, Qty("1000000"))),
      List(FixField(269, '1'), FixField(270, Price("1.40550")), FixField(271, Qty("1000000")))
    )
    val timestamp = FixField(52, UTCTimestamp(someDate))
    val snapshot = FixStructure(timestamp, instrument, quotes)
    assert ("52=20110726-19:22:00.273 | 55=EUR/USD | 268=2 | 269=0 | 270=1.40546 | 271=1000000 | 269=1 | 270=1.40550 | 271=1000000" ===
      snapshot.toString)
  }

  test("timezone serialization") {
    val ts = TZTimestamp(someDate, TimeZone.getTimeZone("GMT+3:00"))
    assert(ts === TZTimestamp(ts.toBytes))
    val tzTime = TZTimeOnly(18, 7, 36, TimeZone.getTimeZone("GMT+1"))
    assert(tzTime === TZTimeOnly(tzTime.toBytes))
  }
}