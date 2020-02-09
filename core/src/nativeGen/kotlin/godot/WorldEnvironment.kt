// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.String
import kotlin.Suppress
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class WorldEnvironment(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Node(null) {
  var environment: Environment
    get() {
       return getEnvironment() 
    }
    set(value) {
      setEnvironment(value)
    }

  constructor() : this(null) {
    _handle = __new()
  }

  fun getEnvironment(): Environment {
    val _ret = __method_bind.getEnvironment.call(this._handle)
    return _ret.toAny() as Environment
  }

  fun setEnvironment(env: Environment) {
    val _arg = Variant(env)
    __method_bind.setEnvironment.call(this._handle, listOf(_arg))
  }

  companion object {
    internal fun __new(): COpaquePointer = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("WorldEnvironment".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for WorldEnvironment" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for WorldEnvironment
     */
    private object __method_bind {
      val getEnvironment: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WorldEnvironment".cstr.ptr,
            "get_environment".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_environment" }
        }
      val setEnvironment: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WorldEnvironment".cstr.ptr,
            "set_environment".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_environment" }
        }}
  }
}
