package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class EFPTrackingError(percentage: BigDecimal) extends FixField(405, types.Percentage(percentage))