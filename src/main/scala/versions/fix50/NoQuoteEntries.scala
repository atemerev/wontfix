package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class NoQuoteEntries(num: Int) extends FixField(295, types.NumInGroup(num))