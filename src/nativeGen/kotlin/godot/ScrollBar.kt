// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Float
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class ScrollBar internal constructor(
  _handle: COpaquePointer
) : Range(_handle) {
  fun getCustomStep(): Float {
    val _ret = __method_bind.get_custom_step.call(this.toVariant())
    TODO()
  }

  fun setCustomStep(step: Float) {
    val _args = VariantArray.new()
    _args.append(step)
    val _ret = __method_bind.set_custom_step.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  companion object {
    /**
     * Container for method_bind pointers for ScrollBar
     */
    private object __method_bind {
      val get_custom_step: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScrollBar".cstr.ptr,
              "get_custom_step".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_custom_step" }
            }
          }

      val set_custom_step: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ScrollBar".cstr.ptr,
              "set_custom_step".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_custom_step" }
            }
          }
    }
  }
}
