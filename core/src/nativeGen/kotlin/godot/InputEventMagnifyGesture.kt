// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Float
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class InputEventMagnifyGesture(
  _handle: COpaquePointer
) : InputEventGesture(_handle) {
  var factor: Float
    get() {
       return getFactor() 
    }
    set(value) {
      setFactor(value)
    }

  fun getFactor(): Float {
    val _ret = __method_bind.getFactor.call(this._handle)
    return _ret.asFloat()
  }

  fun setFactor(factor: Float) {
    val _arg = Variant.new(factor)
    __method_bind.setFactor.call(this._handle, listOf(_arg))
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
      val getFactor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMagnifyGesture".cstr.ptr,
            "get_factor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_factor" }
        }
      val setFactor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMagnifyGesture".cstr.ptr,
            "set_factor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_factor" }
        }}
  }
}
