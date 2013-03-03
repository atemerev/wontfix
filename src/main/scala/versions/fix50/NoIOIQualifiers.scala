package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class NoIOIQualifiers(num: Int) extends FixField(199, types.NumInGroup(num))