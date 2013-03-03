package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class AllocAcctIDSource(i: Int) extends FixField(661, types.FixInteger(i))