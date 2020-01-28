// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class TranslationServer(
  _handle: COpaquePointer
) : Object(_handle) {
  fun addTranslation(translation: Translation) {
    val _arg = Variant.new(translation)
    __method_bind.addTranslation.call(this._handle, _arg, 1)
  }

  fun clear() {
    __method_bind.clear.call(this._handle)
  }

  fun getLoadedLocales(): VariantArray {
    val _ret = __method_bind.getLoadedLocales.call(this._handle)
    return _ret.asVariantArray()
  }

  fun getLocale(): String {
    val _ret = __method_bind.getLocale.call(this._handle)
    return _ret.asString()
  }

  fun getLocaleName(locale: String): String {
    val _arg = Variant.new(locale)
    val _ret = __method_bind.getLocaleName.call(this._handle, _arg, 1)
    return _ret.asString()
  }

  fun removeTranslation(translation: Translation) {
    val _arg = Variant.new(translation)
    __method_bind.removeTranslation.call(this._handle, _arg, 1)
  }

  fun setLocale(locale: String) {
    val _arg = Variant.new(locale)
    __method_bind.setLocale.call(this._handle, _arg, 1)
  }

  fun translate(message: String): String {
    val _arg = Variant.new(message)
    val _ret = __method_bind.translate.call(this._handle, _arg, 1)
    return _ret.asString()
  }

  companion object {
    val Instance: TranslationServer
      get() = memScoped {
        val handle =
          checkNotNull(Godot.gdnative.godot_global_get_singleton)("TranslationServer".cstr.ptr)
        requireNotNull(handle) { "No instance found for singleton TranslationServer" }
        TranslationServer(
          handle
        )
      }
    /**
     * Container for method_bind pointers for TranslationServer
     */
    private object __method_bind {
      val addTranslation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TranslationServer".cstr.ptr,
            "add_translation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_translation" }
        }
      val clear: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TranslationServer".cstr.ptr,
            "clear".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear" }
        }
      val getLoadedLocales: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TranslationServer".cstr.ptr,
            "get_loaded_locales".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_loaded_locales" }
        }
      val getLocale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TranslationServer".cstr.ptr,
            "get_locale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_locale" }
        }
      val getLocaleName: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TranslationServer".cstr.ptr,
            "get_locale_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_locale_name" }
        }
      val removeTranslation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TranslationServer".cstr.ptr,
            "remove_translation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_translation" }
        }
      val setLocale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TranslationServer".cstr.ptr,
            "set_locale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_locale" }
        }
      val translate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TranslationServer".cstr.ptr,
            "translate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method translate" }
        }}
  }
}
