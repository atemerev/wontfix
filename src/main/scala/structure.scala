package com.miriamlaurel.wontfix.structure

import com.miriamlaurel.wontfix.numbers.Decimal
import com.miriamlaurel.wontfix.types._

sealed trait FixElement {
  def flatten: List[FixField]
  override def toString: String = flatten.map(field => field.toString).mkString(" | ")
}

case class FixField(tag: TagNum, value: FixValue[Any]) extends FixElement {

  def this(tagNumber: Int, value: FixValue[Any]) = this(TagNum(tagNumber), value)

  lazy val tagNumber = tag.value

  override def toString: String = tagNumber.toString + "=" + value.toString

  def flatten = List(this)
}

object FixField {
  def apply(tagNumber: Int, value: FixValue[Any]) = new FixField(TagNum(tagNumber), value)
  def apply(tagNumber: Int, value: Int) = new FixField(TagNum(tagNumber), FixInteger(value))
  def apply(tagNumber: Int, value: Decimal) = new FixField(TagNum(tagNumber), FixFloat(value))
  def apply(tagNumber: Int, value: Char) = new FixField(TagNum(tagNumber), FixChar(value))
  def apply(tagNumber: Int, value: String) = new FixField(TagNum(tagNumber), FixString(value))
}

case class FixRepeatingGroup(groupTag: TagNum, groups: List[FixElement]*) extends FixElement {

  require(groups.forall(e => e.size > 0 && e(0).isInstanceOf[FixField]) &&
    groups.map(_(0).asInstanceOf[FixField].tagNumber).toSet.size == 1,
      "Group validation failed")

  def size = groups.length

  lazy val flatten = FixField(groupTag, NumInGroup(size)) :: groups.flatten.map(_.flatten).flatten.toList
}
object FixRepeatingGroup {
  def apply(groupNumber: Int, groups: List[FixElement]*) = new FixRepeatingGroup(TagNum(groupNumber), groups: _*)
}

case class FixStructure(elements: FixElement*) extends FixElement {
  lazy val flatten = elements.map(_.flatten).flatten.toList
}

case class FixMessage(msgType: String, structure: FixStructure)