import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.extra

class MiscPlugin : Plugin<Project> {
  override fun apply(project: Project) {
    var releaseMode = false
    if ("${project.version}".matches(Regex("^\\d+\\.\\d+\\.\\d+(-rc\\.\\d+)?"))) {
      releaseMode = true
    }
    project.extra["releaseMode"] = releaseMode
    project.subprojects {
      this.project.extra["releaseMode"] = releaseMode
    }
  }
}