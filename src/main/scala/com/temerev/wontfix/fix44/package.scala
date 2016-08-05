package com.temerev.wontfix

package object fix44 {
  val FixVersion = 8
  val MsgType = 34
  val MDReqID = 262
  val SubscriptionRequestType = 263
  val MarketDepth = 264
  val MDUpdateType = 265
  val NoMDEntryTypes = 267
  val NoMDEntries = 268
  val MDEntryType = 269
  val MDEntryPx = 270
  val MDEntrySize = 271
  val MDEntryDate = 272
  val MDEntryTime = 273
  val NoRelatedSym = 146
  val SecurityID = 48
  val SecurityIDSource = 22
  val Price = 242
  val TransactTime = 60

  val mockLmaxDictionary = new FixDictionary {

    override def getTagsInGroup(msgType: String, groupTag: Int): Seq[Int] = (msgType, groupTag) match {
      case (messages.MarketDataRequest, NoRelatedSym) => Seq(SecurityID, SecurityIDSource)
      case (messages.MarketDataRequest, NoMDEntries) => Seq(MDEntryType)
      case (messages.MarketDataSnapshotFullRefresh, NoMDEntries) => Seq(MDEntryType, MDEntryPx, MDEntrySize, MDEntryDate, MDEntryTime)
      case _ => Seq.empty
    }

    override def getTagsInMessage(msgType: String): Seq[Int] = msgType match {
      case messages.MarketDataRequest => Seq(MDReqID, SubscriptionRequestType, MarketDepth, MDUpdateType, NoMDEntryTypes, NoRelatedSym)
      case messages.MarketDataSnapshotFullRefresh => Seq(MDReqID, SecurityID, SecurityIDSource, NoMDEntries)
    }
  }
}
