includeBuild("../../build-support") {
  dependencySubstitution {
    substitute(module("godot-kotlin:build-support:0.1.0")).with(project(":"))
  }
}

includeBuild("../../godot-kotlin-editor-plugin") {
  dependencySubstitution {
    substitute(module("com.github.raniejade:godot-kotlin-editor-plugin:0.1.0")).with(project(":"))
  }
}

includeBuild("../../") {
  dependencySubstitution {
    substitute(module("com.github.raniejade:godot-kotlin-gradle-plugin:0.1.0")).with(project(":godot-kotlin-gradle-plugin"))
    substitute(module("com.github.raniejade:godot-kotlin:0.1.0")).with(project(":godot-kotlin"))
  }
}

pluginManagement {
  resolutionStrategy.eachPlugin {
    when (requested.id.id) {
      "com.github.raniejade.godot-kotlin",
      "com.github.raniejade.godot-kotlin.plugin" -> useModule("com.github.raniejade:godot-kotlin-gradle-plugin:0.1.0")
    }
  }
}

include("editor-plugin")