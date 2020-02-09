// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
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

open class ShortCut(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Resource(null) {
  var shortcut: InputEvent
    get() {
       return getShortcut() 
    }
    set(value) {
      setShortcut(value)
    }

  constructor() : this(null) {
    _handle = __new()
  }

  fun getAsText(): String {
    val _ret = __method_bind.getAsText.call(this._handle)
    return _ret.asString()
  }

  fun getShortcut(): InputEvent {
    val _ret = __method_bind.getShortcut.call(this._handle)
    return _ret.toAny() as InputEvent
  }

  fun isShortcut(event: InputEvent): Boolean {
    val _arg = Variant(event)
    val _ret = __method_bind.isShortcut.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun isValid(): Boolean {
    val _ret = __method_bind.isValid.call(this._handle)
    return _ret.asBoolean()
  }

  fun setShortcut(event: InputEvent) {
    val _arg = Variant(event)
    __method_bind.setShortcut.call(this._handle, listOf(_arg))
  }

  companion object {
    internal fun __new(): COpaquePointer = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("ShortCut".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for ShortCut" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for ShortCut
     */
    private object __method_bind {
      val getAsText: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ShortCut".cstr.ptr,
            "get_as_text".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_as_text" }
        }
      val getShortcut: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ShortCut".cstr.ptr,
            "get_shortcut".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_shortcut" }
        }
      val isShortcut: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ShortCut".cstr.ptr,
            "is_shortcut".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_shortcut" }
        }
      val isValid: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ShortCut".cstr.ptr,
            "is_valid".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_valid" }
        }
      val setShortcut: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ShortCut".cstr.ptr,
            "set_shortcut".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_shortcut" }
        }}
  }
}
