package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class MatchStatus(c: Char) extends FixField(573, types.FixChar(c))

object MatchStatus {
  val COMPARED_MATCHED_OR_AFFIRMED = MatchStatus('0')
  val UNCOMPARED_UNMATCHED_OR_UNAFFIRMED = MatchStatus('1')
  val ADVISORY_OR_ALERT = MatchStatus('2')
}