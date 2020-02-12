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

open class VisualScriptGlobalConstant(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : VisualScriptNode(null) {
  var constant: Int
    get() {
       return getGlobalConstant() 
    }
    set(value) {
      setGlobalConstant(value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getGlobalConstant(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getGlobalConstant.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun setGlobalConstant(index: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setGlobalConstant.call(self._handle, listOf(index), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualScriptGlobalConstant".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisualScriptGlobalConstant" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for VisualScriptGlobalConstant
     */
    private object __method_bind {
      val getGlobalConstant: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptGlobalConstant".cstr.ptr,
            "get_global_constant".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_global_constant" }
        }
      val setGlobalConstant: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptGlobalConstant".cstr.ptr,
            "set_global_constant".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_global_constant" }
        }}
  }
}
