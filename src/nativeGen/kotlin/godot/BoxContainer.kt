// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlin.Boolean
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class BoxContainer internal constructor(
  _handle: COpaquePointer
) : Container(_handle) {
  fun addSpacer(begin: Boolean) {
    TODO()
  }

  fun getAlignment(): AlignMode {
    TODO()
  }

  fun setAlignment(alignment: Int) {
    TODO()
  }

  enum class AlignMode(
    val value: Int
  ) {
    ALIGN_BEGIN(0),

    ALIGN_CENTER(1),

    ALIGN_END(2);

    companion object {
      fun from(value: Int): AlignMode {
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
    val ALIGN_BEGIN: Int = 0

    val ALIGN_CENTER: Int = 1

    val ALIGN_END: Int = 2

    /**
     * Container for method_bind pointers for BoxContainer
     */
    private object __method_bind {
      val add_spacer: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BoxContainer".cstr.ptr,
              "add_spacer".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_spacer" }
            }
          }

      val get_alignment: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BoxContainer".cstr.ptr,
              "get_alignment".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_alignment" }
            }
          }

      val set_alignment: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BoxContainer".cstr.ptr,
              "set_alignment".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_alignment" }
            }
          }
    }
  }
}
