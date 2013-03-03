package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class NoQuoteQualifiers(num: Int) extends FixField(735, types.NumInGroup(num))