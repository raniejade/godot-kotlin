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

open class EditorScenePostImport(
  _handle: COpaquePointer
) : Reference(_handle) {
  fun getSourceFile(): String {
    val _ret = __method_bind.getSourceFile.call(this._handle)
    return _ret.asString()
  }

  fun getSourceFolder(): String {
    val _ret = __method_bind.getSourceFolder.call(this._handle)
    return _ret.asString()
  }

  companion object {
    /**
     * Container for method_bind pointers for EditorScenePostImport
     */
    private object __method_bind {
      val getSourceFile: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorScenePostImport".cstr.ptr,
            "get_source_file".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_source_file" }
        }
      val getSourceFolder: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorScenePostImport".cstr.ptr,
            "get_source_folder".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_source_folder" }
        }}
  }
}
