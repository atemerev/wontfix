package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class IOINaturalFlag(bool: Boolean) extends FixField(130, types.FixBoolean(bool))