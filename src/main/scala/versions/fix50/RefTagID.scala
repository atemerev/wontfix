package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class RefTagID(i: Int) extends FixField(371, types.FixInteger(i))