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
    leftTangent: Float = 0.0f,
    rightTangent: Float = 0.0f,
    leftMode: Int = 0,
    rightMode: Int = 0
  ): Int {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(position))
    _args.add(Variant.fromAny(leftTangent))
    _args.add(Variant.fromAny(rightTangent))
    _args.add(Variant.fromAny(leftMode))
    _args.add(Variant.fromAny(rightMode))
    val _ret = __method_bind.addPoint.call(this._handle, _args)
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
    val _ret = __method_bind.getPointLeftMode.call(this._handle, listOf(_arg))
    return Curve.TangentMode.from(_ret.asInt())
  }

  fun getPointLeftTangent(index: Int): Float {
    val _arg = Variant.new(index)
    val _ret = __method_bind.getPointLeftTangent.call(this._handle, listOf(_arg))
    return _ret.asFloat()
  }

  fun getPointPosition(index: Int): Vector2 {
    val _arg = Variant.new(index)
    val _ret = __method_bind.getPointPosition.call(this._handle, listOf(_arg))
    return _ret.asVector2()
  }

  fun getPointRightMode(index: Int): TangentMode {
    val _arg = Variant.new(index)
    val _ret = __method_bind.getPointRightMode.call(this._handle, listOf(_arg))
    return Curve.TangentMode.from(_ret.asInt())
  }

  fun getPointRightTangent(index: Int): Float {
    val _arg = Variant.new(index)
    val _ret = __method_bind.getPointRightTangent.call(this._handle, listOf(_arg))
    return _ret.asFloat()
  }

  fun interpolate(offset: Float): Float {
    val _arg = Variant.new(offset)
    val _ret = __method_bind.interpolate.call(this._handle, listOf(_arg))
    return _ret.asFloat()
  }

  fun interpolateBaked(offset: Float): Float {
    val _arg = Variant.new(offset)
    val _ret = __method_bind.interpolateBaked.call(this._handle, listOf(_arg))
    return _ret.asFloat()
  }

  fun removePoint(index: Int) {
    val _arg = Variant.new(index)
    __method_bind.removePoint.call(this._handle, listOf(_arg))
  }

  fun setBakeResolution(resolution: Int) {
    val _arg = Variant.new(resolution)
    __method_bind.setBakeResolution.call(this._handle, listOf(_arg))
  }

  fun setMaxValue(max: Float) {
    val _arg = Variant.new(max)
    __method_bind.setMaxValue.call(this._handle, listOf(_arg))
  }

  fun setMinValue(min: Float) {
    val _arg = Variant.new(min)
    __method_bind.setMinValue.call(this._handle, listOf(_arg))
  }

  fun setPointLeftMode(index: Int, mode: Int) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(index))
    _args.add(Variant.fromAny(mode))
    __method_bind.setPointLeftMode.call(this._handle, _args)
  }

  fun setPointLeftTangent(index: Int, tangent: Float) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(index))
    _args.add(Variant.fromAny(tangent))
    __method_bind.setPointLeftTangent.call(this._handle, _args)
  }

  fun setPointOffset(index: Int, offset: Float): Int {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(index))
    _args.add(Variant.fromAny(offset))
    val _ret = __method_bind.setPointOffset.call(this._handle, _args)
    return _ret.asInt()
  }

  fun setPointRightMode(index: Int, mode: Int) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(index))
    _args.add(Variant.fromAny(mode))
    __method_bind.setPointRightMode.call(this._handle, _args)
  }

  fun setPointRightTangent(index: Int, tangent: Float) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(index))
    _args.add(Variant.fromAny(tangent))
    __method_bind.setPointRightTangent.call(this._handle, _args)
  }

  fun setPointValue(index: Int, y: Float) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(index))
    _args.add(Variant.fromAny(y))
    __method_bind.setPointValue.call(this._handle, _args)
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
            "add_point".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_point" }
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
            "clean_dupes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clean_dupes" }
        }
      val clearPoints: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
            "clear_points".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear_points" }
        }
      val getBakeResolution: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
            "get_bake_resolution".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_bake_resolution" }
        }
      val getMaxValue: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
            "get_max_value".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_max_value" }
        }
      val getMinValue: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
            "get_min_value".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_min_value" }
        }
      val getPointCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
            "get_point_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_point_count" }
        }
      val getPointLeftMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
            "get_point_left_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_point_left_mode" }
        }
      val getPointLeftTangent: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
            "get_point_left_tangent".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_point_left_tangent" }
        }
      val getPointPosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
            "get_point_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_point_position" }
        }
      val getPointRightMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
            "get_point_right_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_point_right_mode" }
        }
      val getPointRightTangent: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
            "get_point_right_tangent".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_point_right_tangent" }
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
            "interpolate_baked".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method interpolate_baked" }
        }
      val removePoint: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
            "remove_point".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_point" }
        }
      val setBakeResolution: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
            "set_bake_resolution".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_bake_resolution" }
        }
      val setMaxValue: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
            "set_max_value".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_max_value" }
        }
      val setMinValue: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
            "set_min_value".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_min_value" }
        }
      val setPointLeftMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
            "set_point_left_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_point_left_mode" }
        }
      val setPointLeftTangent: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
            "set_point_left_tangent".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_point_left_tangent" }
        }
      val setPointOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
            "set_point_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_point_offset" }
        }
      val setPointRightMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
            "set_point_right_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_point_right_mode" }
        }
      val setPointRightTangent: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
            "set_point_right_tangent".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_point_right_tangent" }
        }
      val setPointValue: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
            "set_point_value".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_point_value" }
        }}
  }
}
