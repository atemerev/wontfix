package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class EncodedUnderlyingSecurityDescLen(length: Int) extends FixField(364, types.Length(length))