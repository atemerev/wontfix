package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class ResetSeqNumFlag(bool: Boolean) extends FixField(141, types.FixBoolean(bool))