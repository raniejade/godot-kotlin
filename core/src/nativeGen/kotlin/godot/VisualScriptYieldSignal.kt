// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.NodePath
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

open class VisualScriptYieldSignal(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : VisualScriptNode(null) {
  var baseType: String
    get() {
       return getBaseType() 
    }
    set(value) {
      setBaseType(value)
    }

  var callMode: CallMode
    get() {
       return getCallMode() 
    }
    set(value) {
      setCallMode(value.value)
    }

  var nodePath: NodePath
    get() {
       return getBasePath() 
    }
    set(value) {
      setBasePath(value)
    }

  var signal: String
    get() {
       return getSignal() 
    }
    set(value) {
      setSignal(value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  /**
   * Specialized setter for nodePath
   */
  fun nodePath(cb: NodePath.() -> Unit) {
    val _p = nodePath
    cb(_p)
    nodePath = _p
  }

  fun getBasePath(): NodePath {
    val self = this
    return Allocator.allocationScope {
      val _ret = NodePath()
      val _retPtr = _ret._value.ptr
      __method_bind.getBasePath.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getBaseType(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getBaseType.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getCallMode(): CallMode {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getCallMode.call(self._handle, emptyList(), _retPtr)
      VisualScriptYieldSignal.CallMode.from(_ret.value)
    }
  }

  fun getSignal(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getSignal.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun setBasePath(basePath: NodePath) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setBasePath.call(self._handle, listOf(basePath), null)
    }
  }

  fun setBaseType(baseType: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setBaseType.call(self._handle, listOf(baseType), null)
    }
  }

  fun setCallMode(mode: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setCallMode.call(self._handle, listOf(mode), null)
    }
  }

  fun setSignal(signal: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSignal.call(self._handle, listOf(signal), null)
    }
  }

  enum class CallMode(
    val value: Int
  ) {
    SELF(0),

    NODE_PATH(1),

    INSTANCE(2);

    companion object {
      fun from(value: Int): CallMode {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualScriptYieldSignal".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisualScriptYieldSignal" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for VisualScriptYieldSignal
     */
    private object __method_bind {
      val getBasePath: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptYieldSignal".cstr.ptr,
            "get_base_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_base_path" }
        }
      val getBaseType: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptYieldSignal".cstr.ptr,
            "get_base_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_base_type" }
        }
      val getCallMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptYieldSignal".cstr.ptr,
            "get_call_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_call_mode" }
        }
      val getSignal: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptYieldSignal".cstr.ptr,
            "get_signal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_signal" }
        }
      val setBasePath: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptYieldSignal".cstr.ptr,
            "set_base_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_base_path" }
        }
      val setBaseType: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptYieldSignal".cstr.ptr,
            "set_base_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_base_type" }
        }
      val setCallMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptYieldSignal".cstr.ptr,
            "set_call_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_call_mode" }
        }
      val setSignal: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualScriptYieldSignal".cstr.ptr,
            "set_signal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_signal" }
        }}
  }
}
