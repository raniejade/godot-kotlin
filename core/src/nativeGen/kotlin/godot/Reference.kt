// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
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

open class Reference(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Object(null) {
  constructor() : this(null) {
    _handle = __new()
  }

  fun initRef(): Boolean {
    val _ret = __method_bind.initRef.call(this._handle)
    return _ret.asBoolean()
  }

  fun reference(): Boolean {
    val _ret = __method_bind.reference.call(this._handle)
    return _ret.asBoolean()
  }

  fun unreference(): Boolean {
    val _ret = __method_bind.unreference.call(this._handle)
    return _ret.asBoolean()
  }

  companion object {
    internal fun __new(): COpaquePointer = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Reference".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for Reference" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for Reference
     */
    private object __method_bind {
      val initRef: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Reference".cstr.ptr,
            "init_ref".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method init_ref" }
        }
      val reference: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Reference".cstr.ptr,
            "reference".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method reference" }
        }
      val unreference: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Reference".cstr.ptr,
            "unreference".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method unreference" }
        }}
  }
}
