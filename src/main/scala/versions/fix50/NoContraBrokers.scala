package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class NoContraBrokers(num: Int) extends FixField(382, types.NumInGroup(num))