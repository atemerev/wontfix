package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class PriorSpreadIndicator(bool: Boolean) extends FixField(720, types.FixBoolean(bool))