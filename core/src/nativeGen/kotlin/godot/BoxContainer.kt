// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Int
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class BoxContainer(
  _handle: COpaquePointer
) : Container(_handle) {
  var alignment: AlignMode
    get() {
       return getAlignment() 
    }
    set(value) {
      setAlignment(value.value)
    }

  fun addSpacer(begin: Boolean) {
    val _arg = Variant.new(begin)
    __method_bind.addSpacer.call(this._handle, listOf(_arg))
  }

  fun getAlignment(): AlignMode {
    val _ret = __method_bind.getAlignment.call(this._handle)
    return BoxContainer.AlignMode.from(_ret.asInt())
  }

  fun setAlignment(alignment: Int) {
    val _arg = Variant.new(alignment)
    __method_bind.setAlignment.call(this._handle, listOf(_arg))
  }

  enum class AlignMode(
    val value: Int
  ) {
    BEGIN(0),

    CENTER(1),

    END(2);

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
    /**
     * Container for method_bind pointers for BoxContainer
     */
    private object __method_bind {
      val addSpacer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BoxContainer".cstr.ptr,
            "add_spacer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_spacer" }
        }
      val getAlignment: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BoxContainer".cstr.ptr,
            "get_alignment".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_alignment" }
        }
      val setAlignment: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BoxContainer".cstr.ptr,
            "set_alignment".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_alignment" }
        }}
  }
}
