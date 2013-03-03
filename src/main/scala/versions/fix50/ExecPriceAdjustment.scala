package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class ExecPriceAdjustment(f: BigDecimal) extends FixField(485, types.FixFloat(f))