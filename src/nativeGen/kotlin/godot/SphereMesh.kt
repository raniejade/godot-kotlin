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

open class SphereMesh(
  _handle: COpaquePointer
) : PrimitiveMesh(_handle) {
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
    val _arg = Variant.new(height)
    __method_bind.setHeight.call(this._handle, _arg, 1)
  }

  fun setIsHemisphere(isHemisphere: Boolean) {
    val _arg = Variant.new(isHemisphere)
    __method_bind.setIsHemisphere.call(this._handle, _arg, 1)
  }

  fun setRadialSegments(radialSegments: Int) {
    val _arg = Variant.new(radialSegments)
    __method_bind.setRadialSegments.call(this._handle, _arg, 1)
  }

  fun setRadius(radius: Float) {
    val _arg = Variant.new(radius)
    __method_bind.setRadius.call(this._handle, _arg, 1)
  }

  fun setRings(rings: Int) {
    val _arg = Variant.new(rings)
    __method_bind.setRings.call(this._handle, _arg, 1)
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
      val getHeight: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SphereMesh".cstr.ptr,
            "getHeight".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getHeight" }
        }
      val getIsHemisphere: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SphereMesh".cstr.ptr,
            "getIsHemisphere".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getIsHemisphere" }
        }
      val getRadialSegments: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SphereMesh".cstr.ptr,
            "getRadialSegments".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getRadialSegments" }
        }
      val getRadius: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SphereMesh".cstr.ptr,
            "getRadius".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getRadius" }
        }
      val getRings: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SphereMesh".cstr.ptr,
            "getRings".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getRings" }
        }
      val setHeight: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SphereMesh".cstr.ptr,
            "setHeight".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setHeight" }
        }
      val setIsHemisphere: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SphereMesh".cstr.ptr,
            "setIsHemisphere".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setIsHemisphere" }
        }
      val setRadialSegments: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SphereMesh".cstr.ptr,
            "setRadialSegments".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setRadialSegments" }
        }
      val setRadius: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SphereMesh".cstr.ptr,
            "setRadius".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setRadius" }
        }
      val setRings: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SphereMesh".cstr.ptr,
            "setRings".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setRings" }
        }}
  }
}
