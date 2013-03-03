package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class TotNoStrikes(i: Int) extends FixField(422, types.FixInteger(i))