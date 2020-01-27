// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class YSort internal constructor(
  _handle: COpaquePointer
) : Node2D(_handle) {
  fun isSortEnabled(): Boolean {
    val _ret = __method_bind.is_sort_enabled.call(this.toVariant())
    return _ret.asBool()
  }

  fun setSortEnabled(enabled: Boolean) {
    val _args = VariantArray.new()
    _args.append(enabled)
    __method_bind.set_sort_enabled.call(this.toVariant(), _args.toVariant(), 1)
  }

  companion object {
    fun new(): YSort = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("YSort".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton YSort" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      YSort(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): YSort = YSort(ptr)
    /**
     * Container for method_bind pointers for YSort
     */
    private object __method_bind {
      val is_sort_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("YSort".cstr.ptr,
              "is_sort_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_sort_enabled" }
            }
          }

      val set_sort_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("YSort".cstr.ptr,
              "set_sort_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_sort_enabled" }
            }
          }
    }
  }
}
