package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class GapFillFlag(bool: Boolean) extends FixField(123, types.FixBoolean(bool))