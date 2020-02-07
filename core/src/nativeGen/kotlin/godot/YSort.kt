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

open class YSort(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Node2D(null) {
  var sortEnabled: Boolean
    get() {
       return isSortEnabled() 
    }
    set(value) {
      setSortEnabled(value)
    }

  constructor() : this(null) {
    _handle = __new()
  }

  fun isSortEnabled(): Boolean {
    val _ret = __method_bind.isSortEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun setSortEnabled(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setSortEnabled.call(this._handle, listOf(_arg))
  }

  companion object {
    internal fun __new(): COpaquePointer = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("YSort".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for YSort" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for YSort
     */
    private object __method_bind {
      val isSortEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("YSort".cstr.ptr,
            "is_sort_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_sort_enabled" }
        }
      val setSortEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("YSort".cstr.ptr,
            "set_sort_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_sort_enabled" }
        }}
  }
}
