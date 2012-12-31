/*
* WontFIX: A pragmatic Scala FIX engine.
*
* Copyright (C) 2011 Miriam Laurel Sarl.
*
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU Affero General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
*
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU Affero General Public License for more details.
*
* You should have received a copy of the GNU Affero General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.miriamlaurel.wontfix.codegen

import xml.{Node, XML}

object Codegen {

  val TYPE_MAP = Map(
    "STRING" -> ("s: String", "FixString"),
    "CHAR" -> ("c: Char", "FixChar"),
    "INT" -> ("i: Int", "FixInteger"),
    "FLOAT" -> ("f: BigDecimal", "FixFloat"),
    "LENGTH" -> ("length: Int", "Length"),
    "SEQNUM" -> ("seqNum: Int", "SeqNum"),
    "NUMINGROUP" -> ("num: Int", "NumInGroup"),
    "DAY-OF-MONTH" -> ("day: Int", "DayOfMonth"),
    "QTY" -> ("qty: BigDecimal", "Qty"),
    "PRICE" -> ("price: BigDecimal", "Price"),
    "PRICEOFFSET" -> ("offset: BigDecimal", "PriceOffset"),
    "AMT" -> ("amount: BigDecimal", "Amt"),
    "PERCENTAGE" -> ("percentage: BigDecimal", "Percentage"),
    "BOOLEAN" -> ("bool: Boolean", "FixBoolean"),
    "MULTIPLECHARVALUE" -> ("chars: Char*", "MultipleCharValue"),
    "MULTIPLESTRINGVALUE" -> ("strings: String*", "MultipleStringValue"),
    "COUNTRY" -> ("code: String", "Country"),
    "CURRENCY" -> ("code: String", "Currency"),
    "EXCHANGE" -> ("code: String", "Exchange"),
    "MONTH-YEAR" -> ("year: Int, month: Int, day: Option[Int], week: Option[Int]", "MonthYear"),
    "UTCTIMESTAMP" -> ("timestamp: Date", "UTCTimestamp"),
    "UTCDATEONLY" -> ("year: Int, month: Int, day: Int", "UTCDateOnly"),
    "UTCTIMEONLY" -> ("hour: Int, minute: Int, second: Int, millis: Int", "UTCTimeOnly"),
    "LOCALMKTDATE" -> ("year: Int, month: Int, day: Int", "LocalMktDate"),
    "TZTIMEONLY" -> ("hour: Int, minute: Int, second: Int, tz: TimeZone", "TZTimeOnly"),
    "TZTIMESTAMP" -> ("timestamp: Date, tz: TimeZone", "TZTimestamp"),
    "DATA" -> ("data: Array[Byte]", "Data")
  )

  val LITERAL_QUOTE = Map(
    "STRING" -> "\"",
    "CHAR" -> "'",
    "INT" -> "",
    "MULTIPLECHARVALUE" -> "'",
    "MULTIPLESTRINGVALUE" -> "\"",
    "NUMINGROUP" -> ""
  )

  def genField(fieldNode: Node): String = {
    val fieldType = (fieldNode \ "@name").text
    val tagNum = (fieldNode \ "@number").text.toInt
    <def>val {fieldType}: Int = {tagNum}</def>.text
  }

  def genFields(rootNode: Node): String = (rootNode \ "fields" \ "field").map(genField(_)).map("  " + _).mkString("\n")

  def main(args: Array[String]) {
    val root = XML.load(Codegen.getClass.getResourceAsStream("/FIX50.xml"))
    val header = "package com.temerev.wontfix.fix50\n\npackage object fields {\n"
    val trailer = "\n}"
    println(header + genFields(root) + trailer)

  }
}
