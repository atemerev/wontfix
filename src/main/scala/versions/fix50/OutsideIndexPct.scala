package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class OutsideIndexPct(percentage: BigDecimal) extends FixField(407, types.Percentage(percentage))