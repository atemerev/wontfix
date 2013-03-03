package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class CustomerOrFirm(i: Int) extends FixField(204, types.FixInteger(i))

object CustomerOrFirm {
  val CUSTOMER = CustomerOrFirm(0)
  val FIRM = CustomerOrFirm(1)
}