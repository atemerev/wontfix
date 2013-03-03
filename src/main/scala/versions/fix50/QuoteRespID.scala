package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class QuoteRespID(s: String) extends FixField(693, types.FixString(s))