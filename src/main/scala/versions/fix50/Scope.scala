package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class Scope(chars: Char*) extends FixField(546, types.MultipleCharValue(chars: _*))

object Scope {
  val LOCAL = Scope('1')
  val NATIONAL = Scope('2')
  val GLOBAL = Scope('3')
}