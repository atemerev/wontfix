package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class EncodedUnderlyingIssuerLen(length: Int) extends FixField(362, types.Length(length))