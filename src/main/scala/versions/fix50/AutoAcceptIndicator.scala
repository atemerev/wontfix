package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class AutoAcceptIndicator(bool: Boolean) extends FixField(754, types.FixBoolean(bool))