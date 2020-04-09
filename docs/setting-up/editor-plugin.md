# Editor plugin

This binding allows you author Godot editor plugins which can be published to any maven repository \([jcenter](https://bintray.com/bintray/jcenter) for example\).

## Wrapper

Editor plugins are built using gradle, the first step is to setup a gradle wrapper. Please refer to [this section](https://github.com/raniejade/godot-kotlin/tree/a5038fb4b8fdb76ec13ff6d63659ee9b87e3a853/docs/src/doc/setup/gradle.md?#wrapper) for a detailed instruction on how to do so.

## Setup

Once you have the wrapper installed, we need to setup the Gradle plugin this binding provides.

```kotlin
plugins {
    kotlin("multiplatform") version "$kotlinVersion"
    id("com.github.raniejade.godot-kotlin.plugin") version "$godotKotlinVersion"
}

repositories {
    jcenter()
    mavenCentral()
}

godotPlugin {
    mainClass.set("MyPlugin")
    author.set("me")
    description.set("A custom editor plugin built using godot-kotlin!")
    additionalClasses("MyCustomType")
}
```

The gradle plugin will take care of generating the `plugin.cfg`, `gdns` and `gdnlib` files your plugin needs. Checkout Godot's official [docs](https://docs.godotengine.org/en/stable/tutorials/plugins/editor/) for more details on how to write editor plugins.

## Building

Building the plugin is done by invoking the `buildPlugin` gradle task.

```text
./gradlew buildPlugin
```

This will build the plugin for the current operating system.

## Publishing

!!! note "" The following guide assumes you have prior knowledge about publishing artifacts using gradle.

To publish a plugin, first you need to apply the `maven-publish` gradle plugin.

```kotlin
plugins {
    kotlin("multiplatform") version "$kotlinVersion"
    id("com.github.raniejade.godot-kotlin.plugin") version "$godotKotlinVersion"
    `maven-publish`
}
```

The gradle plugin this binding provides will automatically configure a [publication](https://docs.gradle.org/current/userguide/publishing_maven.html#publishing_maven:publications) that can be used for publishing.

From this point, you have two options:

* Use `maven-publish` to publish to a maven repository. See this [guide](https://docs.gradle.org/current/userguide/publishing_maven.html#publishing_maven:repositories) for detailed instructions.
* If you plan to publish to [bintray](https://github.com/raniejade/godot-kotlin/tree/a5038fb4b8fdb76ec13ff6d63659ee9b87e3a853/docs/src/doc/setup/bintray.com), you need to use the [bintray-gradle-plugin](https://github.com/bintray/gradle-bintray-plugin).

