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

open class VisualScriptLists(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : VisualScriptNode(null) {
  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun addInputDataPort(
    type: Int,
    name: String,
    index: Int
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(type)
      _args.add(name)
      _args.add(index)
      __method_bind.addInputDataPort.call(self._handle, _args, null)
    }
  }

  fun addOutputDataPort(
    type: Int,
    name: String,
    index: Int
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(type)
      _args.add(name)
      _args.add(index)
      __method_bind.addOutputDataPort.call(self._handle, _args, null)
    }
  }

  fun removeInputDataPort(index: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.removeInputDataPort.call(self._handle, listOf(index), null)
    }
  }

  fun removeOutputDataPort(index: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.removeOutputDataPort.call(self._handle, listOf(index), null)
    }
  }

  fun setInputDataPortName(index: Int, name: String) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(index)
      _args.add(name)
      __method_bind.setInputDataPortName.call(self._handle, _args, null)
    }
  }

  fun setInputDataPortType(index: Int, type: Int) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(index)
      _args.add(type)
      __method_bind.setInputDataPortType.call(self._handle, _args, null)
    }
  }

  fun setOutputDataPortName(index: Int, name: String) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(index)
      _args.add(name)
      __method_bind.setOutputDataPortName.call(self._handle, _args, null)
    }
  }

  fun setOutputDataPortType(index: Int, type: Int) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(index)
      _args.add(type)
      __method_bind.setOutputDataPortType.call(self._handle, _args, null)
    }
  }

  companion object {
    /**
     * Container for method_bind pointers for VisualScriptLists
     */
    private object __method_bind {
      val addInputDataPort: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptLists".cstr.ptr,
            "add_input_data_port".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_input_data_port" }
        }
      val addOutputDataPort: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptLists".cstr.ptr,
            "add_output_data_port".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_output_data_port" }
        }
      val removeInputDataPort: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptLists".cstr.ptr,
            "remove_input_data_port".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_input_data_port" }
        }
      val removeOutputDataPort: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptLists".cstr.ptr,
            "remove_output_data_port".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_output_data_port" }
        }
      val setInputDataPortName: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptLists".cstr.ptr,
            "set_input_data_port_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_input_data_port_name" }
        }
      val setInputDataPortType: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptLists".cstr.ptr,
            "set_input_data_port_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_input_data_port_type" }
        }
      val setOutputDataPortName: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptLists".cstr.ptr,
            "set_output_data_port_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_output_data_port_name" }
        }
      val setOutputDataPortType: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptLists".cstr.ptr,
            "set_output_data_port_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_output_data_port_type" }
        }}
  }
}
