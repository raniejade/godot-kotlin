// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.PoolStringArray
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

open class Translation internal constructor(
  _handle: COpaquePointer
) : Resource(_handle) {
  fun addMessage(srcMessage: String, xlatedMessage: String) {
    val _args = VariantArray.new()
    _args.append(srcMessage)
    _args.append(xlatedMessage)
    __method_bind.add_message.call(this._handle, _args.toVariant(), 2)
  }

  fun eraseMessage(srcMessage: String) {
    val _arg = Variant.new(srcMessage)
    __method_bind.erase_message.call(this._handle, _arg, 1)
  }

  fun getLocale(): String {
    val _ret = __method_bind.get_locale.call(this._handle)
    return _ret.asString()
  }

  fun getMessage(srcMessage: String): String {
    val _arg = Variant.new(srcMessage)
    val _ret = __method_bind.get_message.call(this._handle, _arg, 1)
    return _ret.asString()
  }

  fun getMessageCount(): Int {
    val _ret = __method_bind.get_message_count.call(this._handle)
    return _ret.asInt()
  }

  fun getMessageList(): PoolStringArray {
    val _ret = __method_bind.get_message_list.call(this._handle)
    return _ret.asPoolStringArray()
  }

  fun setLocale(locale: String) {
    val _arg = Variant.new(locale)
    __method_bind.set_locale.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): Translation = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Translation".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for Translation" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Translation(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): Translation = Translation(ptr)
    /**
     * Container for method_bind pointers for Translation
     */
    private object __method_bind {
      val add_message: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Translation".cstr.ptr,
            "add_message".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_message" }
        }
      val erase_message: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Translation".cstr.ptr,
            "erase_message".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method erase_message" }
        }
      val get_locale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Translation".cstr.ptr,
            "get_locale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_locale" }
        }
      val get_message: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Translation".cstr.ptr,
            "get_message".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_message" }
        }
      val get_message_count: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Translation".cstr.ptr,
            "get_message_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_message_count" }
        }
      val get_message_list: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Translation".cstr.ptr,
            "get_message_list".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_message_list" }
        }
      val set_locale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Translation".cstr.ptr,
            "set_locale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_locale" }
        }}
  }
}
