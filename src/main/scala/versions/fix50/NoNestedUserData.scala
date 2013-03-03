package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class NoNestedUserData(i: Int) extends FixField(9000, types.FixInteger(i))