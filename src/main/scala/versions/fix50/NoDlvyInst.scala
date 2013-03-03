package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class NoDlvyInst(num: Int) extends FixField(85, types.NumInGroup(num))