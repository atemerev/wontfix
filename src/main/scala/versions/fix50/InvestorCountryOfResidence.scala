package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class InvestorCountryOfResidence(code: String) extends FixField(475, types.Country(code))