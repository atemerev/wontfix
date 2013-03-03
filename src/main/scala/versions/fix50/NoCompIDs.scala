package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class NoCompIDs(num: Int) extends FixField(936, types.NumInGroup(num))