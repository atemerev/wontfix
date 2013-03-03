package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class AllowableOneSidednessCurr(code: String) extends FixField(767, types.Currency(code))