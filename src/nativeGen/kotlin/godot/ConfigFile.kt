// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.PoolStringArray
import godot.core.Variant
import kotlin.Boolean
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class ConfigFile internal constructor(
  _handle: COpaquePointer
) : Reference(_handle) {
  fun eraseSection(section: String) {
    TODO()
  }

  fun getSectionKeys(section: String): PoolStringArray {
    TODO()
  }

  fun getSections(): PoolStringArray {
    TODO()
  }

  fun getValue(
    section: String,
    key: String,
    default: Variant
  ): Variant {
    TODO()
  }

  fun hasSection(section: String): Boolean {
    TODO()
  }

  fun hasSectionKey(section: String, key: String): Boolean {
    TODO()
  }

  fun load(path: String): Error {
    TODO()
  }

  fun save(path: String): Error {
    TODO()
  }

  fun setValue(
    section: String,
    key: String,
    value: Variant
  ) {
    TODO()
  }

  companion object {
    fun new(): ConfigFile = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("ConfigFile".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton ConfigFile" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      ConfigFile(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for ConfigFile
     */
    private object __method_bind {
      val erase_section: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ConfigFile".cstr.ptr,
              "erase_section".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method erase_section" }
            }
          }

      val get_section_keys: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ConfigFile".cstr.ptr,
              "get_section_keys".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_section_keys" }
            }
          }

      val get_sections: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ConfigFile".cstr.ptr,
              "get_sections".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_sections" }
            }
          }

      val get_value: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ConfigFile".cstr.ptr,
              "get_value".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_value" }
            }
          }

      val has_section: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ConfigFile".cstr.ptr,
              "has_section".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_section" }
            }
          }

      val has_section_key: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ConfigFile".cstr.ptr,
              "has_section_key".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_section_key" }
            }
          }

      val load: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ConfigFile".cstr.ptr,
              "load".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method load" }
            }
          }

      val save: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ConfigFile".cstr.ptr,
              "save".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method save" }
            }
          }

      val set_value: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ConfigFile".cstr.ptr,
              "set_value".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_value" }
            }
          }
    }
  }
}
