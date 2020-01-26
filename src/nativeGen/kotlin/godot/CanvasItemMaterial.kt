// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlin.Boolean
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class CanvasItemMaterial internal constructor(
  _handle: COpaquePointer
) : Material(_handle) {
  fun getBlendMode(): CanvasItemMaterial.BlendMode {
    TODO()
  }

  fun getLightMode(): CanvasItemMaterial.LightMode {
    TODO()
  }

  fun getParticlesAnimHFrames(): Int {
    TODO()
  }

  fun getParticlesAnimLoop(): Boolean {
    TODO()
  }

  fun getParticlesAnimVFrames(): Int {
    TODO()
  }

  fun getParticlesAnimation(): Boolean {
    TODO()
  }

  fun setBlendMode() {
    TODO()
  }

  fun setLightMode() {
    TODO()
  }

  fun setParticlesAnimHFrames() {
    TODO()
  }

  fun setParticlesAnimLoop() {
    TODO()
  }

  fun setParticlesAnimVFrames() {
    TODO()
  }

  fun setParticlesAnimation() {
    TODO()
  }

  enum class LightMode(
    val value: Int
  ) {
    LIGHT_MODE_NORMAL(0),

    LIGHT_MODE_UNSHADED(1),

    LIGHT_MODE_LIGHT_ONLY(2);
  }

  enum class BlendMode(
    val value: Int
  ) {
    BLEND_MODE_MIX(0),

    BLEND_MODE_ADD(1),

    BLEND_MODE_SUB(2),

    BLEND_MODE_MUL(3),

    BLEND_MODE_PREMULT_ALPHA(4);
  }

  companion object {
    val BLEND_MODE_ADD: Int = 1

    val BLEND_MODE_MIX: Int = 0

    val BLEND_MODE_MUL: Int = 3

    val BLEND_MODE_PREMULT_ALPHA: Int = 4

    val BLEND_MODE_SUB: Int = 2

    val LIGHT_MODE_LIGHT_ONLY: Int = 2

    val LIGHT_MODE_NORMAL: Int = 0

    val LIGHT_MODE_UNSHADED: Int = 1

    fun new(): CanvasItemMaterial = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("CanvasItemMaterial".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton CanvasItemMaterial" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      CanvasItemMaterial(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for CanvasItemMaterial
     */
    private object __method_bind {
      val get_blend_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItemMaterial".cstr.ptr,
              "get_blend_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_blend_mode" }
            }
          }

      val get_light_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItemMaterial".cstr.ptr,
              "get_light_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_light_mode" }
            }
          }

      val get_particles_anim_h_frames: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItemMaterial".cstr.ptr,
              "get_particles_anim_h_frames".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_particles_anim_h_frames" }
            }
          }

      val get_particles_anim_loop: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItemMaterial".cstr.ptr,
              "get_particles_anim_loop".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_particles_anim_loop" }
            }
          }

      val get_particles_anim_v_frames: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItemMaterial".cstr.ptr,
              "get_particles_anim_v_frames".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_particles_anim_v_frames" }
            }
          }

      val get_particles_animation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItemMaterial".cstr.ptr,
              "get_particles_animation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_particles_animation" }
            }
          }

      val set_blend_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItemMaterial".cstr.ptr,
              "set_blend_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_blend_mode" }
            }
          }

      val set_light_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItemMaterial".cstr.ptr,
              "set_light_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_light_mode" }
            }
          }

      val set_particles_anim_h_frames: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItemMaterial".cstr.ptr,
              "set_particles_anim_h_frames".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_particles_anim_h_frames" }
            }
          }

      val set_particles_anim_loop: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItemMaterial".cstr.ptr,
              "set_particles_anim_loop".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_particles_anim_loop" }
            }
          }

      val set_particles_anim_v_frames: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItemMaterial".cstr.ptr,
              "set_particles_anim_v_frames".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_particles_anim_v_frames" }
            }
          }

      val set_particles_animation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItemMaterial".cstr.ptr,
              "set_particles_animation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_particles_animation" }
            }
          }
    }
  }
}
