package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class EncodedListExecInst(data: Array[Byte]) extends FixField(353, types.Data(data))