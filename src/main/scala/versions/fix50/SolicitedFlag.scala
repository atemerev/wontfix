package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class SolicitedFlag(bool: Boolean) extends FixField(377, types.FixBoolean(bool))