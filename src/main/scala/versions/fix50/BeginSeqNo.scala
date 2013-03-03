package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class BeginSeqNo(seqNum: Int) extends FixField(7, types.SeqNum(seqNum))