// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import godot.core.Godot
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class ConvexPolygonShape2D internal constructor(
  _handle: COpaquePointer
) : Shape2D(_handle) {
  companion object {
    fun new(): ConvexPolygonShape2D = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("ConvexPolygonShape2D".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for ConvexPolygonShape2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()

      ConvexPolygonShape2D(
        fn()
      )
    }}
}
