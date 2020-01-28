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

open class Path(
  _handle: COpaquePointer
) : Spatial(_handle) {
  var curve: Curve3D
    get() {
       return getCurve() 
    }
    set(value) {
      setCurve(value)
    }

  fun getCurve(): Curve3D {
    val _ret = __method_bind.getCurve.call(this._handle)
    return _ret.asObject(::Curve3D)!!
  }

  fun setCurve(curve: Curve3D) {
    val _arg = Variant.new(curve)
    __method_bind.setCurve.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): Path = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Path".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for Path" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Path(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): Path = Path(ptr)
    /**
     * Container for method_bind pointers for Path
     */
    private object __method_bind {
      val getCurve: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Path".cstr.ptr,
            "getCurve".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCurve" }
        }
      val setCurve: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Path".cstr.ptr,
            "setCurve".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCurve" }
        }}
  }
}
