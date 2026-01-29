import Dependencies._

ThisBuild / scalafmtOnCompile := true
ThisBuild / name := "$name$"
ThisBuild / organization := "$organization$"
ThisBuild / version := "0.0.1-SNAPSHOT"
ThisBuild / scalaVersion := "$scala_version$"

lazy val `$name;format="norm"$` = (project in file("."))
  .settings(commonSettings)
  .settings(
    libraryDependencies ++= commonDependencies
  )

lazy val domain = (project in file("domain"))
  .settings(commonSettings)
lazy val core =
  (project in file("core"))
    .settings(commonSettings)
    .dependsOn(domain % oneToOneClassDependency)
lazy val delivery =
  (project in file("delivery"))
    .settings(commonSettings)
    .dependsOn(core % oneToOneClassDependency)
lazy val persistence =
  (project in file("persistence"))
    .settings(commonSettings)
    .dependsOn(core % oneToOneClassDependency)
lazy val main =
  (project in file("main"))
    .settings(commonSettings)
    .dependsOn(delivery % oneToOneClassDependency)
    .dependsOn(persistence % oneToOneClassDependency)

lazy val oneToOneClassDependency = "compile->compile;test->test"
lazy val commonSettings = Seq()
lazy val commonDependencies = Seq(
  org.typelevel.`cats-core`,
  dev.optics.monocle,
  dev.optics.`monocle-generic`
)
lazy val testDependencies = Seq(
  org.scalatest.scalatest
)
