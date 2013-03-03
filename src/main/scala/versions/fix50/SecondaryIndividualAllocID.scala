package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class SecondaryIndividualAllocID(s: String) extends FixField(989, types.FixString(s))