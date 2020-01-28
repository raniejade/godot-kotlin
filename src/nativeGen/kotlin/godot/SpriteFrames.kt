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
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class SpriteFrames(
  _handle: COpaquePointer
) : Resource(_handle) {
  fun addAnimation(anim: String) {
    val _arg = Variant.new(anim)
    __method_bind.add_animation.call(this._handle, _arg, 1)
  }

  fun addFrame(
    anim: String,
    frame: Texture,
    atPosition: Int
  ) {
    val _args = VariantArray.new()
    _args.append(anim)
    _args.append(frame)
    _args.append(atPosition)
    __method_bind.add_frame.call(this._handle, _args.toVariant(), 3)
  }

  fun clear(anim: String) {
    val _arg = Variant.new(anim)
    __method_bind.clear.call(this._handle, _arg, 1)
  }

  fun clearAll() {
    __method_bind.clear_all.call(this._handle)
  }

  fun getAnimationLoop(anim: String): Boolean {
    val _arg = Variant.new(anim)
    val _ret = __method_bind.get_animation_loop.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun getAnimationNames(): PoolStringArray {
    val _ret = __method_bind.get_animation_names.call(this._handle)
    return _ret.asPoolStringArray()
  }

  fun getAnimationSpeed(anim: String): Float {
    val _arg = Variant.new(anim)
    val _ret = __method_bind.get_animation_speed.call(this._handle, _arg, 1)
    return _ret.asFloat()
  }

  fun getFrame(anim: String, idx: Int): Texture {
    val _args = VariantArray.new()
    _args.append(anim)
    _args.append(idx)
    val _ret = __method_bind.get_frame.call(this._handle, _args.toVariant(), 2)
    return _ret.asObject(::Texture)!!
  }

  fun getFrameCount(anim: String): Int {
    val _arg = Variant.new(anim)
    val _ret = __method_bind.get_frame_count.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun hasAnimation(anim: String): Boolean {
    val _arg = Variant.new(anim)
    val _ret = __method_bind.has_animation.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun removeAnimation(anim: String) {
    val _arg = Variant.new(anim)
    __method_bind.remove_animation.call(this._handle, _arg, 1)
  }

  fun removeFrame(anim: String, idx: Int) {
    val _args = VariantArray.new()
    _args.append(anim)
    _args.append(idx)
    __method_bind.remove_frame.call(this._handle, _args.toVariant(), 2)
  }

  fun renameAnimation(anim: String, newname: String) {
    val _args = VariantArray.new()
    _args.append(anim)
    _args.append(newname)
    __method_bind.rename_animation.call(this._handle, _args.toVariant(), 2)
  }

  fun setAnimationLoop(anim: String, loop: Boolean) {
    val _args = VariantArray.new()
    _args.append(anim)
    _args.append(loop)
    __method_bind.set_animation_loop.call(this._handle, _args.toVariant(), 2)
  }

  fun setAnimationSpeed(anim: String, speed: Float) {
    val _args = VariantArray.new()
    _args.append(anim)
    _args.append(speed)
    __method_bind.set_animation_speed.call(this._handle, _args.toVariant(), 2)
  }

  fun setFrame(
    anim: String,
    idx: Int,
    txt: Texture
  ) {
    val _args = VariantArray.new()
    _args.append(anim)
    _args.append(idx)
    _args.append(txt)
    __method_bind.set_frame.call(this._handle, _args.toVariant(), 3)
  }

  companion object {
    fun new(): SpriteFrames = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("SpriteFrames".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for SpriteFrames" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      SpriteFrames(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): SpriteFrames = SpriteFrames(ptr)
    /**
     * Container for method_bind pointers for SpriteFrames
     */
    private object __method_bind {
      val add_animation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteFrames".cstr.ptr,
            "add_animation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_animation" }
        }
      val add_frame: CPointer<godot_method_bind>
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
      val clear_all: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteFrames".cstr.ptr,
            "clear_all".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear_all" }
        }
      val get_animation_loop: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteFrames".cstr.ptr,
            "get_animation_loop".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_animation_loop" }
        }
      val get_animation_names: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteFrames".cstr.ptr,
            "get_animation_names".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_animation_names" }
        }
      val get_animation_speed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteFrames".cstr.ptr,
            "get_animation_speed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_animation_speed" }
        }
      val get_frame: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteFrames".cstr.ptr,
            "get_frame".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_frame" }
        }
      val get_frame_count: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteFrames".cstr.ptr,
            "get_frame_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_frame_count" }
        }
      val has_animation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteFrames".cstr.ptr,
            "has_animation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_animation" }
        }
      val remove_animation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteFrames".cstr.ptr,
            "remove_animation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_animation" }
        }
      val remove_frame: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteFrames".cstr.ptr,
            "remove_frame".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_frame" }
        }
      val rename_animation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteFrames".cstr.ptr,
            "rename_animation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method rename_animation" }
        }
      val set_animation_loop: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteFrames".cstr.ptr,
            "set_animation_loop".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_animation_loop" }
        }
      val set_animation_speed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteFrames".cstr.ptr,
            "set_animation_speed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_animation_speed" }
        }
      val set_frame: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteFrames".cstr.ptr,
            "set_frame".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_frame" }
        }}
  }
}
