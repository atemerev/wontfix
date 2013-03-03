package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class RawData(data: Array[Byte]) extends FixField(96, types.Data(data))