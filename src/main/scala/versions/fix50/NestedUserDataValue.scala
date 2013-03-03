package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class NestedUserDataValue(s: String) extends FixField(9002, types.FixString(s))