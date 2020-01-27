// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class EditorSceneImporterAssimp(
  _handle: COpaquePointer
) : EditorSceneImporter(_handle) {
  companion object {
    fun new(): EditorSceneImporterAssimp = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("EditorSceneImporterAssimp".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for EditorSceneImporterAssimp" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      EditorSceneImporterAssimp(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): EditorSceneImporterAssimp = EditorSceneImporterAssimp(ptr)
    /**
     * Container for method_bind pointers for EditorSceneImporterAssimp
     */
    private object __method_bind
  }
}
