import sbt._

lazy val monocleVersion = "3.3.0"
lazy val catsVersion = "2.13.0"
lazy val chimneyVersion = "1.18.2"
lazy val scalatestVersion = "3.2.19"

object org {
  object scalatest {
    lazy val scalatest =
      "org.scalatest" %% "scalatest" % scalatestVersion % "test"
  }
  object typelevel {
    lazy val `cats-core` = "org.typelevel" %% "cats-core" % catsVersion
  }
}
object dev {
  object optics {
    lazy val monocle = "dev.optics" %% "monocle" % monocleVersion
    lazy val `monocle-generic` =
      "dev.optics" %% "monocle-generic" % monocleVersion
  }
}
