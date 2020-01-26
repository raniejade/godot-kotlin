// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlin.Boolean
import kotlin.Float
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class PhysicsMaterial internal constructor(
  _handle: COpaquePointer
) : Resource(_handle) {
  fun getBounce(): Float {
    TODO()
  }

  fun getFriction(): Float {
    TODO()
  }

  fun isAbsorbent(): Boolean {
    TODO()
  }

  fun isRough(): Boolean {
    TODO()
  }

  fun setAbsorbent(absorbent: Boolean) {
    TODO()
  }

  fun setBounce(bounce: Float) {
    TODO()
  }

  fun setFriction(friction: Float) {
    TODO()
  }

  fun setRough(rough: Boolean) {
    TODO()
  }

  companion object {
    fun new(): PhysicsMaterial = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("PhysicsMaterial".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton PhysicsMaterial" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      PhysicsMaterial(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for PhysicsMaterial
     */
    private object __method_bind {
      val get_bounce: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsMaterial".cstr.ptr,
              "get_bounce".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_bounce" }
            }
          }

      val get_friction: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsMaterial".cstr.ptr,
              "get_friction".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_friction" }
            }
          }

      val is_absorbent: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsMaterial".cstr.ptr,
              "is_absorbent".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_absorbent" }
            }
          }

      val is_rough: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsMaterial".cstr.ptr,
              "is_rough".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_rough" }
            }
          }

      val set_absorbent: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsMaterial".cstr.ptr,
              "set_absorbent".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_absorbent" }
            }
          }

      val set_bounce: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsMaterial".cstr.ptr,
              "set_bounce".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_bounce" }
            }
          }

      val set_friction: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsMaterial".cstr.ptr,
              "set_friction".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_friction" }
            }
          }

      val set_rough: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsMaterial".cstr.ptr,
              "set_rough".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_rough" }
            }
          }
    }
  }
}
