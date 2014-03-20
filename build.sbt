name := "fsmtest"

version := "1.0-SNAPSHOT"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  "com.typesafe.akka" %% "akka-testkit" % "2.2.0" % "test" withSources(),
  "org.scalatest" % "scalatest_2.10" % "2.1.0" % "test" withSources()
)     

play.Project.playScalaSettings

testOptions in Test := Nil