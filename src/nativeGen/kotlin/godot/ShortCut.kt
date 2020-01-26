// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlin.Boolean
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class ShortCut internal constructor(
  _handle: COpaquePointer
) : Resource(_handle) {
  fun getAsText(): String {
    TODO()
  }

  fun getShortcut(): InputEvent {
    TODO()
  }

  fun isShortcut(event: InputEvent): Boolean {
    TODO()
  }

  fun isValid(): Boolean {
    TODO()
  }

  fun setShortcut(event: InputEvent) {
    TODO()
  }

  companion object {
    fun new(): ShortCut = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("ShortCut".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton ShortCut" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      ShortCut(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): ShortCut = ShortCut(ptr)
    /**
     * Container for method_bind pointers for ShortCut
     */
    private object __method_bind {
      val get_as_text: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ShortCut".cstr.ptr,
              "get_as_text".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_as_text" }
            }
          }

      val get_shortcut: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ShortCut".cstr.ptr,
              "get_shortcut".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_shortcut" }
            }
          }

      val is_shortcut: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ShortCut".cstr.ptr,
              "is_shortcut".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_shortcut" }
            }
          }

      val is_valid: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ShortCut".cstr.ptr,
              "is_valid".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_valid" }
            }
          }

      val set_shortcut: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ShortCut".cstr.ptr,
              "set_shortcut".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_shortcut" }
            }
          }
    }
  }
}
