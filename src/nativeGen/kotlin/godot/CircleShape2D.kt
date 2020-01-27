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

open class CircleShape2D internal constructor(
  _handle: COpaquePointer
) : Shape2D(_handle) {
  fun getRadius(): Float {
    val _ret = __method_bind.get_radius.call(this._handle)
    return _ret.asFloat()
  }

  fun setRadius(radius: Float) {
    val _arg = Variant.new(radius)
    __method_bind.set_radius.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): CircleShape2D = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("CircleShape2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for CircleShape2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      CircleShape2D(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): CircleShape2D = CircleShape2D(ptr)
    /**
     * Container for method_bind pointers for CircleShape2D
     */
    private object __method_bind {
      val get_radius: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CircleShape2D".cstr.ptr,
            "get_radius".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_radius" }
        }
      val set_radius: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CircleShape2D".cstr.ptr,
            "set_radius".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_radius" }
        }}
  }
}
