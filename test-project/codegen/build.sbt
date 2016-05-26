name := "codegen"
version := "0.1.0"

libraryDependencies ++= Seq(
   "com.typesafe.slick" %% "slick" % "3.1.0",
   "com.typesafe.slick" %% "slick-codegen" % "3.1.0",
   "com.h2database" % "h2" % "1.3.170",
   "mysql" % "mysql-connector-java" % "5.1.34"
)
