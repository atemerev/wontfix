package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class OnBehalfOfLocationID(s: String) extends FixField(144, types.FixString(s))