package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class NoAffectedOrders(i: Int) extends FixField(534, types.FixInteger(i))