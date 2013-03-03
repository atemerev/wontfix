package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class MessageEncoding(s: String) extends FixField(347, types.FixString(s))

object MessageEncoding {
  val ISO_2022_JP = MessageEncoding("ISO-2022-JP")
  val EUC_JP = MessageEncoding("EUC-JP")
  val SHIFT_JIS = MessageEncoding("SHIFT_JIS")
  val UTF_8 = MessageEncoding("UTF-8")
}