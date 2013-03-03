package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class LegRepurchaseTerm(i: Int) extends FixField(251, types.FixInteger(i))