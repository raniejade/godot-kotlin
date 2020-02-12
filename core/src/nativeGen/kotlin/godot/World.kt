// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.RID
import godot.core.Variant
import godot.core.VariantArray
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

open class World(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Resource(null) {
  val directSpaceState: PhysicsDirectSpaceState
    get() {
       return getDirectSpaceState() 
    }

  var environment: Environment
    get() {
       return getEnvironment() 
    }
    set(value) {
      setEnvironment(value)
    }

  var fallbackEnvironment: Environment
    get() {
       return getFallbackEnvironment() 
    }
    set(value) {
      setFallbackEnvironment(value)
    }

  val scenario: RID
    get() {
       return getScenario() 
    }

  val space: RID
    get() {
       return getSpace() 
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getDirectSpaceState(): PhysicsDirectSpaceState {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: PhysicsDirectSpaceState
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getDirectSpaceState.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<PhysicsDirectSpaceState>(_tmp.value!!)
      _ret
    }
  }

  fun getEnvironment(): Environment {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Environment
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getEnvironment.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<Environment>(_tmp.value!!)
      _ret
    }
  }

  fun getFallbackEnvironment(): Environment {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Environment
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getFallbackEnvironment.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<Environment>(_tmp.value!!)
      _ret
    }
  }

  fun getScenario(): RID {
    val self = this
    return Allocator.allocationScope {
      val _ret = RID()
      val _retPtr = _ret._value.ptr
      __method_bind.getScenario.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getSpace(): RID {
    val self = this
    return Allocator.allocationScope {
      val _ret = RID()
      val _retPtr = _ret._value.ptr
      __method_bind.getSpace.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun setEnvironment(env: Environment) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setEnvironment.call(self._handle, listOf(env), null)
    }
  }

  fun setFallbackEnvironment(env: Environment) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setFallbackEnvironment.call(self._handle, listOf(env), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("World".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for World" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for World
     */
    private object __method_bind {
      val getDirectSpaceState: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("World".cstr.ptr,
            "get_direct_space_state".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_direct_space_state" }
        }
      val getEnvironment: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("World".cstr.ptr,
            "get_environment".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_environment" }
        }
      val getFallbackEnvironment: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("World".cstr.ptr,
            "get_fallback_environment".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_fallback_environment" }
        }
      val getScenario: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("World".cstr.ptr,
            "get_scenario".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_scenario" }
        }
      val getSpace: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("World".cstr.ptr,
            "get_space".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_space" }
        }
      val setEnvironment: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("World".cstr.ptr,
            "set_environment".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_environment" }
        }
      val setFallbackEnvironment: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("World".cstr.ptr,
            "set_fallback_environment".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_fallback_environment" }
        }}
  }
}
