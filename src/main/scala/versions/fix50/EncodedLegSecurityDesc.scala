package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class EncodedLegSecurityDesc(data: Array[Byte]) extends FixField(622, types.Data(data))