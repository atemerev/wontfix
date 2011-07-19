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

case class ParseError(message: String)

trait ByteCodec {
  def encode(message: FixMessage): Array[Byte]
  def decode(data: Array[Byte]): Either[FixMessage, ParseError]
  def incrementalDecode(data: Array[Byte]): Seq[Either[FixMessage, ParseError]] = undefined
}

class FixtpCodec(val version: String) extends ByteCodec {

  private val UTF8 = Charset.forName("UTF-8")

  def encode(message: FixMessage) = {
    val body = message.structure.flatten
    val typeField = FixField(35, message.msgType)
    val begin = FixField(8, version)
    val bodyData = body.map(fieldToBytes(_)).foldLeft(Array[Byte]())(_ ++ _)
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
  def decode(data: Array[Byte]) = undefined

  private def fieldToBytes(field: FixField): Array[Byte] = field.toString.getBytes(UTF8) :+ 1.toByte
}