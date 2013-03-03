package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class MDEntryPositionNo(i: Int) extends FixField(290, types.FixInteger(i))