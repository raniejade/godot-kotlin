import godot.task.GenerateAPI

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
            defaultSourceSet {
                kotlin.srcDirs("src/nativeMain/kotlin", "src/nativeCore/kotlin", "src/nativeGen/kotlin")
            }
            val gdnative by cinterops.creating {
                packageName("gdnative")
                compilerOpts("-I$rootDir/godot_headers")
            }
        }
    }
}


tasks {
    val generateAPI by creating(GenerateAPI::class) {
        source.set(project.file("godot_headers/api.json"))
        outputDir.set(project.file("src/nativeGen/kotlin"))
    }
}

group = "com.github.raniejade"
version = "0.1.0"