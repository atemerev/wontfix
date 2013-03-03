package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class TestMessageIndicator(bool: Boolean) extends FixField(464, types.FixBoolean(bool))