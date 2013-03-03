package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class LastNetworkResponseID(s: String) extends FixField(934, types.FixString(s))