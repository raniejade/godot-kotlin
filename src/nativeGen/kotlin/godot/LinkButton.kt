// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlin.Int
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class LinkButton internal constructor(
  _handle: COpaquePointer
) : BaseButton(_handle) {
  fun getText(): String {
    TODO()
  }

  fun getUnderlineMode(): UnderlineMode {
    TODO()
  }

  fun setText(text: String) {
    TODO()
  }

  fun setUnderlineMode(underline_mode: Int) {
    TODO()
  }

  enum class UnderlineMode(
    val value: Int
  ) {
    UNDERLINE_MODE_ALWAYS(0),

    UNDERLINE_MODE_ON_HOVER(1),

    UNDERLINE_MODE_NEVER(2);

    companion object {
      fun from(value: Int): UnderlineMode {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  companion object {
    val UNDERLINE_MODE_ALWAYS: Int = 0

    val UNDERLINE_MODE_NEVER: Int = 2

    val UNDERLINE_MODE_ON_HOVER: Int = 1

    fun new(): LinkButton = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("LinkButton".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton LinkButton" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      LinkButton(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): LinkButton = LinkButton(ptr)
    /**
     * Container for method_bind pointers for LinkButton
     */
    private object __method_bind {
      val get_text: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LinkButton".cstr.ptr,
              "get_text".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_text" }
            }
          }

      val get_underline_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LinkButton".cstr.ptr,
              "get_underline_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_underline_mode" }
            }
          }

      val set_text: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LinkButton".cstr.ptr,
              "set_text".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_text" }
            }
          }

      val set_underline_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LinkButton".cstr.ptr,
              "set_underline_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_underline_mode" }
            }
          }
    }
  }
}
