package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class LegDatedDate(year: Int, month: Int, day: Int) extends FixField(739, types.LocalMktDate(year, month, day))