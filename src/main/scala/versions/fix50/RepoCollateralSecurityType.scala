package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class RepoCollateralSecurityType(i: Int) extends FixField(239, types.FixInteger(i))