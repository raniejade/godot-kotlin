// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Float
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class SphereShape(
  _handle: COpaquePointer
) : Shape(_handle) {
  var radius: Float
    get() {
       return getRadius() 
    }
    set(value) {
      setRadius(value)
    }

  fun getRadius(): Float {
    val _ret = __method_bind.getRadius.call(this._handle)
    return _ret.asFloat()
  }

  fun setRadius(radius: Float) {
    val _arg = Variant.new(radius)
    __method_bind.setRadius.call(this._handle, listOf(_arg))
  }

  companion object {
    fun new(): SphereShape = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("SphereShape".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for SphereShape" }
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
      val getRadius: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SphereShape".cstr.ptr,
            "get_radius".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_radius" }
        }
      val setRadius: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SphereShape".cstr.ptr,
            "set_radius".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_radius" }
        }}
  }
}
