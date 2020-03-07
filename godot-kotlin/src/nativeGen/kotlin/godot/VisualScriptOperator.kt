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

open class VisualScriptOperator(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : VisualScriptNode(null) {
  var operator: Variant.Operator
    get() {
       return getOperator() 
    }
    set(value) {
      setOperator(value.value)
    }

  var type: Variant.Type
    get() {
       return getTyped() 
    }
    set(value) {
      setTyped(value.value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getOperator(): Variant.Operator {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getOperator.call(self._handle, emptyList(), _retPtr)
      Variant.Operator.from(_ret.value)
    }
  }

  fun getTyped(): Variant.Type {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getTyped.call(self._handle, emptyList(), _retPtr)
      Variant.Type.from(_ret.value)
    }
  }

  fun setOperator(op: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setOperator.call(self._handle, listOf(op), null)
    }
  }

  fun setTyped(type: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setTyped.call(self._handle, listOf(type), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualScriptOperator".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisualScriptOperator" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for VisualScriptOperator
     */
    private object __method_bind {
      val getOperator: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptOperator".cstr.ptr,
              "get_operator".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_operator" }
            }
          }

      val getTyped: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptOperator".cstr.ptr,
              "get_typed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_typed" }
            }
          }

      val setOperator: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptOperator".cstr.ptr,
              "set_operator".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_operator" }
            }
          }

      val setTyped: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptOperator".cstr.ptr,
              "set_typed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_typed" }
            }
          }
    }
  }
}
