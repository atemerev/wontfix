package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class RegistStatus(c: Char) extends FixField(506, types.FixChar(c))

object RegistStatus {
  val ACCEPTED = RegistStatus('A')
  val REJECTED = RegistStatus('R')
  val HELD = RegistStatus('H')
  val REMINDER = RegistStatus('N')
}