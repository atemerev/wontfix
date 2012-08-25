package com.miriamlaurel.wontfix.structure

import com.miriamlaurel.wontfix.numbers.Decimal
import com.miriamlaurel.wontfix.types._
import com.miriamlaurel.wontfix.fix50.fields.{PosAmt, PriorityIndicator, PosReqID}

sealed trait FixElement {
  def flatten: Seq[FixField]
  override def toString: String = flatten.map(field => field.toString).mkString(" | ")
}

case class FixField(tag: TagNum, value: FixValue[Any]) extends FixElement {

  def this(tagNumber: Int, value: FixValue[Any]) = this(TagNum(tagNumber), value)

  lazy val tagNumber = tag.value

  override def toString: String = tagNumber.toString + "=" + value.toString

  def flatten = Seq(this)
}

object FixField {
  def apply(tagNumber: Int, value: FixValue[Any]): FixField = FixField(TagNum(tagNumber), value)
  def apply(tagNumber: Int, value: Int): FixField = FixField(TagNum(tagNumber), FixInteger(value))
  def apply(tagNumber: Int, value: Decimal): FixField = FixField(TagNum(tagNumber), FixFloat(value))
  def apply(tagNumber: Int, value: Char): FixField = FixField(TagNum(tagNumber), FixChar(value))
  def apply(tagNumber: Int, value: String): FixField = FixField(TagNum(tagNumber), FixString(value))
}

case class FixRepeatingGroup(groupTag: TagNum, groups: Seq[FixElement]*) extends FixElement {

  require(groups.forall(e => e.length > 0), "Empty groups are not allowed")
  require(groups.map(_(0).asInstanceOf[FixField].tagNumber).toSet.size == 1,
      "Group validation failed")

  def size = groups.length

  lazy val flatten = FixField(groupTag, NumInGroup(size)) +: groups.flatten.map(_.flatten).flatten.toSeq
}
object FixRepeatingGroup {
  def apply(groupNumber: Int, groups: Seq[FixElement]*) = new FixRepeatingGroup(TagNum(groupNumber), groups: _*)
}

case class FixStructure(elements: FixElement*) extends FixElement {
  lazy val flatten = elements.map(_.flatten).flatten.toSeq
}

case class FixMessage(msgType: String, structure: FixStructure)

case class Instrument(s: PriorityIndicator, s1: Option[PosAmt] = None, s2: Option[PosReqID] = None) extends FixStructure({
  val required: Seq[FixElement] = Seq(s)
  val optional: Seq[FixElement] = Seq(s1, s2).flatten
  required ++ optional
}: _*)
