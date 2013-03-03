package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class AllowableOneSidednessPct(percentage: BigDecimal) extends FixField(765, types.Percentage(percentage))