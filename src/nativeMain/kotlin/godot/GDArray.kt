package godot

import gdnative.godot_array

class GDArray(private val context: GDContext, internal val handle: godot_array) {
    companion object
}