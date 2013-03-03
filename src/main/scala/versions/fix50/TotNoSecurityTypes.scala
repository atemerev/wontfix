package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class TotNoSecurityTypes(i: Int) extends FixField(557, types.FixInteger(i))