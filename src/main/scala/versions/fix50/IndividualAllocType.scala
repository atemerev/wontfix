package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class IndividualAllocType(i: Int) extends FixField(992, types.FixInteger(i))

object IndividualAllocType {
  val SUB_ALLOCATE = IndividualAllocType(1)
  val THIRD_PARTY_ALLOCATION = IndividualAllocType(2)
}