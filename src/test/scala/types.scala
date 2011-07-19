package com.miriamlaurel.wontfix.types

import org.scalatest.FunSuite
import com.miriamlaurel.wontfix.numbers.Decimal

class FixTypesSuite extends FunSuite {
  test("complex FIX structure flattens correctly") {
    val instrument = FixStructure(
      FixField(55, "EUR/USD")
    )
    val quotes = FixRepeatingGroup(268,
      List(FixField(269, '0'), FixField(270, Price("1.40546")), FixField(271, Qty("1000000"))),
      List(FixField(269, '1'), FixField(270, Price("1.40550")), FixField(271, Qty("1000000")))
    )
    val snapshot = FixStructure(instrument, quotes)
    val result = "55=EUR/USD | 268=2 | 269=0 | 270=1.40546 | 271=1000000 | 269=1 | 270=1.40550 | 271=1000000"
    assert (result === snapshot.toString)
  }
}