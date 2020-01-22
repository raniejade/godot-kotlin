package godot

import gdnative.godot_pool_byte_array

class PoolByteArray(private val context: GDContext, internal val handle: godot_pool_byte_array) {
    companion object
}