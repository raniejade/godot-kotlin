subprojects {
  configurations.all {
    resolutionStrategy.dependencySubstitution {
      substitute(module("com.github.raniejade:godot-kotlin-linux")).with(project(":core"))
      substitute(module("com.github.raniejade:godot-kotlin-windows")).with(project(":core"))
      substitute(module("com.github.raniejade:godot-kotlin-macos")).with(project(":core"))
    }
  }

}