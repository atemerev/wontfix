package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class LastRptRequested(bool: Boolean) extends FixField(912, types.FixBoolean(bool))