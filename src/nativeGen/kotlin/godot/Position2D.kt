// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class Position2D internal constructor(
  _handle: COpaquePointer
) : Node2D(_handle) {
  companion object {
    fun new(): Position2D = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Position2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton Position2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Position2D(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for Position2D
     */
    private object __method_bind {
      val _get_gizmo_extents: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Position2D".cstr.ptr,
              "_get_gizmo_extents".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _get_gizmo_extents" }
            }
          }

      val _set_gizmo_extents: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Position2D".cstr.ptr,
              "_set_gizmo_extents".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _set_gizmo_extents" }
            }
          }
    }
  }
}
