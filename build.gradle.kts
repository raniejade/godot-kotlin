import godot.task.GenerateBuiltInTypesTask

plugins {
    kotlin("multiplatform")
}

repositories {
    jcenter()
    mavenCentral()
}

kotlin {
    linuxX64("native") {
        compilations.getByName("main") {
            val gdnative by cinterops.creating {
                packageName("gdnative")
                compilerOpts("-I$rootDir/godot_headers")
            }
        }
    }
}

tasks {
    val generateBuiltInTypes by creating(GenerateBuiltInTypesTask::class) {
        source.set(project.file("builtinTypes.json"))
        outputDir.set(project.file("src/nativeMain/kotlin"))
    }
}


group = "com.github.raniejade"
version = "0.1.0"