// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.PoolByteArray
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Any
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class GDScript(
  _handle: COpaquePointer
) : Script(_handle) {
  fun getAsByteCode(): PoolByteArray {
    val _ret = __method_bind.getAsByteCode.call(this._handle)
    return _ret.asPoolByteArray()
  }

  fun new(vararg varargs: Any?): Variant {
    val _args = VariantArray.new()
    varargs.forEach { _args.append(Variant.fromAny(it)) }
    val _ret = __method_bind.new.call(this._handle, _args.toVariant(), 0)
    return _ret
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
      val getAsByteCode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GDScript".cstr.ptr,
            "get_as_byte_code".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_as_byte_code" }
        }
      val new: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GDScript".cstr.ptr,
            "new".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method new" }
        }}
  }
}
