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

open class CapsuleShape2D internal constructor(
  _handle: COpaquePointer
) : Shape2D(_handle) {
  fun getHeight(): Float {
    TODO()
  }

  fun getRadius(): Float {
    TODO()
  }

  fun setHeight(height: Float) {
    TODO()
  }

  fun setRadius(radius: Float) {
    TODO()
  }

  companion object {
    fun new(): CapsuleShape2D = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("CapsuleShape2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton CapsuleShape2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      CapsuleShape2D(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for CapsuleShape2D
     */
    private object __method_bind {
      val get_height: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CapsuleShape2D".cstr.ptr,
              "get_height".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_height" }
            }
          }

      val get_radius: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CapsuleShape2D".cstr.ptr,
              "get_radius".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_radius" }
            }
          }

      val set_height: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CapsuleShape2D".cstr.ptr,
              "set_height".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_height" }
            }
          }

      val set_radius: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CapsuleShape2D".cstr.ptr,
              "set_radius".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_radius" }
            }
          }
    }
  }
}
