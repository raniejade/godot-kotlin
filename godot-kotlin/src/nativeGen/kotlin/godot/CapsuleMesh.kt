// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.reflect.KCallable
import kotlinx.cinterop.BooleanVar
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.COpaquePointerVar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.DoubleVar
import kotlinx.cinterop.IntVar
import kotlinx.cinterop.alloc
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.readValue
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.value

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
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getMidHeight.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getRadialSegments(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getRadialSegments.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getRadius(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getRadius.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getRings(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getRings.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun setMidHeight(midHeight: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setMidHeight.call(self._handle, listOf(midHeight), null)
    }
  }

  fun setRadialSegments(segments: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setRadialSegments.call(self._handle, listOf(segments), null)
    }
  }

  fun setRadius(radius: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setRadius.call(self._handle, listOf(radius), null)
    }
  }

  fun setRings(rings: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setRings.call(self._handle, listOf(rings), null)
    }
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
