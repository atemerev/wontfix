package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class FundRenewWaiv(c: Char) extends FixField(497, types.FixChar(c))

object FundRenewWaiv {
  val NO = FundRenewWaiv('N')
  val YES = FundRenewWaiv('Y')
}