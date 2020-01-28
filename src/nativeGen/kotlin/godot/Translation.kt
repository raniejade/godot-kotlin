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

open class Translation(
  _handle: COpaquePointer
) : Resource(_handle) {
  var locale: String
    get() {
       return getLocale() 
    }
    set(value) {
      setLocale(value)
    }

  var messages: PoolStringArray
    get() {
       return _getMessages() 
    }
    set(value) {
      _setMessages(value)
    }

  fun addMessage(srcMessage: String, xlatedMessage: String) {
    val _args = VariantArray.new()
    _args.append(srcMessage)
    _args.append(xlatedMessage)
    __method_bind.addMessage.call(this._handle, _args.toVariant(), 2)
  }

  fun eraseMessage(srcMessage: String) {
    val _arg = Variant.new(srcMessage)
    __method_bind.eraseMessage.call(this._handle, _arg, 1)
  }

  fun getLocale(): String {
    val _ret = __method_bind.getLocale.call(this._handle)
    return _ret.asString()
  }

  fun getMessage(srcMessage: String): String {
    val _arg = Variant.new(srcMessage)
    val _ret = __method_bind.getMessage.call(this._handle, _arg, 1)
    return _ret.asString()
  }

  fun getMessageCount(): Int {
    val _ret = __method_bind.getMessageCount.call(this._handle)
    return _ret.asInt()
  }

  fun getMessageList(): PoolStringArray {
    val _ret = __method_bind.getMessageList.call(this._handle)
    return _ret.asPoolStringArray()
  }

  fun setLocale(locale: String) {
    val _arg = Variant.new(locale)
    __method_bind.setLocale.call(this._handle, _arg, 1)
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
      val addMessage: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Translation".cstr.ptr,
            "addMessage".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addMessage" }
        }
      val eraseMessage: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Translation".cstr.ptr,
            "eraseMessage".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method eraseMessage" }
        }
      val getLocale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Translation".cstr.ptr,
            "getLocale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getLocale" }
        }
      val getMessage: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Translation".cstr.ptr,
            "getMessage".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getMessage" }
        }
      val getMessageCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Translation".cstr.ptr,
            "getMessageCount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getMessageCount" }
        }
      val getMessageList: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Translation".cstr.ptr,
            "getMessageList".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getMessageList" }
        }
      val setLocale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Translation".cstr.ptr,
            "setLocale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setLocale" }
        }}
  }
}
