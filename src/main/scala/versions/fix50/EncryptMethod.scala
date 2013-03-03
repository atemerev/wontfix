package com.miriamlaurel.wontfix.versions.fix50

import com.miriamlaurel.wontfix.types
import com.miriamlaurel.wontfix.structure._

case class EncryptMethod(i: Int) extends FixField(98, types.FixInteger(i))

object EncryptMethod {
  val NONE_OTHER = EncryptMethod(0)
  val PKCS = EncryptMethod(1)
  val DES = EncryptMethod(2)
  val PKCS_DES = EncryptMethod(3)
  val PGP_DES = EncryptMethod(4)
  val PGP_DES_MD5 = EncryptMethod(5)
  val PEM_DES_MD5 = EncryptMethod(6)
}