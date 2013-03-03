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

import xml.{NodeSeq, Node, XML}
import java.io.{BufferedWriter, File, FileWriter}

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
    val rawType = (fieldNode \ "@type").text
    val typeEntry = TYPE_MAP(rawType)
    val superType = typeEntry._2
    val valsList = typeEntry._1.split(", ").map(_.split(": ")(0)).mkString(", ")
    val constructorVals = if (rawType.startsWith("MULTIPLE")) valsList + ": _*" else valsList
    val caseClassDef =
      <def>case class {fieldType}({typeEntry._1}) extends FixField({tagNum}, types.{superType}({constructorVals}))</def>.text
    val enums = (fieldNode \ "value")
    if (enums.size > 0) caseClassDef +
      "\n\n" +
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

  def main(args: Array[String]) {
    if (args.length != 3) {
      println("Usage: codegen <dictionary> <source directory> <package>")
      System.exit(1)
    }
    val root = XML.loadFile(args(0))
    val fieldNodes = (root \ "fields" \ "field")
    val packageString = "package " + args(2)
    val imports = "import com.miriamlaurel.wontfix.types\nimport com.miriamlaurel.wontfix.structure._"
    fieldNodes foreach (node => {
      val fieldDef = genField(node)
      val typeNode: NodeSeq = node \ "@type"
      val i1 = if (typeNode.text.endsWith("TIMESTAMP"))
        imports + "\nimport java.util.Date" else imports
      val i2 = if (typeNode.text.startsWith("TZ")) i1 + "\nimport java.util.TimeZone" else i1
      writeToFile(
        dir = args(1),
        fileName = (node \ "@name").text + ".scala",
        content = packageString + "\n\n" + i2 + "\n\n" + fieldDef)
    })

    def writeToFile(dir: String, fileName: String, content: String) {
      val file = new File(dir, fileName)
      val writer = new BufferedWriter(new FileWriter(file))
      writer.write(content)
      writer.flush()
      writer.close()
    }
  }
}
