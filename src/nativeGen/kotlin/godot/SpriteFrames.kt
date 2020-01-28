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
  var animations: VariantArray
    get() {
       return _getAnimations() 
    }
    set(value) {
      _setAnimations(value)
    }

  var frames: VariantArray
    get() {
       return _getFrames() 
    }
    set(value) {
      _setFrames(value)
    }

  fun addAnimation(anim: String) {
    val _arg = Variant.new(anim)
    __method_bind.addAnimation.call(this._handle, _arg, 1)
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
    __method_bind.addFrame.call(this._handle, _args.toVariant(), 3)
  }

  fun clear(anim: String) {
    val _arg = Variant.new(anim)
    __method_bind.clear.call(this._handle, _arg, 1)
  }

  fun clearAll() {
    __method_bind.clearAll.call(this._handle)
  }

  fun getAnimationLoop(anim: String): Boolean {
    val _arg = Variant.new(anim)
    val _ret = __method_bind.getAnimationLoop.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun getAnimationNames(): PoolStringArray {
    val _ret = __method_bind.getAnimationNames.call(this._handle)
    return _ret.asPoolStringArray()
  }

  fun getAnimationSpeed(anim: String): Float {
    val _arg = Variant.new(anim)
    val _ret = __method_bind.getAnimationSpeed.call(this._handle, _arg, 1)
    return _ret.asFloat()
  }

  fun getFrame(anim: String, idx: Int): Texture {
    val _args = VariantArray.new()
    _args.append(anim)
    _args.append(idx)
    val _ret = __method_bind.getFrame.call(this._handle, _args.toVariant(), 2)
    return _ret.asObject(::Texture)!!
  }

  fun getFrameCount(anim: String): Int {
    val _arg = Variant.new(anim)
    val _ret = __method_bind.getFrameCount.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun hasAnimation(anim: String): Boolean {
    val _arg = Variant.new(anim)
    val _ret = __method_bind.hasAnimation.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun removeAnimation(anim: String) {
    val _arg = Variant.new(anim)
    __method_bind.removeAnimation.call(this._handle, _arg, 1)
  }

  fun removeFrame(anim: String, idx: Int) {
    val _args = VariantArray.new()
    _args.append(anim)
    _args.append(idx)
    __method_bind.removeFrame.call(this._handle, _args.toVariant(), 2)
  }

  fun renameAnimation(anim: String, newname: String) {
    val _args = VariantArray.new()
    _args.append(anim)
    _args.append(newname)
    __method_bind.renameAnimation.call(this._handle, _args.toVariant(), 2)
  }

  fun setAnimationLoop(anim: String, loop: Boolean) {
    val _args = VariantArray.new()
    _args.append(anim)
    _args.append(loop)
    __method_bind.setAnimationLoop.call(this._handle, _args.toVariant(), 2)
  }

  fun setAnimationSpeed(anim: String, speed: Float) {
    val _args = VariantArray.new()
    _args.append(anim)
    _args.append(speed)
    __method_bind.setAnimationSpeed.call(this._handle, _args.toVariant(), 2)
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
    __method_bind.setFrame.call(this._handle, _args.toVariant(), 3)
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
      val addAnimation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteFrames".cstr.ptr,
            "addAnimation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addAnimation" }
        }
      val addFrame: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteFrames".cstr.ptr,
            "addFrame".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addFrame" }
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
            "clearAll".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clearAll" }
        }
      val getAnimationLoop: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteFrames".cstr.ptr,
            "getAnimationLoop".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getAnimationLoop" }
        }
      val getAnimationNames: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteFrames".cstr.ptr,
            "getAnimationNames".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getAnimationNames" }
        }
      val getAnimationSpeed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteFrames".cstr.ptr,
            "getAnimationSpeed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getAnimationSpeed" }
        }
      val getFrame: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteFrames".cstr.ptr,
            "getFrame".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getFrame" }
        }
      val getFrameCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteFrames".cstr.ptr,
            "getFrameCount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getFrameCount" }
        }
      val hasAnimation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteFrames".cstr.ptr,
            "hasAnimation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method hasAnimation" }
        }
      val removeAnimation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteFrames".cstr.ptr,
            "removeAnimation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method removeAnimation" }
        }
      val removeFrame: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteFrames".cstr.ptr,
            "removeFrame".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method removeFrame" }
        }
      val renameAnimation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteFrames".cstr.ptr,
            "renameAnimation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method renameAnimation" }
        }
      val setAnimationLoop: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteFrames".cstr.ptr,
            "setAnimationLoop".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setAnimationLoop" }
        }
      val setAnimationSpeed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteFrames".cstr.ptr,
            "setAnimationSpeed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setAnimationSpeed" }
        }
      val setFrame: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SpriteFrames".cstr.ptr,
            "setFrame".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setFrame" }
        }}
  }
}
