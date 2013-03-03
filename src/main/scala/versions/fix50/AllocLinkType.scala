package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class AllocLinkType(i: Int) extends FixField(197, types.FixInteger(i))

object AllocLinkType {
  val F_X_NETTING = AllocLinkType(0)
  val F_X_SWAP = AllocLinkType(1)
}