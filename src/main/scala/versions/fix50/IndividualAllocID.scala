package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class IndividualAllocID(s: String) extends FixField(467, types.FixString(s))