package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class NoPosAmt(num: Int) extends FixField(753, types.NumInGroup(num))