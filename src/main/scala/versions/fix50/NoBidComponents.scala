package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class NoBidComponents(num: Int) extends FixField(420, types.NumInGroup(num))