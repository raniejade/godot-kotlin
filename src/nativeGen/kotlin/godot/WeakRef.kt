// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class WeakRef(
  _handle: COpaquePointer
) : Reference(_handle) {
  fun getRef(): Variant {
    val _ret = __method_bind.getRef.call(this._handle)
    return _ret
  }

  companion object {
    fun new(): WeakRef = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("WeakRef".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for WeakRef" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      WeakRef(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): WeakRef = WeakRef(ptr)
    /**
     * Container for method_bind pointers for WeakRef
     */
    private object __method_bind {
      val getRef: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("WeakRef".cstr.ptr,
            "getRef".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getRef" }
        }}
  }
}
