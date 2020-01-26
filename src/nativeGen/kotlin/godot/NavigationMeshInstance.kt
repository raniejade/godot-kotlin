// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import godot.core.Godot
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class NavigationMeshInstance internal constructor(
  _handle: COpaquePointer
) : Spatial(_handle) {
  companion object {
    fun new(): NavigationMeshInstance = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("NavigationMeshInstance".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for NavigationMeshInstance" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()

      NavigationMeshInstance(
        fn()
      )
    }}
}
