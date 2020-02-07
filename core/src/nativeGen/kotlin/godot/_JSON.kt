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

open class _JSONInternal(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Object(null) {
  fun parse(json: String): JSONParseResult {
    val _arg = Variant(json)
    val _ret = __method_bind.parse.call(this._handle, listOf(_arg))
    return _ret.asObject(::JSONParseResult)!!
  }

  fun print(
    value: Variant,
    indent: String = "",
    sortKeys: Boolean = false
  ): String {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(value))
    _args.add(Variant.fromAny(indent))
    _args.add(Variant.fromAny(sortKeys))
    val _ret = __method_bind.print.call(this._handle, _args)
    return _ret.asString()
  }

  companion object {
    /**
     * Container for method_bind pointers for _JSON
     */
    private object __method_bind {
      val parse: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_JSON".cstr.ptr,
            "parse".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method parse" }
        }
      val print: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_JSON".cstr.ptr,
            "print".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method print" }
        }}
  }
}

object _JSON : _JSONInternal(null) {
  init {
    memScoped {
      val handle = checkNotNull(Godot.gdnative.godot_global_get_singleton)("_JSON".cstr.ptr)
      requireNotNull(handle) { "No instance found for singleton _JSON" }
      _handle = handle
    }
  }
}
