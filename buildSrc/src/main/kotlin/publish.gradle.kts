plugins {
  id("com.jfrog.bintray")
  `maven-publish` apply false
}

val bintrayUser = propOrEnv("BINTRAY_USER")
val bintrayApiKey = propOrEnv("BINTRAY_API_KEY")

var bintrayRepo = "godot-kotlin-dev"
var doPublish = true

if (project.extra["releaseMode"] == true) {
  bintrayRepo = "godot-kotlin"
  doPublish = false
}

val artifacts = project.extra["artifacts"] as Array<String>
bintray {
  user = bintrayUser
  key = bintrayApiKey
  publish = doPublish
  dryRun = true
  with(pkg) {
    repo = bintrayRepo
    desc = "Kotlin Native bindings for Godot"
    name = "godot-kotlin"
    setLicenses("MIT")
    setLabels("kotlin", "godot", "gamedev")
    vcsUrl = "https://github.com/raniejade/godot-kotlin.git"
    githubRepo = "spekframework/spek"
    with(version) {
      name = rootProject.version.toString()
    }
  }

  setPublications(*artifacts)
}

publishing {
  publications {
    all {
      if (this is MavenPublication) {
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