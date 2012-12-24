package com.miriamlaurel.wontfix.structure

import com.miriamlaurel.wontfix.types._

sealed trait FixElement {
  def flatten: Seq[FixField]
  override def toString: String = flatten.map(field => field.toString).mkString(" | ")
}

class FixField(val tag: TagNum, val value: FixValue[Any]) extends FixElement {

  def this(tagNumber: Int, value: FixValue[Any]) = this(TagNum(tagNumber), value)

  lazy val tagNumber = tag.value

  override def toString: String = tagNumber.toString + "=" + value.toString

  def flatten = Seq(this)

  override def equals(obj: Any): Boolean = obj match {
    case that: FixField => this.tag == that.tag && this.value == that.value
    case _ => false
  }

  override def hashCode(): Int = super.hashCode()
}

object FixField {
  def apply(tag: TagNum, value: FixValue[Any]): FixField = new FixField(tag, value)
  def apply(tagNumber: Int, value: FixValue[Any]): FixField = new FixField(TagNum(tagNumber), value)
  def apply(tagNumber: Int, value: Int): FixField = new FixField(TagNum(tagNumber), FixInteger(value))
  def apply(tagNumber: Int, value: BigDecimal): FixField = new FixField(TagNum(tagNumber), FixFloat(value))
  def apply(tagNumber: Int, value: Char): FixField = new FixField(TagNum(tagNumber), FixChar(value))
  def apply(tagNumber: Int, value: String): FixField = new FixField(TagNum(tagNumber), FixString(value))
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

case class FixComponent(elements: FixElement*) extends FixElement {
  lazy val flatten = elements.map(_.flatten).flatten.toSeq
}

case class FixMessage(msgType: String, structure: FixComponent)

