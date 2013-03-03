package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class RegistTransType(c: Char) extends FixField(514, types.FixChar(c))

object RegistTransType {
  val NEW = RegistTransType('0')
  val REPLACE = RegistTransType('1')
  val CANCEL = RegistTransType('2')
}