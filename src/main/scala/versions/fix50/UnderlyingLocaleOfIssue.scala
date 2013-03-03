package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class UnderlyingLocaleOfIssue(s: String) extends FixField(594, types.FixString(s))