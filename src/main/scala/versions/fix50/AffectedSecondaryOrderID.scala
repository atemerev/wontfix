package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class AffectedSecondaryOrderID(s: String) extends FixField(536, types.FixString(s))