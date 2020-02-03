// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Int
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class LightOccluder2D(
  _handle: COpaquePointer
) : Node2D(_handle) {
  var occluder: OccluderPolygon2D
    get() {
       return getOccluderPolygon() 
    }
    set(value) {
      setOccluderPolygon(value)
    }

  fun getOccluderLightMask(): Int {
    val _ret = __method_bind.getOccluderLightMask.call(this._handle)
    return _ret.asInt()
  }

  fun getOccluderPolygon(): OccluderPolygon2D {
    val _ret = __method_bind.getOccluderPolygon.call(this._handle)
    return _ret.asObject(::OccluderPolygon2D)!!
  }

  fun setOccluderLightMask(mask: Int) {
    val _arg = Variant.new(mask)
    __method_bind.setOccluderLightMask.call(this._handle, listOf(_arg))
  }

  fun setOccluderPolygon(polygon: OccluderPolygon2D) {
    val _arg = Variant.new(polygon)
    __method_bind.setOccluderPolygon.call(this._handle, listOf(_arg))
  }

  companion object {
    fun new(): LightOccluder2D = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("LightOccluder2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for LightOccluder2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      LightOccluder2D(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): LightOccluder2D = LightOccluder2D(ptr)
    /**
     * Container for method_bind pointers for LightOccluder2D
     */
    private object __method_bind {
      val getOccluderLightMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LightOccluder2D".cstr.ptr,
            "get_occluder_light_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_occluder_light_mask" }
        }
      val getOccluderPolygon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LightOccluder2D".cstr.ptr,
            "get_occluder_polygon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_occluder_polygon" }
        }
      val setOccluderLightMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LightOccluder2D".cstr.ptr,
            "set_occluder_light_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_occluder_light_mask" }
        }
      val setOccluderPolygon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LightOccluder2D".cstr.ptr,
            "set_occluder_polygon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_occluder_polygon" }
        }}
  }
}
