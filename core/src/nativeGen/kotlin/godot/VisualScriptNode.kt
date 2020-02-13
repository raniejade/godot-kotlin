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

open class VisualScriptNode(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Resource(null) {
  /**
   * VisualScriptNode::ports_changed signal
   */
  val signalPortsChanged: Signal0 = Signal0("ports_changed")

  internal constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  open fun _get_default_input_values(): VariantArray {
    TODO()
  }

  open fun _set_default_input_values(values: VariantArray) {
    TODO()
  }

  fun getDefaultInputValue(portIdx: Int): Variant {
    val self = this
    return Allocator.allocationScope {
      val _ret = Variant()
      val _retPtr = _ret._value.ptr
      __method_bind.getDefaultInputValue.call(self._handle, listOf(portIdx), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getVisualScript(): VisualScript {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: VisualScript
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getVisualScript.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<VisualScript>(_tmp.value!!)
      _ret
    }
  }

  fun portsChangedNotify() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.portsChangedNotify.call(self._handle, emptyList(), null)
    }
  }

  fun setDefaultInputValue(portIdx: Int, value: Variant) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(portIdx)
      _args.add(value)
      __method_bind.setDefaultInputValue.call(self._handle, _args, null)
    }
  }

  companion object {
    /**
     * Container for method_bind pointers for VisualScriptNode
     */
    private object __method_bind {
      val getDefaultInputValue: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptNode".cstr.ptr,
            "get_default_input_value".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_default_input_value" }
        }
      val getVisualScript: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptNode".cstr.ptr,
            "get_visual_script".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_visual_script" }
        }
      val portsChangedNotify: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptNode".cstr.ptr,
            "ports_changed_notify".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method ports_changed_notify" }
        }
      val setDefaultInputValue: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptNode".cstr.ptr,
            "set_default_input_value".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_default_input_value" }
        }}
  }
}
