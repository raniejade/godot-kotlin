// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.RID
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class World2D internal constructor(
  _handle: COpaquePointer
) : Resource(_handle) {
  fun getCanvas(): RID {
    TODO()
  }

  fun getDirectSpaceState(): Physics2DDirectSpaceState {
    TODO()
  }

  fun getSpace(): RID {
    TODO()
  }

  companion object {
    fun new(): World2D = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("World2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton World2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      World2D(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for World2D
     */
    private object __method_bind {
      val get_canvas: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("World2D".cstr.ptr,
              "get_canvas".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_canvas" }
            }
          }

      val get_direct_space_state: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("World2D".cstr.ptr,
              "get_direct_space_state".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_direct_space_state" }
            }
          }

      val get_space: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("World2D".cstr.ptr,
              "get_space".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_space" }
            }
          }
    }
  }
}
