# godot-kotlin
[![GitHub](https://img.shields.io/github/license/raniejade/godot-kotlin?style=flat-square)](LICENSE)
[![GitHub Workflow Status](https://img.shields.io/github/workflow/status/raniejade/godot-kotlin/CI?style=flat-square)](https://github.com/raniejade/godot-kotlin/actions?query=workflow%3ACI)
[![Bintray](https://img.shields.io/bintray/v/raniejade/godot-kotlin/godot-kotlin?label=release&style=flat-square)](https://bintray.com/raniejade/godot-kotlin/godot-kotlin/_latestVersion)
[![Bintray](https://img.shields.io/bintray/v/raniejade/godot-kotlin-dev/godot-kotlin?label=dev&style=flat-square)](https://bintray.com/raniejade/godot-kotlin-dev/godot-kotlin/_latestVersion)

Kotlin Native bindings for Godot.

Documentation is available at [godot-kotl.in](https://godot-kotl.in).

## Status
Use with caution, this binding is not yet ready for production use. All of the core Godot classes are fully accessible in Kotlin, however, some APIs are a bit clunky and require some tweaking to make it concise (in the Kotlin way). 

Here are some gotchas when using this binding:
- Kotlin Native's compile times are horribly slow, it can take almost a minute to re-compile after making a **single line** change.
- GDScript's coroutine is not and will probably never be implemented. However, a similar feature using Kotlin coroutines will be provided (when Kotlin Native supports multi-threaded coroutines).

## Versioning
Checkout the [documentation](https://godot-kotl.in) for information about how this project is versioned.
    
https://godot-kotlin.netlify.com