package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class LastMsgSeqNumProcessed(seqNum: Int) extends FixField(369, types.SeqNum(seqNum))