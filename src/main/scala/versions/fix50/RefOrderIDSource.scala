package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class RefOrderIDSource(c: Char) extends FixField(1081, types.FixChar(c))

object RefOrderIDSource {
  val SECONDARYORDEID = RefOrderIDSource('0')
  val ORDEID = RefOrderIDSource('1')
  val MENTRYID = RefOrderIDSource('2')
  val QUOTENTRYID = RefOrderIDSource('3')
}