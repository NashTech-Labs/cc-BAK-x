import sbt._
import sbt.Keys._
object Dependencies {

  val VERSION = "1.1-SNAPSHOT"

  lazy val basicSettings = Seq(
    version := "1.0-SNAPSHOT",
    homepage := Some(new URL("http://knoldus.com")),
    organization := "BAK-X",
    organizationHomepage := Some(new URL("http://knoldus.com")),
    description := "Knol-X, Leave and Wordpress",
    startYear := Some(2017),
    scalaVersion in ThisBuild := "2.11.8",
    parallelExecution in ThisBuild := false,
    parallelExecution in Test := false,
    ivyScala := ivyScala.value map {
      _.copy(overrideScalaVersion = true)
    },
    updateOptions := updateOptions.value.withCachedResolution(true),
    scalacOptions := Seq(
      "-encoding", "utf8",
      "-feature",
      "-unchecked",
      "-deprecation",
      "-language:_",
      "-Xlog-reflective-calls"
    )
  )

  val playV = "2.5.0"
  val silhouetteV = "3.0.0"
  val akkaV = "2.3.4"
  val scalaV = "2.11.8"

  val playEvolution: ModuleID = "com.typesafe.play" %% "play-jdbc-evolutions" % playV
  val playJDBC: ModuleID = "com.typesafe.play" %% "play-jdbc" % playV
  val playJSON: ModuleID = "com.typesafe.play" %% "play-json" % playV
  val playWS: ModuleID = "com.typesafe.play" %% "play-ws" % playV
  val silhouette: ModuleID = "com.mohiva" %% "play-silhouette" % silhouetteV
  val silhouetteTest: ModuleID = "com.mohiva" %% "play-silhouette-testkit" % silhouetteV
  val akka: ModuleID = "com.typesafe.akka" %% "akka-actor" % akkaV
  val postgres: ModuleID = "postgresql" % "postgresql" % "9.1-901.jdbc4"
  val akkaHttp: ModuleID = "com.typesafe.akka" %% "akka-http-core" % "10.0.7"
  val akkaHttpExperimental: ModuleID = "com.typesafe.akka" %% "akka-http-experimental" % "2.4.11.2"
  val akkaHttpSpray: ModuleID = "com.typesafe.akka" %% "akka-http-spray-json-experimental" % "2.4.11.2"
  val akkaHttpTestKit: ModuleID = "com.typesafe.akka" % "akka-http-testkit_2.11" % "10.0.8" % "test"
  val playSilhouette: ModuleID = "com.mohiva" % "play-silhouette_2.11" % "4.0.0"
  val playSilCrypto: ModuleID  = "com.mohiva" % "play-silhouette-password-bcrypt_2.11" % "4.0.0"
  val playJca : ModuleID = "com.mohiva" % "play-silhouette-crypto-jca_2.11" % "4.0.0"
  val playPersistance : ModuleID = "com.mohiva" % "play-silhouette-persistence_2.11" % "4.0.0"
  val playSilhouetteTestKit : ModuleID = "com.mohiva" % "play-silhouette-testkit_2.11" % "4.0.0"
  val scalaGuice : ModuleID = "net.codingwell" % "scala-guice_2.11" % "4.1.0"
  val morphia : ModuleID = "org.mongodb.morphia" % "morphia" % "1.3.2"
  val jacksonDataType : ModuleID = "com.fasterxml.jackson.datatype" % "jackson-datatype-joda" % "2.9.0.pr4"
  val jodaTime : ModuleID = "joda-time" % "joda-time" % "2.9.9"
  val jacksonModule : ModuleID = "com.fasterxml.jackson.module" % "jackson-module-scala_2.11" % "2.9.0.pr3"
  val jacksonDataTypeJson : ModuleID = "com.fasterxml.jackson.datatype" % "jackson-datatype-json-org" % "2.9.0.pr4"
  val unirest : ModuleID = "com.mashape.unirest" % "unirest-java" % "1.4.9"
  val jsonJackson: ModuleID = "org.json4s" % "json4s-jackson_2.11" % "3.5.2"
  val scalaTest: ModuleID = "org.scalatest" % "scalatest_2.11" % "3.0.3" % "test"
  val embeddedMongo: ModuleID ="com.github.simplyscala" %% "scalatest-embedmongo" % "0.2.4" % "test"
  val slick: ModuleID = "com.typesafe.slick" % "slick_2.11" % "3.2.0"
  val slickCp: ModuleID = "com.typesafe.slick" %% "slick-hikaricp" % "3.2.0"
  val postgresSql: ModuleID = "org.postgresql" % "postgresql" % "9.4.1212"
  val json4s: ModuleID = "org.json4s" % "json4s-native_2.11" % "3.5.2"
}