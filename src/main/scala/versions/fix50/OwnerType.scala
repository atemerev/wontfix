package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class OwnerType(i: Int) extends FixField(522, types.FixInteger(i))

object OwnerType {
  val INDIVIDUAL_INVESTOR = OwnerType(1)
  val PUBLIC_COMPANY = OwnerType(2)
  val PRIVATE_COMPANY = OwnerType(3)
  val INDIVIDUAL_TRUSTEE = OwnerType(4)
  val COMPANY_TRUSTEE = OwnerType(5)
  val PENSION_PLAN = OwnerType(6)
  val CUSTODIAN_UNDER_GIFTS_TO_MINORS_ACT = OwnerType(7)
  val TRUSTS = OwnerType(8)
  val FIDUCIARIES = OwnerType(9)
  val NETWORKING_SUB_ACCOUNT = OwnerType(10)
  val NON_PROFIT_ORGANIZATION = OwnerType(11)
  val CORPORATE_BODY = OwnerType(12)
  val NOMINEE = OwnerType(13)
}