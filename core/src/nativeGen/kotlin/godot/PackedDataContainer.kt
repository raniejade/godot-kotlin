// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.GDError
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Int
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

open class PackedDataContainer(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Resource(null) {
  constructor() : this(null) {
    _handle = __new()
  }

  fun pack(value: Variant): GDError {
    val _arg = Variant(value)
    val _ret = __method_bind.pack.call(this._handle, listOf(_arg))
    return GDError.from(_ret.asInt())
  }

  fun size(): Int {
    val _ret = __method_bind.size.call(this._handle)
    return _ret.asInt()
  }

  companion object {
    internal fun __new(): COpaquePointer = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("PackedDataContainer".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for PackedDataContainer" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for PackedDataContainer
     */
    private object __method_bind {
      val pack: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PackedDataContainer".cstr.ptr,
            "pack".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method pack" }
        }
      val size: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PackedDataContainer".cstr.ptr,
            "size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method size" }
        }}
  }
}
