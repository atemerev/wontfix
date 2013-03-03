package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class LegRepoCollateralSecurityType(i: Int) extends FixField(250, types.FixInteger(i))