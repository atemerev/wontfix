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
import com.miriamlaurel.wontfix.structure._
import java.nio.charset.Charset
import xml.Elem

trait ByteCodec {
  def encode(message: FixMessage): Array[Byte]
  def decode(data: Array[Byte]): Either[FixMessage, ParseError]
  def incrementalDecode(data: Array[Byte]): Seq[Either[FixMessage, ParseError]] = undefined
}

class FixtpCodec(val version: String, dictionary: Elem) extends ByteCodec {

  val fields = dictionary \\ "fields" \ "field"
  val typeMap = Map(fields.map(f => ((f \ "@number").text.toInt -> ((f \ "@type").text match {
    case "STRING" => data: Array[Byte] => FixString(data)
    case "CHAR" => data: Array[Byte] => FixChar(data)
    case "INT" => data: Array[Byte] => FixInteger(data)
    case "FLOAT" => data: Array[Byte] => FixFloat(data)
    case "LENGTH" => data: Array[Byte] => Length(data)
    case "SEQNUM" => data: Array[Byte] => SeqNum(data)
    case "NUMINGROUP" => data: Array[Byte] => NumInGroup(data)
    case "DAY-OF-MONTH" => data: Array[Byte] => DayOfMonth(data)
    case "QTY" => data: Array[Byte] => Qty(data)
    case "PRICE" => data: Array[Byte] => Price(data)
    case "PRICEOFFSET" => data: Array[Byte] => PriceOffset(data)
    case "AMT" => data: Array[Byte] => Amt(data)
    case "PERCENTAGE" => data: Array[Byte] => Percentage(data)
    case "BOOLEAN" => data: Array[Byte] => FixBoolean(data)
    case "MULTIPLECHARVALUE" => data: Array[Byte] => MultipleCharValue(data)
    case "MULTIPLESTRINGVALUE" => data: Array[Byte] => MultipleStringValue(data)
    case "COUNTRY" => data: Array[Byte] => Country(data)
    case "CURRENCY" => data: Array[Byte] => Currency(data)
    case "EXCHANGE" => data: Array[Byte] => Exchange(data)
    case "MONTH-YEAR" => data: Array[Byte] => MonthYear(data)
    case "UTCTIMESTAMP" => data: Array[Byte] => UTCTimestamp(data)
    case "UTCTIMEONLY" => data: Array[Byte] => UTCTimeOnly(data)
    case "LOCALMKTDATE" => data: Array[Byte] => LocalMktDate(data)
    case "TZTIMEONLY" => data: Array[Byte] => TZTimeOnly(data)
    case "TZTIMESTAMP" => data: Array[Byte] => TZTimestamp(data)
    case "DATA" => data: Array[Byte] => Data(data)
    case _ => throw new ParseError("Unknown type")
  }))): _*)

  private val ASCII = Charset.forName("US-ASCII")

  /*! Since we want something working first, we will not bother with SeqNum and SenderCompID at
      this time. */

  def encode(message: FixMessage) = {
    val body = message.structure.flatten
    val typeField = FixField(35, message.msgType)
    val begin = FixField(8, version)
    val bodyData = Array.concat(body.map(fieldToBytes(_)): _*)
    val bodyLength = FixField(9, bodyData.length)
    val checksum = FixField(10, bodyData.foldLeft(0)(_ + _.toInt) % 256)
    Array.concat(
      fieldToBytes(begin),
      fieldToBytes(typeField),
      fieldToBytes(bodyLength),
      bodyData,
      fieldToBytes(checksum)
    )
  }

  def decode(data: Array[Byte]) = {
    val tokens = (new String(data, ASCII)).split(1.toChar).toList
    if (tokens.size < 3) Right(ParseError("FIX message should contain at least 3 fields")) else tokens.foreach(token =>
      bytesToField(token.getBytes()) match {
        case Some(field) => field
        case None => throw new ParseError("Can't parse FIX field: " + token)
      }
    )
    undefined
  }

  private def fieldToBytes(field: FixField): Array[Byte] = field.toString.getBytes(ASCII) :+ 1.toByte

  private def bytesToField(bytes: Array[Byte]): Option[FixField] = {
    val tokens = new String(bytes, ASCII).split("=")
    undefined
  }
}