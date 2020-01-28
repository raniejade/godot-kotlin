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

open class BoxShape(
  _handle: COpaquePointer
) : Shape(_handle) {
  var extents: Vector3
    get() {
       return getExtents() 
    }
    set(value) {
      setExtents(value)
    }

  fun getExtents(): Vector3 {
    val _ret = __method_bind.getExtents.call(this._handle)
    return _ret.asVector3()
  }

  fun setExtents(extents: Vector3) {
    val _arg = Variant.new(extents)
    __method_bind.setExtents.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): BoxShape = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("BoxShape".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for BoxShape" }
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
      val getExtents: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BoxShape".cstr.ptr,
            "getExtents".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getExtents" }
        }
      val setExtents: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BoxShape".cstr.ptr,
            "setExtents".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setExtents" }
        }}
  }
}
