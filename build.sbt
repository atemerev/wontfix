import sbt.Keys._

scalaVersion in ThisBuild := "2.11.8"
sbtVersion in ThisBuild := "0.13.12"

lazy val root = (project in file(".")).
  aggregate(wontFixJs, wontFixVM).
  settings(
    publish := {},
    publishLocal := {},
    name := "wontfix",
    version := "0.1-SNAPSHOT",
    organization := "com.temerev",
    version := "0.1.0"
  )

lazy val wontFix = crossProject.crossType(CrossType.Pure).in(file(".")).
  settings(
    libraryDependencies ++= Seq(
      "org.scalatest" %% "scalatest" % "2.2.6" % "test"
    )
  ).
  jsSettings(
    libraryDependencies ++= Seq(
      "org.scala-js" %%% "scalajs-java-time" % "0.2.0"
    )
  )

lazy val wontFixVM = wontFix.jvm
lazy val wontFixJs = wontFix.js