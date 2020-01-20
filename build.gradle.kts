plugins {
    kotlin("multiplatform") version "1.3.61"
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

        binaries {
            sharedLib()
        }
    }
}


group = "com.github.raniejade"
version = "0.1.0"