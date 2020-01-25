import org.jetbrains.kotlin.gradle.plugin.mpp.NativeBuildType

plugins {
    kotlin("multiplatform")
}

repositories {
    jcenter()
    mavenCentral()
}

kotlin {
    linuxX64("simple") {
        binaries {
            sharedLib(listOf(NativeBuildType.DEBUG))
        }
    }
    sourceSets {
        val simpleMain by getting {
            dependencies {
                api(project(":"))
            }
        }
    }
}

