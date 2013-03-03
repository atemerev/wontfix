package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class NewSeqNo(seqNum: Int) extends FixField(36, types.SeqNum(seqNum))