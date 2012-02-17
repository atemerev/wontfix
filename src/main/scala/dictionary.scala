package com.miriamlaurel.wontfix.dictionary

import xml.Node
import com.miriamlaurel.wontfix.types.TagNum

class FixDictionary(root: Node) {

  private[FixDictionary] val fields = root \ "fields" \ "field"
  private[FixDictionary] val fieldsByName = Map[String, Node](fields.map(node => (node \ "@name").text -> node): _*)

  private[FixDictionary] val groupTags = Map[Int, Node](
    fields
      .filter(node => (node \ "@type").text == "NUMINGROUP")
      .map(node => (node \ "@number").text.toInt -> node): _*
  )

  private[FixDictionary] val allowedTags: Map[TagNum, Set[Node]] = groupTags.map(
    entry => {
      val tagNum = TagNum(entry._1)
      val groupTagName = (entry._2 \ "@name").text
      val groupTag = (root \\ "group").find(node => (node \ "@name").text == groupTagName).get
      val groupFields = (groupTag \ "field").map(node => (node \ "@name").text).map(fieldsByName).toSet
      tagNum -> groupFields
    }
  )

  def getAllowedTags(groupTag: TagNum): Set[TagNum] = allowedTags
    .get(groupTag)
    .getOrElse(Set[Node]())
    .map(node => TagNum((node \ "@number").text.toInt))

  def isGroupTag(tag: TagNum): Boolean = groupTags contains tag.value
}