// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Float
import kotlin.String
import kotlin.Suppress
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class InputEventMagnifyGesture(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : InputEventGesture(null) {
  var factor: Float
    get() {
       return getFactor() 
    }
    set(value) {
      setFactor(value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getFactor(): Float {
    val _ret = __method_bind.getFactor.call(this._handle)
    return _ret.asFloat()
  }

  fun setFactor(factor: Float) {
    val _arg = Variant(factor)
    __method_bind.setFactor.call(this._handle, listOf(_arg))
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("InputEventMagnifyGesture".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for InputEventMagnifyGesture" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for InputEventMagnifyGesture
     */
    private object __method_bind {
      val getFactor: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMagnifyGesture".cstr.ptr,
            "get_factor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_factor" }
        }
      val setFactor: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("InputEventMagnifyGesture".cstr.ptr,
            "set_factor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_factor" }
        }}
  }
}
