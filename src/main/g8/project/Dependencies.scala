import sbt._


object Dependencies {
  object org {
			object scalatest {
				val scalatestVersion = "3.2.19"
				val scalatest =
					"org.scalatest" %% "scalatest" % scalatestVersion % "test"
			}
			object typelevel {
				val catsVersion = "2.13.0"
				val `cats-core` = "org.typelevel" %% "cats-core" % catsVersion
			}
		}
		object dev {
			object optics {
				val monocleVersion = "3.3.0"
				val monocle = "dev.optics" %% "monocle" % monocleVersion
				val `monocle-generic` =
					"dev.optics" %% "monocle-generic" % monocleVersion
			}
		}

}
