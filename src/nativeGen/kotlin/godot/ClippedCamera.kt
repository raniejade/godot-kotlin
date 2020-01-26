// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class ClippedCamera internal constructor(
  _handle: COpaquePointer
) : Camera(_handle) {
  fun addException() {
    TODO()
  }

  fun addExceptionRid() {
    TODO()
  }

  fun clearExceptions() {
    TODO()
  }

  fun getClipOffset(): Float {
    TODO()
  }

  fun getCollisionMask(): Int {
    TODO()
  }

  fun getCollisionMaskBit(): Boolean {
    TODO()
  }

  fun getMargin(): Float {
    TODO()
  }

  fun getProcessMode(): ClippedCamera.ProcessMode {
    TODO()
  }

  fun isClipToAreasEnabled(): Boolean {
    TODO()
  }

  fun isClipToBodiesEnabled(): Boolean {
    TODO()
  }

  fun removeException() {
    TODO()
  }

  fun removeExceptionRid() {
    TODO()
  }

  fun setClipToAreas() {
    TODO()
  }

  fun setClipToBodies() {
    TODO()
  }

  fun setCollisionMask() {
    TODO()
  }

  fun setCollisionMaskBit() {
    TODO()
  }

  fun setMargin() {
    TODO()
  }

  fun setProcessMode() {
    TODO()
  }

  enum class ProcessMode(
    val value: Int
  ) {
    CLIP_PROCESS_PHYSICS(0),

    CLIP_PROCESS_IDLE(1);
  }

  companion object {
    val CLIP_PROCESS_IDLE: Int = 1

    val CLIP_PROCESS_PHYSICS: Int = 0

    fun new(): ClippedCamera = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("ClippedCamera".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton ClippedCamera" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      ClippedCamera(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for ClippedCamera
     */
    private object __method_bind {
      val add_exception: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ClippedCamera".cstr.ptr,
              "add_exception".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_exception" }
            }
          }

      val add_exception_rid: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ClippedCamera".cstr.ptr,
              "add_exception_rid".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_exception_rid" }
            }
          }

      val clear_exceptions: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ClippedCamera".cstr.ptr,
              "clear_exceptions".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clear_exceptions" }
            }
          }

      val get_clip_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ClippedCamera".cstr.ptr,
              "get_clip_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_clip_offset" }
            }
          }

      val get_collision_mask: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ClippedCamera".cstr.ptr,
              "get_collision_mask".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_collision_mask" }
            }
          }

      val get_collision_mask_bit: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ClippedCamera".cstr.ptr,
              "get_collision_mask_bit".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_collision_mask_bit" }
            }
          }

      val get_margin: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ClippedCamera".cstr.ptr,
              "get_margin".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_margin" }
            }
          }

      val get_process_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ClippedCamera".cstr.ptr,
              "get_process_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_process_mode" }
            }
          }

      val is_clip_to_areas_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ClippedCamera".cstr.ptr,
              "is_clip_to_areas_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_clip_to_areas_enabled" }
            }
          }

      val is_clip_to_bodies_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ClippedCamera".cstr.ptr,
              "is_clip_to_bodies_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_clip_to_bodies_enabled" }
            }
          }

      val remove_exception: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ClippedCamera".cstr.ptr,
              "remove_exception".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_exception" }
            }
          }

      val remove_exception_rid: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ClippedCamera".cstr.ptr,
              "remove_exception_rid".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_exception_rid" }
            }
          }

      val set_clip_to_areas: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ClippedCamera".cstr.ptr,
              "set_clip_to_areas".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_clip_to_areas" }
            }
          }

      val set_clip_to_bodies: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ClippedCamera".cstr.ptr,
              "set_clip_to_bodies".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_clip_to_bodies" }
            }
          }

      val set_collision_mask: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ClippedCamera".cstr.ptr,
              "set_collision_mask".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_collision_mask" }
            }
          }

      val set_collision_mask_bit: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ClippedCamera".cstr.ptr,
              "set_collision_mask_bit".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_collision_mask_bit" }
            }
          }

      val set_margin: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ClippedCamera".cstr.ptr,
              "set_margin".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_margin" }
            }
          }

      val set_process_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ClippedCamera".cstr.ptr,
              "set_process_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_process_mode" }
            }
          }
    }
  }
}
