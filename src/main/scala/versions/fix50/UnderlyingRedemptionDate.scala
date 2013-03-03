package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class UnderlyingRedemptionDate(year: Int, month: Int, day: Int) extends FixField(247, types.LocalMktDate(year, month, day))