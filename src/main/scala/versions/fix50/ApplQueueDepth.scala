package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class ApplQueueDepth(i: Int) extends FixField(813, types.FixInteger(i))