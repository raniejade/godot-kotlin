// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Dictionary
import godot.core.GDError
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

open class Script(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Resource(null) {
  var sourceCode: String
    get() {
       return getSourceCode() 
    }
    set(value) {
      setSourceCode(value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun canInstance(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.canInstance.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getBaseScript(): Script {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Script
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getBaseScript.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<Script>(_tmp.value!!)
      _ret
    }
  }

  fun getInstanceBaseType(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getInstanceBaseType.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getPropertyDefaultValue(property: String): Variant {
    val self = this
    return Allocator.allocationScope {
      val _ret = Variant()
      val _retPtr = _ret._value.ptr
      __method_bind.getPropertyDefaultValue.call(self._handle, listOf(property), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getScriptConstantMap(): Dictionary {
    val self = this
    return Allocator.allocationScope {
      val _ret = Dictionary()
      val _retPtr = _ret._value.ptr
      __method_bind.getScriptConstantMap.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getScriptMethodList(): VariantArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = VariantArray()
      val _retPtr = _ret._value.ptr
      __method_bind.getScriptMethodList.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getScriptPropertyList(): VariantArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = VariantArray()
      val _retPtr = _ret._value.ptr
      __method_bind.getScriptPropertyList.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getScriptSignalList(): VariantArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = VariantArray()
      val _retPtr = _ret._value.ptr
      __method_bind.getScriptSignalList.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getSourceCode(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getSourceCode.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun hasScriptSignal(signalName: String): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.hasScriptSignal.call(self._handle, listOf(signalName), _retPtr)
      _ret.value
    }
  }

  fun hasSourceCode(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.hasSourceCode.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun instanceHas(baseObject: Object): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.instanceHas.call(self._handle, listOf(baseObject), _retPtr)
      _ret.value
    }
  }

  fun isTool(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isTool.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun reload(keepState: Boolean = false): GDError {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.reload.call(self._handle, listOf(keepState), _retPtr)
      GDError.from(_ret.value)
    }
  }

  fun setSourceCode(source: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSourceCode.call(self._handle, listOf(source), null)
    }
  }

  companion object {
    /**
     * Container for method_bind pointers for Script
     */
    private object __method_bind {
      val canInstance: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Script".cstr.ptr,
            "can_instance".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method can_instance" }
        }
      val getBaseScript: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Script".cstr.ptr,
            "get_base_script".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_base_script" }
        }
      val getInstanceBaseType: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Script".cstr.ptr,
            "get_instance_base_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_instance_base_type" }
        }
      val getPropertyDefaultValue: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Script".cstr.ptr,
            "get_property_default_value".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_property_default_value" }
        }
      val getScriptConstantMap: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Script".cstr.ptr,
            "get_script_constant_map".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_script_constant_map" }
        }
      val getScriptMethodList: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Script".cstr.ptr,
            "get_script_method_list".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_script_method_list" }
        }
      val getScriptPropertyList: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Script".cstr.ptr,
            "get_script_property_list".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_script_property_list" }
        }
      val getScriptSignalList: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Script".cstr.ptr,
            "get_script_signal_list".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_script_signal_list" }
        }
      val getSourceCode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Script".cstr.ptr,
            "get_source_code".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_source_code" }
        }
      val hasScriptSignal: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Script".cstr.ptr,
            "has_script_signal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_script_signal" }
        }
      val hasSourceCode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Script".cstr.ptr,
            "has_source_code".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_source_code" }
        }
      val instanceHas: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Script".cstr.ptr,
            "instance_has".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method instance_has" }
        }
      val isTool: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Script".cstr.ptr,
            "is_tool".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_tool" }
        }
      val reload: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Script".cstr.ptr,
            "reload".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method reload" }
        }
      val setSourceCode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Script".cstr.ptr,
            "set_source_code".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_source_code" }
        }}
  }
}
