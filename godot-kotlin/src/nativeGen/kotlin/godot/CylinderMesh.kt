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

open class CylinderMesh(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : PrimitiveMesh(null) {
  var bottomRadius: Float
    get() {
       return getBottomRadius() 
    }
    set(value) {
      setBottomRadius(value)
    }

  var height: Float
    get() {
       return getHeight() 
    }
    set(value) {
      setHeight(value)
    }

  var radialSegments: Int
    get() {
       return getRadialSegments() 
    }
    set(value) {
      setRadialSegments(value)
    }

  var rings: Int
    get() {
       return getRings() 
    }
    set(value) {
      setRings(value)
    }

  var topRadius: Float
    get() {
       return getTopRadius() 
    }
    set(value) {
      setTopRadius(value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getBottomRadius(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getBottomRadius.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getHeight(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getHeight.call(self._handle, emptyList(), _retPtr)
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

  fun getRings(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getRings.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getTopRadius(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getTopRadius.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun setBottomRadius(radius: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setBottomRadius.call(self._handle, listOf(radius), null)
    }
  }

  fun setHeight(height: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setHeight.call(self._handle, listOf(height), null)
    }
  }

  fun setRadialSegments(segments: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setRadialSegments.call(self._handle, listOf(segments), null)
    }
  }

  fun setRings(rings: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setRings.call(self._handle, listOf(rings), null)
    }
  }

  fun setTopRadius(radius: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setTopRadius.call(self._handle, listOf(radius), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("CylinderMesh".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for CylinderMesh" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for CylinderMesh
     */
    private object __method_bind {
      val getBottomRadius: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CylinderMesh".cstr.ptr,
              "get_bottom_radius".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_bottom_radius" }
            }
          }

      val getHeight: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CylinderMesh".cstr.ptr,
              "get_height".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_height" }
            }
          }

      val getRadialSegments: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CylinderMesh".cstr.ptr,
              "get_radial_segments".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_radial_segments" }
            }
          }

      val getRings: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CylinderMesh".cstr.ptr,
              "get_rings".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_rings" }
            }
          }

      val getTopRadius: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CylinderMesh".cstr.ptr,
              "get_top_radius".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_top_radius" }
            }
          }

      val setBottomRadius: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CylinderMesh".cstr.ptr,
              "set_bottom_radius".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_bottom_radius" }
            }
          }

      val setHeight: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CylinderMesh".cstr.ptr,
              "set_height".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_height" }
            }
          }

      val setRadialSegments: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CylinderMesh".cstr.ptr,
              "set_radial_segments".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_radial_segments" }
            }
          }

      val setRings: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CylinderMesh".cstr.ptr,
              "set_rings".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_rings" }
            }
          }

      val setTopRadius: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CylinderMesh".cstr.ptr,
              "set_top_radius".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_top_radius" }
            }
          }
    }
  }
}
