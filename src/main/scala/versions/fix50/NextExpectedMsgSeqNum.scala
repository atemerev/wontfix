package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class NextExpectedMsgSeqNum(seqNum: Int) extends FixField(789, types.SeqNum(seqNum))