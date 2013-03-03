package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class HopRefID(seqNum: Int) extends FixField(630, types.SeqNum(seqNum))