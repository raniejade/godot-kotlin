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

open class Position3D(
  _handle: COpaquePointer
) : Spatial(_handle) {
  companion object {
    fun new(): Position3D = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Position3D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for Position3D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Position3D(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): Position3D = Position3D(ptr)
    /**
     * Container for method_bind pointers for Position3D
     */
    private object __method_bind
  }
}
