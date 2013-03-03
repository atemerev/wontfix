package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class OptAttribute(c: Char) extends FixField(206, types.FixChar(c))