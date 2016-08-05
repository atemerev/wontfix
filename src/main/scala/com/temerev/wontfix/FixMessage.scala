package com.temerev.wontfix

import fix44._

case class FixMessage private(header: Fix, body: Fix, trailer: Fix) {
  def fixVersion: String = header.getString(FixVersion)
  def msgType: String = header.getString(MsgType)
}