name := "test-project"
version := "0.1.0"

lazy val codegen = project

lazy val myFirstApplication = (project in file(".")).aggregate(codegen).dependsOn(codegen)

libraryDependencies ++= Seq(
   "com.typesafe.slick" %% "slick" % "3.1.0",
   "com.typesafe.slick" %% "slick-codegen" % "3.1.0",
   "com.h2database" % "h2" % "1.3.170",
   "mysql" % "mysql-connector-java" % "5.1.34"
)

// h2
enablePlugins(SlickCodeGenH2)
slickUrl := { _ => s"jdbc:h2:mem:test;INIT=runscript from '${baseDirectory.value / "h2.create.sql"}'" }
slickSourceCodeGenerator := "demo.CustomizedCodeGenerator"

// mysql
enablePlugins(SlickCodeGenMySql)
//slickPort := 33066
//slickUser := Some("test")
//slickPassword := Some("test")
//slickDatabases += "your-db"

sourceGenerators in Compile <+= slickGenTables

// https://github.com/slick/slick-codegen-customization-example/blob/master/project/Build.scala
// https://www.playframework.com/documentation/2.3.x/SBTSubProjects
// http://xerial.org/blog/2014/03/26/buidling-multi-module-projects-in-sbt/
