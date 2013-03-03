package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class BidDescriptorType(i: Int) extends FixField(399, types.FixInteger(i))

object BidDescriptorType {
  val SECTOR = BidDescriptorType(1)
  val COUNTRY = BidDescriptorType(2)
  val INDEX = BidDescriptorType(3)
}