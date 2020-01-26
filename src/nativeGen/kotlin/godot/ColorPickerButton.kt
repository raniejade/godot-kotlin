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

open class ColorPickerButton internal constructor(
  _handle: COpaquePointer
) : Button(_handle) {
  companion object {
    fun new(): ColorPickerButton = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("ColorPickerButton".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton ColorPickerButton" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      ColorPickerButton(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for ColorPickerButton
     */
    private object __method_bind {
      val _color_changed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPickerButton".cstr.ptr,
              "_color_changed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _color_changed" }
            }
          }

      val _modal_closed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPickerButton".cstr.ptr,
              "_modal_closed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _modal_closed" }
            }
          }

      val get_pick_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPickerButton".cstr.ptr,
              "get_pick_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_pick_color" }
            }
          }

      val get_picker: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPickerButton".cstr.ptr,
              "get_picker".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_picker" }
            }
          }

      val get_popup: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPickerButton".cstr.ptr,
              "get_popup".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_popup" }
            }
          }

      val is_editing_alpha: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPickerButton".cstr.ptr,
              "is_editing_alpha".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_editing_alpha" }
            }
          }

      val set_edit_alpha: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPickerButton".cstr.ptr,
              "set_edit_alpha".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_edit_alpha" }
            }
          }

      val set_pick_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorPickerButton".cstr.ptr,
              "set_pick_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_pick_color" }
            }
          }
    }
  }
}
