// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class InputEventPanGesture internal constructor(
  _handle: COpaquePointer
) : InputEventGesture(_handle) {
  fun getDelta(): Vector2 {
    val _ret = __method_bind.get_delta.call(this.toVariant())
    TODO()
  }

  fun setDelta(delta: Vector2) {
    val _args = VariantArray.new()
    _args.append(delta)
    val _ret = __method_bind.set_delta.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  companion object {
    fun new(): InputEventPanGesture = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("InputEventPanGesture".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton InputEventPanGesture" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      InputEventPanGesture(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): InputEventPanGesture = InputEventPanGesture(ptr)
    /**
     * Container for method_bind pointers for InputEventPanGesture
     */
    private object __method_bind {
      val get_delta: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventPanGesture".cstr.ptr,
              "get_delta".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_delta" }
            }
          }

      val set_delta: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventPanGesture".cstr.ptr,
              "set_delta".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_delta" }
            }
          }
    }
  }
}
