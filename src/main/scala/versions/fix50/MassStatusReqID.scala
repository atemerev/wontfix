package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class MassStatusReqID(s: String) extends FixField(584, types.FixString(s))