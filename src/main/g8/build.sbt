// give the user a nice default project!
ThisBuild / scalafmtOnCompile := true
ThisBuild / organization := "$organization$"
ThisBuild / version := "0.0.1-SNAPSHOT"
ThisBuild / scalaVersion := "$scala_version$"

val oneToOneClassDependency = "compile->compile;test->test"

lazy val `$name;format="norm"$` = (project in file(".")).settings(
  name := "$name$"
)

lazy val domain = (project in file("domain"))
lazy val core =
  (project in file("core")).dependsOn(domain % oneToOneClassDependency)
lazy val delivery =
  (project in file("delivery")).dependsOn(core % oneToOneClassDependency)
lazy val persistence =
  (project in file("persistence")).dependsOn(core % oneToOneClassDependency)
lazy val main =
  (project in file("main"))
    .dependsOn(delivery % oneToOneClassDependency)
    .dependsOn(persistence % oneToOneClassDependency)
