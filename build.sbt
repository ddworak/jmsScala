name := "jmsScala"

version := "0.81"

scalaVersion := "2.11.7"

crossScalaVersions := Seq("2.10.3", "2.11.7")

fullResolvers := {
  ("JBoss" at "https://repository.jboss.org/nexus/content/groups/public") +: fullResolvers.value
}

libraryDependencies += "javax.jms" % "jms" % "1.1"

scalaSource in Compile := baseDirectory.value / "src"

excludeFilter in unmanagedSources := "example"
