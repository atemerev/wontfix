package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class ConfirmRefID(s: String) extends FixField(772, types.FixString(s))