package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class ReportedPxDiff(bool: Boolean) extends FixField(1134, types.FixBoolean(bool))