// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class VSeparator(
  _handle: COpaquePointer
) : Separator(_handle) {
  companion object {
    fun new(): VSeparator = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("VSeparator".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VSeparator" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VSeparator(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): VSeparator = VSeparator(ptr)
    /**
     * Container for method_bind pointers for VSeparator
     */
    private object __method_bind
  }
}
