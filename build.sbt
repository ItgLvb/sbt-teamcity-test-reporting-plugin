name := "sbt-teamcity-test-reporting-plugin"

organization := "ru.infobis"

sbtPlugin := true

publishTo := Some("Artifactory Realm" at "http://artifactory.infobis.ru/artifactory/sbt")

credentials += Credentials(Path.userHome / ".sbt" / ".credentials")