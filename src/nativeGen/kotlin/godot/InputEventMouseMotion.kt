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

open class InputEventMouseMotion internal constructor(
  _handle: COpaquePointer
) : InputEventMouse(_handle) {
  fun getRelative(): Vector2 {
    val _ret = __method_bind.get_relative.call(this.toVariant())
    return _ret.asVector2()
  }

  fun getSpeed(): Vector2 {
    val _ret = __method_bind.get_speed.call(this.toVariant())
    return _ret.asVector2()
  }

  fun setRelative(relative: Vector2) {
    val _arg = Variant.new(relative)
    __method_bind.set_relative.call(this.toVariant(), _arg, 1)
  }

  fun setSpeed(speed: Vector2) {
    val _arg = Variant.new(speed)
    __method_bind.set_speed.call(this.toVariant(), _arg, 1)
  }

  companion object {
    fun new(): InputEventMouseMotion = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("InputEventMouseMotion".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for InputEventMouseMotion" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      InputEventMouseMotion(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): InputEventMouseMotion = InputEventMouseMotion(ptr)
    /**
     * Container for method_bind pointers for InputEventMouseMotion
     */
    private object __method_bind {
      val get_relative: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMouseMotion".cstr.ptr,
            "get_relative".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_relative" }
        }
      val get_speed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMouseMotion".cstr.ptr,
            "get_speed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_speed" }
        }
      val set_relative: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMouseMotion".cstr.ptr,
            "set_relative".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_relative" }
        }
      val set_speed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMouseMotion".cstr.ptr,
            "set_speed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_speed" }
        }}
  }
}
