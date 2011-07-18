package com.miriamlaurel.wontfix.types

import org.scalatest.FunSuite

class FixTypesSuite extends FunSuite {
  test("High-level MarketDataSnapshotFullRefresh test") {
    val instrument = FixStructure(
      new FixField(55, FixString("EUR/USD"))
    )
  }
}