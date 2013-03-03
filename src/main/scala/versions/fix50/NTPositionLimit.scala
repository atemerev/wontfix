package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class NTPositionLimit(i: Int) extends FixField(971, types.FixInteger(i))