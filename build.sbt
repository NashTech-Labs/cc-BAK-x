import Dependencies._

coverageEnabled := true

lazy val root: _root_.sbt.Project = Project(id = "bak-x", base = file("."))
  .settings(basicSettings)
  .aggregate(leave, core)

lazy val core = project.in(file("core")).settings(basicSettings)
  .settings(libraryDependencies ++= Seq(
    akkaHttp,
    scalaTest,
    akkaHttpTestKit,
    akkaHttpExperimental,
    akkaHttpSpray
  ))

lazy val leave: Project = project.in(file("leave"))
  .settings(basicSettings)
  .settings(libraryDependencies ++= Seq(
    slick,
    slickCp,
    postgresSql,
    scalaTest,
    akkaHttpTestKit,
    json4s,
    jsonJackson,
    scalaGuice
  ))
  .dependsOn(core)
