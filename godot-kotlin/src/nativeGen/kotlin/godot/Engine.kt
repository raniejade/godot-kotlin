// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
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
    val self = this
    return Allocator.allocationScope {
      val _ret = Dictionary()
      val _retPtr = _ret._value.ptr
      __method_bind.getAuthorInfo.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getCopyrightInfo(): VariantArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = VariantArray()
      val _retPtr = _ret._value.ptr
      __method_bind.getCopyrightInfo.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getDonorInfo(): Dictionary {
    val self = this
    return Allocator.allocationScope {
      val _ret = Dictionary()
      val _retPtr = _ret._value.ptr
      __method_bind.getDonorInfo.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getFramesDrawn(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getFramesDrawn.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getFramesPerSecond(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getFramesPerSecond.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getIdleFrames(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getIdleFrames.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getIterationsPerSecond(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getIterationsPerSecond.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getLicenseInfo(): Dictionary {
    val self = this
    return Allocator.allocationScope {
      val _ret = Dictionary()
      val _retPtr = _ret._value.ptr
      __method_bind.getLicenseInfo.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getLicenseText(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getLicenseText.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getMainLoop(): MainLoop {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: MainLoop
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getMainLoop.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<MainLoop>(_tmp.value!!)
      _ret
    }
  }

  fun getPhysicsFrames(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getPhysicsFrames.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getPhysicsInterpolationFraction(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getPhysicsInterpolationFraction.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getPhysicsJitterFix(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getPhysicsJitterFix.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getSingleton(name: String): Object {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Object
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getSingleton.call(self._handle, listOf(name), _retPtr)
      _ret = objectToType<Object>(_tmp.value!!)
      _ret
    }
  }

  fun getTargetFps(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getTargetFps.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getTimeScale(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getTimeScale.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getVersionInfo(): Dictionary {
    val self = this
    return Allocator.allocationScope {
      val _ret = Dictionary()
      val _retPtr = _ret._value.ptr
      __method_bind.getVersionInfo.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun hasSingleton(name: String): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.hasSingleton.call(self._handle, listOf(name), _retPtr)
      _ret.value
    }
  }

  fun isEditorHint(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isEditorHint.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isInPhysicsFrame(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isInPhysicsFrame.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun setEditorHint(enabled: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setEditorHint.call(self._handle, listOf(enabled), null)
    }
  }

  fun setIterationsPerSecond(iterationsPerSecond: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setIterationsPerSecond.call(self._handle, listOf(iterationsPerSecond), null)
    }
  }

  fun setPhysicsJitterFix(physicsJitterFix: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setPhysicsJitterFix.call(self._handle, listOf(physicsJitterFix), null)
    }
  }

  fun setTargetFps(targetFps: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setTargetFps.call(self._handle, listOf(targetFps), null)
    }
  }

  fun setTimeScale(timeScale: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setTimeScale.call(self._handle, listOf(timeScale), null)
    }
  }

  companion object {
    /**
     * Container for method_bind pointers for Engine
     */
    private object __method_bind {
      val getAuthorInfo: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
              "get_author_info".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_author_info" }
            }
          }

      val getCopyrightInfo: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
              "get_copyright_info".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_copyright_info" }
            }
          }

      val getDonorInfo: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
              "get_donor_info".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_donor_info" }
            }
          }

      val getFramesDrawn: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
              "get_frames_drawn".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_frames_drawn" }
            }
          }

      val getFramesPerSecond: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
              "get_frames_per_second".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_frames_per_second" }
            }
          }

      val getIdleFrames: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
              "get_idle_frames".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_idle_frames" }
            }
          }

      val getIterationsPerSecond: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
              "get_iterations_per_second".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_iterations_per_second" }
            }
          }

      val getLicenseInfo: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
              "get_license_info".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_license_info" }
            }
          }

      val getLicenseText: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
              "get_license_text".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_license_text" }
            }
          }

      val getMainLoop: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
              "get_main_loop".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_main_loop" }
            }
          }

      val getPhysicsFrames: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
              "get_physics_frames".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_physics_frames" }
            }
          }

      val getPhysicsInterpolationFraction: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
              "get_physics_interpolation_fraction".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method get_physics_interpolation_fraction" }
            }
          }

      val getPhysicsJitterFix: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
              "get_physics_jitter_fix".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_physics_jitter_fix" }
            }
          }

      val getSingleton: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
              "get_singleton".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_singleton" }
            }
          }

      val getTargetFps: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
              "get_target_fps".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_target_fps" }
            }
          }

      val getTimeScale: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
              "get_time_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_time_scale" }
            }
          }

      val getVersionInfo: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
              "get_version_info".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_version_info" }
            }
          }

      val hasSingleton: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
              "has_singleton".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_singleton" }
            }
          }

      val isEditorHint: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
              "is_editor_hint".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_editor_hint" }
            }
          }

      val isInPhysicsFrame: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
              "is_in_physics_frame".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_in_physics_frame" }
            }
          }

      val setEditorHint: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
              "set_editor_hint".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_editor_hint" }
            }
          }

      val setIterationsPerSecond: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
              "set_iterations_per_second".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_iterations_per_second" }
            }
          }

      val setPhysicsJitterFix: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
              "set_physics_jitter_fix".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_physics_jitter_fix" }
            }
          }

      val setTargetFps: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
              "set_target_fps".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_target_fps" }
            }
          }

      val setTimeScale: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
              "set_time_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_time_scale" }
            }
          }
    }
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
