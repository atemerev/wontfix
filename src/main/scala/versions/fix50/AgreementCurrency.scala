package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class AgreementCurrency(code: String) extends FixField(918, types.Currency(code))