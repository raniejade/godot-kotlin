// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import godot.core.Godot
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class NavigationMesh internal constructor(
  _handle: COpaquePointer
) : Resource(_handle) {
  companion object {
    val PARSED_GEOMETRY_BOTH: Int = 2

    val PARSED_GEOMETRY_MESH_INSTANCES: Int = 0

    val PARSED_GEOMETRY_STATIC_COLLIDERS: Int = 1

    val SAMPLE_PARTITION_LAYERS: Int = 2

    val SAMPLE_PARTITION_MONOTONE: Int = 1

    val SAMPLE_PARTITION_WATERSHED: Int = 0

    fun new(): NavigationMesh = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("NavigationMesh".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for NavigationMesh" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      NavigationMesh(
        fn()
      )
    }}
}
