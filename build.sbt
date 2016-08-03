mainClass in Compile := Some("com.miriamlaurel.carb.Main")

lazy val root = (project in file(".")).
  settings(
    name := "wontfix",
    organization := "com.temerev",
    scalaVersion := "2.11.8",
    version := "0.1.0",
    sbtVersion := "0.13.12",
    libraryDependencies ++= Seq(
      "com.typesafe.akka" %% "akka-actor" % "2.4.8",
      "com.typesafe.akka" %% "akka-stream" % "2.4.8",
      "org.scalatest" %% "scalatest" % "2.2.6" % "test"
    )
  )
