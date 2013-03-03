package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class NoCapacities(num: Int) extends FixField(862, types.NumInGroup(num))