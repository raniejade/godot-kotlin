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

open class PathFollow(
  _handle: COpaquePointer
) : Spatial(_handle) {
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

  var rotationMode: Int
    get() {
       return PathFollow.RotationMode.from(getRotationMode()) 
    }
    set(value) {
      setRotationMode(PathFollow.RotationMode.from(value))
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
    val _arg = Variant.new(enable)
    __method_bind.setCubicInterpolation.call(this._handle, _arg, 1)
  }

  fun setHOffset(hOffset: Float) {
    val _arg = Variant.new(hOffset)
    __method_bind.setHOffset.call(this._handle, _arg, 1)
  }

  fun setLoop(loop: Boolean) {
    val _arg = Variant.new(loop)
    __method_bind.setLoop.call(this._handle, _arg, 1)
  }

  fun setOffset(offset: Float) {
    val _arg = Variant.new(offset)
    __method_bind.setOffset.call(this._handle, _arg, 1)
  }

  fun setRotationMode(rotationMode: Int) {
    val _arg = Variant.new(rotationMode)
    __method_bind.setRotationMode.call(this._handle, _arg, 1)
  }

  fun setUnitOffset(unitOffset: Float) {
    val _arg = Variant.new(unitOffset)
    __method_bind.setUnitOffset.call(this._handle, _arg, 1)
  }

  fun setVOffset(vOffset: Float) {
    val _arg = Variant.new(vOffset)
    __method_bind.setVOffset.call(this._handle, _arg, 1)
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
      val getCubicInterpolation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow".cstr.ptr,
            "getCubicInterpolation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCubicInterpolation" }
        }
      val getHOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow".cstr.ptr,
            "getHOffset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getHOffset" }
        }
      val getOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow".cstr.ptr,
            "getOffset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getOffset" }
        }
      val getRotationMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow".cstr.ptr,
            "getRotationMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getRotationMode" }
        }
      val getUnitOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow".cstr.ptr,
            "getUnitOffset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getUnitOffset" }
        }
      val getVOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow".cstr.ptr,
            "getVOffset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getVOffset" }
        }
      val hasLoop: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow".cstr.ptr,
            "hasLoop".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method hasLoop" }
        }
      val setCubicInterpolation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow".cstr.ptr,
            "setCubicInterpolation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCubicInterpolation" }
        }
      val setHOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow".cstr.ptr,
            "setHOffset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setHOffset" }
        }
      val setLoop: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow".cstr.ptr,
            "setLoop".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setLoop" }
        }
      val setOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow".cstr.ptr,
            "setOffset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setOffset" }
        }
      val setRotationMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow".cstr.ptr,
            "setRotationMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setRotationMode" }
        }
      val setUnitOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow".cstr.ptr,
            "setUnitOffset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setUnitOffset" }
        }
      val setVOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PathFollow".cstr.ptr,
            "setVOffset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setVOffset" }
        }}
  }
}
