package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class SecurityUpdateAction(c: Char) extends FixField(980, types.FixChar(c))

object SecurityUpdateAction {
  val ADD = SecurityUpdateAction('A')
  val DELETE = SecurityUpdateAction('D')
  val MODIFY = SecurityUpdateAction('M')
}