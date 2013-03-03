package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class EmailType(c: Char) extends FixField(94, types.FixChar(c))

object EmailType {
  val NEW = EmailType('0')
  val REPLY = EmailType('1')
  val ADMIN_REPLY = EmailType('2')
}