// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Float
import kotlin.String
import kotlin.Suppress
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class DampedSpringJoint2D(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Joint2D(null) {
  var damping: Float
    get() {
       return getDamping() 
    }
    set(value) {
      setDamping(value)
    }

  var length: Float
    get() {
       return getLength() 
    }
    set(value) {
      setLength(value)
    }

  var restLength: Float
    get() {
       return getRestLength() 
    }
    set(value) {
      setRestLength(value)
    }

  var stiffness: Float
    get() {
       return getStiffness() 
    }
    set(value) {
      setStiffness(value)
    }

  constructor() : this(null) {
    _handle = __new()
  }

  fun getDamping(): Float {
    val _ret = __method_bind.getDamping.call(this._handle)
    return _ret.asFloat()
  }

  fun getLength(): Float {
    val _ret = __method_bind.getLength.call(this._handle)
    return _ret.asFloat()
  }

  fun getRestLength(): Float {
    val _ret = __method_bind.getRestLength.call(this._handle)
    return _ret.asFloat()
  }

  fun getStiffness(): Float {
    val _ret = __method_bind.getStiffness.call(this._handle)
    return _ret.asFloat()
  }

  fun setDamping(damping: Float) {
    val _arg = Variant(damping)
    __method_bind.setDamping.call(this._handle, listOf(_arg))
  }

  fun setLength(length: Float) {
    val _arg = Variant(length)
    __method_bind.setLength.call(this._handle, listOf(_arg))
  }

  fun setRestLength(restLength: Float) {
    val _arg = Variant(restLength)
    __method_bind.setRestLength.call(this._handle, listOf(_arg))
  }

  fun setStiffness(stiffness: Float) {
    val _arg = Variant(stiffness)
    __method_bind.setStiffness.call(this._handle, listOf(_arg))
  }

  companion object {
    internal fun __new(): COpaquePointer = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("DampedSpringJoint2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for DampedSpringJoint2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for DampedSpringJoint2D
     */
    private object __method_bind {
      val getDamping: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DampedSpringJoint2D".cstr.ptr,
            "get_damping".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_damping" }
        }
      val getLength: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DampedSpringJoint2D".cstr.ptr,
            "get_length".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_length" }
        }
      val getRestLength: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DampedSpringJoint2D".cstr.ptr,
            "get_rest_length".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_rest_length" }
        }
      val getStiffness: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DampedSpringJoint2D".cstr.ptr,
            "get_stiffness".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_stiffness" }
        }
      val setDamping: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DampedSpringJoint2D".cstr.ptr,
            "set_damping".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_damping" }
        }
      val setLength: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DampedSpringJoint2D".cstr.ptr,
            "set_length".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_length" }
        }
      val setRestLength: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DampedSpringJoint2D".cstr.ptr,
            "set_rest_length".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_rest_length" }
        }
      val setStiffness: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DampedSpringJoint2D".cstr.ptr,
            "set_stiffness".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_stiffness" }
        }}
  }
}
