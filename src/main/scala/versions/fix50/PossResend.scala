package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class PossResend(bool: Boolean) extends FixField(97, types.FixBoolean(bool))