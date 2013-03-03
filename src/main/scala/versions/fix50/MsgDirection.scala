package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class MsgDirection(c: Char) extends FixField(385, types.FixChar(c))

object MsgDirection {
  val RECEIVE = MsgDirection('R')
  val SEND = MsgDirection('S')
}