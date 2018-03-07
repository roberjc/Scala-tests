name:= "TestEclipse"
version:= "2.0"
scalaVersion:= "2.11.8"

val sparkVersion = "2.2.0"

libraryDependencies += "org.scala-lang" % "scala-library" % "2.11.8"
libraryDependencies += "org.apache.spark" % "spark-core_2.11" % sparkVersion

publishMavenStyle:= false
EclipseKeys.withJavadoc := false
EclipseKeys.withSource := false