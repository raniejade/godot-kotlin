## 32.1.0
**Release date**: Feb 15 2020

This is the initial release of `godot-kotlin` which supports Godot 3.2. Godot's 3D platformer demo was [ported](https://github.com/raniejade/godot-kotlin-demos/tree/master/3d-platformer) to accompany this release and to showcase the capabilities of this binding.

The initial supported platforms are:

- Linux X64
- Windows X64
- MacOS X64

More will be added in the upcoming releases.

See [Roadmap](./roadmap.md) for the future plans of this project.

**Known issues**
- Compilation speed is very slow (https://github.com/JetBrains/kotlin-native/issues/733)
- Building release shared library is causing an OOM (https://github.com/JetBrains/kotlin-native/issues/3877). By
  default the gradle plugin will build a debug shared library, please use that for now.