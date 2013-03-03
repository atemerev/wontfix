package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class NumBidders(i: Int) extends FixField(417, types.FixInteger(i))