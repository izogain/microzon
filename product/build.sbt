import AssemblyKeys._

name := """product"""

version := "0.1.0"

scalaVersion := "2.10.4"

resolvers += "spray" at "http://repo.spray.io/"

resolvers += "Sonatype Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/"

libraryDependencies ++= {
  val akkaV = "2.3.5"
  val sprayV = "1.3.1"
  Seq(
    "io.spray" % "spray-can" % sprayV,
    "io.spray" % "spray-routing" % sprayV,
    "io.spray" %% "spray-json" % "1.2.6",
    "tyrex" % "tyrex" % "1.0.1",
    "org.reactivemongo" %% "reactivemongo" % "0.10.5.akka23-SNAPSHOT",
    "io.spray" % "spray-testkit" % sprayV % "test",
    "com.typesafe.akka" %% "akka-actor" % akkaV,
    "com.typesafe.akka" %% "akka-testkit" % akkaV % "test",
    "org.specs2" %% "specs2-core" % "2.3.7" % "test"
  )
}

assemblySettings

mainClass in assembly := Some("de.leanovate.dose.product.Application")

target in assembly := baseDirectory.value / ".." / "vagrant" / "dists"
