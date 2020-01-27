// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Float
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class SphereShape internal constructor(
  _handle: COpaquePointer
) : Shape(_handle) {
  fun getRadius(): Float {
    val _ret = __method_bind.get_radius.call(this.toVariant())
    TODO()
  }

  fun setRadius(radius: Float) {
    val _args = VariantArray.new()
    _args.append(radius)
    val _ret = __method_bind.set_radius.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  companion object {
    fun new(): SphereShape = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("SphereShape".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton SphereShape" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      SphereShape(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): SphereShape = SphereShape(ptr)
    /**
     * Container for method_bind pointers for SphereShape
     */
    private object __method_bind {
      val get_radius: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SphereShape".cstr.ptr,
              "get_radius".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_radius" }
            }
          }

      val set_radius: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SphereShape".cstr.ptr,
              "set_radius".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_radius" }
            }
          }
    }
  }
}
