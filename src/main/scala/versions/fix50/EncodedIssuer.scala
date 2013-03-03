package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class EncodedIssuer(data: Array[Byte]) extends FixField(349, types.Data(data))