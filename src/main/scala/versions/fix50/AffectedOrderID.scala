package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class AffectedOrderID(s: String) extends FixField(535, types.FixString(s))