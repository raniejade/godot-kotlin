// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Rect2
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

open class Particles2D internal constructor(
  _handle: COpaquePointer
) : Node2D(_handle) {
  fun captureRect(): Rect2 {
    TODO()
  }

  fun getAmount(): Int {
    TODO()
  }

  fun getDrawOrder(): DrawOrder {
    TODO()
  }

  fun getExplosivenessRatio(): Float {
    TODO()
  }

  fun getFixedFps(): Int {
    TODO()
  }

  fun getFractionalDelta(): Boolean {
    TODO()
  }

  fun getLifetime(): Float {
    TODO()
  }

  fun getNormalMap(): Texture {
    TODO()
  }

  fun getOneShot(): Boolean {
    TODO()
  }

  fun getPreProcessTime(): Float {
    TODO()
  }

  fun getProcessMaterial(): Material {
    TODO()
  }

  fun getRandomnessRatio(): Float {
    TODO()
  }

  fun getSpeedScale(): Float {
    TODO()
  }

  fun getTexture(): Texture {
    TODO()
  }

  fun getUseLocalCoordinates(): Boolean {
    TODO()
  }

  fun getVisibilityRect(): Rect2 {
    TODO()
  }

  fun isEmitting(): Boolean {
    TODO()
  }

  fun restart() {
    TODO()
  }

  fun setAmount(amount: Int) {
    TODO()
  }

  fun setDrawOrder(order: Int) {
    TODO()
  }

  fun setEmitting(emitting: Boolean) {
    TODO()
  }

  fun setExplosivenessRatio(ratio: Float) {
    TODO()
  }

  fun setFixedFps(fps: Int) {
    TODO()
  }

  fun setFractionalDelta(enable: Boolean) {
    TODO()
  }

  fun setLifetime(secs: Float) {
    TODO()
  }

  fun setNormalMap(texture: Texture) {
    TODO()
  }

  fun setOneShot(secs: Boolean) {
    TODO()
  }

  fun setPreProcessTime(secs: Float) {
    TODO()
  }

  fun setProcessMaterial(material: Material) {
    TODO()
  }

  fun setRandomnessRatio(ratio: Float) {
    TODO()
  }

  fun setSpeedScale(scale: Float) {
    TODO()
  }

  fun setTexture(texture: Texture) {
    TODO()
  }

  fun setUseLocalCoordinates(enable: Boolean) {
    TODO()
  }

  fun setVisibilityRect(visibility_rect: Rect2) {
    TODO()
  }

  enum class DrawOrder(
    val value: Int
  ) {
    DRAW_ORDER_INDEX(0),

    DRAW_ORDER_LIFETIME(1);
  }

  companion object {
    val DRAW_ORDER_INDEX: Int = 0

    val DRAW_ORDER_LIFETIME: Int = 1

    fun new(): Particles2D = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Particles2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton Particles2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Particles2D(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for Particles2D
     */
    private object __method_bind {
      val capture_rect: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles2D".cstr.ptr,
              "capture_rect".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method capture_rect" }
            }
          }

      val get_amount: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles2D".cstr.ptr,
              "get_amount".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_amount" }
            }
          }

      val get_draw_order: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles2D".cstr.ptr,
              "get_draw_order".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_draw_order" }
            }
          }

      val get_explosiveness_ratio: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles2D".cstr.ptr,
              "get_explosiveness_ratio".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_explosiveness_ratio" }
            }
          }

      val get_fixed_fps: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles2D".cstr.ptr,
              "get_fixed_fps".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_fixed_fps" }
            }
          }

      val get_fractional_delta: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles2D".cstr.ptr,
              "get_fractional_delta".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_fractional_delta" }
            }
          }

      val get_lifetime: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles2D".cstr.ptr,
              "get_lifetime".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_lifetime" }
            }
          }

      val get_normal_map: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles2D".cstr.ptr,
              "get_normal_map".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_normal_map" }
            }
          }

      val get_one_shot: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles2D".cstr.ptr,
              "get_one_shot".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_one_shot" }
            }
          }

      val get_pre_process_time: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles2D".cstr.ptr,
              "get_pre_process_time".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_pre_process_time" }
            }
          }

      val get_process_material: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles2D".cstr.ptr,
              "get_process_material".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_process_material" }
            }
          }

      val get_randomness_ratio: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles2D".cstr.ptr,
              "get_randomness_ratio".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_randomness_ratio" }
            }
          }

      val get_speed_scale: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles2D".cstr.ptr,
              "get_speed_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_speed_scale" }
            }
          }

      val get_texture: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles2D".cstr.ptr,
              "get_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_texture" }
            }
          }

      val get_use_local_coordinates: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles2D".cstr.ptr,
              "get_use_local_coordinates".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_use_local_coordinates" }
            }
          }

      val get_visibility_rect: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles2D".cstr.ptr,
              "get_visibility_rect".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_visibility_rect" }
            }
          }

      val is_emitting: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles2D".cstr.ptr,
              "is_emitting".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_emitting" }
            }
          }

      val restart: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles2D".cstr.ptr,
              "restart".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method restart" }
            }
          }

      val set_amount: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles2D".cstr.ptr,
              "set_amount".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_amount" }
            }
          }

      val set_draw_order: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles2D".cstr.ptr,
              "set_draw_order".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_draw_order" }
            }
          }

      val set_emitting: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles2D".cstr.ptr,
              "set_emitting".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_emitting" }
            }
          }

      val set_explosiveness_ratio: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles2D".cstr.ptr,
              "set_explosiveness_ratio".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_explosiveness_ratio" }
            }
          }

      val set_fixed_fps: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles2D".cstr.ptr,
              "set_fixed_fps".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_fixed_fps" }
            }
          }

      val set_fractional_delta: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles2D".cstr.ptr,
              "set_fractional_delta".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_fractional_delta" }
            }
          }

      val set_lifetime: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles2D".cstr.ptr,
              "set_lifetime".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_lifetime" }
            }
          }

      val set_normal_map: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles2D".cstr.ptr,
              "set_normal_map".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_normal_map" }
            }
          }

      val set_one_shot: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles2D".cstr.ptr,
              "set_one_shot".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_one_shot" }
            }
          }

      val set_pre_process_time: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles2D".cstr.ptr,
              "set_pre_process_time".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_pre_process_time" }
            }
          }

      val set_process_material: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles2D".cstr.ptr,
              "set_process_material".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_process_material" }
            }
          }

      val set_randomness_ratio: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles2D".cstr.ptr,
              "set_randomness_ratio".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_randomness_ratio" }
            }
          }

      val set_speed_scale: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles2D".cstr.ptr,
              "set_speed_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_speed_scale" }
            }
          }

      val set_texture: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles2D".cstr.ptr,
              "set_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_texture" }
            }
          }

      val set_use_local_coordinates: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles2D".cstr.ptr,
              "set_use_local_coordinates".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_use_local_coordinates" }
            }
          }

      val set_visibility_rect: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Particles2D".cstr.ptr,
              "set_visibility_rect".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_visibility_rect" }
            }
          }
    }
  }
}
