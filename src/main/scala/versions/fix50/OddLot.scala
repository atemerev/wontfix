package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class OddLot(bool: Boolean) extends FixField(575, types.FixBoolean(bool))