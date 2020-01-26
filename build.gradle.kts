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

group = "com.github.raniejade"
version = "0.1.0"