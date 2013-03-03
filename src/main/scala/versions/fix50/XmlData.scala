package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class XmlData(data: Array[Byte]) extends FixField(213, types.Data(data))