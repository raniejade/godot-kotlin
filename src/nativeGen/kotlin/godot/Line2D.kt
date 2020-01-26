// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Color
import godot.core.Godot
import godot.core.PoolVector2Array
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

open class Line2D internal constructor(
  _handle: COpaquePointer
) : Node2D(_handle) {
  fun addPoint(position: Vector2, at_position: Int) {
    TODO()
  }

  fun clearPoints() {
    TODO()
  }

  fun getBeginCapMode(): LineCapMode {
    TODO()
  }

  fun getDefaultColor(): Color {
    TODO()
  }

  fun getEndCapMode(): LineCapMode {
    TODO()
  }

  fun getGradient(): Gradient {
    TODO()
  }

  fun getJointMode(): LineJointMode {
    TODO()
  }

  fun getPointCount(): Int {
    TODO()
  }

  fun getPointPosition(i: Int): Vector2 {
    TODO()
  }

  fun getPoints(): PoolVector2Array {
    TODO()
  }

  fun getRoundPrecision(): Int {
    TODO()
  }

  fun getSharpLimit(): Float {
    TODO()
  }

  fun getTexture(): Texture {
    TODO()
  }

  fun getTextureMode(): LineTextureMode {
    TODO()
  }

  fun getWidth(): Float {
    TODO()
  }

  fun removePoint(i: Int) {
    TODO()
  }

  fun setBeginCapMode(mode: Int) {
    TODO()
  }

  fun setDefaultColor(color: Color) {
    TODO()
  }

  fun setEndCapMode(mode: Int) {
    TODO()
  }

  fun setGradient(color: Gradient) {
    TODO()
  }

  fun setJointMode(mode: Int) {
    TODO()
  }

  fun setPointPosition(i: Int, position: Vector2) {
    TODO()
  }

  fun setPoints(points: PoolVector2Array) {
    TODO()
  }

  fun setRoundPrecision(precision: Int) {
    TODO()
  }

  fun setSharpLimit(limit: Float) {
    TODO()
  }

  fun setTexture(texture: Texture) {
    TODO()
  }

  fun setTextureMode(mode: Int) {
    TODO()
  }

  fun setWidth(width: Float) {
    TODO()
  }

  enum class LineTextureMode(
    val value: Int
  ) {
    LINE_TEXTURE_NONE(0),

    LINE_TEXTURE_TILE(1),

    LINE_TEXTURE_STRETCH(2);
  }

  enum class LineCapMode(
    val value: Int
  ) {
    LINE_CAP_NONE(0),

    LINE_CAP_BOX(1),

    LINE_CAP_ROUND(2);
  }

  enum class LineJointMode(
    val value: Int
  ) {
    LINE_JOINT_SHARP(0),

    LINE_JOINT_BEVEL(1),

    LINE_JOINT_ROUND(2);
  }

  companion object {
    val LINE_CAP_BOX: Int = 1

    val LINE_CAP_NONE: Int = 0

    val LINE_CAP_ROUND: Int = 2

    val LINE_JOINT_BEVEL: Int = 1

    val LINE_JOINT_ROUND: Int = 2

    val LINE_JOINT_SHARP: Int = 0

    val LINE_TEXTURE_NONE: Int = 0

    val LINE_TEXTURE_STRETCH: Int = 2

    val LINE_TEXTURE_TILE: Int = 1

    fun new(): Line2D = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Line2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton Line2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Line2D(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for Line2D
     */
    private object __method_bind {
      val add_point: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
              "add_point".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_point" }
            }
          }

      val clear_points: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
              "clear_points".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clear_points" }
            }
          }

      val get_begin_cap_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
              "get_begin_cap_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_begin_cap_mode" }
            }
          }

      val get_default_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
              "get_default_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_default_color" }
            }
          }

      val get_end_cap_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
              "get_end_cap_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_end_cap_mode" }
            }
          }

      val get_gradient: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
              "get_gradient".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_gradient" }
            }
          }

      val get_joint_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
              "get_joint_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_joint_mode" }
            }
          }

      val get_point_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
              "get_point_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_point_count" }
            }
          }

      val get_point_position: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
              "get_point_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_point_position" }
            }
          }

      val get_points: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
              "get_points".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_points" }
            }
          }

      val get_round_precision: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
              "get_round_precision".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_round_precision" }
            }
          }

      val get_sharp_limit: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
              "get_sharp_limit".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_sharp_limit" }
            }
          }

      val get_texture: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
              "get_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_texture" }
            }
          }

      val get_texture_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
              "get_texture_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_texture_mode" }
            }
          }

      val get_width: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
              "get_width".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_width" }
            }
          }

      val remove_point: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
              "remove_point".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_point" }
            }
          }

      val set_begin_cap_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
              "set_begin_cap_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_begin_cap_mode" }
            }
          }

      val set_default_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
              "set_default_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_default_color" }
            }
          }

      val set_end_cap_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
              "set_end_cap_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_end_cap_mode" }
            }
          }

      val set_gradient: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
              "set_gradient".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_gradient" }
            }
          }

      val set_joint_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
              "set_joint_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_joint_mode" }
            }
          }

      val set_point_position: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
              "set_point_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_point_position" }
            }
          }

      val set_points: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
              "set_points".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_points" }
            }
          }

      val set_round_precision: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
              "set_round_precision".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_round_precision" }
            }
          }

      val set_sharp_limit: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
              "set_sharp_limit".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_sharp_limit" }
            }
          }

      val set_texture: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
              "set_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_texture" }
            }
          }

      val set_texture_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
              "set_texture_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_texture_mode" }
            }
          }

      val set_width: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Line2D".cstr.ptr,
              "set_width".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_width" }
            }
          }
    }
  }
}
