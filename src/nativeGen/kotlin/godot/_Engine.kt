// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Dictionary
import godot.core.Godot
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

open class _Engine(
  _handle: COpaquePointer
) : Object(_handle) {
  var editorHint: Boolean
    get() {
       return isEditorHint() 
    }
    set(value) {
      setEditorHint(value)
    }

  var iterationsPerSecond: Int
    get() {
       return getIterationsPerSecond() 
    }
    set(value) {
      setIterationsPerSecond(value)
    }

  var physicsJitterFix: Float
    get() {
       return getPhysicsJitterFix() 
    }
    set(value) {
      setPhysicsJitterFix(value)
    }

  var targetFps: Int
    get() {
       return getTargetFps() 
    }
    set(value) {
      setTargetFps(value)
    }

  var timeScale: Float
    get() {
       return getTimeScale() 
    }
    set(value) {
      setTimeScale(value)
    }

  fun getAuthorInfo(): Dictionary {
    val _ret = __method_bind.getAuthorInfo.call(this._handle)
    return _ret.asDictionary()
  }

  fun getCopyrightInfo(): VariantArray {
    val _ret = __method_bind.getCopyrightInfo.call(this._handle)
    return _ret.asVariantArray()
  }

  fun getDonorInfo(): Dictionary {
    val _ret = __method_bind.getDonorInfo.call(this._handle)
    return _ret.asDictionary()
  }

  fun getFramesDrawn(): Int {
    val _ret = __method_bind.getFramesDrawn.call(this._handle)
    return _ret.asInt()
  }

  fun getFramesPerSecond(): Float {
    val _ret = __method_bind.getFramesPerSecond.call(this._handle)
    return _ret.asFloat()
  }

  fun getIterationsPerSecond(): Int {
    val _ret = __method_bind.getIterationsPerSecond.call(this._handle)
    return _ret.asInt()
  }

  fun getLicenseInfo(): Dictionary {
    val _ret = __method_bind.getLicenseInfo.call(this._handle)
    return _ret.asDictionary()
  }

  fun getLicenseText(): String {
    val _ret = __method_bind.getLicenseText.call(this._handle)
    return _ret.asString()
  }

  fun getMainLoop(): MainLoop {
    val _ret = __method_bind.getMainLoop.call(this._handle)
    return _ret.asObject(::MainLoop)!!
  }

  fun getPhysicsJitterFix(): Float {
    val _ret = __method_bind.getPhysicsJitterFix.call(this._handle)
    return _ret.asFloat()
  }

  fun getSingleton(name: String): Object {
    val _arg = Variant.new(name)
    val _ret = __method_bind.getSingleton.call(this._handle, _arg, 1)
    return _ret.asObject(::Object)!!
  }

  fun getTargetFps(): Int {
    val _ret = __method_bind.getTargetFps.call(this._handle)
    return _ret.asInt()
  }

  fun getTimeScale(): Float {
    val _ret = __method_bind.getTimeScale.call(this._handle)
    return _ret.asFloat()
  }

  fun getVersionInfo(): Dictionary {
    val _ret = __method_bind.getVersionInfo.call(this._handle)
    return _ret.asDictionary()
  }

  fun hasSingleton(name: String): Boolean {
    val _arg = Variant.new(name)
    val _ret = __method_bind.hasSingleton.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun isEditorHint(): Boolean {
    val _ret = __method_bind.isEditorHint.call(this._handle)
    return _ret.asBoolean()
  }

  fun isInPhysicsFrame(): Boolean {
    val _ret = __method_bind.isInPhysicsFrame.call(this._handle)
    return _ret.asBoolean()
  }

  fun setEditorHint(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setEditorHint.call(this._handle, _arg, 1)
  }

  fun setIterationsPerSecond(iterationsPerSecond: Int) {
    val _arg = Variant.new(iterationsPerSecond)
    __method_bind.setIterationsPerSecond.call(this._handle, _arg, 1)
  }

  fun setPhysicsJitterFix(physicsJitterFix: Float) {
    val _arg = Variant.new(physicsJitterFix)
    __method_bind.setPhysicsJitterFix.call(this._handle, _arg, 1)
  }

  fun setTargetFps(targetFps: Int) {
    val _arg = Variant.new(targetFps)
    __method_bind.setTargetFps.call(this._handle, _arg, 1)
  }

  fun setTimeScale(timeScale: Float) {
    val _arg = Variant.new(timeScale)
    __method_bind.setTimeScale.call(this._handle, _arg, 1)
  }

  companion object {
    val Instance: _Engine
      get() = memScoped {
        val handle = checkNotNull(Godot.gdnative.godot_global_get_singleton)("_Engine".cstr.ptr)
        requireNotNull(handle) { "No instance found for singleton _Engine" }
        _Engine(
          handle
        )
      }
    /**
     * Container for method_bind pointers for _Engine
     */
    private object __method_bind {
      val getAuthorInfo: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
            "getAuthorInfo".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getAuthorInfo" }
        }
      val getCopyrightInfo: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
            "getCopyrightInfo".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCopyrightInfo" }
        }
      val getDonorInfo: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
            "getDonorInfo".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getDonorInfo" }
        }
      val getFramesDrawn: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
            "getFramesDrawn".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getFramesDrawn" }
        }
      val getFramesPerSecond: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
            "getFramesPerSecond".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getFramesPerSecond" }
        }
      val getIterationsPerSecond: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
            "getIterationsPerSecond".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getIterationsPerSecond" }
        }
      val getLicenseInfo: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
            "getLicenseInfo".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getLicenseInfo" }
        }
      val getLicenseText: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
            "getLicenseText".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getLicenseText" }
        }
      val getMainLoop: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
            "getMainLoop".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getMainLoop" }
        }
      val getPhysicsJitterFix: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
            "getPhysicsJitterFix".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPhysicsJitterFix" }
        }
      val getSingleton: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
            "getSingleton".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSingleton" }
        }
      val getTargetFps: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
            "getTargetFps".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTargetFps" }
        }
      val getTimeScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
            "getTimeScale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTimeScale" }
        }
      val getVersionInfo: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
            "getVersionInfo".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getVersionInfo" }
        }
      val hasSingleton: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
            "hasSingleton".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method hasSingleton" }
        }
      val isEditorHint: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
            "isEditorHint".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isEditorHint" }
        }
      val isInPhysicsFrame: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
            "isInPhysicsFrame".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isInPhysicsFrame" }
        }
      val setEditorHint: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
            "setEditorHint".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setEditorHint" }
        }
      val setIterationsPerSecond: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
            "setIterationsPerSecond".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setIterationsPerSecond" }
        }
      val setPhysicsJitterFix: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
            "setPhysicsJitterFix".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setPhysicsJitterFix" }
        }
      val setTargetFps: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
            "setTargetFps".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setTargetFps" }
        }
      val setTimeScale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
            "setTimeScale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setTimeScale" }
        }}
  }
}
