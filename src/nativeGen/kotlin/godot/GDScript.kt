// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.PoolByteArray
import godot.core.Variant
import godot.core.VariantArray
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class GDScript internal constructor(
  _handle: COpaquePointer
) : Script(_handle) {
  fun getAsByteCode(): PoolByteArray {
    val _ret = __method_bind.get_as_byte_code.call(this.toVariant())
    return _ret.asPoolByteArray()
  }

  fun new(): Object {
    val _ret = __method_bind.new.call(this.toVariant())
    return _ret.asObject(::Object)!!
  }

  companion object {
    fun new(): GDScript = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("GDScript".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for GDScript" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      GDScript(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): GDScript = GDScript(ptr)
    /**
     * Container for method_bind pointers for GDScript
     */
    private object __method_bind {
      val get_as_byte_code: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GDScript".cstr.ptr,
              "get_as_byte_code".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_as_byte_code" }
            }
          }

      val new: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GDScript".cstr.ptr,
              "new".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method new" }
            }
          }
    }
  }
}
