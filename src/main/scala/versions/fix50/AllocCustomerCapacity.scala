package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class AllocCustomerCapacity(s: String) extends FixField(993, types.FixString(s))