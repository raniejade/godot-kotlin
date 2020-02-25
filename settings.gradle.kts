include(":godot-kotlin")
include(":godot-kotlin-gradle-plugin")

val excludeIdePlugins: String? by settings

// gradle-intellij-plugin downloads the IJ SDK (the whole ide) during configuration phase
// so even if it does not participate in the build it will try to download the sdk.
// this flag exclude the idea plugin module when `excludeIdePlugins` property is present.
if (excludeIdePlugins == null) {
  include(":godot-kotlin-idea-plugin")
}

includeBuild("./build-support") {
  dependencySubstitution {
    substitute(module("godot-kotlin:build-support:0.1.0")).with(project(":"))
  }
}