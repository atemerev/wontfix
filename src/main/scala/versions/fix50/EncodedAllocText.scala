package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class EncodedAllocText(data: Array[Byte]) extends FixField(361, types.Data(data))