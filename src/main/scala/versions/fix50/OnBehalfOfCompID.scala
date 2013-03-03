package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class OnBehalfOfCompID(s: String) extends FixField(115, types.FixString(s))