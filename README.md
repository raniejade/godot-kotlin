# godot-kotlin
![GitHub](https://img.shields.io/github/license/raniejade/godot-kotlin?style=flat-square)
![GitHub Workflow Status](https://img.shields.io/github/workflow/status/raniejade/godot-kotlin/Build?style=flat-square)
![Bintray](https://img.shields.io/bintray/v/raniejade/godot-kotlin/godot-kotlin?label=release&style=flat-square)
![Bintray](https://img.shields.io/bintray/v/raniejade/godot-kotlin-dev/godot-kotlin?label=dev&style=flat-square)

Kotlin Native bindings for Godot.

## Status
Use with caution, this binding is not yet ready for production use. All of the core Godot classes are fully accessible in Kotlin, however, some APIs are a bit clunky and require some tweaking to make it concise (in the Kotlin way). 

Here are some gotchas when using this binding:
- Kotlin Native's compile times are horribly slow, it can take almost a minute to re-compile after making a **single line** change.
- GDScript's coroutine is not and will probably never be implemented. However, a similar feature using Kotlin coroutines will be provided (when Kotlin Native supports multi-threaded coroutines).
- It **might** be slow (I haven't look at performance yet). 

## Versioning
Release versions follow [semantic versioning](https://semver.org/) where the major component is based of the version (specifically the major and minor component) of Godot this release supports.

As an example, a release with a version of `32.1.0` is only guaranteed to work with Godot `3.2`.
    