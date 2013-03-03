package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class ExecAckStatus(c: Char) extends FixField(1036, types.FixChar(c))

object ExecAckStatus {
  val RECEIVED_NOT_YET_PROCESSED = ExecAckStatus('0')
  val ACCEPTED = ExecAckStatus('1')
  val DONT_KNOW = ExecAckStatus('2')
}