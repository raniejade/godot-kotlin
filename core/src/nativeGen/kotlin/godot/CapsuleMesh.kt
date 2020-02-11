// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
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

open class CapsuleMesh(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : PrimitiveMesh(null) {
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

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
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
    val _arg = Variant(midHeight)
    __method_bind.setMidHeight.call(this._handle, listOf(_arg))
  }

  fun setRadialSegments(segments: Int) {
    val _arg = Variant(segments)
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
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("CapsuleMesh".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for CapsuleMesh" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for CapsuleMesh
     */
    private object __method_bind {
      val getMidHeight: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CapsuleMesh".cstr.ptr,
            "get_mid_height".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_mid_height" }
        }
      val getRadialSegments: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CapsuleMesh".cstr.ptr,
            "get_radial_segments".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_radial_segments" }
        }
      val getRadius: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CapsuleMesh".cstr.ptr,
            "get_radius".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_radius" }
        }
      val getRings: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CapsuleMesh".cstr.ptr,
            "get_rings".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_rings" }
        }
      val setMidHeight: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CapsuleMesh".cstr.ptr,
            "set_mid_height".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_mid_height" }
        }
      val setRadialSegments: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CapsuleMesh".cstr.ptr,
            "set_radial_segments".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_radial_segments" }
        }
      val setRadius: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CapsuleMesh".cstr.ptr,
            "set_radius".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_radius" }
        }
      val setRings: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CapsuleMesh".cstr.ptr,
            "set_rings".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_rings" }
        }}
  }
}
