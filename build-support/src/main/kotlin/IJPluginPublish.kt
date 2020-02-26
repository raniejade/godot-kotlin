import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.extra
import org.gradle.kotlin.dsl.withType
import org.jetbrains.intellij.tasks.PublishTask

class IJPluginPublish : Plugin<Project> {
  override fun apply(project: Project) {
    val channel = if (project.extra["releaseMode"] == true) {
      "default"
    } else {
      "dev"
    }

    val publishToken = project.propOrEnv("HUB_API_TOKEN")

    project.tasks.withType(PublishTask::class) {
      setToken(publishToken)
      setChannels(channel)
    }
  }
}