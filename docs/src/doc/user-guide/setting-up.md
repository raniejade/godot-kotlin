## Overview
This binding uses [Gradle](https://gradle.org) as its build tool and provides a plugin to get you started quickly. The following shows a typical project structure.

```
├── gradlew
├── gradlew.bat
├── build.gradle.kts
├── default_env.tres
├── icon.png
├── icon.png
├── project.godot
├── scene.tscn
└── src/
    ├── godot/
    │   ├── gdnlib/
    │   └── gdns/
    └── simpleMain/
        └── kotlin/
```

## Gradle plugin
This binding provides a gradle plugin (`com.github.raniejade.godot-kotlin`) that helps you setup a project properly.

```kotlin
plugins {
    kotlin("multiplatform")
    id("com.github.raniejade.godot-kotlin")
}

repositories {
    jcenter()
    mavenCentral()
}

godot {
    libraries {
        val simple by creating {
            classes(
              "Simple"
            )
        }
    }
}
```

In the above example, you are telling the plugin to create a library (that can be used in godot) with a name `simple`. The plugin will automatically configure a source set using the pattern `<libraryName>Main` (for this example it will configure the `simpleMain` source set). This example also register a class named `Simple` which will be exposed to Godot.

The plugin automatically generates the appropriate `gdnlib` and `gdns` files which can be found at `src/godot/gdnlib` and `src/godot/gdns`, respectively. It is up to you whether you want to include those files in source control or not.

By default the plugin is configured to build all [supported platforms](supported-platforms.md). This can be changed via the `platforms` property of the library.

```kotlin
godot {
  libraries {
    val simple by creating {
      platforms(TargetPlatform.WINDOW)
      ...
    }
  }
}
```

### Building
To produce the shared library you can execute the following (use `gradlew.bat` on Windows).

```shell script
./gradlew build 
```

This will produce the necessary binaries and files (`gdnlib` and `gdns`) that you can use in Godot.

## Template (for the lazy)
TODO