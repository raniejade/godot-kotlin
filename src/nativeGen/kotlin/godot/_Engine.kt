// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Dictionary
import godot.core.Godot
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

open class _Engine internal constructor(
  _handle: COpaquePointer
) : Object(_handle) {
  fun getAuthorInfo(): Dictionary {
    TODO()
  }

  fun getCopyrightInfo(): VariantArray {
    TODO()
  }

  fun getDonorInfo(): Dictionary {
    TODO()
  }

  fun getFramesDrawn(): Int {
    TODO()
  }

  fun getFramesPerSecond(): Float {
    TODO()
  }

  fun getIterationsPerSecond(): Int {
    TODO()
  }

  fun getLicenseInfo(): Dictionary {
    TODO()
  }

  fun getLicenseText(): String {
    TODO()
  }

  fun getMainLoop(): MainLoop {
    TODO()
  }

  fun getPhysicsJitterFix(): Float {
    TODO()
  }

  fun getSingleton(): Object {
    TODO()
  }

  fun getTargetFps(): Int {
    TODO()
  }

  fun getTimeScale(): Float {
    TODO()
  }

  fun getVersionInfo(): Dictionary {
    TODO()
  }

  fun hasSingleton(): Boolean {
    TODO()
  }

  fun isEditorHint(): Boolean {
    TODO()
  }

  fun isInPhysicsFrame(): Boolean {
    TODO()
  }

  fun setEditorHint() {
    TODO()
  }

  fun setIterationsPerSecond() {
    TODO()
  }

  fun setPhysicsJitterFix() {
    TODO()
  }

  fun setTargetFps() {
    TODO()
  }

  fun setTimeScale() {
    TODO()
  }

  companion object {
    val Instance: _Engine = memScoped {
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
      val get_author_info: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
              "get_author_info".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_author_info" }
            }
          }

      val get_copyright_info: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
              "get_copyright_info".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_copyright_info" }
            }
          }

      val get_donor_info: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
              "get_donor_info".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_donor_info" }
            }
          }

      val get_frames_drawn: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
              "get_frames_drawn".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_frames_drawn" }
            }
          }

      val get_frames_per_second: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
              "get_frames_per_second".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_frames_per_second" }
            }
          }

      val get_iterations_per_second: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
              "get_iterations_per_second".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_iterations_per_second" }
            }
          }

      val get_license_info: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
              "get_license_info".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_license_info" }
            }
          }

      val get_license_text: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
              "get_license_text".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_license_text" }
            }
          }

      val get_main_loop: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
              "get_main_loop".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_main_loop" }
            }
          }

      val get_physics_jitter_fix: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
              "get_physics_jitter_fix".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_physics_jitter_fix" }
            }
          }

      val get_singleton: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
              "get_singleton".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_singleton" }
            }
          }

      val get_target_fps: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
              "get_target_fps".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_target_fps" }
            }
          }

      val get_time_scale: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
              "get_time_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_time_scale" }
            }
          }

      val get_version_info: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
              "get_version_info".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_version_info" }
            }
          }

      val has_singleton: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
              "has_singleton".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_singleton" }
            }
          }

      val is_editor_hint: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
              "is_editor_hint".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_editor_hint" }
            }
          }

      val is_in_physics_frame: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
              "is_in_physics_frame".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_in_physics_frame" }
            }
          }

      val set_editor_hint: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
              "set_editor_hint".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_editor_hint" }
            }
          }

      val set_iterations_per_second: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
              "set_iterations_per_second".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_iterations_per_second" }
            }
          }

      val set_physics_jitter_fix: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
              "set_physics_jitter_fix".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_physics_jitter_fix" }
            }
          }

      val set_target_fps: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
              "set_target_fps".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_target_fps" }
            }
          }

      val set_time_scale: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Engine".cstr.ptr,
              "set_time_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_time_scale" }
            }
          }
    }
  }
}
