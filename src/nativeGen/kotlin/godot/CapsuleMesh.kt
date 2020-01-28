// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Float
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class CapsuleMesh(
  _handle: COpaquePointer
) : PrimitiveMesh(_handle) {
  var midHeight: Float
    get() {
       return getMidHeight() 
    }
    set(value) {
      setMidHeight(value)
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

  fun getMidHeight(): Float {
    val _ret = __method_bind.getMidHeight.call(this._handle)
    return _ret.asFloat()
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

  fun setMidHeight(midHeight: Float) {
    val _arg = Variant.new(midHeight)
    __method_bind.setMidHeight.call(this._handle, _arg, 1)
  }

  fun setRadialSegments(segments: Int) {
    val _arg = Variant.new(segments)
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
    fun new(): CapsuleMesh = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("CapsuleMesh".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for CapsuleMesh" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      CapsuleMesh(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): CapsuleMesh = CapsuleMesh(ptr)
    /**
     * Container for method_bind pointers for CapsuleMesh
     */
    private object __method_bind {
      val getMidHeight: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CapsuleMesh".cstr.ptr,
            "getMidHeight".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getMidHeight" }
        }
      val getRadialSegments: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CapsuleMesh".cstr.ptr,
            "getRadialSegments".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getRadialSegments" }
        }
      val getRadius: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CapsuleMesh".cstr.ptr,
            "getRadius".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getRadius" }
        }
      val getRings: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CapsuleMesh".cstr.ptr,
            "getRings".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getRings" }
        }
      val setMidHeight: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CapsuleMesh".cstr.ptr,
            "setMidHeight".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setMidHeight" }
        }
      val setRadialSegments: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CapsuleMesh".cstr.ptr,
            "setRadialSegments".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setRadialSegments" }
        }
      val setRadius: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CapsuleMesh".cstr.ptr,
            "setRadius".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setRadius" }
        }
      val setRings: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CapsuleMesh".cstr.ptr,
            "setRings".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setRings" }
        }}
  }
}
