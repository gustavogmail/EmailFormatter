lazy val root = (project in file("."))
  .enablePlugins(PlayScala)
  .settings(
    name := """EmailFormatter""",
    version := "2.8.x",
    scalaVersion := "2.13.8",
    libraryDependencies ++= Seq(
      guice,
      "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0" % Test
    ),
    scalacOptions ++= Seq(
      "-feature",
      "-deprecation",
      "-Xfatal-warnings"
    )
  )
