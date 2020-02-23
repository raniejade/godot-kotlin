import org.ajoberstar.reckon.gradle.ReckonExtension
import org.ajoberstar.reckon.gradle.ReckonPlugin
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure

class BuildVersion : Plugin<Project> {
  override fun apply(project: Project) {
    project.plugins.apply(ReckonPlugin::class.java)
    project.extensions.configure<ReckonExtension> {
      scopeFromProp()
      stageFromProp("alpha", "rc", "final")
    }
  }
}