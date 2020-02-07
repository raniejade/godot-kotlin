// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
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
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class SpriteFrames(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Resource(null) {
  constructor() : this(null) {
    _handle = __new()
  }

  fun addAnimation(anim: String) {
    val _arg = Variant.new(anim)
    __method_bind.addAnimation.call(this._handle, listOf(_arg))
  }

  fun addFrame(
    anim: String,
    frame: Texture,
    atPosition: Int = -1
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(anim))
    _args.add(Variant.fromAny(frame))
    _args.add(Variant.fromAny(atPosition))
    __method_bind.addFrame.call(this._handle, _args)
  }

  fun clear(anim: String) {
    val _arg = Variant.new(anim)
    __method_bind.clear.call(this._handle, listOf(_arg))
  }

  fun clearAll() {
    __method_bind.clearAll.call(this._handle)
  }

  fun getAnimationLoop(anim: String): Boolean {
    val _arg = Variant.new(anim)
    val _ret = __method_bind.getAnimationLoop.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun getAnimationNames(): PoolStringArray {
    val _ret = __method_bind.getAnimationNames.call(this._handle)
    return _ret.asPoolStringArray()
  }

  fun getAnimationSpeed(anim: String): Float {
    val _arg = Variant.new(anim)
    val _ret = __method_bind.getAnimationSpeed.call(this._handle, listOf(_arg))
    return _ret.asFloat()
  }

  fun getFrame(anim: String, idx: Int): Texture {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(anim))
    _args.add(Variant.fromAny(idx))
    val _ret = __method_bind.getFrame.call(this._handle, _args)
    return _ret.asObject(::Texture)!!
  }

  fun getFrameCount(anim: String): Int {
    val _arg = Variant.new(anim)
    val _ret = __method_bind.getFrameCount.call(this._handle, listOf(_arg))
    return _ret.asInt()
  }

  fun hasAnimation(anim: String): Boolean {
    val _arg = Variant.new(anim)
    val _ret = __method_bind.hasAnimation.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun removeAnimation(anim: String) {
    val _arg = Variant.new(anim)
    __method_bind.removeAnimation.call(this._handle, listOf(_arg))
  }

  fun removeFrame(anim: String, idx: Int) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(anim))
    _args.add(Variant.fromAny(idx))
    __method_bind.removeFrame.call(this._handle, _args)
  }

  fun renameAnimation(anim: String, newname: String) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(anim))
    _args.add(Variant.fromAny(newname))
    __method_bind.renameAnimation.call(this._handle, _args)
  }

  fun setAnimationLoop(anim: String, loop: Boolean) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(anim))
    _args.add(Variant.fromAny(loop))
    __method_bind.setAnimationLoop.call(this._handle, _args)
  }

  fun setAnimationSpeed(anim: String, speed: Float) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(anim))
    _args.add(Variant.fromAny(speed))
    __method_bind.setAnimationSpeed.call(this._handle, _args)
  }

  fun setFrame(
    anim: String,
    idx: Int,
    txt: Texture
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(anim))
    _args.add(Variant.fromAny(idx))
    _args.add(Variant.fromAny(txt))
    __method_bind.setFrame.call(this._handle, _args)
  }

  companion object {
    internal fun __new(): COpaquePointer = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("SpriteFrames".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for SpriteFrames" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for SpriteFrames
     */
    private object __method_bind {
      val addAnimation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteFrames".cstr.ptr,
            "add_animation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_animation" }
        }
      val addFrame: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteFrames".cstr.ptr,
            "add_frame".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_frame" }
        }
      val clear: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteFrames".cstr.ptr,
            "clear".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear" }
        }
      val clearAll: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteFrames".cstr.ptr,
            "clear_all".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear_all" }
        }
      val getAnimationLoop: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteFrames".cstr.ptr,
            "get_animation_loop".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_animation_loop" }
        }
      val getAnimationNames: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteFrames".cstr.ptr,
            "get_animation_names".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_animation_names" }
        }
      val getAnimationSpeed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteFrames".cstr.ptr,
            "get_animation_speed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_animation_speed" }
        }
      val getFrame: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteFrames".cstr.ptr,
            "get_frame".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_frame" }
        }
      val getFrameCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteFrames".cstr.ptr,
            "get_frame_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_frame_count" }
        }
      val hasAnimation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteFrames".cstr.ptr,
            "has_animation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_animation" }
        }
      val removeAnimation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteFrames".cstr.ptr,
            "remove_animation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_animation" }
        }
      val removeFrame: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteFrames".cstr.ptr,
            "remove_frame".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_frame" }
        }
      val renameAnimation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteFrames".cstr.ptr,
            "rename_animation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method rename_animation" }
        }
      val setAnimationLoop: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteFrames".cstr.ptr,
            "set_animation_loop".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_animation_loop" }
        }
      val setAnimationSpeed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteFrames".cstr.ptr,
            "set_animation_speed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_animation_speed" }
        }
      val setFrame: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteFrames".cstr.ptr,
            "set_frame".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_frame" }
        }}
  }
}
