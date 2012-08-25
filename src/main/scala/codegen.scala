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
    "FLOAT" -> ("f: Decimal", "FixFloat"),
    "LENGTH" -> ("length: Int", "Length"),
    "SEQNUM" -> ("seqNum: Int", "SeqNum"),
    "NUMINGROUP" -> ("num: Int", "NumInGroup"),
    "DAY-OF-MONTH" -> ("day: Int", "DayOfMonth"),
    "QTY" -> ("qty: Decimal", "Qty"),
    "PRICE" -> ("price: Decimal", "Price"),
    "PRICEOFFSET" -> ("offset: Decimal", "PriceOffset"),
    "AMT" -> ("amount: Decimal", "Amt"),
    "PERCENTAGE" -> ("percentage: Decimal", "Percentage"),
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
    val rawType = (fieldNode \ "@type").text
    val typeEntry = TYPE_MAP(rawType)
    val superType = typeEntry._2
    val valsList = typeEntry._1.split(", ").map(_.split(": ")(0)).mkString(", ")
    val constructorVals = if (rawType.startsWith("MULTIPLE")) valsList + ": _*" else valsList
    val caseClassDef =
      <def>case class {fieldType}({typeEntry._1}) extends FixField({tagNum}, types.{superType}({constructorVals}))</def>.text
    val enums = (fieldNode \ "value")
    if (enums.size > 0) caseClassDef +
      "\n" +
      "object " + fieldType + " {\n" +
      enums.map(node => {
        val quote = LITERAL_QUOTE(rawType)
        val description = (node \ "@description").text
        val value = (node \ "@enum").text
        "  " +
          <def>val {description} = {fieldType}({quote}{value}{quote})</def>.text
      }).mkString("\n") +
      "\n}"
    else caseClassDef
  }

  def genComponent(node: Node): String = {
    val name = (node \ "@name").text

    null
  }

  def genFields(rootNode: Node): String = (rootNode \ "fields" \ "field").map(genField(_)).mkString("\n\n")

  def main(args: Array[String]) {
    val root = XML.loadFile(args(0))
    println(genFields(root))
  }
}
