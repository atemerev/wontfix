package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class NetworkRequestID(s: String) extends FixField(933, types.FixString(s))