package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class BusinessRejectRefID(s: String) extends FixField(379, types.FixString(s))