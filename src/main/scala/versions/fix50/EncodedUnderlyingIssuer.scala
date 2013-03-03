package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class EncodedUnderlyingIssuer(data: Array[Byte]) extends FixField(363, types.Data(data))