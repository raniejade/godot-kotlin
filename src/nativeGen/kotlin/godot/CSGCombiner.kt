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

open class CSGCombiner(
  _handle: COpaquePointer
) : CSGShape(_handle) {
  companion object {
    fun new(): CSGCombiner = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("CSGCombiner".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for CSGCombiner" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      CSGCombiner(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): CSGCombiner = CSGCombiner(ptr)
    /**
     * Container for method_bind pointers for CSGCombiner
     */
    private object __method_bind
  }
}
