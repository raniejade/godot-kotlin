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
  fun getAuthorInfo(): Dictionary {
    val _ret = __method_bind.get_author_info.call(this._handle)
    return _ret.asDictionary()
  }

  fun getCopyrightInfo(): VariantArray {
    val _ret = __method_bind.get_copyright_info.call(this._handle)
    return _ret.asVariantArray()
  }

  fun getDonorInfo(): Dictionary {
    val _ret = __method_bind.get_donor_info.call(this._handle)
    return _ret.asDictionary()
  }

  fun getFramesDrawn(): Int {
    val _ret = __method_bind.get_frames_drawn.call(this._handle)
    return _ret.asInt()
  }

  fun getFramesPerSecond(): Float {
    val _ret = __method_bind.get_frames_per_second.call(this._handle)
    return _ret.asFloat()
  }

  fun getIterationsPerSecond(): Int {
    val _ret = __method_bind.get_iterations_per_second.call(this._handle)
    return _ret.asInt()
  }

  fun getLicenseInfo(): Dictionary {
    val _ret = __method_bind.get_license_info.call(this._handle)
    return _ret.asDictionary()
  }

  fun getLicenseText(): String {
    val _ret = __method_bind.get_license_text.call(this._handle)
    return _ret.asString()
  }

  fun getMainLoop(): MainLoop {
    val _ret = __method_bind.get_main_loop.call(this._handle)
    return _ret.asObject(::MainLoop)!!
  }

  fun getPhysicsJitterFix(): Float {
    val _ret = __method_bind.get_physics_jitter_fix.call(this._handle)
    return _ret.asFloat()
  }

  fun getSingleton(name: String): Object {
    val _arg = Variant.new(name)
    val _ret = __method_bind.get_singleton.call(this._handle, _arg, 1)
    return _ret.asObject(::Object)!!
  }

  fun getTargetFps(): Int {
    val _ret = __method_bind.get_target_fps.call(this._handle)
    return _ret.asInt()
  }

  fun getTimeScale(): Float {
    val _ret = __method_bind.get_time_scale.call(this._handle)
    return _ret.asFloat()
  }

  fun getVersionInfo(): Dictionary {
    val _ret = __method_bind.get_version_info.call(this._handle)
    return _ret.asDictionary()
  }

  fun hasSingleton(name: String): Boolean {
    val _arg = Variant.new(name)
    val _ret = __method_bind.has_singleton.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun isEditorHint(): Boolean {
    val _ret = __method_bind.is_editor_hint.call(this._handle)
    return _ret.asBoolean()
  }

  fun isInPhysicsFrame(): Boolean {
    val _ret = __method_bind.is_in_physics_frame.call(this._handle)
    return _ret.asBoolean()
  }

  fun setEditorHint(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.set_editor_hint.call(this._handle, _arg, 1)
  }

  fun setIterationsPerSecond(iterationsPerSecond: Int) {
    val _arg = Variant.new(iterationsPerSecond)
    __method_bind.set_iterations_per_second.call(this._handle, _arg, 1)
  }

  fun setPhysicsJitterFix(physicsJitterFix: Float) {
    val _arg = Variant.new(physicsJitterFix)
    __method_bind.set_physics_jitter_fix.call(this._handle, _arg, 1)
  }

  fun setTargetFps(targetFps: Int) {
    val _arg = Variant.new(targetFps)
    __method_bind.set_target_fps.call(this._handle, _arg, 1)
  }

  fun setTimeScale(timeScale: Float) {
    val _arg = Variant.new(timeScale)
    __method_bind.set_time_scale.call(this._handle, _arg, 1)
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
      val get_author_info: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
            "get_author_info".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_author_info" }
        }
      val get_copyright_info: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
            "get_copyright_info".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_copyright_info" }
        }
      val get_donor_info: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
            "get_donor_info".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_donor_info" }
        }
      val get_frames_drawn: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
            "get_frames_drawn".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_frames_drawn" }
        }
      val get_frames_per_second: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
            "get_frames_per_second".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_frames_per_second" }
        }
      val get_iterations_per_second: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
            "get_iterations_per_second".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_iterations_per_second" }
        }
      val get_license_info: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
            "get_license_info".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_license_info" }
        }
      val get_license_text: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
            "get_license_text".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_license_text" }
        }
      val get_main_loop: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
            "get_main_loop".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_main_loop" }
        }
      val get_physics_jitter_fix: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
            "get_physics_jitter_fix".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_physics_jitter_fix" }
        }
      val get_singleton: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
            "get_singleton".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_singleton" }
        }
      val get_target_fps: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
            "get_target_fps".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_target_fps" }
        }
      val get_time_scale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
            "get_time_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_time_scale" }
        }
      val get_version_info: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
            "get_version_info".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_version_info" }
        }
      val has_singleton: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
            "has_singleton".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_singleton" }
        }
      val is_editor_hint: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
            "is_editor_hint".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_editor_hint" }
        }
      val is_in_physics_frame: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
            "is_in_physics_frame".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_in_physics_frame" }
        }
      val set_editor_hint: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
            "set_editor_hint".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_editor_hint" }
        }
      val set_iterations_per_second: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
            "set_iterations_per_second".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_iterations_per_second" }
        }
      val set_physics_jitter_fix: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
            "set_physics_jitter_fix".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_physics_jitter_fix" }
        }
      val set_target_fps: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
            "set_target_fps".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_target_fps" }
        }
      val set_time_scale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
            "set_time_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_time_scale" }
        }}
  }
}
