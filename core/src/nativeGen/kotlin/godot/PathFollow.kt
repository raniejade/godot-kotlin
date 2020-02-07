// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
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

open class PathFollow(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Spatial(null) {
  var cubicInterp: Boolean
    get() {
       return getCubicInterpolation() 
    }
    set(value) {
      setCubicInterpolation(value)
    }

  var hOffset: Float
    get() {
       return getHOffset() 
    }
    set(value) {
      setHOffset(value)
    }

  var loop: Boolean
    get() {
       return hasLoop() 
    }
    set(value) {
      setLoop(value)
    }

  var offset: Float
    get() {
       return getOffset() 
    }
    set(value) {
      setOffset(value)
    }

  var rotationMode: RotationMode
    get() {
       return getRotationMode() 
    }
    set(value) {
      setRotationMode(value.value)
    }

  var unitOffset: Float
    get() {
       return getUnitOffset() 
    }
    set(value) {
      setUnitOffset(value)
    }

  var vOffset: Float
    get() {
       return getVOffset() 
    }
    set(value) {
      setVOffset(value)
    }

  constructor() : this(null) {
    _handle = __new()
  }

  fun getCubicInterpolation(): Boolean {
    val _ret = __method_bind.getCubicInterpolation.call(this._handle)
    return _ret.asBoolean()
  }

  fun getHOffset(): Float {
    val _ret = __method_bind.getHOffset.call(this._handle)
    return _ret.asFloat()
  }

  fun getOffset(): Float {
    val _ret = __method_bind.getOffset.call(this._handle)
    return _ret.asFloat()
  }

  fun getRotationMode(): RotationMode {
    val _ret = __method_bind.getRotationMode.call(this._handle)
    return PathFollow.RotationMode.from(_ret.asInt())
  }

  fun getUnitOffset(): Float {
    val _ret = __method_bind.getUnitOffset.call(this._handle)
    return _ret.asFloat()
  }

  fun getVOffset(): Float {
    val _ret = __method_bind.getVOffset.call(this._handle)
    return _ret.asFloat()
  }

  fun hasLoop(): Boolean {
    val _ret = __method_bind.hasLoop.call(this._handle)
    return _ret.asBoolean()
  }

  fun setCubicInterpolation(enable: Boolean) {
    val _arg = Variant(enable)
    __method_bind.setCubicInterpolation.call(this._handle, listOf(_arg))
  }

  fun setHOffset(hOffset: Float) {
    val _arg = Variant(hOffset)
    __method_bind.setHOffset.call(this._handle, listOf(_arg))
  }

  fun setLoop(loop: Boolean) {
    val _arg = Variant(loop)
    __method_bind.setLoop.call(this._handle, listOf(_arg))
  }

  fun setOffset(offset: Float) {
    val _arg = Variant(offset)
    __method_bind.setOffset.call(this._handle, listOf(_arg))
  }

  fun setRotationMode(rotationMode: Int) {
    val _arg = Variant(rotationMode)
    __method_bind.setRotationMode.call(this._handle, listOf(_arg))
  }

  fun setUnitOffset(unitOffset: Float) {
    val _arg = Variant(unitOffset)
    __method_bind.setUnitOffset.call(this._handle, listOf(_arg))
  }

  fun setVOffset(vOffset: Float) {
    val _arg = Variant(vOffset)
    __method_bind.setVOffset.call(this._handle, listOf(_arg))
  }

  enum class RotationMode(
    val value: Int
  ) {
    NONE(0),

    Y(1),

    XY(2),

    XYZ(3),

    ORIENTED(4);

    companion object {
      fun from(value: Int): RotationMode {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("PathFollow".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for PathFollow" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for PathFollow
     */
    private object __method_bind {
      val getCubicInterpolation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow".cstr.ptr,
            "get_cubic_interpolation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_cubic_interpolation" }
        }
      val getHOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow".cstr.ptr,
            "get_h_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_h_offset" }
        }
      val getOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow".cstr.ptr,
            "get_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_offset" }
        }
      val getRotationMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow".cstr.ptr,
            "get_rotation_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_rotation_mode" }
        }
      val getUnitOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow".cstr.ptr,
            "get_unit_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_unit_offset" }
        }
      val getVOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow".cstr.ptr,
            "get_v_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_v_offset" }
        }
      val hasLoop: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow".cstr.ptr,
            "has_loop".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_loop" }
        }
      val setCubicInterpolation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow".cstr.ptr,
            "set_cubic_interpolation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_cubic_interpolation" }
        }
      val setHOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow".cstr.ptr,
            "set_h_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_h_offset" }
        }
      val setLoop: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow".cstr.ptr,
            "set_loop".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_loop" }
        }
      val setOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow".cstr.ptr,
            "set_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_offset" }
        }
      val setRotationMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow".cstr.ptr,
            "set_rotation_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_rotation_mode" }
        }
      val setUnitOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow".cstr.ptr,
            "set_unit_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_unit_offset" }
        }
      val setVOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow".cstr.ptr,
            "set_v_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_v_offset" }
        }}
  }
}
