package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class ExDestinationIDSource(c: Char) extends FixField(1133, types.FixChar(c))

object ExDestinationIDSource {
  val BIC = ExDestinationIDSource('B')
  val GENERALLY_ACCEPTED_MARKET_PARTICIPANT_IDENTIFIER = ExDestinationIDSource('C')
  val PROPRIETARY = ExDestinationIDSource('D')
  val ISO_COUNTRY_CODE = ExDestinationIDSource('E')
  val MIC = ExDestinationIDSource('G')
}