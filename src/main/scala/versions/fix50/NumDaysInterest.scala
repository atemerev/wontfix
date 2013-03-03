package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class NumDaysInterest(i: Int) extends FixField(157, types.FixInteger(i))