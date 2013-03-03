package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class EncodedLegSecurityDescLen(length: Int) extends FixField(621, types.Length(length))