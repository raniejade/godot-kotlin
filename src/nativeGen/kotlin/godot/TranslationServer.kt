// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.VariantArray
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class TranslationServer internal constructor(
  _handle: COpaquePointer
) : Object(_handle) {
  fun addTranslation() {
    TODO()
  }

  fun clear() {
    TODO()
  }

  fun getLoadedLocales(): VariantArray {
    TODO()
  }

  fun getLocale(): String {
    TODO()
  }

  fun getLocaleName(): String {
    TODO()
  }

  fun removeTranslation() {
    TODO()
  }

  fun setLocale() {
    TODO()
  }

  fun translate(): String {
    TODO()
  }

  companion object {
    val Instance: TranslationServer = memScoped {
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
      val add_translation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TranslationServer".cstr.ptr,
              "add_translation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_translation" }
            }
          }

      val clear: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TranslationServer".cstr.ptr,
              "clear".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clear" }
            }
          }

      val get_loaded_locales: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TranslationServer".cstr.ptr,
              "get_loaded_locales".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_loaded_locales" }
            }
          }

      val get_locale: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TranslationServer".cstr.ptr,
              "get_locale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_locale" }
            }
          }

      val get_locale_name: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TranslationServer".cstr.ptr,
              "get_locale_name".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_locale_name" }
            }
          }

      val remove_translation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TranslationServer".cstr.ptr,
              "remove_translation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_translation" }
            }
          }

      val set_locale: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TranslationServer".cstr.ptr,
              "set_locale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_locale" }
            }
          }

      val translate: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TranslationServer".cstr.ptr,
              "translate".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method translate" }
            }
          }
    }
  }
}
