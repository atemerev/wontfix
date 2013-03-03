package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class NoSettlInst(num: Int) extends FixField(778, types.NumInGroup(num))