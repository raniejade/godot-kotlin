[![GitHub](https://img.shields.io/github/license/raniejade/godot-kotlin?style=flat-square)](LICENSE)
[![GitHub Workflow Status](https://img.shields.io/github/workflow/status/raniejade/godot-kotlin/CI?style=flat-square)](https://github.com/raniejade/godot-kotlin/actions?query=workflow%3ACI)
[![Bintray](https://img.shields.io/bintray/v/raniejade/godot-kotlin/godot-kotlin?label=release&style=flat-square)](https://bintray.com/raniejade/godot-kotlin/godot-kotlin/_latestVersion)
[![Bintray](https://img.shields.io/bintray/v/raniejade/godot-kotlin-dev/godot-kotlin?label=dev&style=flat-square)](https://bintray.com/raniejade/godot-kotlin-dev/godot-kotlin/_latestVersion)

`godot-kotlin` is a Kotlin Native binding for the [Godot](https://godotengine.org) game engine which allows you to write your game's logic in [Kotlin](https://kotlinlang.org).

If you are new to this binding, it is recommended to read through the `Getting Started` section of the user guide. The section describes how this project is versioned, API differences between Godot's in-house scripting language `GDScript`, and how to setup a new project.

## Versioning

Release versions follow [semantic versioning](https://semver.org/) where the major component is based of the version (specifically the major and minor component) of Godot the release supports.

As an example, a release with a version of `32.1.0` is only guaranteed to work with Godot `3.2`.