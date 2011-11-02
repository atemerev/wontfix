package com.miriamlaurel.wontfix.parse

import annotation.tailrec
import com.miriamlaurel.wontfix.structure.{FixRepeatingGroup, FixField, FixElement}
import com.miriamlaurel.wontfix.dictionary.FixDictionary
import com.miriamlaurel.wontfix.types.{FixInteger, TagNum}

class Parser(dictionary: FixDictionary) {

  def parse(fields: Seq[FixField]): Seq[FixElement]  = parse(Seq[FixElement](), fields)

  @tailrec
  private def parse(parsed: Seq[FixElement], rest: Seq[FixField]): Seq[FixElement] = {
    if (parsed.isEmpty) parsed else {
      val next: FixField = rest.head
      if (dictionary.isGroupTag(next.tag)) parse(parsed :+ next, rest.tail) else {
        val (group, unparsedRest) = parseGroup(next, rest)
        parse(parsed :+ group, unparsedRest)
      }
    }
  }

  private def parseGroup(groupField: FixField, rest: Seq[FixField]): (FixRepeatingGroup, Seq[FixField]) = {
    val allowedTags = dictionary.getTagListFor(groupField.tag)
    val numberOfSequences = groupField.value.asInstanceOf[FixInteger].value;
    var unparsedRest = rest
    val result = for (i <- 1 to numberOfSequences) yield {
        val (seq, rest) = parseSeq(List.empty, unparsedRest, allowedTags)
        unparsedRest = rest
        seq
    }
    (FixRepeatingGroup(groupField.tagNumber, result: _*), unparsedRest)
  }

  @tailrec
  private def parseSeq(parsed: Seq[FixElement], rest: Seq[FixField], allowed: Set[TagNum]):
      (Seq[FixElement], Seq[FixField]) = {
    if (rest.isEmpty) Pair(parsed, List.empty) else {
      val next = rest.head
      if (!allowed.contains(next.tag)) Pair(parsed, rest)
      else if (!dictionary.isGroupTag(next.tag)) parseSeq(parsed :+ next, rest.tail, allowed - next.tag) else {
        val (group, unparsed) = parseGroup(next, rest)
        parseSeq(parsed :+ group, unparsed, allowed - next.tag)
      }
    }
  }
}