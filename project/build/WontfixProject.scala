/*
 * Copyright (c) Miriam Laurel Sarl, 2011. Licensed under GNU Affero General Public License Version 3.
 * See LICENSE.txt for more details.
 */

import sbt._

class WontfixProject(info: ProjectInfo) extends DefaultProject(info) with AkkaProject with assembly.AssemblyBuilder {

  val mlRepo = "Miriam Laurel repository" at "http://miriamlaurel.com:8080/archiva/repository/internal"
  val mlRepoSnapshots = "Miriam Laurel repository" at "http://miriamlaurel.com:8080/archiva/repository/snapshots"

  val akkaStm = akkaModule("stm")

  override def libraryDependencies = Set(
    "org.apache.mina" % "mina-core" % "2.0.4",
    "net.lag" % "configgy" % "2.0.3-SNAPSHOT",
    "org.scalatest" % "scalatest_2.8.1" % "1.5.1" % "test",
    "ch.qos.logback" % "logback-classic" % "0.9.29"
  ) ++ super.libraryDependencies
}