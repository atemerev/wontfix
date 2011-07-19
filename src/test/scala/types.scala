package com.miriamlaurel.wontfix.types

import org.scalatest.FunSuite
import com.miriamlaurel.wontfix.numbers.Decimal

class FixTypesSuite extends FunSuite {
  test("complex FIX structure flattens correctly") {
    val instrument = FixStructure(
      new FixField(55, FixString("EUR/USD"))
    )
    val quotes = FixRepeatingGroup(TagNum(268),
      List(new FixField(269, FixChar('0')), new FixField(270, Price(Decimal("1.40546"))), new FixField(271, Qty(Decimal("1000000")))),
      List(new FixField(269, FixChar('1')), new FixField(270, Price(Decimal("1.40550"))), new FixField(271, Qty(Decimal("1000000"))))
    )
    val snapshot = FixStructure(instrument, quotes)
    val result = "55=EUR/USD | 268=2 | 269=0 | 270=1.40546 | 271=1000000 | 269=1 | 270=1.40550 | 271=1000000"
    assert (result === snapshot.toString)
  }
}