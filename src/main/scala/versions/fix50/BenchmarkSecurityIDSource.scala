package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class BenchmarkSecurityIDSource(s: String) extends FixField(761, types.FixString(s))