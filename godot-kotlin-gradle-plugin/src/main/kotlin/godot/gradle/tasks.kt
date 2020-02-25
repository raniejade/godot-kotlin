package godot.gradle

import org.gradle.api.Project

fun createGenerateEntryTask(project: Project, library: GDNativeLibrary): GenerateEntry {
  return project.tasks.create(library.generateEntryTaskName, GenerateEntry::class.java) {
    output.set(project.file("${library.generatedEntryDir}/entry.kt"))
    classes.set(library.classes.map { value -> value.map { GDClass(it, false) } })
  }
}

fun createGenerateLibraryTask(project: Project, library: GDNativeLibrary, outputDirPrefix: String = ""): GenerateLibrary {
  return project.tasks.create(library.generateLibraryTaskName, GenerateLibrary::class.java) {
    libraries.set(library.nativeLibraryPaths.map { value -> value.mapValues { it.value.relativeTo(project.projectDir) }})
    output.set(project.file(outputDirPrefix + library.generatedLibraryPath))
    reloadable.set(library.reloadable)
    loadOnce.set(library.loadOnce)
    singleton.set(library.singleton)
    symbolPrefix.set(library.symbolPrefix)
 }
}

fun createGenerateGDClassesTask(project: Project, library: GDNativeLibrary, outputDirPrefix: String = ""): GenerateGDClasses {
  return project.tasks.create(library.generateGDClassesTaskName, GenerateGDClasses::class.java) {
    classes.set(library.classes)
    libraryFile.set(library.generatedLibraryPath)
    outputDir.set(project.file(outputDirPrefix + library.generatedGDClassesDir))
  }
}