enableFeaturePreview("GRADLE_METADATA")

include(":core")
//include(":samples:simple")
include(":samples:rotating-cube")

includeBuild("gradle-plugin") {
  dependencySubstitution {
    substitute(module("com.github.raniejade:godot-kotlin-gradle-plugin:0.1.0")).with(project(":"))
  }
}

pluginManagement {
  resolutionStrategy.eachPlugin {
    if (requested.id.id == "com.github.raniejade.godot-kotlin") {
      useModule("com.github.raniejade:godot-kotlin-gradle-plugin:0.1.0")
    }
  }
}
