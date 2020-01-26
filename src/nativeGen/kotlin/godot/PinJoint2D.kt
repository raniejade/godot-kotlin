// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlin.Float
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class PinJoint2D internal constructor(
  _handle: COpaquePointer
) : Joint2D(_handle) {
  fun getSoftness(): Float {
    TODO()
  }

  fun setSoftness() {
    TODO()
  }

  companion object {
    fun new(): PinJoint2D = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("PinJoint2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton PinJoint2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      PinJoint2D(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for PinJoint2D
     */
    private object __method_bind {
      val get_softness: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PinJoint2D".cstr.ptr,
              "get_softness".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_softness" }
            }
          }

      val set_softness: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PinJoint2D".cstr.ptr,
              "set_softness".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_softness" }
            }
          }
    }
  }
}
