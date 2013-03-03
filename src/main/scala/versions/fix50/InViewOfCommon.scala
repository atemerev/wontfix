package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class InViewOfCommon(bool: Boolean) extends FixField(328, types.FixBoolean(bool))