package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class LocaleOfIssue(s: String) extends FixField(472, types.FixString(s))