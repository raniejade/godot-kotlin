// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Allocator
import godot.core.Dictionary
import godot.core.Godot
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

open class EngineInternal(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Object(null) {
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

  fun getIdleFrames(): Int {
    val _ret = __method_bind.getIdleFrames.call(this._handle)
    return _ret.asInt()
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
    return _ret.toAny() as MainLoop
  }

  fun getPhysicsFrames(): Int {
    val _ret = __method_bind.getPhysicsFrames.call(this._handle)
    return _ret.asInt()
  }

  fun getPhysicsInterpolationFraction(): Float {
    val _ret = __method_bind.getPhysicsInterpolationFraction.call(this._handle)
    return _ret.asFloat()
  }

  fun getPhysicsJitterFix(): Float {
    val _ret = __method_bind.getPhysicsJitterFix.call(this._handle)
    return _ret.asFloat()
  }

  fun getSingleton(name: String): Object {
    val _arg = Variant(name)
    val _ret = __method_bind.getSingleton.call(this._handle, listOf(_arg))
    return _ret.toAny() as Object
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
    val _arg = Variant(name)
    val _ret = __method_bind.hasSingleton.call(this._handle, listOf(_arg))
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
    val _arg = Variant(enabled)
    __method_bind.setEditorHint.call(this._handle, listOf(_arg))
  }

  fun setIterationsPerSecond(iterationsPerSecond: Int) {
    val _arg = Variant(iterationsPerSecond)
    __method_bind.setIterationsPerSecond.call(this._handle, listOf(_arg))
  }

  fun setPhysicsJitterFix(physicsJitterFix: Float) {
    val _arg = Variant(physicsJitterFix)
    __method_bind.setPhysicsJitterFix.call(this._handle, listOf(_arg))
  }

  fun setTargetFps(targetFps: Int) {
    val _arg = Variant(targetFps)
    __method_bind.setTargetFps.call(this._handle, listOf(_arg))
  }

  fun setTimeScale(timeScale: Float) {
    val _arg = Variant(timeScale)
    __method_bind.setTimeScale.call(this._handle, listOf(_arg))
  }

  companion object {
    /**
     * Container for method_bind pointers for Engine
     */
    private object __method_bind {
      val getAuthorInfo: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
            "get_author_info".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_author_info" }
        }
      val getCopyrightInfo: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
            "get_copyright_info".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_copyright_info" }
        }
      val getDonorInfo: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
            "get_donor_info".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_donor_info" }
        }
      val getFramesDrawn: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
            "get_frames_drawn".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_frames_drawn" }
        }
      val getFramesPerSecond: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
            "get_frames_per_second".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_frames_per_second" }
        }
      val getIdleFrames: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
            "get_idle_frames".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_idle_frames" }
        }
      val getIterationsPerSecond: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
            "get_iterations_per_second".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_iterations_per_second" }
        }
      val getLicenseInfo: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
            "get_license_info".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_license_info" }
        }
      val getLicenseText: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
            "get_license_text".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_license_text" }
        }
      val getMainLoop: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
            "get_main_loop".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_main_loop" }
        }
      val getPhysicsFrames: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
            "get_physics_frames".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_physics_frames" }
        }
      val getPhysicsInterpolationFraction: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
            "get_physics_interpolation_fraction".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_physics_interpolation_fraction"
            }
        }
      val getPhysicsJitterFix: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
            "get_physics_jitter_fix".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_physics_jitter_fix" }
        }
      val getSingleton: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
            "get_singleton".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_singleton" }
        }
      val getTargetFps: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
            "get_target_fps".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_target_fps" }
        }
      val getTimeScale: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
            "get_time_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_time_scale" }
        }
      val getVersionInfo: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
            "get_version_info".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_version_info" }
        }
      val hasSingleton: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
            "has_singleton".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_singleton" }
        }
      val isEditorHint: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
            "is_editor_hint".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_editor_hint" }
        }
      val isInPhysicsFrame: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
            "is_in_physics_frame".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_in_physics_frame" }
        }
      val setEditorHint: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
            "set_editor_hint".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_editor_hint" }
        }
      val setIterationsPerSecond: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
            "set_iterations_per_second".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_iterations_per_second" }
        }
      val setPhysicsJitterFix: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
            "set_physics_jitter_fix".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_physics_jitter_fix" }
        }
      val setTargetFps: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
            "set_target_fps".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_target_fps" }
        }
      val setTimeScale: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
            "set_time_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_time_scale" }
        }}
  }
}

object Engine : EngineInternal(null) {
  init {
    Allocator.allocationScope {
      val handle = checkNotNull(Godot.gdnative.godot_global_get_singleton)("Engine".cstr.ptr)
      requireNotNull(handle) { "No instance found for singleton Engine" }
      _handle = handle
    }
  }
}
