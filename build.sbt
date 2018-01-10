scalaVersion := "2.12.3"

name := "sbt-teamcity-test-reporting-plugin"

organization := "com.gu"

sbtPlugin := true

releaseSettings

publishTo <<= version { (v: String) =>
  val nexus = "http://nexus.aquto.internal:8081/nexus/content/repositories/"
  if (v.trim.endsWith("SNAPSHOT"))
    Some("snapshots" at nexus + "snapshots")
  else
    Some("releases"  at nexus + "releases")
}

publishMavenStyle := true