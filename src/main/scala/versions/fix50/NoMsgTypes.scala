package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class NoMsgTypes(num: Int) extends FixField(384, types.NumInGroup(num))