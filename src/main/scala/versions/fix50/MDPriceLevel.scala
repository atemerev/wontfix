package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class MDPriceLevel(i: Int) extends FixField(1023, types.FixInteger(i))