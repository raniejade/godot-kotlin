// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class SphereMesh internal constructor(
  _handle: COpaquePointer
) : PrimitiveMesh(_handle) {
  fun getHeight(): Float {
    val _ret = __method_bind.get_height.call(this._handle)
    return _ret.asFloat()
  }

  fun getIsHemisphere(): Boolean {
    val _ret = __method_bind.get_is_hemisphere.call(this._handle)
    return _ret.asBool()
  }

  fun getRadialSegments(): Int {
    val _ret = __method_bind.get_radial_segments.call(this._handle)
    return _ret.asInt()
  }

  fun getRadius(): Float {
    val _ret = __method_bind.get_radius.call(this._handle)
    return _ret.asFloat()
  }

  fun getRings(): Int {
    val _ret = __method_bind.get_rings.call(this._handle)
    return _ret.asInt()
  }

  fun setHeight(height: Float) {
    val _arg = Variant.new(height)
    __method_bind.set_height.call(this._handle, _arg, 1)
  }

  fun setIsHemisphere(isHemisphere: Boolean) {
    val _arg = Variant.new(isHemisphere)
    __method_bind.set_is_hemisphere.call(this._handle, _arg, 1)
  }

  fun setRadialSegments(radialSegments: Int) {
    val _arg = Variant.new(radialSegments)
    __method_bind.set_radial_segments.call(this._handle, _arg, 1)
  }

  fun setRadius(radius: Float) {
    val _arg = Variant.new(radius)
    __method_bind.set_radius.call(this._handle, _arg, 1)
  }

  fun setRings(rings: Int) {
    val _arg = Variant.new(rings)
    __method_bind.set_rings.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): SphereMesh = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("SphereMesh".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for SphereMesh" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      SphereMesh(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): SphereMesh = SphereMesh(ptr)
    /**
     * Container for method_bind pointers for SphereMesh
     */
    private object __method_bind {
      val get_height: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SphereMesh".cstr.ptr,
            "get_height".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_height" }
        }
      val get_is_hemisphere: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SphereMesh".cstr.ptr,
            "get_is_hemisphere".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_is_hemisphere" }
        }
      val get_radial_segments: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SphereMesh".cstr.ptr,
            "get_radial_segments".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_radial_segments" }
        }
      val get_radius: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SphereMesh".cstr.ptr,
            "get_radius".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_radius" }
        }
      val get_rings: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SphereMesh".cstr.ptr,
            "get_rings".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_rings" }
        }
      val set_height: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SphereMesh".cstr.ptr,
            "set_height".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_height" }
        }
      val set_is_hemisphere: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SphereMesh".cstr.ptr,
            "set_is_hemisphere".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_is_hemisphere" }
        }
      val set_radial_segments: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SphereMesh".cstr.ptr,
            "set_radial_segments".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_radial_segments" }
        }
      val set_radius: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SphereMesh".cstr.ptr,
            "set_radius".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_radius" }
        }
      val set_rings: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SphereMesh".cstr.ptr,
            "set_rings".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_rings" }
        }}
  }
}
