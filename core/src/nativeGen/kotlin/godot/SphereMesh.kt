// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
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

open class SphereMesh(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : PrimitiveMesh(null) {
  var height: Float
    get() {
       return getHeight() 
    }
    set(value) {
      setHeight(value)
    }

  var isHemisphere: Boolean
    get() {
       return getIsHemisphere() 
    }
    set(value) {
      setIsHemisphere(value)
    }

  var radialSegments: Int
    get() {
       return getRadialSegments() 
    }
    set(value) {
      setRadialSegments(value)
    }

  var radius: Float
    get() {
       return getRadius() 
    }
    set(value) {
      setRadius(value)
    }

  var rings: Int
    get() {
       return getRings() 
    }
    set(value) {
      setRings(value)
    }

  constructor() : this(null) {
    _handle = __new()
  }

  fun getHeight(): Float {
    val _ret = __method_bind.getHeight.call(this._handle)
    return _ret.asFloat()
  }

  fun getIsHemisphere(): Boolean {
    val _ret = __method_bind.getIsHemisphere.call(this._handle)
    return _ret.asBoolean()
  }

  fun getRadialSegments(): Int {
    val _ret = __method_bind.getRadialSegments.call(this._handle)
    return _ret.asInt()
  }

  fun getRadius(): Float {
    val _ret = __method_bind.getRadius.call(this._handle)
    return _ret.asFloat()
  }

  fun getRings(): Int {
    val _ret = __method_bind.getRings.call(this._handle)
    return _ret.asInt()
  }

  fun setHeight(height: Float) {
    val _arg = Variant(height)
    __method_bind.setHeight.call(this._handle, listOf(_arg))
  }

  fun setIsHemisphere(isHemisphere: Boolean) {
    val _arg = Variant(isHemisphere)
    __method_bind.setIsHemisphere.call(this._handle, listOf(_arg))
  }

  fun setRadialSegments(radialSegments: Int) {
    val _arg = Variant(radialSegments)
    __method_bind.setRadialSegments.call(this._handle, listOf(_arg))
  }

  fun setRadius(radius: Float) {
    val _arg = Variant(radius)
    __method_bind.setRadius.call(this._handle, listOf(_arg))
  }

  fun setRings(rings: Int) {
    val _arg = Variant(rings)
    __method_bind.setRings.call(this._handle, listOf(_arg))
  }

  companion object {
    internal fun __new(): COpaquePointer = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("SphereMesh".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for SphereMesh" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for SphereMesh
     */
    private object __method_bind {
      val getHeight: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SphereMesh".cstr.ptr,
            "get_height".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_height" }
        }
      val getIsHemisphere: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SphereMesh".cstr.ptr,
            "get_is_hemisphere".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_is_hemisphere" }
        }
      val getRadialSegments: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SphereMesh".cstr.ptr,
            "get_radial_segments".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_radial_segments" }
        }
      val getRadius: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SphereMesh".cstr.ptr,
            "get_radius".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_radius" }
        }
      val getRings: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SphereMesh".cstr.ptr,
            "get_rings".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_rings" }
        }
      val setHeight: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SphereMesh".cstr.ptr,
            "set_height".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_height" }
        }
      val setIsHemisphere: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SphereMesh".cstr.ptr,
            "set_is_hemisphere".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_is_hemisphere" }
        }
      val setRadialSegments: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SphereMesh".cstr.ptr,
            "set_radial_segments".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_radial_segments" }
        }
      val setRadius: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SphereMesh".cstr.ptr,
            "set_radius".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_radius" }
        }
      val setRings: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SphereMesh".cstr.ptr,
            "set_rings".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_rings" }
        }}
  }
}
