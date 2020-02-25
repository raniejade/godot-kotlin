import com.jfrog.bintray.gradle.BintrayExtension
import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.publish.PublishingExtension
import org.gradle.api.publish.maven.MavenPublication
import org.gradle.kotlin.dsl.extra

open class BintrayPublish : Plugin<Project> {
  override fun apply(project: Project) {
    project.plugins.apply("com.jfrog.bintray")
    project.plugins.apply("maven-publish")

    val bintrayUser = project.propOrEnv("BINTRAY_USER")
    val bintrayApiKey = project.propOrEnv("BINTRAY_API_KEY")

    var bintrayRepo = "godot-kotlin-dev"
    var doPublish = true

    if (project.extra["releaseMode"] == true) {
      bintrayRepo = "godot-kotlin"
      doPublish = false
    }

    val artifacts = project.extra["artifacts"] as Array<String>

    project.extensions.configure(BintrayExtension::class.java) {
      user = bintrayUser
      key = bintrayApiKey
      publish = doPublish
      with(pkg) {
        repo = bintrayRepo
        desc = "Kotlin Native bindings for Godot"
        name = "godot-kotlin"
        setLicenses("MIT")
        setLabels("kotlin", "godot", "gamedev")
        vcsUrl = "https://github.com/raniejade/godot-kotlin.git"
        githubRepo = "spekframework/spek"
        with(version) {
          name = project.rootProject.version.toString()
        }
      }

      setPublications(*artifacts)
    }

    project.extensions.configure(PublishingExtension::class.java) {
      publications {
        all {
          if (this@all is MavenPublication) {
            pom {
              url.set("https://github.com/raniejade/godot-kotlin")
              licenses {
                license {
                  name.set("MIT")
                  url.set("https://github.com/raniejade/godot-kotlin/blob/master/LICENSE")
                  distribution.set("repo")
                }
              }
              scm {
                connection.set("scm:git:https://github.com/raniejade/godot-kotlin")
                developerConnection.set("scm:git:github.com:raniejade/godot-kotlin.git")
                tag.set("master")
                url.set("https://github.com/raniejade/godot-kotlin")
              }

              developers {
                developer {
                  id.set("core")
                  name.set("Ranie Jade Ramiso")
                  url.set("https://github.com/raniejade")
                  email.set("raniejaderamiso@gmail.com")
                }
              }
            }
          }
        }
      }
    }
  }
}