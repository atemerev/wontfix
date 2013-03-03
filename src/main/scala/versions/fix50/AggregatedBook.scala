package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class AggregatedBook(bool: Boolean) extends FixField(266, types.FixBoolean(bool))