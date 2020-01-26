// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import godot.core.Godot
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class NavigationPolygonInstance internal constructor(
  _handle: COpaquePointer
) : Node2D(_handle) {
  companion object {
    fun new(): NavigationPolygonInstance = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("NavigationPolygonInstance".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for NavigationPolygonInstance" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()

      NavigationPolygonInstance(
        fn()
      )
    }}
}
