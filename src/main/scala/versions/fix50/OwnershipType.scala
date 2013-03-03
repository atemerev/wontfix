package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class OwnershipType(c: Char) extends FixField(517, types.FixChar(c))

object OwnershipType {
  val JOINT_INVESTORS = OwnershipType('J')
  val TENANTS_IN_COMMON = OwnershipType('T')
  val JOINT_TRUSTEES = OwnershipType('2')
}