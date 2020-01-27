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

open class Curve internal constructor(
  _handle: COpaquePointer
) : Resource(_handle) {
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
    val _ret = __method_bind.add_point.call(this.toVariant(), _args.toVariant(), 5)
    return _ret.asInt()
  }

  fun bake() {
    __method_bind.bake.call(this.toVariant())
  }

  fun cleanDupes() {
    __method_bind.clean_dupes.call(this.toVariant())
  }

  fun clearPoints() {
    __method_bind.clear_points.call(this.toVariant())
  }

  fun getBakeResolution(): Int {
    val _ret = __method_bind.get_bake_resolution.call(this.toVariant())
    return _ret.asInt()
  }

  fun getMaxValue(): Float {
    val _ret = __method_bind.get_max_value.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getMinValue(): Float {
    val _ret = __method_bind.get_min_value.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getPointCount(): Int {
    val _ret = __method_bind.get_point_count.call(this.toVariant())
    return _ret.asInt()
  }

  fun getPointLeftMode(index: Int): TangentMode {
    val _arg = Variant.new(index)
    val _ret = __method_bind.get_point_left_mode.call(this.toVariant(), _arg, 1)
    return Curve.TangentMode.from(_ret.asInt())
  }

  fun getPointLeftTangent(index: Int): Float {
    val _arg = Variant.new(index)
    val _ret = __method_bind.get_point_left_tangent.call(this.toVariant(), _arg, 1)
    return _ret.asFloat()
  }

  fun getPointPosition(index: Int): Vector2 {
    val _arg = Variant.new(index)
    val _ret = __method_bind.get_point_position.call(this.toVariant(), _arg, 1)
    return _ret.asVector2()
  }

  fun getPointRightMode(index: Int): TangentMode {
    val _arg = Variant.new(index)
    val _ret = __method_bind.get_point_right_mode.call(this.toVariant(), _arg, 1)
    return Curve.TangentMode.from(_ret.asInt())
  }

  fun getPointRightTangent(index: Int): Float {
    val _arg = Variant.new(index)
    val _ret = __method_bind.get_point_right_tangent.call(this.toVariant(), _arg, 1)
    return _ret.asFloat()
  }

  fun interpolate(offset: Float): Float {
    val _arg = Variant.new(offset)
    val _ret = __method_bind.interpolate.call(this.toVariant(), _arg, 1)
    return _ret.asFloat()
  }

  fun interpolateBaked(offset: Float): Float {
    val _arg = Variant.new(offset)
    val _ret = __method_bind.interpolate_baked.call(this.toVariant(), _arg, 1)
    return _ret.asFloat()
  }

  fun removePoint(index: Int) {
    val _arg = Variant.new(index)
    __method_bind.remove_point.call(this.toVariant(), _arg, 1)
  }

  fun setBakeResolution(resolution: Int) {
    val _arg = Variant.new(resolution)
    __method_bind.set_bake_resolution.call(this.toVariant(), _arg, 1)
  }

  fun setMaxValue(max: Float) {
    val _arg = Variant.new(max)
    __method_bind.set_max_value.call(this.toVariant(), _arg, 1)
  }

  fun setMinValue(min: Float) {
    val _arg = Variant.new(min)
    __method_bind.set_min_value.call(this.toVariant(), _arg, 1)
  }

  fun setPointLeftMode(index: Int, mode: Int) {
    val _args = VariantArray.new()
    _args.append(index)
    _args.append(mode)
    __method_bind.set_point_left_mode.call(this.toVariant(), _args.toVariant(), 2)
  }

  fun setPointLeftTangent(index: Int, tangent: Float) {
    val _args = VariantArray.new()
    _args.append(index)
    _args.append(tangent)
    __method_bind.set_point_left_tangent.call(this.toVariant(), _args.toVariant(), 2)
  }

  fun setPointOffset(index: Int, offset: Float): Int {
    val _args = VariantArray.new()
    _args.append(index)
    _args.append(offset)
    val _ret = __method_bind.set_point_offset.call(this.toVariant(), _args.toVariant(), 2)
    return _ret.asInt()
  }

  fun setPointRightMode(index: Int, mode: Int) {
    val _args = VariantArray.new()
    _args.append(index)
    _args.append(mode)
    __method_bind.set_point_right_mode.call(this.toVariant(), _args.toVariant(), 2)
  }

  fun setPointRightTangent(index: Int, tangent: Float) {
    val _args = VariantArray.new()
    _args.append(index)
    _args.append(tangent)
    __method_bind.set_point_right_tangent.call(this.toVariant(), _args.toVariant(), 2)
  }

  fun setPointValue(index: Int, y: Float) {
    val _args = VariantArray.new()
    _args.append(index)
    _args.append(y)
    __method_bind.set_point_value.call(this.toVariant(), _args.toVariant(), 2)
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
      val add_point: CPointer<godot_method_bind>
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
      val clean_dupes: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
            "clean_dupes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clean_dupes" }
        }
      val clear_points: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
            "clear_points".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear_points" }
        }
      val get_bake_resolution: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
            "get_bake_resolution".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_bake_resolution" }
        }
      val get_max_value: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
            "get_max_value".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_max_value" }
        }
      val get_min_value: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
            "get_min_value".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_min_value" }
        }
      val get_point_count: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
            "get_point_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_point_count" }
        }
      val get_point_left_mode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
            "get_point_left_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_point_left_mode" }
        }
      val get_point_left_tangent: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
            "get_point_left_tangent".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_point_left_tangent" }
        }
      val get_point_position: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
            "get_point_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_point_position" }
        }
      val get_point_right_mode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
            "get_point_right_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_point_right_mode" }
        }
      val get_point_right_tangent: CPointer<godot_method_bind>
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
      val interpolate_baked: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
            "interpolate_baked".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method interpolate_baked" }
        }
      val remove_point: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
            "remove_point".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_point" }
        }
      val set_bake_resolution: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
            "set_bake_resolution".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_bake_resolution" }
        }
      val set_max_value: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
            "set_max_value".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_max_value" }
        }
      val set_min_value: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
            "set_min_value".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_min_value" }
        }
      val set_point_left_mode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
            "set_point_left_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_point_left_mode" }
        }
      val set_point_left_tangent: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
            "set_point_left_tangent".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_point_left_tangent" }
        }
      val set_point_offset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
            "set_point_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_point_offset" }
        }
      val set_point_right_mode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
            "set_point_right_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_point_right_mode" }
        }
      val set_point_right_tangent: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
            "set_point_right_tangent".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_point_right_tangent" }
        }
      val set_point_value: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
            "set_point_value".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_point_value" }
        }}
  }
}
