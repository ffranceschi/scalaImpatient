scalaVersion := "2.12.7"
organization := "com.wise"

lazy val root = (project in file("."))
  .settings(
    name := "impatient",
    libraryDependencies ++= Seq("org.scalatest" %% "scalatest" % "3.0.5" % "test")
  )
