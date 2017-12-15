import Dependencies._

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "dk.heynjohnsen",
      scalaVersion := "2.12.4",
      version      := "0.1.0"
    )),
    name := "WifiScan",
    libraryDependencies += scalaTest % Test
  )