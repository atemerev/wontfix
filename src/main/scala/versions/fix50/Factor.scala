package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class Factor(f: BigDecimal) extends FixField(228, types.FixFloat(f))