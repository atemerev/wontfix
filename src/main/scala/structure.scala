package com.miriamlaurel.wontfix.structure

import com.miriamlaurel.wontfix.types._

sealed trait FixElement {
  def flatten: Seq[FixField]
  override def toString: String = flatten.map(field => field.toString).mkString(" | ")
}

object FixElement {
  def apply(tagNum: Int, value: Any): FixElement = value match {
    case v: Int => FixField(tagNum, v)
    case v: Char => FixField(tagNum, v)
    case v: String => FixField(tagNum, v)
    case v: BigDecimal => FixField(tagNum, v)
    case v: FixValue[_] => FixField(tagNum, v)
    case _ => throw new IllegalArgumentException("Can't match value: " + value)
  }
}

case class FixField(tag: TagNum, value: FixValue[_]) extends FixElement {

  def this(tagNumber: Int, value: FixValue[_]) = this(TagNum(tagNumber), value)

  lazy val tagNumber = tag.value

  override def toString: String = tagNumber.toString + "=" + value.toString

  def flatten = Seq(this)
}

object FixField {
  def apply(tagNumber: Int, value: FixValue[_]): FixField = FixField(TagNum(tagNumber), value)
  def apply(tagNumber: Int, value: Int): FixField = FixField(TagNum(tagNumber), FixInteger(value))
  def apply(tagNumber: Int, value: BigDecimal): FixField = FixField(TagNum(tagNumber), FixFloat(value))
  def apply(tagNumber: Int, value: Char): FixField = FixField(TagNum(tagNumber), FixChar(value))
  def apply(tagNumber: Int, value: String): FixField = FixField(TagNum(tagNumber), FixString(value))
}

case class FixGroup(groupTag: TagNum, groups: Seq[FixElement]*) extends FixElement {

  require(groups.forall(e => e.length > 0), "Empty groups are not allowed")
  require(groups.map(_(0).asInstanceOf[FixField].tagNumber).toSet.size == 1,
      "Group validation failed")

  def size = groups.length

  lazy val flatten = FixField(groupTag, NumInGroup(size)) +: groups.flatten.map(_.flatten).flatten.toSeq
}

object FixGroup {
  def apply(tagNum: Int, groups: Seq[FixElement]*): FixGroup = FixGroup(TagNum(tagNum), groups: _*)
}

case class FixComponent(elements: FixElement*) extends FixElement {
  lazy val flatten = elements.map(_.flatten).flatten.toSeq
}

case class FixMessage(msgType: String, body: FixComponent)

object FixMessage {
  def apply(msgType: String, elems: FixElement*): FixMessage = FixMessage(msgType, FixComponent(elems: _*))
}

