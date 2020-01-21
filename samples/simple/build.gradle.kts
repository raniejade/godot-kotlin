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
            sharedLib()
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

