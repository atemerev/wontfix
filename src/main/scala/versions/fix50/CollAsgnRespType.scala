package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class CollAsgnRespType(i: Int) extends FixField(905, types.FixInteger(i))

object CollAsgnRespType {
  val RECEIVED = CollAsgnRespType(0)
  val ACCEPTED = CollAsgnRespType(1)
  val DECLINED = CollAsgnRespType(2)
  val REJECTED = CollAsgnRespType(3)
}