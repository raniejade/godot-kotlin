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

open class DampedSpringJoint2D internal constructor(
  _handle: COpaquePointer
) : Joint2D(_handle) {
  fun getDamping(): Float {
    TODO()
  }

  fun getLength(): Float {
    TODO()
  }

  fun getRestLength(): Float {
    TODO()
  }

  fun getStiffness(): Float {
    TODO()
  }

  fun setDamping(damping: Float) {
    TODO()
  }

  fun setLength(length: Float) {
    TODO()
  }

  fun setRestLength(rest_length: Float) {
    TODO()
  }

  fun setStiffness(stiffness: Float) {
    TODO()
  }

  companion object {
    fun new(): DampedSpringJoint2D = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("DampedSpringJoint2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton DampedSpringJoint2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      DampedSpringJoint2D(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for DampedSpringJoint2D
     */
    private object __method_bind {
      val get_damping: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DampedSpringJoint2D".cstr.ptr,
              "get_damping".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_damping" }
            }
          }

      val get_length: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DampedSpringJoint2D".cstr.ptr,
              "get_length".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_length" }
            }
          }

      val get_rest_length: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DampedSpringJoint2D".cstr.ptr,
              "get_rest_length".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_rest_length" }
            }
          }

      val get_stiffness: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DampedSpringJoint2D".cstr.ptr,
              "get_stiffness".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_stiffness" }
            }
          }

      val set_damping: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DampedSpringJoint2D".cstr.ptr,
              "set_damping".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_damping" }
            }
          }

      val set_length: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DampedSpringJoint2D".cstr.ptr,
              "set_length".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_length" }
            }
          }

      val set_rest_length: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DampedSpringJoint2D".cstr.ptr,
              "set_rest_length".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_rest_length" }
            }
          }

      val set_stiffness: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DampedSpringJoint2D".cstr.ptr,
              "set_stiffness".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_stiffness" }
            }
          }
    }
  }
}
