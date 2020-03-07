// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
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

open class CSGTorus(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : CSGPrimitive(null) {
  var innerRadius: Float
    get() {
       return getInnerRadius() 
    }
    set(value) {
      setInnerRadius(value)
    }

  var material: Material
    get() {
       return getMaterial() 
    }
    set(value) {
      setMaterial(value)
    }

  var outerRadius: Float
    get() {
       return getOuterRadius() 
    }
    set(value) {
      setOuterRadius(value)
    }

  var ringSides: Int
    get() {
       return getRingSides() 
    }
    set(value) {
      setRingSides(value)
    }

  var sides: Int
    get() {
       return getSides() 
    }
    set(value) {
      setSides(value)
    }

  var smoothFaces: Boolean
    get() {
       return getSmoothFaces() 
    }
    set(value) {
      setSmoothFaces(value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getInnerRadius(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getInnerRadius.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getMaterial(): Material {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Material
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getMaterial.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<Material>(_tmp.value!!)
      _ret
    }
  }

  fun getOuterRadius(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getOuterRadius.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getRingSides(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getRingSides.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getSides(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getSides.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getSmoothFaces(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getSmoothFaces.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun setInnerRadius(radius: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setInnerRadius.call(self._handle, listOf(radius), null)
    }
  }

  fun setMaterial(material: Material) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setMaterial.call(self._handle, listOf(material), null)
    }
  }

  fun setOuterRadius(radius: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setOuterRadius.call(self._handle, listOf(radius), null)
    }
  }

  fun setRingSides(sides: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setRingSides.call(self._handle, listOf(sides), null)
    }
  }

  fun setSides(sides: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSides.call(self._handle, listOf(sides), null)
    }
  }

  fun setSmoothFaces(smoothFaces: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSmoothFaces.call(self._handle, listOf(smoothFaces), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("CSGTorus".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for CSGTorus" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for CSGTorus
     */
    private object __method_bind {
      val getInnerRadius: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGTorus".cstr.ptr,
              "get_inner_radius".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_inner_radius" }
            }
          }

      val getMaterial: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGTorus".cstr.ptr,
              "get_material".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_material" }
            }
          }

      val getOuterRadius: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGTorus".cstr.ptr,
              "get_outer_radius".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_outer_radius" }
            }
          }

      val getRingSides: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGTorus".cstr.ptr,
              "get_ring_sides".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_ring_sides" }
            }
          }

      val getSides: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGTorus".cstr.ptr,
              "get_sides".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_sides" }
            }
          }

      val getSmoothFaces: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGTorus".cstr.ptr,
              "get_smooth_faces".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_smooth_faces" }
            }
          }

      val setInnerRadius: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGTorus".cstr.ptr,
              "set_inner_radius".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_inner_radius" }
            }
          }

      val setMaterial: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGTorus".cstr.ptr,
              "set_material".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_material" }
            }
          }

      val setOuterRadius: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGTorus".cstr.ptr,
              "set_outer_radius".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_outer_radius" }
            }
          }

      val setRingSides: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGTorus".cstr.ptr,
              "set_ring_sides".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_ring_sides" }
            }
          }

      val setSides: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGTorus".cstr.ptr,
              "set_sides".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_sides" }
            }
          }

      val setSmoothFaces: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGTorus".cstr.ptr,
              "set_smooth_faces".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_smooth_faces" }
            }
          }
    }
  }
}
