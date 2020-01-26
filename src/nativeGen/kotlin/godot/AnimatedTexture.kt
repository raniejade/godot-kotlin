// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class AnimatedTexture internal constructor(
  _handle: COpaquePointer
) : Texture(_handle) {
  companion object {
    val MAX_FRAMES: Int = 256

    fun new(): AnimatedTexture = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AnimatedTexture".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton AnimatedTexture" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      AnimatedTexture(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for AnimatedTexture
     */
    private object __method_bind {
      val _update_proxy: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedTexture".cstr.ptr,
              "_update_proxy".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _update_proxy" }
            }
          }

      val get_fps: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedTexture".cstr.ptr,
              "get_fps".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_fps" }
            }
          }

      val get_frame_delay: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedTexture".cstr.ptr,
              "get_frame_delay".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_frame_delay" }
            }
          }

      val get_frame_texture: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedTexture".cstr.ptr,
              "get_frame_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_frame_texture" }
            }
          }

      val get_frames: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedTexture".cstr.ptr,
              "get_frames".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_frames" }
            }
          }

      val set_fps: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedTexture".cstr.ptr,
              "set_fps".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_fps" }
            }
          }

      val set_frame_delay: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedTexture".cstr.ptr,
              "set_frame_delay".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_frame_delay" }
            }
          }

      val set_frame_texture: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedTexture".cstr.ptr,
              "set_frame_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_frame_texture" }
            }
          }

      val set_frames: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimatedTexture".cstr.ptr,
              "set_frames".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_frames" }
            }
          }
    }
  }
}
