package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class StateOrProvinceOfIssue(s: String) extends FixField(471, types.FixString(s))