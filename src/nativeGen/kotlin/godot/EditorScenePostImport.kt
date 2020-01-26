// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class EditorScenePostImport internal constructor(
  _handle: COpaquePointer
) : Reference(_handle) {
  fun getSourceFile(): String {
    TODO()
  }

  fun getSourceFolder(): String {
    TODO()
  }

  companion object {
    fun new(): EditorScenePostImport = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("EditorScenePostImport".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton EditorScenePostImport" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      EditorScenePostImport(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for EditorScenePostImport
     */
    private object __method_bind {
      val get_source_file: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorScenePostImport".cstr.ptr,
              "get_source_file".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_source_file" }
            }
          }

      val get_source_folder: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorScenePostImport".cstr.ptr,
              "get_source_folder".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_source_folder" }
            }
          }
    }
  }
}
