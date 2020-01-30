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

open class PointMesh(
  _handle: COpaquePointer
) : PrimitiveMesh(_handle) {
  companion object {
    fun new(): PointMesh = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("PointMesh".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for PointMesh" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      PointMesh(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): PointMesh = PointMesh(ptr)
    /**
     * Container for method_bind pointers for PointMesh
     */
    private object __method_bind
  }
}
