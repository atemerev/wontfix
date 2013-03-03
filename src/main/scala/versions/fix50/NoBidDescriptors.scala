package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class NoBidDescriptors(num: Int) extends FixField(398, types.NumInGroup(num))