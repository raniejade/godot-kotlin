// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Transform
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
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

open class Listener(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Spatial(null) {
  constructor() : this(null) {
    _handle = __new()
  }

  fun clearCurrent() {
    __method_bind.clearCurrent.call(this._handle)
  }

  fun getListenerTransform(): Transform {
    val _ret = __method_bind.getListenerTransform.call(this._handle)
    return _ret.asTransform()
  }

  fun isCurrent(): Boolean {
    val _ret = __method_bind.isCurrent.call(this._handle)
    return _ret.asBoolean()
  }

  fun makeCurrent() {
    __method_bind.makeCurrent.call(this._handle)
  }

  companion object {
    internal fun __new(): COpaquePointer = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Listener".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for Listener" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for Listener
     */
    private object __method_bind {
      val clearCurrent: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Listener".cstr.ptr,
            "clear_current".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear_current" }
        }
      val getListenerTransform: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Listener".cstr.ptr,
            "get_listener_transform".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_listener_transform" }
        }
      val isCurrent: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Listener".cstr.ptr,
            "is_current".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_current" }
        }
      val makeCurrent: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Listener".cstr.ptr,
            "make_current".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method make_current" }
        }}
  }
}
