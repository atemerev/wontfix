package com.miriamlaurel.wontfix.dictionary

import xml.Node
import com.miriamlaurel.wontfix.types.TagNum
import com.miriamlaurel.wontfix.util._

class FixDictionary(root: Node) {
  def getTagListFor(groupTag: TagNum): Set[TagNum] = undefined
  def isGroupTag(tag: TagNum): Boolean = undefined
}