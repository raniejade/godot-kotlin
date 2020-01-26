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

open class Path internal constructor(
  _handle: COpaquePointer
) : Spatial(_handle) {
  fun getCurve(): Curve3D {
    TODO()
  }

  fun setCurve(curve: Curve3D) {
    TODO()
  }

  companion object {
    fun new(): Path = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Path".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton Path" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Path(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for Path
     */
    private object __method_bind {
      val get_curve: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Path".cstr.ptr,
              "get_curve".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_curve" }
            }
          }

      val set_curve: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Path".cstr.ptr,
              "set_curve".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_curve" }
            }
          }
    }
  }
}
