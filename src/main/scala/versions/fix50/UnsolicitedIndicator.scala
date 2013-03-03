package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class UnsolicitedIndicator(bool: Boolean) extends FixField(325, types.FixBoolean(bool))