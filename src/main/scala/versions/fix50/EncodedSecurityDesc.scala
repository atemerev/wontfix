package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class EncodedSecurityDesc(data: Array[Byte]) extends FixField(351, types.Data(data))