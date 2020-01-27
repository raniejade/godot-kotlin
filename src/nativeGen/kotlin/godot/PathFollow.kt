// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class PathFollow internal constructor(
  _handle: COpaquePointer
) : Spatial(_handle) {
  fun getCubicInterpolation(): Boolean {
    val _ret = __method_bind.get_cubic_interpolation.call(this._handle)
    return _ret.asBool()
  }

  fun getHOffset(): Float {
    val _ret = __method_bind.get_h_offset.call(this._handle)
    return _ret.asFloat()
  }

  fun getOffset(): Float {
    val _ret = __method_bind.get_offset.call(this._handle)
    return _ret.asFloat()
  }

  fun getRotationMode(): RotationMode {
    val _ret = __method_bind.get_rotation_mode.call(this._handle)
    return PathFollow.RotationMode.from(_ret.asInt())
  }

  fun getUnitOffset(): Float {
    val _ret = __method_bind.get_unit_offset.call(this._handle)
    return _ret.asFloat()
  }

  fun getVOffset(): Float {
    val _ret = __method_bind.get_v_offset.call(this._handle)
    return _ret.asFloat()
  }

  fun hasLoop(): Boolean {
    val _ret = __method_bind.has_loop.call(this._handle)
    return _ret.asBool()
  }

  fun setCubicInterpolation(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.set_cubic_interpolation.call(this._handle, _arg, 1)
  }

  fun setHOffset(hOffset: Float) {
    val _arg = Variant.new(hOffset)
    __method_bind.set_h_offset.call(this._handle, _arg, 1)
  }

  fun setLoop(loop: Boolean) {
    val _arg = Variant.new(loop)
    __method_bind.set_loop.call(this._handle, _arg, 1)
  }

  fun setOffset(offset: Float) {
    val _arg = Variant.new(offset)
    __method_bind.set_offset.call(this._handle, _arg, 1)
  }

  fun setRotationMode(rotationMode: Int) {
    val _arg = Variant.new(rotationMode)
    __method_bind.set_rotation_mode.call(this._handle, _arg, 1)
  }

  fun setUnitOffset(unitOffset: Float) {
    val _arg = Variant.new(unitOffset)
    __method_bind.set_unit_offset.call(this._handle, _arg, 1)
  }

  fun setVOffset(vOffset: Float) {
    val _arg = Variant.new(vOffset)
    __method_bind.set_v_offset.call(this._handle, _arg, 1)
  }

  enum class RotationMode(
    val value: Int
  ) {
    ROTATION_NONE(0),

    ROTATION_Y(1),

    ROTATION_XY(2),

    ROTATION_XYZ(3),

    ROTATION_ORIENTED(4);

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
    val ROTATION_NONE: Int = 0

    val ROTATION_ORIENTED: Int = 4

    val ROTATION_XY: Int = 2

    val ROTATION_XYZ: Int = 3

    val ROTATION_Y: Int = 1

    fun new(): PathFollow = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("PathFollow".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for PathFollow" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      PathFollow(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): PathFollow = PathFollow(ptr)
    /**
     * Container for method_bind pointers for PathFollow
     */
    private object __method_bind {
      val get_cubic_interpolation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow".cstr.ptr,
            "get_cubic_interpolation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_cubic_interpolation" }
        }
      val get_h_offset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow".cstr.ptr,
            "get_h_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_h_offset" }
        }
      val get_offset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow".cstr.ptr,
            "get_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_offset" }
        }
      val get_rotation_mode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow".cstr.ptr,
            "get_rotation_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_rotation_mode" }
        }
      val get_unit_offset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow".cstr.ptr,
            "get_unit_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_unit_offset" }
        }
      val get_v_offset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow".cstr.ptr,
            "get_v_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_v_offset" }
        }
      val has_loop: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow".cstr.ptr,
            "has_loop".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_loop" }
        }
      val set_cubic_interpolation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow".cstr.ptr,
            "set_cubic_interpolation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_cubic_interpolation" }
        }
      val set_h_offset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow".cstr.ptr,
            "set_h_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_h_offset" }
        }
      val set_loop: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow".cstr.ptr,
            "set_loop".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_loop" }
        }
      val set_offset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow".cstr.ptr,
            "set_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_offset" }
        }
      val set_rotation_mode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow".cstr.ptr,
            "set_rotation_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_rotation_mode" }
        }
      val set_unit_offset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow".cstr.ptr,
            "set_unit_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_unit_offset" }
        }
      val set_v_offset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow".cstr.ptr,
            "set_v_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_v_offset" }
        }}
  }
}
