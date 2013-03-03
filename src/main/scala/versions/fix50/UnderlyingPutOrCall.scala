package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class UnderlyingPutOrCall(i: Int) extends FixField(315, types.FixInteger(i))