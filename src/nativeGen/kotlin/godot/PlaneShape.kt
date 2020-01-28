// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Plane
import godot.core.Variant
import godot.core.VariantArray
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class PlaneShape(
  _handle: COpaquePointer
) : Shape(_handle) {
  var plane: Plane
    get() {
       return getPlane() 
    }
    set(value) {
      setPlane(value)
    }

  fun getPlane(): Plane {
    val _ret = __method_bind.getPlane.call(this._handle)
    return _ret.asPlane()
  }

  fun setPlane(plane: Plane) {
    val _arg = Variant.new(plane)
    __method_bind.setPlane.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): PlaneShape = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("PlaneShape".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for PlaneShape" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      PlaneShape(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): PlaneShape = PlaneShape(ptr)
    /**
     * Container for method_bind pointers for PlaneShape
     */
    private object __method_bind {
      val getPlane: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PlaneShape".cstr.ptr,
            "getPlane".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPlane" }
        }
      val setPlane: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PlaneShape".cstr.ptr,
            "setPlane".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setPlane" }
        }}
  }
}
