// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class ButtonGroup(
  _handle: COpaquePointer
) : Resource(_handle) {
  fun getButtons(): VariantArray {
    val _ret = __method_bind.getButtons.call(this._handle)
    return _ret.asVariantArray()
  }

  fun getPressedButton(): BaseButton {
    val _ret = __method_bind.getPressedButton.call(this._handle)
    return _ret.asObject(::BaseButton)!!
  }

  companion object {
    fun new(): ButtonGroup = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("ButtonGroup".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for ButtonGroup" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      ButtonGroup(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): ButtonGroup = ButtonGroup(ptr)
    /**
     * Container for method_bind pointers for ButtonGroup
     */
    private object __method_bind {
      val getButtons: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ButtonGroup".cstr.ptr,
            "get_buttons".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_buttons" }
        }
      val getPressedButton: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ButtonGroup".cstr.ptr,
            "get_pressed_button".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_pressed_button" }
        }}
  }
}
