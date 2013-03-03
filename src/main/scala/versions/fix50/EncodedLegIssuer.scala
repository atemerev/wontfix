package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class EncodedLegIssuer(data: Array[Byte]) extends FixField(619, types.Data(data))