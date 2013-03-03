package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class LegSecurityExchange(code: String) extends FixField(616, types.Exchange(code))