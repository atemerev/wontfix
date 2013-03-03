package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class ParticipationRate(percentage: BigDecimal) extends FixField(849, types.Percentage(percentage))