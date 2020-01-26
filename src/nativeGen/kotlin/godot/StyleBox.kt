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

open class StyleBox internal constructor(
  _handle: COpaquePointer
) : Resource(_handle) {
  companion object {
    /**
     * Container for method_bind pointers for StyleBox
     */
    private object __method_bind {
      val draw: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBox".cstr.ptr,
              "draw".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method draw" }
            }
          }

      val get_center_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBox".cstr.ptr,
              "get_center_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_center_size" }
            }
          }

      val get_current_item_drawn: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBox".cstr.ptr,
              "get_current_item_drawn".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_current_item_drawn" }
            }
          }

      val get_default_margin: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBox".cstr.ptr,
              "get_default_margin".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_default_margin" }
            }
          }

      val get_margin: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBox".cstr.ptr,
              "get_margin".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_margin" }
            }
          }

      val get_minimum_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBox".cstr.ptr,
              "get_minimum_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_minimum_size" }
            }
          }

      val get_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBox".cstr.ptr,
              "get_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_offset" }
            }
          }

      val set_default_margin: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBox".cstr.ptr,
              "set_default_margin".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_default_margin" }
            }
          }

      val test_mask: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBox".cstr.ptr,
              "test_mask".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method test_mask" }
            }
          }
    }
  }
}
