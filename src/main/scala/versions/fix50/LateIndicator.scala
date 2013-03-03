package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class LateIndicator(bool: Boolean) extends FixField(978, types.FixBoolean(bool))