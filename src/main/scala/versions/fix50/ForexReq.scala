package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class ForexReq(bool: Boolean) extends FixField(121, types.FixBoolean(bool))