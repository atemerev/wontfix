package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class ReversalIndicator(bool: Boolean) extends FixField(700, types.FixBoolean(bool))