// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
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
  fun getData(): VariantArray {
    TODO()
  }

  fun setData() {
    TODO()
  }

  fun addPoint(): Int {
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

  fun getPointLeftMode(): Curve.TangentMode {
    TODO()
  }

  fun getPointLeftTangent(): Float {
    TODO()
  }

  fun getPointPosition(): Vector2 {
    TODO()
  }

  fun getPointRightMode(): Curve.TangentMode {
    TODO()
  }

  fun getPointRightTangent(): Float {
    TODO()
  }

  fun interpolate(): Float {
    TODO()
  }

  fun interpolateBaked(): Float {
    TODO()
  }

  fun removePoint() {
    TODO()
  }

  fun setBakeResolution() {
    TODO()
  }

  fun setMaxValue() {
    TODO()
  }

  fun setMinValue() {
    TODO()
  }

  fun setPointLeftMode() {
    TODO()
  }

  fun setPointLeftTangent() {
    TODO()
  }

  fun setPointOffset(): Int {
    TODO()
  }

  fun setPointRightMode() {
    TODO()
  }

  fun setPointRightTangent() {
    TODO()
  }

  fun setPointValue() {
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
      val _get_data: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
              "_get_data".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _get_data" }
            }
          }

      val _set_data: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Curve".cstr.ptr,
              "_set_data".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _set_data" }
            }
          }

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
