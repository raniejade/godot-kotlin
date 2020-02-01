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

open class PinJoint2D(
  _handle: COpaquePointer
) : Joint2D(_handle) {
  var softness: Float
    get() {
       return getSoftness() 
    }
    set(value) {
      setSoftness(value)
    }

  fun getSoftness(): Float {
    val _ret = __method_bind.getSoftness.call(this._handle)
    return _ret.asFloat()
  }

  fun setSoftness(softness: Float) {
    val _arg = Variant.new(softness)
    __method_bind.setSoftness.call(this._handle, listOf(_arg))
  }

  companion object {
    fun new(): PinJoint2D = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("PinJoint2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for PinJoint2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      PinJoint2D(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): PinJoint2D = PinJoint2D(ptr)
    /**
     * Container for method_bind pointers for PinJoint2D
     */
    private object __method_bind {
      val getSoftness: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PinJoint2D".cstr.ptr,
            "get_softness".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_softness" }
        }
      val setSoftness: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PinJoint2D".cstr.ptr,
            "set_softness".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_softness" }
        }}
  }
}
