// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
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
    left_tangent: Float,
    right_tangent: Float,
    left_mode: Int,
    right_mode: Int
  ): Int {
    TODO()
  }

  fun bake() {
    TODO()
  }

  fun cleanDupes() {
    TODO()
  }

  fun clearPoints() {
    TODO()
  }

  fun getBakeResolution(): Int {
    TODO()
  }

  fun getMaxValue(): Float {
    TODO()
  }

  fun getMinValue(): Float {
    TODO()
  }

  fun getPointCount(): Int {
    TODO()
  }

  fun getPointLeftMode(index: Int): TangentMode {
    TODO()
  }

  fun getPointLeftTangent(index: Int): Float {
    TODO()
  }

  fun getPointPosition(index: Int): Vector2 {
    TODO()
  }

  fun getPointRightMode(index: Int): TangentMode {
    TODO()
  }

  fun getPointRightTangent(index: Int): Float {
    TODO()
  }

  fun interpolate(offset: Float): Float {
    TODO()
  }

  fun interpolateBaked(offset: Float): Float {
    TODO()
  }

  fun removePoint(index: Int) {
    TODO()
  }

  fun setBakeResolution(resolution: Int) {
    TODO()
  }

  fun setMaxValue(max: Float) {
    TODO()
  }

  fun setMinValue(min: Float) {
    TODO()
  }

  fun setPointLeftMode(index: Int, mode: Int) {
    TODO()
  }

  fun setPointLeftTangent(index: Int, tangent: Float) {
    TODO()
  }

  fun setPointOffset(index: Int, offset: Float): Int {
    TODO()
  }

  fun setPointRightMode(index: Int, mode: Int) {
    TODO()
  }

  fun setPointRightTangent(index: Int, tangent: Float) {
    TODO()
  }

  fun setPointValue(index: Int, y: Float) {
    TODO()
  }

  enum class TangentMode(
    val value: Int
  ) {
    TANGENT_FREE(0),

    TANGENT_LINEAR(1),

    TANGENT_MODE_COUNT(2);
  }

  companion object {
    val TANGENT_FREE: Int = 0

    val TANGENT_LINEAR: Int = 1

    val TANGENT_MODE_COUNT: Int = 2

    fun new(): Curve = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Curve".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton Curve" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Curve(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for Curve
     */
    private object __method_bind {
      val add_point: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
              "add_point".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_point" }
            }
          }

      val bake: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
              "bake".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method bake" }
            }
          }

      val clean_dupes: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
              "clean_dupes".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clean_dupes" }
            }
          }

      val clear_points: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
              "clear_points".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clear_points" }
            }
          }

      val get_bake_resolution: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
              "get_bake_resolution".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_bake_resolution" }
            }
          }

      val get_max_value: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
              "get_max_value".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_max_value" }
            }
          }

      val get_min_value: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
              "get_min_value".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_min_value" }
            }
          }

      val get_point_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
              "get_point_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_point_count" }
            }
          }

      val get_point_left_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
              "get_point_left_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_point_left_mode" }
            }
          }

      val get_point_left_tangent: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
              "get_point_left_tangent".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_point_left_tangent" }
            }
          }

      val get_point_position: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
              "get_point_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_point_position" }
            }
          }

      val get_point_right_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
              "get_point_right_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_point_right_mode" }
            }
          }

      val get_point_right_tangent: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
              "get_point_right_tangent".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_point_right_tangent" }
            }
          }

      val interpolate: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
              "interpolate".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method interpolate" }
            }
          }

      val interpolate_baked: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
              "interpolate_baked".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method interpolate_baked" }
            }
          }

      val remove_point: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
              "remove_point".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_point" }
            }
          }

      val set_bake_resolution: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
              "set_bake_resolution".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_bake_resolution" }
            }
          }

      val set_max_value: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
              "set_max_value".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_max_value" }
            }
          }

      val set_min_value: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
              "set_min_value".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_min_value" }
            }
          }

      val set_point_left_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
              "set_point_left_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_point_left_mode" }
            }
          }

      val set_point_left_tangent: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
              "set_point_left_tangent".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_point_left_tangent" }
            }
          }

      val set_point_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
              "set_point_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_point_offset" }
            }
          }

      val set_point_right_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
              "set_point_right_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_point_right_mode" }
            }
          }

      val set_point_right_tangent: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
              "set_point_right_tangent".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_point_right_tangent" }
            }
          }

      val set_point_value: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
              "set_point_value".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_point_value" }
            }
          }
    }
  }
}
