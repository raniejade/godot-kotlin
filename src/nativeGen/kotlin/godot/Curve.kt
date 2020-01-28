// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import kotlin.Float
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class Curve(
  _handle: COpaquePointer
) : Resource(_handle) {
  var data: Int
    get() {
       return _getData() 
    }
    set(value) {
      _setData(value)
    }

  var bakeResolution: Int
    get() {
       return getBakeResolution() 
    }
    set(value) {
      setBakeResolution(value)
    }

  var maxValue: Float
    get() {
       return getMaxValue() 
    }
    set(value) {
      setMaxValue(value)
    }

  var minValue: Float
    get() {
       return getMinValue() 
    }
    set(value) {
      setMinValue(value)
    }

  fun addPoint(
    position: Vector2,
    leftTangent: Float,
    rightTangent: Float,
    leftMode: Int,
    rightMode: Int
  ): Int {
    val _args = VariantArray.new()
    _args.append(position)
    _args.append(leftTangent)
    _args.append(rightTangent)
    _args.append(leftMode)
    _args.append(rightMode)
    val _ret = __method_bind.addPoint.call(this._handle, _args.toVariant(), 5)
    return _ret.asInt()
  }

  fun bake() {
    __method_bind.bake.call(this._handle)
  }

  fun cleanDupes() {
    __method_bind.cleanDupes.call(this._handle)
  }

  fun clearPoints() {
    __method_bind.clearPoints.call(this._handle)
  }

  fun getBakeResolution(): Int {
    val _ret = __method_bind.getBakeResolution.call(this._handle)
    return _ret.asInt()
  }

  fun getMaxValue(): Float {
    val _ret = __method_bind.getMaxValue.call(this._handle)
    return _ret.asFloat()
  }

  fun getMinValue(): Float {
    val _ret = __method_bind.getMinValue.call(this._handle)
    return _ret.asFloat()
  }

  fun getPointCount(): Int {
    val _ret = __method_bind.getPointCount.call(this._handle)
    return _ret.asInt()
  }

  fun getPointLeftMode(index: Int): TangentMode {
    val _arg = Variant.new(index)
    val _ret = __method_bind.getPointLeftMode.call(this._handle, _arg, 1)
    return Curve.TangentMode.from(_ret.asInt())
  }

  fun getPointLeftTangent(index: Int): Float {
    val _arg = Variant.new(index)
    val _ret = __method_bind.getPointLeftTangent.call(this._handle, _arg, 1)
    return _ret.asFloat()
  }

  fun getPointPosition(index: Int): Vector2 {
    val _arg = Variant.new(index)
    val _ret = __method_bind.getPointPosition.call(this._handle, _arg, 1)
    return _ret.asVector2()
  }

  fun getPointRightMode(index: Int): TangentMode {
    val _arg = Variant.new(index)
    val _ret = __method_bind.getPointRightMode.call(this._handle, _arg, 1)
    return Curve.TangentMode.from(_ret.asInt())
  }

  fun getPointRightTangent(index: Int): Float {
    val _arg = Variant.new(index)
    val _ret = __method_bind.getPointRightTangent.call(this._handle, _arg, 1)
    return _ret.asFloat()
  }

  fun interpolate(offset: Float): Float {
    val _arg = Variant.new(offset)
    val _ret = __method_bind.interpolate.call(this._handle, _arg, 1)
    return _ret.asFloat()
  }

  fun interpolateBaked(offset: Float): Float {
    val _arg = Variant.new(offset)
    val _ret = __method_bind.interpolateBaked.call(this._handle, _arg, 1)
    return _ret.asFloat()
  }

  fun removePoint(index: Int) {
    val _arg = Variant.new(index)
    __method_bind.removePoint.call(this._handle, _arg, 1)
  }

  fun setBakeResolution(resolution: Int) {
    val _arg = Variant.new(resolution)
    __method_bind.setBakeResolution.call(this._handle, _arg, 1)
  }

  fun setMaxValue(max: Float) {
    val _arg = Variant.new(max)
    __method_bind.setMaxValue.call(this._handle, _arg, 1)
  }

  fun setMinValue(min: Float) {
    val _arg = Variant.new(min)
    __method_bind.setMinValue.call(this._handle, _arg, 1)
  }

  fun setPointLeftMode(index: Int, mode: Int) {
    val _args = VariantArray.new()
    _args.append(index)
    _args.append(mode)
    __method_bind.setPointLeftMode.call(this._handle, _args.toVariant(), 2)
  }

  fun setPointLeftTangent(index: Int, tangent: Float) {
    val _args = VariantArray.new()
    _args.append(index)
    _args.append(tangent)
    __method_bind.setPointLeftTangent.call(this._handle, _args.toVariant(), 2)
  }

  fun setPointOffset(index: Int, offset: Float): Int {
    val _args = VariantArray.new()
    _args.append(index)
    _args.append(offset)
    val _ret = __method_bind.setPointOffset.call(this._handle, _args.toVariant(), 2)
    return _ret.asInt()
  }

  fun setPointRightMode(index: Int, mode: Int) {
    val _args = VariantArray.new()
    _args.append(index)
    _args.append(mode)
    __method_bind.setPointRightMode.call(this._handle, _args.toVariant(), 2)
  }

  fun setPointRightTangent(index: Int, tangent: Float) {
    val _args = VariantArray.new()
    _args.append(index)
    _args.append(tangent)
    __method_bind.setPointRightTangent.call(this._handle, _args.toVariant(), 2)
  }

  fun setPointValue(index: Int, y: Float) {
    val _args = VariantArray.new()
    _args.append(index)
    _args.append(y)
    __method_bind.setPointValue.call(this._handle, _args.toVariant(), 2)
  }

  enum class TangentMode(
    val value: Int
  ) {
    TANGENT_FREE(0),

    TANGENT_LINEAR(1),

    TANGENT_MODE_COUNT(2);

    companion object {
      fun from(value: Int): TangentMode {
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
    val TANGENT_FREE: Int = 0

    val TANGENT_LINEAR: Int = 1

    val TANGENT_MODE_COUNT: Int = 2

    fun new(): Curve = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Curve".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for Curve" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Curve(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): Curve = Curve(ptr)
    /**
     * Container for method_bind pointers for Curve
     */
    private object __method_bind {
      val addPoint: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
            "addPoint".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addPoint" }
        }
      val bake: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
            "bake".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method bake" }
        }
      val cleanDupes: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
            "cleanDupes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method cleanDupes" }
        }
      val clearPoints: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
            "clearPoints".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clearPoints" }
        }
      val getBakeResolution: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
            "getBakeResolution".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getBakeResolution" }
        }
      val getMaxValue: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
            "getMaxValue".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getMaxValue" }
        }
      val getMinValue: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
            "getMinValue".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getMinValue" }
        }
      val getPointCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
            "getPointCount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPointCount" }
        }
      val getPointLeftMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
            "getPointLeftMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPointLeftMode" }
        }
      val getPointLeftTangent: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
            "getPointLeftTangent".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPointLeftTangent" }
        }
      val getPointPosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
            "getPointPosition".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPointPosition" }
        }
      val getPointRightMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
            "getPointRightMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPointRightMode" }
        }
      val getPointRightTangent: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
            "getPointRightTangent".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPointRightTangent" }
        }
      val interpolate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
            "interpolate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method interpolate" }
        }
      val interpolateBaked: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
            "interpolateBaked".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method interpolateBaked" }
        }
      val removePoint: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
            "removePoint".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method removePoint" }
        }
      val setBakeResolution: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
            "setBakeResolution".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setBakeResolution" }
        }
      val setMaxValue: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
            "setMaxValue".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setMaxValue" }
        }
      val setMinValue: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
            "setMinValue".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setMinValue" }
        }
      val setPointLeftMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
            "setPointLeftMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setPointLeftMode" }
        }
      val setPointLeftTangent: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
            "setPointLeftTangent".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setPointLeftTangent" }
        }
      val setPointOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
            "setPointOffset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setPointOffset" }
        }
      val setPointRightMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
            "setPointRightMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setPointRightMode" }
        }
      val setPointRightTangent: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
            "setPointRightTangent".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setPointRightTangent" }
        }
      val setPointValue: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
            "setPointValue".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setPointValue" }
        }}
  }
}
