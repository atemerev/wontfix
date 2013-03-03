package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class ManualOrderIndicator(bool: Boolean) extends FixField(1028, types.FixBoolean(bool))