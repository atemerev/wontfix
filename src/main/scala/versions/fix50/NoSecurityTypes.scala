package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class NoSecurityTypes(num: Int) extends FixField(558, types.NumInGroup(num))