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

package com.miriamlaurel.wontfix.parse

import annotation.tailrec
import com.miriamlaurel.wontfix.dictionary.FixDictionary
import com.miriamlaurel.wontfix.types.{FixInteger, TagNum}
import com.miriamlaurel.wontfix.structure.{FixComponent, FixGroup, FixField, FixElement}
import java.nio.ByteBuffer

class Parser(dictionary: FixDictionary) {

  var byteState = ByteState.Garbage
  var tagBuffer = ByteBuffer.allocate(15)
  var valBuffer = ByteBuffer.allocate(65535)


  def onData(bytes: Array[Byte]) {

    import ByteState._

    for (b <- bytes) {
      byteState match {
        case Garbage => {
          if (isNumber(b)) {
            tagBuffer.put(b)
            byteState = Tagnum
          }
        }
        case Tagnum => {
          if (isNumber(b)) {
            tagBuffer.put(b)
          } else if (isEqualsSign(b)) {
            tagBuffer.flip()
            byteState = Equals
          } else {
            fault()
          }
        }
        case Equals => {
          if (isSplit(b)) {
            fault()
          } else {
            valBuffer.put(b)
            byteState = Val
          }
        }
        case Val => {
          if (isSplit(b)) {
            valBuffer.flip()
            emitTag()
            byteState = Split
          } else {
            valBuffer.put(b)
          }
        }
        case Split => {
          if (isNumber(b)) {
            tagBuffer.put(b)
            byteState = Tagnum
          } else {
            fault()
          }
        }
      }
    }

    def isNumber(b: Byte) = b >= 0x30 && b <= 0x39
    def isEqualsSign(b: Byte) = b == 0x3D
    def isSplit(b: Byte) = b == 0x01
    def emitTag() {
      val tagNum = tagBuffer.getInt
      val bytes = new Array[Byte](valBuffer.remaining())
      valBuffer.get(bytes)
      val value = new String(bytes)
      val field = FixField(tagNum, value)
      tagBuffer.clear()
      valBuffer.clear()
      onTag(field)
    }
  }

  def onTag(field: FixField) {
  }

  /**
   * Parse raw sequence of FIX fields and find repeating groups.
   * @param fields Sequence of raw FIX fields.
   * @return A sequence of FIX elements, which can be fields, or repeating groups.
   */
  def parse(fields: Seq[FixField]): FixComponent = FixComponent(parse(Seq[FixElement](), fields): _*)

  private def fault() {
    tagBuffer.clear()
    valBuffer.clear()
    byteState = ByteState.Garbage
  }

  @tailrec
  private def parse(parsed: Seq[FixElement], rest: Seq[FixField]): Seq[FixElement] = {
    if (rest.isEmpty) parsed else {
      val next: FixField = rest.head
      if (!dictionary.isGroupTag(next.tag)) parse(parsed :+ next, rest.tail) else {
        val (group, unparsedRest) = parseGroup(next, rest.tail)
        parse(parsed :+ group, unparsedRest)
      }
    }
  }

  private def parseGroup(groupField: FixField, rest: Seq[FixField]): (FixGroup, Seq[FixField]) = {
    val allowedTags = dictionary.getAllowedTags(groupField.tag)
    val numberOfSequences = groupField.value.asInstanceOf[FixInteger].value
    var unparsedRest = rest
    val result = for (i <- 1 to numberOfSequences) yield {
        val (seq, rest) = parseSeq(List.empty, unparsedRest, allowedTags)
        unparsedRest = rest
        seq
    }
    (FixGroup(TagNum(groupField.tagNumber), result: _*), unparsedRest)
  }

  @tailrec
  private def parseSeq(parsed: Seq[FixElement], rest: Seq[FixField], allowed: Set[TagNum]):
      (Seq[FixElement], Seq[FixField]) = {
    if (rest.isEmpty) Pair(parsed, List.empty) else {
      val next = rest.head
      if (!allowed.contains(next.tag)) Pair(parsed, rest)
      else if (!dictionary.isGroupTag(next.tag)) parseSeq(parsed :+ next, rest.tail, allowed - next.tag) else {
        val (group, unparsed) = parseGroup(next, rest.tail)
        parseSeq(parsed :+ group, unparsed, allowed - next.tag)
      }
    }
  }

  object ByteState extends Enumeration {
    val Garbage, Tagnum, Equals, Val, Split = Value
  }
}