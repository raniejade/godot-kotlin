includeBuild("../") {
  dependencySubstitution {
    substitute(module("com.github.raniejade:godot-kotlin-gradle-plugin:0.1.0")).with(project(":gradle-plugin"))
    substitute(module("com.github.raniejade:godot-kotlin-linux")).with(project(":core"))
    substitute(module("com.github.raniejade:godot-kotlin-windows")).with(project(":core"))
    substitute(module("com.github.raniejade:godot-kotlin-macos")).with(project(":core"))
  }
}

include("simple")
include("rotating-cube")

pluginManagement {
  resolutionStrategy.eachPlugin {
    if (requested.id.id == "com.github.raniejade.godot-kotlin") {
      useModule("com.github.raniejade:godot-kotlin-gradle-plugin:0.1.0")
    }
  }
}
