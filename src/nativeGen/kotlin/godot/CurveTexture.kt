// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class CurveTexture internal constructor(
  _handle: COpaquePointer
) : Texture(_handle) {
  fun getCurve(): Curve {
    val _ret = __method_bind.get_curve.call(this._handle)
    return _ret.asObject(::Curve)!!
  }

  fun setCurve(curve: Curve) {
    val _arg = Variant.new(curve)
    __method_bind.set_curve.call(this._handle, _arg, 1)
  }

  fun setWidth(width: Int) {
    val _arg = Variant.new(width)
    __method_bind.set_width.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): CurveTexture = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("CurveTexture".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for CurveTexture" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      CurveTexture(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): CurveTexture = CurveTexture(ptr)
    /**
     * Container for method_bind pointers for CurveTexture
     */
    private object __method_bind {
      val get_curve: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CurveTexture".cstr.ptr,
            "get_curve".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_curve" }
        }
      val set_curve: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CurveTexture".cstr.ptr,
            "set_curve".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_curve" }
        }
      val set_width: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CurveTexture".cstr.ptr,
            "set_width".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_width" }
        }}
  }
}
