// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class LinkButton(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : BaseButton(null) {
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

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
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
    val _arg = Variant(text)
    __method_bind.setText.call(this._handle, listOf(_arg))
  }

  fun setUnderlineMode(underlineMode: Int) {
    val _arg = Variant(underlineMode)
    __method_bind.setUnderlineMode.call(this._handle, listOf(_arg))
  }

  enum class UnderlineMode(
    val value: Int
  ) {
    ALWAYS(0),

    ON_HOVER(1),

    NEVER(2);

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
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("LinkButton".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for LinkButton" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for LinkButton
     */
    private object __method_bind {
      val getText: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LinkButton".cstr.ptr,
            "get_text".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_text" }
        }
      val getUnderlineMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LinkButton".cstr.ptr,
            "get_underline_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_underline_mode" }
        }
      val setText: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LinkButton".cstr.ptr,
            "set_text".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_text" }
        }
      val setUnderlineMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LinkButton".cstr.ptr,
            "set_underline_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_underline_mode" }
        }}
  }
}
