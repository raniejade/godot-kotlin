// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Color
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

open class CanvasModulate(
  _handle: COpaquePointer
) : Node2D(_handle) {
  var color: Color
    get() {
       return getColor() 
    }
    set(value) {
      setColor(value)
    }

  fun getColor(): Color {
    val _ret = __method_bind.getColor.call(this._handle)
    return _ret.asColor()
  }

  fun setColor(color: Color) {
    val _arg = Variant.new(color)
    __method_bind.setColor.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): CanvasModulate = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("CanvasModulate".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for CanvasModulate" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      CanvasModulate(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): CanvasModulate = CanvasModulate(ptr)
    /**
     * Container for method_bind pointers for CanvasModulate
     */
    private object __method_bind {
      val getColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasModulate".cstr.ptr,
            "getColor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getColor" }
        }
      val setColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasModulate".cstr.ptr,
            "setColor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setColor" }
        }}
  }
}
