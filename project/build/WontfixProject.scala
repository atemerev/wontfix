/*
 * WontFIX: A pragmatic Scala FIX engine.
 *
 * Copyright (C) 2011 Miriam Laurel Sarl.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
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