// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.RID
import godot.core.Variant
import godot.core.VariantArray
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class World(
  _handle: COpaquePointer
) : Resource(_handle) {
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

  fun getDirectSpaceState(): PhysicsDirectSpaceState {
    val _ret = __method_bind.getDirectSpaceState.call(this._handle)
    return _ret.asObject(::PhysicsDirectSpaceState)!!
  }

  fun getEnvironment(): Environment {
    val _ret = __method_bind.getEnvironment.call(this._handle)
    return _ret.asObject(::Environment)!!
  }

  fun getFallbackEnvironment(): Environment {
    val _ret = __method_bind.getFallbackEnvironment.call(this._handle)
    return _ret.asObject(::Environment)!!
  }

  fun getScenario(): RID {
    val _ret = __method_bind.getScenario.call(this._handle)
    return _ret.asRID()
  }

  fun getSpace(): RID {
    val _ret = __method_bind.getSpace.call(this._handle)
    return _ret.asRID()
  }

  fun setEnvironment(env: Environment) {
    val _arg = Variant.new(env)
    __method_bind.setEnvironment.call(this._handle, listOf(_arg))
  }

  fun setFallbackEnvironment(env: Environment) {
    val _arg = Variant.new(env)
    __method_bind.setFallbackEnvironment.call(this._handle, listOf(_arg))
  }

  companion object {
    fun new(): World = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("World".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for World" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      World(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): World = World(ptr)
    /**
     * Container for method_bind pointers for World
     */
    private object __method_bind {
      val getDirectSpaceState: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("World".cstr.ptr,
            "get_direct_space_state".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_direct_space_state" }
        }
      val getEnvironment: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("World".cstr.ptr,
            "get_environment".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_environment" }
        }
      val getFallbackEnvironment: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("World".cstr.ptr,
            "get_fallback_environment".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_fallback_environment" }
        }
      val getScenario: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("World".cstr.ptr,
            "get_scenario".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_scenario" }
        }
      val getSpace: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("World".cstr.ptr,
            "get_space".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_space" }
        }
      val setEnvironment: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("World".cstr.ptr,
            "set_environment".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_environment" }
        }
      val setFallbackEnvironment: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("World".cstr.ptr,
            "set_fallback_environment".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_fallback_environment" }
        }}
  }
}
