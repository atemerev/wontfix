package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class NumTickets(i: Int) extends FixField(395, types.FixInteger(i))