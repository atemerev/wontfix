package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class ContraryInstructionIndicator(bool: Boolean) extends FixField(719, types.FixBoolean(bool))