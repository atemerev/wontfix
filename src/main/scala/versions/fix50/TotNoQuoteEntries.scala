package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class TotNoQuoteEntries(i: Int) extends FixField(304, types.FixInteger(i))