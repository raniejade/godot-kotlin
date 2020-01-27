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

open class CheckBox internal constructor(
  _handle: COpaquePointer
) : Button(_handle) {
  companion object {
    fun new(): CheckBox = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("CheckBox".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton CheckBox" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      CheckBox(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): CheckBox = CheckBox(ptr)
    /**
     * Container for method_bind pointers for CheckBox
     */
    private object __method_bind
  }
}
