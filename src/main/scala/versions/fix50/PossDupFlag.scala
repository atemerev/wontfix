package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class PossDupFlag(bool: Boolean) extends FixField(43, types.FixBoolean(bool))