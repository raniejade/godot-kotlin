// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class RectangleShape2D internal constructor(
  _handle: COpaquePointer
) : Shape2D(_handle) {
  fun getExtents(): Vector2 {
    val _ret = __method_bind.get_extents.call(this.toVariant())
    return _ret.asVector2()
  }

  fun setExtents(extents: Vector2) {
    val _arg = Variant.new(extents)
    __method_bind.set_extents.call(this.toVariant(), _arg, 1)
  }

  companion object {
    fun new(): RectangleShape2D = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("RectangleShape2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for RectangleShape2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      RectangleShape2D(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): RectangleShape2D = RectangleShape2D(ptr)
    /**
     * Container for method_bind pointers for RectangleShape2D
     */
    private object __method_bind {
      val get_extents: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RectangleShape2D".cstr.ptr,
            "get_extents".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_extents" }
        }
      val set_extents: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RectangleShape2D".cstr.ptr,
            "set_extents".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_extents" }
        }}
  }
}
