// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector3
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class BoxShape internal constructor(
  _handle: COpaquePointer
) : Shape(_handle) {
  fun getExtents(): Vector3 {
    val _ret = __method_bind.get_extents.call(this.toVariant())
    return _ret.asVector3()
  }

  fun setExtents(extents: Vector3) {
    val _args = VariantArray.new()
    _args.append(extents)
    __method_bind.set_extents.call(this.toVariant(), _args.toVariant(), 1)
  }

  companion object {
    fun new(): BoxShape = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("BoxShape".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton BoxShape" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      BoxShape(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): BoxShape = BoxShape(ptr)
    /**
     * Container for method_bind pointers for BoxShape
     */
    private object __method_bind {
      val get_extents: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BoxShape".cstr.ptr,
              "get_extents".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_extents" }
            }
          }

      val set_extents: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BoxShape".cstr.ptr,
              "set_extents".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_extents" }
            }
          }
    }
  }
}
