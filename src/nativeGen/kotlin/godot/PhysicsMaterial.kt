// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
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
    val _ret = __method_bind.get_bounce.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getFriction(): Float {
    val _ret = __method_bind.get_friction.call(this.toVariant())
    return _ret.asFloat()
  }

  fun isAbsorbent(): Boolean {
    val _ret = __method_bind.is_absorbent.call(this.toVariant())
    return _ret.asBool()
  }

  fun isRough(): Boolean {
    val _ret = __method_bind.is_rough.call(this.toVariant())
    return _ret.asBool()
  }

  fun setAbsorbent(absorbent: Boolean) {
    val _arg = Variant.new(absorbent)
    __method_bind.set_absorbent.call(this.toVariant(), _arg, 1)
  }

  fun setBounce(bounce: Float) {
    val _arg = Variant.new(bounce)
    __method_bind.set_bounce.call(this.toVariant(), _arg, 1)
  }

  fun setFriction(friction: Float) {
    val _arg = Variant.new(friction)
    __method_bind.set_friction.call(this.toVariant(), _arg, 1)
  }

  fun setRough(rough: Boolean) {
    val _arg = Variant.new(rough)
    __method_bind.set_rough.call(this.toVariant(), _arg, 1)
  }

  companion object {
    fun new(): PhysicsMaterial = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("PhysicsMaterial".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for PhysicsMaterial" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      PhysicsMaterial(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): PhysicsMaterial = PhysicsMaterial(ptr)
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
