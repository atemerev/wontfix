package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class PaymentRemitterID(s: String) extends FixField(505, types.FixString(s))