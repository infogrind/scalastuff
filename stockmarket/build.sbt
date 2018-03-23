import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "ch.hotstuff",
      scalaVersion := "2.12.4",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "stockmarket",
    libraryDependencies += junit % Test,
    libraryDependencies += scalaTest % Test
  )
