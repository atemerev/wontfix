package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class QuoteResponseLevel(i: Int) extends FixField(301, types.FixInteger(i))

object QuoteResponseLevel {
  val NO_ACKNOWLEDGEMENT = QuoteResponseLevel(0)
  val ACKNOWLEDGE_ONLY_NEGATIVE_OR_ERRONEOUS_QUOTES = QuoteResponseLevel(1)
  val ACKNOWLEDGE_EACH_QUOTE_MESSAGES = QuoteResponseLevel(2)
}