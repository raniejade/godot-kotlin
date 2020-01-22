package godot

import gdnative.godot_pool_int_array

class PoolIntArray(private val context: GDContext, internal val handle: godot_pool_int_array) {
    companion object
}