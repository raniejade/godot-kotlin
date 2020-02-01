// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Int
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class LinkButton(
  _handle: COpaquePointer
) : BaseButton(_handle) {
  var text: String
    get() {
       return getText() 
    }
    set(value) {
      setText(value)
    }

  var underline: UnderlineMode
    get() {
       return getUnderlineMode() 
    }
    set(value) {
      setUnderlineMode(value.value)
    }

  fun getText(): String {
    val _ret = __method_bind.getText.call(this._handle)
    return _ret.asString()
  }

  fun getUnderlineMode(): UnderlineMode {
    val _ret = __method_bind.getUnderlineMode.call(this._handle)
    return LinkButton.UnderlineMode.from(_ret.asInt())
  }

  fun setText(text: String) {
    val _arg = Variant.new(text)
    __method_bind.setText.call(this._handle, listOf(_arg))
  }

  fun setUnderlineMode(underlineMode: Int) {
    val _arg = Variant.new(underlineMode)
    __method_bind.setUnderlineMode.call(this._handle, listOf(_arg))
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
      requireNotNull(fnPtr) { "No instance found for LinkButton" }
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
      val getText: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LinkButton".cstr.ptr,
            "get_text".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_text" }
        }
      val getUnderlineMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LinkButton".cstr.ptr,
            "get_underline_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_underline_mode" }
        }
      val setText: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LinkButton".cstr.ptr,
            "set_text".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_text" }
        }
      val setUnderlineMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LinkButton".cstr.ptr,
            "set_underline_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_underline_mode" }
        }}
  }
}
