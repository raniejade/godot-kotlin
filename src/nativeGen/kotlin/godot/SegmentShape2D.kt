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

open class SegmentShape2D internal constructor(
  _handle: COpaquePointer
) : Shape2D(_handle) {
  companion object {
    fun new(): SegmentShape2D = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("SegmentShape2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton SegmentShape2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      SegmentShape2D(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for SegmentShape2D
     */
    private object __method_bind {
      val get_a: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SegmentShape2D".cstr.ptr,
              "get_a".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_a" }
            }
          }

      val get_b: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SegmentShape2D".cstr.ptr,
              "get_b".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_b" }
            }
          }

      val set_a: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SegmentShape2D".cstr.ptr,
              "set_a".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_a" }
            }
          }

      val set_b: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SegmentShape2D".cstr.ptr,
              "set_b".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_b" }
            }
          }
    }
  }
}
