package godot.gradle

import org.gradle.api.Plugin
import org.gradle.api.Project
import org.jetbrains.kotlin.gradle.dsl.KotlinMultiplatformExtension
import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget

open class GodotPlugin : Plugin<Project> {
  override fun apply(project: Project) {
    val godotExtension = project.extensions.create("godot", GodotExtension::class.java, project.objects)
    configureLinks(project, godotExtension)
  }

  private fun configureLinks(project: Project, godotExtension: GodotExtension) {
    project.afterEvaluate {
      val generatedSourcesDir = "${project.projectDir}/build/godot"
      godotExtension.libraries.configureEach {
        val task = project.tasks.create("generate${name.capitalize()}Entry", GenerateEntry::class.java) {
          output.set(project.file("$generatedSourcesDir/kotlin/entry"))
          classes.set(this@configureEach.classes)
        }

        val mppExtension = checkNotNull(project.extensions.findByType(KotlinMultiplatformExtension::class.java)) { "Kotlin multiplatform plugin not applied!" }
        targets.get().forEach { targetName ->
          val target = mppExtension.targets.getByName(targetName)
          require(target is KotlinNativeTarget) { "$target is not a native target!" }
          target.apply {
            compilations.getByName("main") {
              compileKotlinTask.dependsOn(task)
              defaultSourceSet {
                kotlin.srcDirs("$generatedSourcesDir/kotlin")
              }
            }
          }
        }
      }
    }
  }
}