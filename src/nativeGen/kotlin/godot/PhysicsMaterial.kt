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

open class PhysicsMaterial(
  _handle: COpaquePointer
) : Resource(_handle) {
  var absorbent: Boolean
    get() {
       return isAbsorbent() 
    }
    set(value) {
      setAbsorbent(value)
    }

  var bounce: Float
    get() {
       return getBounce() 
    }
    set(value) {
      setBounce(value)
    }

  var friction: Float
    get() {
       return getFriction() 
    }
    set(value) {
      setFriction(value)
    }

  var rough: Boolean
    get() {
       return isRough() 
    }
    set(value) {
      setRough(value)
    }

  fun getBounce(): Float {
    val _ret = __method_bind.getBounce.call(this._handle)
    return _ret.asFloat()
  }

  fun getFriction(): Float {
    val _ret = __method_bind.getFriction.call(this._handle)
    return _ret.asFloat()
  }

  fun isAbsorbent(): Boolean {
    val _ret = __method_bind.isAbsorbent.call(this._handle)
    return _ret.asBoolean()
  }

  fun isRough(): Boolean {
    val _ret = __method_bind.isRough.call(this._handle)
    return _ret.asBoolean()
  }

  fun setAbsorbent(absorbent: Boolean) {
    val _arg = Variant.new(absorbent)
    __method_bind.setAbsorbent.call(this._handle, _arg, 1)
  }

  fun setBounce(bounce: Float) {
    val _arg = Variant.new(bounce)
    __method_bind.setBounce.call(this._handle, _arg, 1)
  }

  fun setFriction(friction: Float) {
    val _arg = Variant.new(friction)
    __method_bind.setFriction.call(this._handle, _arg, 1)
  }

  fun setRough(rough: Boolean) {
    val _arg = Variant.new(rough)
    __method_bind.setRough.call(this._handle, _arg, 1)
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
      val getBounce: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsMaterial".cstr.ptr,
            "getBounce".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getBounce" }
        }
      val getFriction: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsMaterial".cstr.ptr,
            "getFriction".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getFriction" }
        }
      val isAbsorbent: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsMaterial".cstr.ptr,
            "isAbsorbent".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isAbsorbent" }
        }
      val isRough: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsMaterial".cstr.ptr,
            "isRough".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isRough" }
        }
      val setAbsorbent: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsMaterial".cstr.ptr,
            "setAbsorbent".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setAbsorbent" }
        }
      val setBounce: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsMaterial".cstr.ptr,
            "setBounce".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setBounce" }
        }
      val setFriction: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsMaterial".cstr.ptr,
            "setFriction".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setFriction" }
        }
      val setRough: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsMaterial".cstr.ptr,
            "setRough".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setRough" }
        }}
  }
}
