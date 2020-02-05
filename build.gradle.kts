plugins {
  id("org.ajoberstar.reckon") version "0.12.0"
}

reckon {
  scopeFromProp()
  stageFromProp("alpha", "rc", "final")
}

val version = project.version

subprojects {
  this.version = version.toString()
}