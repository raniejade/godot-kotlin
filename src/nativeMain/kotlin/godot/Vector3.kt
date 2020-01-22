package godot

import gdnative.godot_vector3
import kotlinx.cinterop.*

class Vector3(private val context: GDContext, internal val handle: godot_vector3) {
    companion object
}