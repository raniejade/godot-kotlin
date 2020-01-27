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

open class VSplitContainer(
  _handle: COpaquePointer
) : SplitContainer(_handle) {
  companion object {
    fun new(): VSplitContainer = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VSplitContainer".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VSplitContainer" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VSplitContainer(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): VSplitContainer = VSplitContainer(ptr)
    /**
     * Container for method_bind pointers for VSplitContainer
     */
    private object __method_bind
  }
}
