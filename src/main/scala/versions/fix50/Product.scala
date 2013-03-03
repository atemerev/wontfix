package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class Product(i: Int) extends FixField(460, types.FixInteger(i))

object Product {
  val AGENCY = Product(1)
  val COMMODITY = Product(2)
  val CORPORATE = Product(3)
  val CURRENCY = Product(4)
  val EQUITY = Product(5)
  val GOVERNMENT = Product(6)
  val INDEX = Product(7)
  val LOAN = Product(8)
  val MONEYMARKET = Product(9)
  val MORTGAGE = Product(10)
  val MUNICIPAL = Product(11)
  val OTHER = Product(12)
  val FINANCING = Product(13)
}