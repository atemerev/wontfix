package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class DiscretionOffsetValue(f: BigDecimal) extends FixField(389, types.FixFloat(f))