import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "numguess-play-scala"
    val appVersion      = "1.0"

    val appDependencies = Seq(
      // Add your project dependencies here,
    )

    val main = PlayProject(appName, appVersion, appDependencies).settings(defaultScalaSettings:_*).settings(
      // Add your own project settings here
    )

}
