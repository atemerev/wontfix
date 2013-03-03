package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class OnBehalfOfSubID(s: String) extends FixField(116, types.FixString(s))