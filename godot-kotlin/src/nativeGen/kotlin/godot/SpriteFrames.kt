// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.PoolStringArray
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Float
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

open class SpriteFrames(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Resource(null) {
  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  open fun _get_animations(): VariantArray {
    TODO()
  }

  open fun _get_frames(): VariantArray {
    TODO()
  }

  open fun _set_animations(arg0: VariantArray) {
    TODO()
  }

  open fun _set_frames(arg0: VariantArray) {
    TODO()
  }

  fun addAnimation(anim: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.addAnimation.call(self._handle, listOf(anim), null)
    }
  }

  fun addFrame(
    anim: String,
    frame: Texture,
    atPosition: Int = -1
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(anim)
      _args.add(frame)
      _args.add(atPosition)
      __method_bind.addFrame.call(self._handle, _args, null)
    }
  }

  fun clear(anim: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.clear.call(self._handle, listOf(anim), null)
    }
  }

  fun clearAll() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.clearAll.call(self._handle, emptyList(), null)
    }
  }

  fun getAnimationLoop(anim: String): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getAnimationLoop.call(self._handle, listOf(anim), _retPtr)
      _ret.value
    }
  }

  fun getAnimationNames(): PoolStringArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = PoolStringArray()
      val _retPtr = _ret._value.ptr
      __method_bind.getAnimationNames.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getAnimationSpeed(anim: String): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getAnimationSpeed.call(self._handle, listOf(anim), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getFrame(anim: String, idx: Int): Texture {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Texture
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      val _args = mutableListOf<Any?>()
      _args.add(anim)
      _args.add(idx)
      __method_bind.getFrame.call(self._handle, _args, _retPtr)
      _ret = objectToType<Texture>(_tmp.value!!)
      _ret
    }
  }

  fun getFrameCount(anim: String): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getFrameCount.call(self._handle, listOf(anim), _retPtr)
      _ret.value
    }
  }

  fun hasAnimation(anim: String): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.hasAnimation.call(self._handle, listOf(anim), _retPtr)
      _ret.value
    }
  }

  fun removeAnimation(anim: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.removeAnimation.call(self._handle, listOf(anim), null)
    }
  }

  fun removeFrame(anim: String, idx: Int) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(anim)
      _args.add(idx)
      __method_bind.removeFrame.call(self._handle, _args, null)
    }
  }

  fun renameAnimation(anim: String, newname: String) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(anim)
      _args.add(newname)
      __method_bind.renameAnimation.call(self._handle, _args, null)
    }
  }

  fun setAnimationLoop(anim: String, loop: Boolean) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(anim)
      _args.add(loop)
      __method_bind.setAnimationLoop.call(self._handle, _args, null)
    }
  }

  fun setAnimationSpeed(anim: String, speed: Float) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(anim)
      _args.add(speed)
      __method_bind.setAnimationSpeed.call(self._handle, _args, null)
    }
  }

  fun setFrame(
    anim: String,
    idx: Int,
    txt: Texture
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(anim)
      _args.add(idx)
      _args.add(txt)
      __method_bind.setFrame.call(self._handle, _args, null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("SpriteFrames".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for SpriteFrames" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for SpriteFrames
     */
    private object __method_bind {
      val addAnimation: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteFrames".cstr.ptr,
              "add_animation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_animation" }
            }
          }

      val addFrame: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteFrames".cstr.ptr,
              "add_frame".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_frame" }
            }
          }

      val clear: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteFrames".cstr.ptr,
              "clear".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clear" }
            }
          }

      val clearAll: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteFrames".cstr.ptr,
              "clear_all".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clear_all" }
            }
          }

      val getAnimationLoop: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteFrames".cstr.ptr,
              "get_animation_loop".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_animation_loop" }
            }
          }

      val getAnimationNames: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteFrames".cstr.ptr,
              "get_animation_names".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_animation_names" }
            }
          }

      val getAnimationSpeed: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteFrames".cstr.ptr,
              "get_animation_speed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_animation_speed" }
            }
          }

      val getFrame: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteFrames".cstr.ptr,
              "get_frame".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_frame" }
            }
          }

      val getFrameCount: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteFrames".cstr.ptr,
              "get_frame_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_frame_count" }
            }
          }

      val hasAnimation: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteFrames".cstr.ptr,
              "has_animation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_animation" }
            }
          }

      val removeAnimation: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteFrames".cstr.ptr,
              "remove_animation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_animation" }
            }
          }

      val removeFrame: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteFrames".cstr.ptr,
              "remove_frame".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_frame" }
            }
          }

      val renameAnimation: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteFrames".cstr.ptr,
              "rename_animation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method rename_animation" }
            }
          }

      val setAnimationLoop: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteFrames".cstr.ptr,
              "set_animation_loop".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_animation_loop" }
            }
          }

      val setAnimationSpeed: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteFrames".cstr.ptr,
              "set_animation_speed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_animation_speed" }
            }
          }

      val setFrame: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteFrames".cstr.ptr,
              "set_frame".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_frame" }
            }
          }
    }
  }
}
