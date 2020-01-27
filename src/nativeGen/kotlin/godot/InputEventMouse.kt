// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class InputEventMouse internal constructor(
  _handle: COpaquePointer
) : InputEventWithModifiers(_handle) {
  fun getButtonMask(): Int {
    val _ret = __method_bind.get_button_mask.call(this.toVariant())
    return _ret.asInt()
  }

  fun getGlobalPosition(): Vector2 {
    val _ret = __method_bind.get_global_position.call(this.toVariant())
    return _ret.asVector2()
  }

  fun getPosition(): Vector2 {
    val _ret = __method_bind.get_position.call(this.toVariant())
    return _ret.asVector2()
  }

  fun setButtonMask(buttonMask: Int) {
    val _args = VariantArray.new()
    _args.append(buttonMask)
    __method_bind.set_button_mask.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setGlobalPosition(globalPosition: Vector2) {
    val _args = VariantArray.new()
    _args.append(globalPosition)
    __method_bind.set_global_position.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setPosition(position: Vector2) {
    val _args = VariantArray.new()
    _args.append(position)
    __method_bind.set_position.call(this.toVariant(), _args.toVariant(), 1)
  }

  companion object {
    /**
     * Container for method_bind pointers for InputEventMouse
     */
    private object __method_bind {
      val get_button_mask: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMouse".cstr.ptr,
              "get_button_mask".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_button_mask" }
            }
          }

      val get_global_position: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMouse".cstr.ptr,
              "get_global_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_global_position" }
            }
          }

      val get_position: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMouse".cstr.ptr,
              "get_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_position" }
            }
          }

      val set_button_mask: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMouse".cstr.ptr,
              "set_button_mask".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_button_mask" }
            }
          }

      val set_global_position: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMouse".cstr.ptr,
              "set_global_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_global_position" }
            }
          }

      val set_position: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMouse".cstr.ptr,
              "set_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_position" }
            }
          }
    }
  }
}
