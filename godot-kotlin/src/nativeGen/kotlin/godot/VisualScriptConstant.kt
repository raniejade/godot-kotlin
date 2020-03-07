// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
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

open class VisualScriptConstant(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : VisualScriptNode(null) {
  var type: Variant.Type
    get() {
       return getConstantType() 
    }
    set(value) {
      setConstantType(value.value)
    }

  var value: Variant
    get() {
       return getConstantValue() 
    }
    set(value) {
      setConstantValue(value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  /**
   * Specialized setter for value
   */
  fun value(cb: Variant.() -> Unit) {
    val _p = value
    cb(_p)
    value = _p
  }

  fun getConstantType(): Variant.Type {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getConstantType.call(self._handle, emptyList(), _retPtr)
      Variant.Type.from(_ret.value)
    }
  }

  fun getConstantValue(): Variant {
    val self = this
    return Allocator.allocationScope {
      val _ret = Variant()
      val _retPtr = _ret._value.ptr
      __method_bind.getConstantValue.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun setConstantType(type: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setConstantType.call(self._handle, listOf(type), null)
    }
  }

  fun setConstantValue(value: Variant) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setConstantValue.call(self._handle, listOf(value), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualScriptConstant".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisualScriptConstant" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for VisualScriptConstant
     */
    private object __method_bind {
      val getConstantType: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptConstant".cstr.ptr,
              "get_constant_type".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_constant_type" }
            }
          }

      val getConstantValue: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptConstant".cstr.ptr,
              "get_constant_value".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_constant_value" }
            }
          }

      val setConstantType: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptConstant".cstr.ptr,
              "set_constant_type".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_constant_type" }
            }
          }

      val setConstantValue: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptConstant".cstr.ptr,
              "set_constant_value".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_constant_value" }
            }
          }
    }
  }
}
