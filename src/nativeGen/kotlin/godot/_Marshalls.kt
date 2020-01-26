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

open class _Marshalls internal constructor(
  _handle: COpaquePointer
) : Reference(_handle) {
  companion object {
    val Instance: _Marshalls = memScoped {
          val handle =
            checkNotNull(Godot.gdnative.godot_global_get_singleton)("_Marshalls".cstr.ptr)
          requireNotNull(handle) { "No instance found for singleton _Marshalls" }
          _Marshalls(
            handle
          )
        }

    /**
     * Container for method_bind pointers for _Marshalls
     */
    private object __method_bind {
      val base64_to_raw: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Marshalls".cstr.ptr,
              "base64_to_raw".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method base64_to_raw" }
            }
          }

      val base64_to_utf8: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Marshalls".cstr.ptr,
              "base64_to_utf8".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method base64_to_utf8" }
            }
          }

      val base64_to_variant: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Marshalls".cstr.ptr,
              "base64_to_variant".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method base64_to_variant" }
            }
          }

      val raw_to_base64: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Marshalls".cstr.ptr,
              "raw_to_base64".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method raw_to_base64" }
            }
          }

      val utf8_to_base64: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Marshalls".cstr.ptr,
              "utf8_to_base64".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method utf8_to_base64" }
            }
          }

      val variant_to_base64: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_Marshalls".cstr.ptr,
              "variant_to_base64".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method variant_to_base64" }
            }
          }
    }
  }
}
