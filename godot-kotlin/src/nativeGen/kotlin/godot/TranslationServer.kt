// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.String
import kotlin.Suppress
import kotlin.reflect.KCallable
import kotlinx.cinterop.BooleanVar
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.COpaquePointerVar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.DoubleVar
import kotlinx.cinterop.IntVar
import kotlinx.cinterop.alloc
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.readValue
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.value

open class TranslationServerInternal(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Object(null) {
  fun addTranslation(translation: Translation) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.addTranslation.call(self._handle, listOf(translation), null)
    }
  }

  fun clear() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.clear.call(self._handle, emptyList(), null)
    }
  }

  fun getLoadedLocales(): VariantArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = VariantArray()
      val _retPtr = _ret._value.ptr
      __method_bind.getLoadedLocales.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getLocale(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getLocale.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getLocaleName(locale: String): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getLocaleName.call(self._handle, listOf(locale), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun removeTranslation(translation: Translation) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.removeTranslation.call(self._handle, listOf(translation), null)
    }
  }

  fun setLocale(locale: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setLocale.call(self._handle, listOf(locale), null)
    }
  }

  fun translate(message: String): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.translate.call(self._handle, listOf(message), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  companion object {
    /**
     * Container for method_bind pointers for TranslationServer
     */
    private object __method_bind {
      val addTranslation: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TranslationServer".cstr.ptr,
              "add_translation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_translation" }
            }
          }

      val clear: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TranslationServer".cstr.ptr,
              "clear".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clear" }
            }
          }

      val getLoadedLocales: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TranslationServer".cstr.ptr,
              "get_loaded_locales".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_loaded_locales" }
            }
          }

      val getLocale: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TranslationServer".cstr.ptr,
              "get_locale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_locale" }
            }
          }

      val getLocaleName: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TranslationServer".cstr.ptr,
              "get_locale_name".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_locale_name" }
            }
          }

      val removeTranslation: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TranslationServer".cstr.ptr,
              "remove_translation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_translation" }
            }
          }

      val setLocale: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TranslationServer".cstr.ptr,
              "set_locale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_locale" }
            }
          }

      val translate: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TranslationServer".cstr.ptr,
              "translate".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method translate" }
            }
          }
    }
  }
}

object TranslationServer : TranslationServerInternal(null) {
  init {
    Allocator.allocationScope {
      val handle =
          checkNotNull(Godot.gdnative.godot_global_get_singleton)("TranslationServer".cstr.ptr)
      requireNotNull(handle) { "No instance found for singleton TranslationServer" }
      _handle = handle
    }
  }
}
