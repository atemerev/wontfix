package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class EncodedUnderlyingSecurityDesc(data: Array[Byte]) extends FixField(365, types.Data(data))