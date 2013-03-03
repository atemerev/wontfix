package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class RefSeqNum(seqNum: Int) extends FixField(45, types.SeqNum(seqNum))