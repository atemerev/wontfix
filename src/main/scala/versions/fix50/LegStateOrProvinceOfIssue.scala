package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class LegStateOrProvinceOfIssue(s: String) extends FixField(597, types.FixString(s))