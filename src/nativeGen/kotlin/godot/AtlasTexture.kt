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

open class AtlasTexture internal constructor(
  _handle: COpaquePointer
) : Texture(_handle) {
  companion object {
    fun new(): AtlasTexture = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("AtlasTexture".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton AtlasTexture" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      AtlasTexture(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for AtlasTexture
     */
    private object __method_bind {
      val get_atlas: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AtlasTexture".cstr.ptr,
              "get_atlas".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_atlas" }
            }
          }

      val get_margin: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AtlasTexture".cstr.ptr,
              "get_margin".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_margin" }
            }
          }

      val get_region: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AtlasTexture".cstr.ptr,
              "get_region".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_region" }
            }
          }

      val has_filter_clip: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AtlasTexture".cstr.ptr,
              "has_filter_clip".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_filter_clip" }
            }
          }

      val set_atlas: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AtlasTexture".cstr.ptr,
              "set_atlas".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_atlas" }
            }
          }

      val set_filter_clip: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AtlasTexture".cstr.ptr,
              "set_filter_clip".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_filter_clip" }
            }
          }

      val set_margin: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AtlasTexture".cstr.ptr,
              "set_margin".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_margin" }
            }
          }

      val set_region: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AtlasTexture".cstr.ptr,
              "set_region".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_region" }
            }
          }
    }
  }
}
