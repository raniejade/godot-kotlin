import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget

plugins {
    kotlin("multiplatform") version "1.3.20"
    `maven-publish`
}

val os by lazy { org.gradle.internal.os.OperatingSystem.current()!! }

repositories {
    jcenter()
}

kotlin {
    val isPublishMode = project.hasProperty("publishMode")
    fun KotlinNativeTarget.gdnative() {
        compilations.getByName("main") {
            defaultSourceSet.apply {
                kotlin.srcDir("src/nativeMain/kotlin")
            }
            val gdnative by cinterops.creating {
                packageName("gdnative")
                compilerOpts("-I$rootDir/godot_headers")
            }
        }
    }

    if (os.isLinux || isPublishMode) {
        linuxX64 {
            gdnative()
        }
    }

    if (os.isWindows || isPublishMode) {
        mingwX64 {
            gdnative()
        }
    }
}

group = "com.github.raniejade"
version = "0.1.0"