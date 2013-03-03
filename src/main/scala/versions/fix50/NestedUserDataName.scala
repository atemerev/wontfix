package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class NestedUserDataName(s: String) extends FixField(9001, types.FixString(s))