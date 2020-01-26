// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlin.Float
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class SceneTreeTimer internal constructor(
  _handle: COpaquePointer
) : Reference(_handle) {
  fun getTimeLeft(): Float {
    TODO()
  }

  fun setTimeLeft() {
    TODO()
  }

  companion object {
    /**
     * Container for method_bind pointers for SceneTreeTimer
     */
    private object __method_bind {
      val get_time_left: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTreeTimer".cstr.ptr,
              "get_time_left".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_time_left" }
            }
          }

      val set_time_left: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTreeTimer".cstr.ptr,
              "set_time_left".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_time_left" }
            }
          }
    }
  }
}
