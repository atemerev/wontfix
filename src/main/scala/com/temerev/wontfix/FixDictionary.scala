package com.temerev.wontfix

trait FixDictionary {
  def getTagsInGroup(msgType: String, groupTag: Int): Seq[Int]
  def getTagsInMessage(msgType: String): Seq[Int]
}
