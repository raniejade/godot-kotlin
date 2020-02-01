// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Color
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Unit
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class ColorRect(
  _handle: COpaquePointer
) : Control(_handle) {
  var color: Color
    get() {
       return getFrameColor() 
    }
    set(value) {
      setFrameColor(value)
    }

  /**
   * Specialized setter for color
   */
  fun color(cb: Color.() -> Unit) {
    val _p = color
    cb(_p)
    color = _p
  }

  fun getFrameColor(): Color {
    val _ret = __method_bind.getFrameColor.call(this._handle)
    return _ret.asColor()
  }

  fun setFrameColor(color: Color) {
    val _arg = Variant.new(color)
    __method_bind.setFrameColor.call(this._handle, listOf(_arg))
  }

  companion object {
    fun new(): ColorRect = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("ColorRect".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for ColorRect" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      ColorRect(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): ColorRect = ColorRect(ptr)
    /**
     * Container for method_bind pointers for ColorRect
     */
    private object __method_bind {
      val getFrameColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorRect".cstr.ptr,
            "get_frame_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_frame_color" }
        }
      val setFrameColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ColorRect".cstr.ptr,
            "set_frame_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_frame_color" }
        }}
  }
}
