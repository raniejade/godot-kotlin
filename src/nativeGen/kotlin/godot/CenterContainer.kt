// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class CenterContainer(
  _handle: COpaquePointer
) : Container(_handle) {
  var useTopLeft: Boolean
    get() {
       return isUsingTopLeft() 
    }
    set(value) {
      setUseTopLeft(value)
    }

  fun isUsingTopLeft(): Boolean {
    val _ret = __method_bind.isUsingTopLeft.call(this._handle)
    return _ret.asBoolean()
  }

  fun setUseTopLeft(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setUseTopLeft.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): CenterContainer = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("CenterContainer".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for CenterContainer" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      CenterContainer(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): CenterContainer = CenterContainer(ptr)
    /**
     * Container for method_bind pointers for CenterContainer
     */
    private object __method_bind {
      val isUsingTopLeft: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CenterContainer".cstr.ptr,
            "isUsingTopLeft".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isUsingTopLeft" }
        }
      val setUseTopLeft: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CenterContainer".cstr.ptr,
            "setUseTopLeft".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setUseTopLeft" }
        }}
  }
}
