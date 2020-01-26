// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class Button internal constructor(
  _handle: COpaquePointer
) : BaseButton(_handle) {
  fun getButtonIcon(): Texture {
    TODO()
  }

  fun getClipText(): Boolean {
    TODO()
  }

  fun getText(): String {
    TODO()
  }

  fun getTextAlign(): Button.TextAlign {
    TODO()
  }

  fun isFlat(): Boolean {
    TODO()
  }

  fun setButtonIcon() {
    TODO()
  }

  fun setClipText() {
    TODO()
  }

  fun setFlat() {
    TODO()
  }

  fun setText() {
    TODO()
  }

  fun setTextAlign() {
    TODO()
  }

  enum class TextAlign(
    val value: Int
  ) {
    ALIGN_LEFT(0),

    ALIGN_CENTER(1),

    ALIGN_RIGHT(2);
  }

  companion object {
    val ALIGN_CENTER: Int = 1

    val ALIGN_LEFT: Int = 0

    val ALIGN_RIGHT: Int = 2

    fun new(): Button = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Button".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton Button" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Button(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for Button
     */
    private object __method_bind {
      val get_button_icon: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Button".cstr.ptr,
              "get_button_icon".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_button_icon" }
            }
          }

      val get_clip_text: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Button".cstr.ptr,
              "get_clip_text".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_clip_text" }
            }
          }

      val get_text: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Button".cstr.ptr,
              "get_text".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_text" }
            }
          }

      val get_text_align: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Button".cstr.ptr,
              "get_text_align".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_text_align" }
            }
          }

      val is_flat: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Button".cstr.ptr,
              "is_flat".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_flat" }
            }
          }

      val set_button_icon: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Button".cstr.ptr,
              "set_button_icon".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_button_icon" }
            }
          }

      val set_clip_text: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Button".cstr.ptr,
              "set_clip_text".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_clip_text" }
            }
          }

      val set_flat: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Button".cstr.ptr,
              "set_flat".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_flat" }
            }
          }

      val set_text: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Button".cstr.ptr,
              "set_text".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_text" }
            }
          }

      val set_text_align: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Button".cstr.ptr,
              "set_text_align".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_text_align" }
            }
          }
    }
  }
}
