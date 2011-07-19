package com.miriamlaurel.wontfix.types

import org.scalatest.FunSuite
import com.miriamlaurel.wontfix.numbers.Decimal

class FixTypesSuite extends FunSuite {
  test("High-level MarketDataSnapshotFullRefresh test") {
    val instrument = FixStructure(
      new FixField(55, FixString("EUR/USD"))
    )
    val quotes = FixRepeatingGroup(TagNum(268),
      List(new FixField(269, FixChar('0')), new FixField(270, Price(Decimal("1.40546"))), new FixField(271, Qty(Decimal("1000000")))),
      List(new FixField(269, FixChar('1')), new FixField(270, Price(Decimal("1.40550"))), new FixField(271, Qty(Decimal("1000000"))))
    )
    val snapshot = FixStructure(instrument, quotes)
    println(snapshot.toString)
  }
}