package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class NoRegistDtls(num: Int) extends FixField(473, types.NumInGroup(num))