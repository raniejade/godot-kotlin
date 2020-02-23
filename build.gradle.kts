import java.nio.file.Files
import java.nio.file.Paths

apply {
  plugin(BuildVersion::class.java)
}

val versionString = project.version

subprojects {
  group = "com.github.raniejade"
  this.version = versionString.toString()

  if (Files.exists(Paths.get("$rootDir/local.properties"))) {
    val localProperties = java.util.Properties()
    localProperties.load(java.io.FileInputStream("$rootDir/local.properties"))
    localProperties.forEach { prop -> project.extra.set(prop.key as String, prop.value) }
  }

  var releaseMode = false
  if ("$version".matches(Regex("^\\d+\\.\\d+\\.\\d+(-rc\\.\\d+)?"))) {
    releaseMode = true
  }
  project.extra["releaseMode"] = releaseMode
}