// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.reflect.KCallable
import kotlinx.cinterop.BooleanVar
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.COpaquePointerVar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.DoubleVar
import kotlinx.cinterop.IntVar
import kotlinx.cinterop.alloc
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.readValue
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.value

open class VisualShaderNodeBooleanConstant(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : VisualShaderNode(null) {
  var constant: Boolean
    get() {
       return getConstant() 
    }
    set(value) {
      setConstant(value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getConstant(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getConstant.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun setConstant(value: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setConstant.call(self._handle, listOf(value), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualShaderNodeBooleanConstant".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisualShaderNodeBooleanConstant" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for VisualShaderNodeBooleanConstant
     */
    private object __method_bind {
      val getConstant: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeBooleanConstant".cstr.ptr,
            "get_constant".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_constant" }
        }
      val setConstant: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeBooleanConstant".cstr.ptr,
            "set_constant".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_constant" }
        }}
  }
}
