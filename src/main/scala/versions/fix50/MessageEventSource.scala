package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class MessageEventSource(s: String) extends FixField(1011, types.FixString(s))