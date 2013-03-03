package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class SecureData(data: Array[Byte]) extends FixField(91, types.Data(data))