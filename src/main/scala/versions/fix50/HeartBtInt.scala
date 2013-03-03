package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class HeartBtInt(i: Int) extends FixField(108, types.FixInteger(i))