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

open class GridMap internal constructor(
  _handle: COpaquePointer
) : Spatial(_handle) {
  companion object {
    val INVALID_CELL_ITEM: Int = -1

    fun new(): GridMap = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("GridMap".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for GridMap" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      GridMap(
        fn()
      )
    }}
}
