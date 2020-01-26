// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlin.Boolean
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class CenterContainer internal constructor(
  _handle: COpaquePointer
) : Container(_handle) {
  fun isUsingTopLeft(): Boolean {
    TODO()
  }

  fun setUseTopLeft(enable: Boolean) {
    TODO()
  }

  companion object {
    fun new(): CenterContainer = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("CenterContainer".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton CenterContainer" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      CenterContainer(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for CenterContainer
     */
    private object __method_bind {
      val is_using_top_left: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CenterContainer".cstr.ptr,
              "is_using_top_left".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_using_top_left" }
            }
          }

      val set_use_top_left: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CenterContainer".cstr.ptr,
              "set_use_top_left".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_use_top_left" }
            }
          }
    }
  }
}
