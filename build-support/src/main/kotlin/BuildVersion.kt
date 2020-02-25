import org.ajoberstar.reckon.gradle.ReckonExtension
import org.ajoberstar.reckon.gradle.ReckonPlugin
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.kotlin.dsl.configure

class BuildVersion : Plugin<Project> {
  override fun apply(project: Project) {
    // if included build don't use reckon
    // it causes issues with gradle's uptodate check.
    if (project.gradle.parent != null) {
      project.version = "0.1.0"
    } else {
      project.plugins.apply(ReckonPlugin::class.java)
      project.extensions.configure<ReckonExtension> {
        scopeFromProp()
        stageFromProp("alpha", "rc", "final")
      }
    }
  }
}