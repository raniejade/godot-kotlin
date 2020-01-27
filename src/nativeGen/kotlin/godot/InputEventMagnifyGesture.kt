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

open class InputEventMagnifyGesture internal constructor(
  _handle: COpaquePointer
) : InputEventGesture(_handle) {
  fun getFactor(): Float {
    val _ret = __method_bind.get_factor.call(this.toVariant())
    return _ret.asFloat()
  }

  fun setFactor(factor: Float) {
    val _arg = Variant.new(factor)
    __method_bind.set_factor.call(this.toVariant(), _arg, 1)
  }

  companion object {
    fun new(): InputEventMagnifyGesture = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("InputEventMagnifyGesture".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for InputEventMagnifyGesture" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      InputEventMagnifyGesture(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): InputEventMagnifyGesture = InputEventMagnifyGesture(ptr)
    /**
     * Container for method_bind pointers for InputEventMagnifyGesture
     */
    private object __method_bind {
      val get_factor: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMagnifyGesture".cstr.ptr,
              "get_factor".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_factor" }
            }
          }

      val set_factor: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMagnifyGesture".cstr.ptr,
              "set_factor".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_factor" }
            }
          }
    }
  }
}
