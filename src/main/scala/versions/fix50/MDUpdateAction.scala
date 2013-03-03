package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class MDUpdateAction(c: Char) extends FixField(279, types.FixChar(c))

object MDUpdateAction {
  val NEW = MDUpdateAction('0')
  val CHANGE = MDUpdateAction('1')
  val DELETE = MDUpdateAction('2')
  val DELETE_THRU = MDUpdateAction('3')
  val DELETE_FROM = MDUpdateAction('4')
}