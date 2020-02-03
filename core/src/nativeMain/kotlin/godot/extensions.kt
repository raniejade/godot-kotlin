package godot

import godot.core.Variant

fun Object.toVariant() = Variant.new(this)