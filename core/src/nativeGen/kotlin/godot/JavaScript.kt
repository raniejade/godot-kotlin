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

open class JavaScript(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Object(null) {
  fun eval(code: String, useGlobalExecutionContext: Boolean = false): Variant {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(code))
    _args.add(Variant.fromAny(useGlobalExecutionContext))
    val _ret = __method_bind.eval.call(this._handle, _args)
    return _ret
  }

  companion object {
    val Instance: JavaScript
      get() = memScoped {
        val handle = checkNotNull(Godot.gdnative.godot_global_get_singleton)("JavaScript".cstr.ptr)
        requireNotNull(handle) { "No instance found for singleton JavaScript" }
        val ret = JavaScript(null)
        ret._handle = handle
        ret
      }
    /**
     * Container for method_bind pointers for JavaScript
     */
    private object __method_bind {
      val eval: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("JavaScript".cstr.ptr,
            "eval".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method eval" }
        }}
  }
}
