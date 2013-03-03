package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class DueToRelated(bool: Boolean) extends FixField(329, types.FixBoolean(bool))