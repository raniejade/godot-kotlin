// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class ShortCut(
  _handle: COpaquePointer
) : Resource(_handle) {
  fun getAsText(): String {
    val _ret = __method_bind.get_as_text.call(this._handle)
    return _ret.asString()
  }

  fun getShortcut(): InputEvent {
    val _ret = __method_bind.get_shortcut.call(this._handle)
    return _ret.asObject(::InputEvent)!!
  }

  fun isShortcut(event: InputEvent): Boolean {
    val _arg = Variant.new(event)
    val _ret = __method_bind.is_shortcut.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun isValid(): Boolean {
    val _ret = __method_bind.is_valid.call(this._handle)
    return _ret.asBoolean()
  }

  fun setShortcut(event: InputEvent) {
    val _arg = Variant.new(event)
    __method_bind.set_shortcut.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): ShortCut = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("ShortCut".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for ShortCut" }
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
      val get_as_text: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ShortCut".cstr.ptr,
            "get_as_text".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_as_text" }
        }
      val get_shortcut: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ShortCut".cstr.ptr,
            "get_shortcut".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_shortcut" }
        }
      val is_shortcut: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ShortCut".cstr.ptr,
            "is_shortcut".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_shortcut" }
        }
      val is_valid: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ShortCut".cstr.ptr,
            "is_valid".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_valid" }
        }
      val set_shortcut: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ShortCut".cstr.ptr,
            "set_shortcut".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_shortcut" }
        }}
  }
}
