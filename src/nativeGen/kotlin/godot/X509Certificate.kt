// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.GDError
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class X509Certificate(
  _handle: COpaquePointer
) : Resource(_handle) {
  fun load(path: String): GDError {
    val _arg = Variant.new(path)
    val _ret = __method_bind.load.call(this._handle, listOf(_arg))
    return GDError.from(_ret.asInt())
  }

  fun save(path: String): GDError {
    val _arg = Variant.new(path)
    val _ret = __method_bind.save.call(this._handle, listOf(_arg))
    return GDError.from(_ret.asInt())
  }

  companion object {
    fun new(): X509Certificate = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("X509Certificate".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for X509Certificate" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      X509Certificate(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): X509Certificate = X509Certificate(ptr)
    /**
     * Container for method_bind pointers for X509Certificate
     */
    private object __method_bind {
      val load: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("X509Certificate".cstr.ptr,
            "load".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method load" }
        }
      val save: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("X509Certificate".cstr.ptr,
            "save".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method save" }
        }}
  }
}
