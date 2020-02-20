includeBuild("../") {
  dependencySubstitution {
    substitute(module("com.github.raniejade:godot-kotlin-gradle-plugin:0.1.0")).with(project(":godot-kotlin-gradle-plugin"))
    substitute(module("com.github.raniejade:godot-kotlin")).with(project(":godot-kotlin"))
  }
}

include("simple")
include("rotating-cube")
include("editor-plugin")

pluginManagement {
  resolutionStrategy.eachPlugin {
    when (requested.id.id) {
      "com.github.raniejade.godot-kotlin",
      "com.github.raniejade.godot-kotlin.plugin" -> useModule("com.github.raniejade:godot-kotlin-gradle-plugin:0.1.0")
    }
  }
}
