package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class SettleOnOpenFlag(s: String) extends FixField(966, types.FixString(s))