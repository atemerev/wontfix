package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class ApplQueueMax(i: Int) extends FixField(812, types.FixInteger(i))