// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.reflect.KCallable
import kotlinx.cinterop.BooleanVar
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.COpaquePointerVar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.DoubleVar
import kotlinx.cinterop.IntVar
import kotlinx.cinterop.alloc
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.readValue
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.value

open class CanvasItemMaterial(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Material(null) {
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

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getBlendMode(): BlendMode {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getBlendMode.call(self._handle, emptyList(), _retPtr)
      CanvasItemMaterial.BlendMode.from(_ret.value)
    }
  }

  fun getLightMode(): LightMode {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getLightMode.call(self._handle, emptyList(), _retPtr)
      CanvasItemMaterial.LightMode.from(_ret.value)
    }
  }

  fun getParticlesAnimHFrames(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getParticlesAnimHFrames.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getParticlesAnimLoop(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getParticlesAnimLoop.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getParticlesAnimVFrames(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getParticlesAnimVFrames.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getParticlesAnimation(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getParticlesAnimation.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun setBlendMode(blendMode: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setBlendMode.call(self._handle, listOf(blendMode), null)
    }
  }

  fun setLightMode(lightMode: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setLightMode.call(self._handle, listOf(lightMode), null)
    }
  }

  fun setParticlesAnimHFrames(frames: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setParticlesAnimHFrames.call(self._handle, listOf(frames), null)
    }
  }

  fun setParticlesAnimLoop(loop: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setParticlesAnimLoop.call(self._handle, listOf(loop), null)
    }
  }

  fun setParticlesAnimVFrames(frames: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setParticlesAnimVFrames.call(self._handle, listOf(frames), null)
    }
  }

  fun setParticlesAnimation(particlesAnim: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setParticlesAnimation.call(self._handle, listOf(particlesAnim), null)
    }
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
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("CanvasItemMaterial".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for CanvasItemMaterial" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for CanvasItemMaterial
     */
    private object __method_bind {
      val getBlendMode: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItemMaterial".cstr.ptr,
              "get_blend_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_blend_mode" }
            }
          }

      val getLightMode: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItemMaterial".cstr.ptr,
              "get_light_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_light_mode" }
            }
          }

      val getParticlesAnimHFrames: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItemMaterial".cstr.ptr,
              "get_particles_anim_h_frames".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_particles_anim_h_frames" }
            }
          }

      val getParticlesAnimLoop: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItemMaterial".cstr.ptr,
              "get_particles_anim_loop".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_particles_anim_loop" }
            }
          }

      val getParticlesAnimVFrames: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItemMaterial".cstr.ptr,
              "get_particles_anim_v_frames".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_particles_anim_v_frames" }
            }
          }

      val getParticlesAnimation: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItemMaterial".cstr.ptr,
              "get_particles_animation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_particles_animation" }
            }
          }

      val setBlendMode: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItemMaterial".cstr.ptr,
              "set_blend_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_blend_mode" }
            }
          }

      val setLightMode: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItemMaterial".cstr.ptr,
              "set_light_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_light_mode" }
            }
          }

      val setParticlesAnimHFrames: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItemMaterial".cstr.ptr,
              "set_particles_anim_h_frames".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_particles_anim_h_frames" }
            }
          }

      val setParticlesAnimLoop: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItemMaterial".cstr.ptr,
              "set_particles_anim_loop".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_particles_anim_loop" }
            }
          }

      val setParticlesAnimVFrames: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItemMaterial".cstr.ptr,
              "set_particles_anim_v_frames".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_particles_anim_v_frames" }
            }
          }

      val setParticlesAnimation: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItemMaterial".cstr.ptr,
              "set_particles_animation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_particles_animation" }
            }
          }
    }
  }
}
