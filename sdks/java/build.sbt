lazy val root = (project in file(".")).
  settings(
    organization := "com.dropbox.sign",
    name := "dropbox-sign",
    version := "1.1.1",
    scalaVersion := "2.11.4",
    scalacOptions ++= Seq("-feature"),
    Compile / javacOptions ++= Seq("-Xlint:deprecation"),
    Compile / packageDoc / publishArtifact := false,
    resolvers += Resolver.mavenLocal,
    libraryDependencies ++= Seq(
      libraryDependencies += "commons-codec" % "commons-codec" % "1.15"
      "com.google.code.findbugs" % "jsr305" % "3.0.0",
      "io.swagger" % "swagger-annotations" % "1.6.3",
      "org.glassfish.jersey.core" % "jersey-client" % "2.35",
      "org.glassfish.jersey.inject" % "jersey-hk2" % "2.35",
      "org.glassfish.jersey.media" % "jersey-media-multipart" % "2.35",
      "org.glassfish.jersey.media" % "jersey-media-json-jackson" % "2.35",
      "org.glassfish.jersey.connectors" % "jersey-apache-connector" % "2.35",
      "com.fasterxml.jackson.core" % "jackson-core" % "2.13.0" % "compile",
      "com.fasterxml.jackson.core" % "jackson-annotations" % "2.13.0" % "compile",
      "com.fasterxml.jackson.core" % "jackson-databind" % "2.13.0" % "compile",
      "com.fasterxml.jackson.datatype" % "jackson-datatype-jsr310" % "2.13.0" % "compile",
      "com.github.joschi.jackson" % "jackson-datatype-threetenbp" % "2.12.5" % "compile",
      "jakarta.annotation" % "jakarta.annotation-api" % "1.3.5" % "compile",
      "junit" % "junit" % "4.13.2" % "test",
      "com.novocode" % "junit-interface" % "0.10" % "test"
    )
  )
