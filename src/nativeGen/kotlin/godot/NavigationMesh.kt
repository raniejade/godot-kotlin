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
    val ParsedGeometryBoth: Int = 2

    val ParsedGeometryMeshInstances: Int = 0

    val ParsedGeometryStaticColliders: Int = 1

    val SamplePartitionLayers: Int = 2

    val SamplePartitionMonotone: Int = 1

    val SamplePartitionWatershed: Int = 0

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
