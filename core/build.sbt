name := "JetMQ"

version := "0.1.0"

scalaVersion := "2.11.7"

scalacOptions ++= Seq(
  "-Xlint",
  "-deprecation",
  "-unchecked",
  "-feature"
)

libraryDependencies ++= Seq(
  "org.specs2" %% "specs2-core" % "3.6.4" % "test",
  "com.typesafe.akka" %% "akka-actor" % "2.4.0",
  "com.typesafe.akka" %% "akka-testkit" % "2.4.0",
  "com.typesafe.akka" %% "akka-slf4j" % "2.4.0",
  "org.scodec" %% "scodec-core" % "1.7.1",
  "org.scodec" %% "scodec-bits" % "1.0.9",
  "org.scalaz" %% "scalaz-core" % "7.1.3",
  "com.typesafe.play" %% "play-json" % "2.4.0",
  "com.typesafe.akka" % "akka-stream-experimental_2.11" % "2.0-M2",
  "com.typesafe.akka" % "akka-http-core-experimental_2.11" % "2.0-M2",
  "com.typesafe.akka" % "akka-http-experimental_2.11" % "2.0-M2"
)

enablePlugins(JavaAppPackaging)
