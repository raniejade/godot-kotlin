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

open class Position2D(
  _handle: COpaquePointer
) : Node2D(_handle) {
  companion object {
    fun new(): Position2D = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Position2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for Position2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Position2D(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): Position2D = Position2D(ptr)
    /**
     * Container for method_bind pointers for Position2D
     */
    private object __method_bind
  }
}
