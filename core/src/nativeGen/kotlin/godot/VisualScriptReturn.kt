// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
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

open class VisualScriptReturn(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : VisualScriptNode(null) {
  var returnEnabled: Boolean
    get() {
       return isReturnValueEnabled() 
    }
    set(value) {
      setEnableReturnValue(value)
    }

  var returnType: Variant.Type
    get() {
       return getReturnType() 
    }
    set(value) {
      setReturnType(value.value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getReturnType(): Variant.Type {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getReturnType.call(self._handle, emptyList(), _retPtr)
      Variant.Type.from(_ret.value)
    }
  }

  fun isReturnValueEnabled(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isReturnValueEnabled.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun setEnableReturnValue(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setEnableReturnValue.call(self._handle, listOf(enable), null)
    }
  }

  fun setReturnType(type: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setReturnType.call(self._handle, listOf(type), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualScriptReturn".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisualScriptReturn" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for VisualScriptReturn
     */
    private object __method_bind {
      val getReturnType: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptReturn".cstr.ptr,
            "get_return_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_return_type" }
        }
      val isReturnValueEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptReturn".cstr.ptr,
            "is_return_value_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_return_value_enabled" }
        }
      val setEnableReturnValue: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptReturn".cstr.ptr,
            "set_enable_return_value".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_enable_return_value" }
        }
      val setReturnType: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptReturn".cstr.ptr,
            "set_return_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_return_type" }
        }}
  }
}
