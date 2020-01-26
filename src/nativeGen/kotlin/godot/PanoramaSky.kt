// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class PanoramaSky internal constructor(
  _handle: COpaquePointer
) : Sky(_handle) {
  companion object {
    fun new(): PanoramaSky = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("PanoramaSky".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton PanoramaSky" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      PanoramaSky(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for PanoramaSky
     */
    private object __method_bind {
      val get_panorama: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PanoramaSky".cstr.ptr,
              "get_panorama".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_panorama" }
            }
          }

      val set_panorama: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PanoramaSky".cstr.ptr,
              "set_panorama".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_panorama" }
            }
          }
    }
  }
}
