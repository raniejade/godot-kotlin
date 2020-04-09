# Release notes

## 32.1.1

**Release date**: Not yet released.

The main focus of this release is to provide a better integration between Godot and IntelliJ IDEA. The integration does not provide many features yet, but this release lays down the foundation on which new features can be built upon.

### Support for authoring and consuming editor plugins

TBD

### Run godot via gradle

TBD

### Intellij IDEA plugin

TBD

### Godot editor plugin

TBD

### Known issues

* IntelliJ IDEA plugin is not available for CLion. Kotlin's plugin for CLion depends on classes from the built-in `java` plugin which is only available in the IntelliJ IDEA.
* Compilation speed is very slow \([https://github.com/JetBrains/kotlin-native/issues/733](release-notes.md)\)
* Building release shared library is causing an OOM \([https://github.com/JetBrains/kotlin-native/issues/3877](release-notes.md)\). By default the gradle plugin will build a debug shared library, please use that for now.

## 32.1.0

**Release date**: Feb 15 2020

This is the initial release of `godot-kotlin` which supports Godot 3.2. Godot's 3D platformer demo was [ported](https://github.com/raniejade/godot-kotlin-demos/tree/master/3d-platformer) to accompany this release and to showcase the capabilities of this binding.

The initial supported platforms are:

* Linux X64
* Windows X64
* MacOS X64

More will be added in the upcoming releases.

See [Roadmap](roadmap.md) for the future plans of this project.

**Known issues**

* Compilation speed is very slow \([https://github.com/JetBrains/kotlin-native/issues/733](release-notes.md)\)
* Building release shared library is causing an OOM \([https://github.com/JetBrains/kotlin-native/issues/3877](release-notes.md)\). By default the gradle plugin will build a debug shared library, please use that for now.

