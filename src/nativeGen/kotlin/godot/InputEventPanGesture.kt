// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import kotlin.Unit
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class InputEventPanGesture(
  _handle: COpaquePointer
) : InputEventGesture(_handle) {
  var delta: Vector2
    get() {
       return getDelta() 
    }
    set(value) {
      setDelta(value)
    }

  /**
   * Specialized setter for delta
   */
  fun delta(cb: Vector2.() -> Unit) {
    val _p = delta
    cb(_p)
    delta = _p
  }

  fun getDelta(): Vector2 {
    val _ret = __method_bind.getDelta.call(this._handle)
    return _ret.asVector2()
  }

  fun setDelta(delta: Vector2) {
    val _arg = Variant.new(delta)
    __method_bind.setDelta.call(this._handle, listOf(_arg))
  }

  companion object {
    fun new(): InputEventPanGesture = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("InputEventPanGesture".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for InputEventPanGesture" }
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
      val getDelta: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventPanGesture".cstr.ptr,
            "get_delta".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_delta" }
        }
      val setDelta: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventPanGesture".cstr.ptr,
            "set_delta".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_delta" }
        }}
  }
}
