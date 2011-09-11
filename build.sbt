name:="samplescala"

version:="1.0"

scalaVersion := "2.9.0-1"

libraryDependencies ++= Seq(
    "org.scalatest" % "scalatest_2.9.0" % "1.6.1"
)

defaultExcludes ~= (filter => filter || "*~")
