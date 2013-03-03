package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class SellerDays(i: Int) extends FixField(287, types.FixInteger(i))