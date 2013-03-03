package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class TotalAffectedOrders(i: Int) extends FixField(533, types.FixInteger(i))