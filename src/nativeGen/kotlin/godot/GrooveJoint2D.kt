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

open class GrooveJoint2D internal constructor(
  _handle: COpaquePointer
) : Joint2D(_handle) {
  fun getInitialOffset(): Float {
    TODO()
  }

  fun getLength(): Float {
    TODO()
  }

  fun setInitialOffset(offset: Float) {
    TODO()
  }

  fun setLength(length: Float) {
    TODO()
  }

  companion object {
    fun new(): GrooveJoint2D = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("GrooveJoint2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton GrooveJoint2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      GrooveJoint2D(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for GrooveJoint2D
     */
    private object __method_bind {
      val get_initial_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GrooveJoint2D".cstr.ptr,
              "get_initial_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_initial_offset" }
            }
          }

      val get_length: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GrooveJoint2D".cstr.ptr,
              "get_length".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_length" }
            }
          }

      val set_initial_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GrooveJoint2D".cstr.ptr,
              "set_initial_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_initial_offset" }
            }
          }

      val set_length: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GrooveJoint2D".cstr.ptr,
              "set_length".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_length" }
            }
          }
    }
  }
}
