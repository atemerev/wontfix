package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class CustDirectedOrder(bool: Boolean) extends FixField(1029, types.FixBoolean(bool))