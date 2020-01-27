// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class EditorNavigationMeshGenerator internal constructor(
  _handle: COpaquePointer
) : Object(_handle) {
  fun bake(navMesh: NavigationMesh, rootNode: Node) {
    val _args = VariantArray.new()
    _args.append(navMesh)
    _args.append(rootNode)
    __method_bind.bake.call(this._handle, _args.toVariant(), 2)
  }

  fun clear(navMesh: NavigationMesh) {
    val _arg = Variant.new(navMesh)
    __method_bind.clear.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): EditorNavigationMeshGenerator = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("EditorNavigationMeshGenerator".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for EditorNavigationMeshGenerator" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      EditorNavigationMeshGenerator(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): EditorNavigationMeshGenerator =
        EditorNavigationMeshGenerator(ptr)
    /**
     * Container for method_bind pointers for EditorNavigationMeshGenerator
     */
    private object __method_bind {
      val bake: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorNavigationMeshGenerator".cstr.ptr,
            "bake".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method bake" }
        }
      val clear: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("EditorNavigationMeshGenerator".cstr.ptr,
            "clear".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear" }
        }}
  }
}
