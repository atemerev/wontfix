package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class UnderlyingRepurchaseTerm(i: Int) extends FixField(244, types.FixInteger(i))