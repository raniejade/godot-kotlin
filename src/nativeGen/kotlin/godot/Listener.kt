// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Transform
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class Listener internal constructor(
  _handle: COpaquePointer
) : Spatial(_handle) {
  fun clearCurrent() {
    __method_bind.clear_current.call(this.toVariant())
  }

  fun getListenerTransform(): Transform {
    val _ret = __method_bind.get_listener_transform.call(this.toVariant())
    return _ret.asTransform()
  }

  fun isCurrent(): Boolean {
    val _ret = __method_bind.is_current.call(this.toVariant())
    return _ret.asBool()
  }

  fun makeCurrent() {
    __method_bind.make_current.call(this.toVariant())
  }

  companion object {
    fun new(): Listener = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Listener".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton Listener" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Listener(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): Listener = Listener(ptr)
    /**
     * Container for method_bind pointers for Listener
     */
    private object __method_bind {
      val clear_current: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Listener".cstr.ptr,
              "clear_current".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clear_current" }
            }
          }

      val get_listener_transform: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Listener".cstr.ptr,
              "get_listener_transform".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_listener_transform" }
            }
          }

      val is_current: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Listener".cstr.ptr,
              "is_current".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_current" }
            }
          }

      val make_current: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Listener".cstr.ptr,
              "make_current".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method make_current" }
            }
          }
    }
  }
}
