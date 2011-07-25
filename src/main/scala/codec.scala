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

package com.miriamlaurel.wontfix.codec

import com.miriamlaurel.wontfix.util._
import com.miriamlaurel.wontfix.types._
import java.nio.charset.Charset
import xml.Elem
import com.miriamlaurel.wontfix.numbers.Decimal
import java.util.Date

case class ParseError(message: String) extends RuntimeException(message)

trait ByteCodec {
  def encode(message: FixMessage): Array[Byte]
  def decode(data: Array[Byte]): Either[FixMessage, ParseError]
  def incrementalDecode(data: Array[Byte]): Seq[Either[FixMessage, ParseError]] = undefined
}

class FixtpCodec(val version: String, dictionary: Elem) extends ByteCodec {

  val fields = dictionary \\ "fields" \ "field"
  val typeMap = Map(fields.map(f => ((f \ "@number").text.toInt -> ((f \ "@type").text match {
    case "STRING" => FixString(_: String)
    case "CHAR" => v: String => FixChar(v.toCharArray()(0))
    case "INT" => v: String => FixInteger(v.toInt)
    case "FLOAT" => v: String => FixFloat(Decimal(v))
    case "LENGTH" => v: String => Length(v.toInt)
    case "SEQNUM" => v: String => SeqNum(v.toInt)
    case "NUMINGROUP" => v: String => NumInGroup(v.toInt)
    case "DAY-OF-MONTH" => v: String => DayOfMonth(v.toInt)
    case "QTY" => v: String => Qty(Decimal(v))
    case "PRICE" => v: String => Price(Decimal(v))
    case "PRICEOFFSET" => v: String => PriceOffset(Decimal(v))
    case "AMT" => v: String => Amt(Decimal(v))
    case "PERCENTAGE" => v: String => Percentage(Decimal(v))
    case "BOOLEAN" => v: String => FixBoolean(if (v == "Y") true
      else if (v == "N") false
      else throw new ParseError("Unknown boolean value: " + v))
    case "MULTIPLECHARVALUE" => v: String => MultipleCharValue(v.split(" ").map(_.toCharArray()(0)): _*)
    case "MULTIPLESTRINGVALUE" => v: String => MultipleStringValue(v.split(" "): _*)
    case "COUNTRY" => v: String => Country(v)
    case "CURRENCY" => v: String => Currency(v)
    case "EXCHANGE" => v: String => Exchange(v)
    case "MONTH-YEAR" => v: String => MonthYear(0, 1, None, None) // todo fix this
    case "UTCTIMESTAMP" => v: String => UTCTimestamp(new Date) // todo fix this
    case "UTCTIMEONLY" => v: String => UTCTimeOnly(0, 0, 0, 0) // todo fix this
    case "LOCALMKTDATE" => v: String => LocalMktDate(0, 1, 1) // todo fix this
    case "TZTIMEONLY" => v: String => TZTimeOnly(0, 0, 0, UTCUtil.UTC) // todo fix this
    case "TZTIMESTAMP" => v: String => TZTimestamp(new Date, UTCUtil.UTC) // todo fix this
    case "DATA" => v: String => Data(v.getBytes(UTF8))
    case _ => throw new ParseError("Unknown type")
  }))): _*)

  private val UTF8 = Charset.forName("UTF-8")

  /*! Since we want something working first, we will not bother with SeqNum and SenderCompID at
      this time. */

  def encode(message: FixMessage) = {
    val body = message.structure.flatten
    val typeField = FixField(35, message.msgType)
    val begin = FixField(8, version)
    val bodyData = Array.concat(body.map(fieldToBytes(_)): _*)
    val bodyLength = FixField(9, bodyData.length)
    val checksum = FixField(10, bodyData.foldLeft(0)(_.toInt + _.toInt) % 256)
    Array.concat(
      fieldToBytes(begin),
      fieldToBytes(typeField),
      fieldToBytes(bodyLength),
      bodyData,
      fieldToBytes(checksum)
    )
  }

  def decode(data: Array[Byte]) = {
    val tokens = (new String(data, UTF8)).split(1.toChar).toList
    if (tokens.size < 3) Right(ParseError("FIX message should contain at least 3 fields")) else tokens match {
      case beginString :: bodyLength :: rest => {
        val checksumToken = rest.last
      }
      case _ => undefined
    }
    undefined
  }

  private def fieldToBytes(field: FixField): Array[Byte] = field.toString.getBytes(UTF8) :+ 1.toByte

  private def bytesToField(bytes: Array[Byte]): Option[FixField] = {
    val tokens = new String(bytes, UTF8).split("=")
    undefined
  }
}