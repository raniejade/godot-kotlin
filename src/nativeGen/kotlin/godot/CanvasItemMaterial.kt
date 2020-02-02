// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Int
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class CanvasItemMaterial(
  _handle: COpaquePointer
) : Material(_handle) {
  var blendMode: BlendMode
    get() {
       return getBlendMode() 
    }
    set(value) {
      setBlendMode(value.value)
    }

  var lightMode: LightMode
    get() {
       return getLightMode() 
    }
    set(value) {
      setLightMode(value.value)
    }

  var particlesAnimHFrames: Int
    get() {
       return getParticlesAnimHFrames() 
    }
    set(value) {
      setParticlesAnimHFrames(value)
    }

  var particlesAnimLoop: Boolean
    get() {
       return getParticlesAnimLoop() 
    }
    set(value) {
      setParticlesAnimLoop(value)
    }

  var particlesAnimVFrames: Int
    get() {
       return getParticlesAnimVFrames() 
    }
    set(value) {
      setParticlesAnimVFrames(value)
    }

  var particlesAnimation: Boolean
    get() {
       return getParticlesAnimation() 
    }
    set(value) {
      setParticlesAnimation(value)
    }

  fun getBlendMode(): BlendMode {
    val _ret = __method_bind.getBlendMode.call(this._handle)
    return CanvasItemMaterial.BlendMode.from(_ret.asInt())
  }

  fun getLightMode(): LightMode {
    val _ret = __method_bind.getLightMode.call(this._handle)
    return CanvasItemMaterial.LightMode.from(_ret.asInt())
  }

  fun getParticlesAnimHFrames(): Int {
    val _ret = __method_bind.getParticlesAnimHFrames.call(this._handle)
    return _ret.asInt()
  }

  fun getParticlesAnimLoop(): Boolean {
    val _ret = __method_bind.getParticlesAnimLoop.call(this._handle)
    return _ret.asBoolean()
  }

  fun getParticlesAnimVFrames(): Int {
    val _ret = __method_bind.getParticlesAnimVFrames.call(this._handle)
    return _ret.asInt()
  }

  fun getParticlesAnimation(): Boolean {
    val _ret = __method_bind.getParticlesAnimation.call(this._handle)
    return _ret.asBoolean()
  }

  fun setBlendMode(blendMode: Int) {
    val _arg = Variant.new(blendMode)
    __method_bind.setBlendMode.call(this._handle, listOf(_arg))
  }

  fun setLightMode(lightMode: Int) {
    val _arg = Variant.new(lightMode)
    __method_bind.setLightMode.call(this._handle, listOf(_arg))
  }

  fun setParticlesAnimHFrames(frames: Int) {
    val _arg = Variant.new(frames)
    __method_bind.setParticlesAnimHFrames.call(this._handle, listOf(_arg))
  }

  fun setParticlesAnimLoop(loop: Boolean) {
    val _arg = Variant.new(loop)
    __method_bind.setParticlesAnimLoop.call(this._handle, listOf(_arg))
  }

  fun setParticlesAnimVFrames(frames: Int) {
    val _arg = Variant.new(frames)
    __method_bind.setParticlesAnimVFrames.call(this._handle, listOf(_arg))
  }

  fun setParticlesAnimation(particlesAnim: Boolean) {
    val _arg = Variant.new(particlesAnim)
    __method_bind.setParticlesAnimation.call(this._handle, listOf(_arg))
  }

  enum class LightMode(
    val value: Int
  ) {
    NORMAL(0),

    UNSHADED(1),

    LIGHT_ONLY(2);

    companion object {
      fun from(value: Int): LightMode {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class BlendMode(
    val value: Int
  ) {
    MIX(0),

    ADD(1),

    SUB(2),

    MUL(3),

    PREMULT_ALPHA(4);

    companion object {
      fun from(value: Int): BlendMode {
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
    fun new(): CanvasItemMaterial = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("CanvasItemMaterial".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for CanvasItemMaterial" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      CanvasItemMaterial(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): CanvasItemMaterial = CanvasItemMaterial(ptr)
    /**
     * Container for method_bind pointers for CanvasItemMaterial
     */
    private object __method_bind {
      val getBlendMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItemMaterial".cstr.ptr,
            "get_blend_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_blend_mode" }
        }
      val getLightMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItemMaterial".cstr.ptr,
            "get_light_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_light_mode" }
        }
      val getParticlesAnimHFrames: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItemMaterial".cstr.ptr,
            "get_particles_anim_h_frames".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_particles_anim_h_frames" }
        }
      val getParticlesAnimLoop: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItemMaterial".cstr.ptr,
            "get_particles_anim_loop".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_particles_anim_loop" }
        }
      val getParticlesAnimVFrames: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItemMaterial".cstr.ptr,
            "get_particles_anim_v_frames".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_particles_anim_v_frames" }
        }
      val getParticlesAnimation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItemMaterial".cstr.ptr,
            "get_particles_animation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_particles_animation" }
        }
      val setBlendMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItemMaterial".cstr.ptr,
            "set_blend_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_blend_mode" }
        }
      val setLightMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItemMaterial".cstr.ptr,
            "set_light_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_light_mode" }
        }
      val setParticlesAnimHFrames: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItemMaterial".cstr.ptr,
            "set_particles_anim_h_frames".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_particles_anim_h_frames" }
        }
      val setParticlesAnimLoop: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItemMaterial".cstr.ptr,
            "set_particles_anim_loop".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_particles_anim_loop" }
        }
      val setParticlesAnimVFrames: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItemMaterial".cstr.ptr,
            "set_particles_anim_v_frames".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_particles_anim_v_frames" }
        }
      val setParticlesAnimation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItemMaterial".cstr.ptr,
            "set_particles_animation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_particles_animation" }
        }}
  }
}
