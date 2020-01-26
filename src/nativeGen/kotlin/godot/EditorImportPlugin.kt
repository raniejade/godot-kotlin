// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class EditorImportPlugin internal constructor(
  _handle: COpaquePointer
) : Reference(_handle) {
  fun getImportOptions(): VariantArray {
    TODO()
  }

  fun getImportOrder(): Int {
    TODO()
  }

  fun getImporterName(): String {
    TODO()
  }

  fun getOptionVisibility(): Boolean {
    TODO()
  }

  fun getPresetCount(): Int {
    TODO()
  }

  fun getPresetName(): String {
    TODO()
  }

  fun getPriority(): Float {
    TODO()
  }

  fun getRecognizedExtensions(): VariantArray {
    TODO()
  }

  fun getResourceType(): String {
    TODO()
  }

  fun getSaveExtension(): String {
    TODO()
  }

  fun getVisibleName(): String {
    TODO()
  }

  fun import(): Int {
    TODO()
  }

  companion object {
    fun new(): EditorImportPlugin = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("EditorImportPlugin".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton EditorImportPlugin" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      EditorImportPlugin(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for EditorImportPlugin
     */
    private object __method_bind {
      val get_import_options: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorImportPlugin".cstr.ptr,
              "get_import_options".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_import_options" }
            }
          }

      val get_import_order: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorImportPlugin".cstr.ptr,
              "get_import_order".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_import_order" }
            }
          }

      val get_importer_name: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorImportPlugin".cstr.ptr,
              "get_importer_name".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_importer_name" }
            }
          }

      val get_option_visibility: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorImportPlugin".cstr.ptr,
              "get_option_visibility".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_option_visibility" }
            }
          }

      val get_preset_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorImportPlugin".cstr.ptr,
              "get_preset_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_preset_count" }
            }
          }

      val get_preset_name: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorImportPlugin".cstr.ptr,
              "get_preset_name".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_preset_name" }
            }
          }

      val get_priority: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorImportPlugin".cstr.ptr,
              "get_priority".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_priority" }
            }
          }

      val get_recognized_extensions: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorImportPlugin".cstr.ptr,
              "get_recognized_extensions".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_recognized_extensions" }
            }
          }

      val get_resource_type: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorImportPlugin".cstr.ptr,
              "get_resource_type".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_resource_type" }
            }
          }

      val get_save_extension: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorImportPlugin".cstr.ptr,
              "get_save_extension".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_save_extension" }
            }
          }

      val get_visible_name: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorImportPlugin".cstr.ptr,
              "get_visible_name".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_visible_name" }
            }
          }

      val import: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorImportPlugin".cstr.ptr,
              "import".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method import" }
            }
          }
    }
  }
}
