// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class TriangleMesh internal constructor(
  _handle: COpaquePointer
) : Reference(_handle) {
  companion object {
    fun new(): TriangleMesh = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("TriangleMesh".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton TriangleMesh" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      TriangleMesh(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): TriangleMesh = TriangleMesh(ptr)
    /**
     * Container for method_bind pointers for TriangleMesh
     */
    private object __method_bind
  }
}
