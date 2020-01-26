// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import kotlin.Boolean
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class _JSON internal constructor(
  _handle: COpaquePointer
) : Object(_handle) {
  fun parse(json: String): JSONParseResult {
    TODO()
  }

  fun print(
    value: Variant,
    indent: String,
    sort_keys: Boolean
  ): String {
    TODO()
  }

  companion object {
    val Instance: _JSON = memScoped {
          val handle = checkNotNull(Godot.gdnative.godot_global_get_singleton)("_JSON".cstr.ptr)
          requireNotNull(handle) { "No instance found for singleton _JSON" }
          _JSON(
            handle
          )
        }

    /**
     * Container for method_bind pointers for _JSON
     */
    private object __method_bind {
      val parse: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_JSON".cstr.ptr,
              "parse".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method parse" }
            }
          }

      val print: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_JSON".cstr.ptr,
              "print".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method print" }
            }
          }
    }
  }
}
