val godotProjects = listOf(
  "simple",
  "rotating-cube",
  "plugin-consumer"
)

gradle.includedBuilds.forEach { build ->
  if (godotProjects.contains(build.name)) {
    tasks.register("runGodot-${build.name}") {
      group = "godot"
      dependsOn(build.task(":runGodot"))
    }
  }
}