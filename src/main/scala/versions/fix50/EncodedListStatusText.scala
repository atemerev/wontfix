package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class EncodedListStatusText(data: Array[Byte]) extends FixField(446, types.Data(data))