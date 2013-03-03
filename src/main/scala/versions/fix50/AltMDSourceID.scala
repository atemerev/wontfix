package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class AltMDSourceID(s: String) extends FixField(817, types.FixString(s))