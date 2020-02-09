// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
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

open class Path2D(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Node2D(null) {
  var curve: Curve2D
    get() {
       return getCurve() 
    }
    set(value) {
      setCurve(value)
    }

  constructor() : this(null) {
    _handle = __new()
  }

  fun getCurve(): Curve2D {
    val _ret = __method_bind.getCurve.call(this._handle)
    return _ret.toAny() as Curve2D
  }

  fun setCurve(curve: Curve2D) {
    val _arg = Variant(curve)
    __method_bind.setCurve.call(this._handle, listOf(_arg))
  }

  companion object {
    internal fun __new(): COpaquePointer = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Path2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for Path2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for Path2D
     */
    private object __method_bind {
      val getCurve: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Path2D".cstr.ptr,
            "get_curve".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_curve" }
        }
      val setCurve: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Path2D".cstr.ptr,
            "set_curve".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_curve" }
        }}
  }
}
