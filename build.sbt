name := "Spark_Scala_Cucumber"

version := "0.1"

scalaVersion := "2.11.11"

libraryDependencies ++=  Seq (
  "io.cucumber" % "cucumber-core" % "4.3.0",
  "io.cucumber" %% "cucumber-scala" % "4.3.0",
  "io.cucumber" % "cucumber-jvm" % "4.3.0" pomOnly(),
  "io.cucumber" % "cucumber-junit" % "4.3.0",
  "org.apache.commons" % "commons-lang3" % "3.9")


libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.2.1"

libraryDependencies += "org.apache.spark" %% "spark-core" % "2.2.1"


libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % Test