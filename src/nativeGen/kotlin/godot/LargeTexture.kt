// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class LargeTexture internal constructor(
  _handle: COpaquePointer
) : Texture(_handle) {
  companion object {
    fun new(): LargeTexture = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("LargeTexture".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton LargeTexture" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      LargeTexture(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for LargeTexture
     */
    private object __method_bind {
      val _get_data: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LargeTexture".cstr.ptr,
              "_get_data".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _get_data" }
            }
          }

      val _set_data: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LargeTexture".cstr.ptr,
              "_set_data".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _set_data" }
            }
          }

      val add_piece: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LargeTexture".cstr.ptr,
              "add_piece".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_piece" }
            }
          }

      val clear: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LargeTexture".cstr.ptr,
              "clear".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clear" }
            }
          }

      val get_piece_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LargeTexture".cstr.ptr,
              "get_piece_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_piece_count" }
            }
          }

      val get_piece_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LargeTexture".cstr.ptr,
              "get_piece_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_piece_offset" }
            }
          }

      val get_piece_texture: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LargeTexture".cstr.ptr,
              "get_piece_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_piece_texture" }
            }
          }

      val set_piece_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LargeTexture".cstr.ptr,
              "set_piece_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_piece_offset" }
            }
          }

      val set_piece_texture: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LargeTexture".cstr.ptr,
              "set_piece_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_piece_texture" }
            }
          }

      val set_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LargeTexture".cstr.ptr,
              "set_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_size" }
            }
          }
    }
  }
}
