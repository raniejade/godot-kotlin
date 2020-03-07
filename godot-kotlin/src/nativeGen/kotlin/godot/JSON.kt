// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.reflect.KCallable
import kotlinx.cinterop.BooleanVar
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.COpaquePointerVar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.DoubleVar
import kotlinx.cinterop.IntVar
import kotlinx.cinterop.alloc
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.readValue
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.value

open class JSONInternal(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Object(null) {
  fun parse(json: String): JSONParseResult {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: JSONParseResult
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.parse.call(self._handle, listOf(json), _retPtr)
      _ret = objectToType<JSONParseResult>(_tmp.value!!)
      _ret
    }
  }

  fun print(
    value: Variant,
    indent: String = "",
    sortKeys: Boolean = false
  ): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      val _args = mutableListOf<Any?>()
      _args.add(value)
      _args.add(indent)
      _args.add(sortKeys)
      __method_bind.print.call(self._handle, _args, _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  companion object {
    /**
     * Container for method_bind pointers for JSON
     */
    private object __method_bind {
      val parse: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_JSON".cstr.ptr,
              "parse".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method parse" }
            }
          }

      val print: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_JSON".cstr.ptr,
              "print".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method print" }
            }
          }
    }
  }
}

object JSON : JSONInternal(null) {
  init {
    Allocator.allocationScope {
      val handle = checkNotNull(Godot.gdnative.godot_global_get_singleton)("JSON".cstr.ptr)
      requireNotNull(handle) { "No instance found for singleton JSON" }
      _handle = handle
    }
  }
}
