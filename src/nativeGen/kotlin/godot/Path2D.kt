// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class Path2D internal constructor(
  _handle: COpaquePointer
) : Node2D(_handle) {
  fun getCurve(): Curve2D {
    val _ret = __method_bind.get_curve.call(this.toVariant())
    return _ret.asObject(::Curve2D)!!
  }

  fun setCurve(curve: Curve2D) {
    val _arg = Variant.new(curve)
    __method_bind.set_curve.call(this.toVariant(), _arg, 1)
  }

  companion object {
    fun new(): Path2D = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Path2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for Path2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Path2D(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): Path2D = Path2D(ptr)
    /**
     * Container for method_bind pointers for Path2D
     */
    private object __method_bind {
      val get_curve: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Path2D".cstr.ptr,
            "get_curve".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_curve" }
        }
      val set_curve: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Path2D".cstr.ptr,
            "set_curve".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_curve" }
        }}
  }
}
