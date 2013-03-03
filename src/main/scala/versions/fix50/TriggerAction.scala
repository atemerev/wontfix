package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class TriggerAction(c: Char) extends FixField(1101, types.FixChar(c))

object TriggerAction {
  val ACTIVATE = TriggerAction('1')
  val MODIFY = TriggerAction('2')
  val CANCEL = TriggerAction('3')
}