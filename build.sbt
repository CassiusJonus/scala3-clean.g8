// This build is for this Giter8 template.
lazy val root = (project in file("."))
  .settings(
    name := "scala3-clean.g8",
    Test / Keys.test := {
      val _ = (Test / g8Test).toTask("").value
    },
    scriptedLaunchOpts ++= List(
      "-Xms1024m",
      "-Xmx1024m",
      "-XX:ReservedCodeCacheSize=128m",
      "-Xss2m",
      "-Dfile.encoding=UTF-8"
    )
  )
