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

open class CSGSphere(
  _handle: COpaquePointer
) : CSGPrimitive(_handle) {
  fun getMaterial(): Material {
    val _ret = __method_bind.get_material.call(this._handle)
    return _ret.asObject(::Material)!!
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

  fun getSmoothFaces(): Boolean {
    val _ret = __method_bind.get_smooth_faces.call(this._handle)
    return _ret.asBool()
  }

  fun setMaterial(material: Material) {
    val _arg = Variant.new(material)
    __method_bind.set_material.call(this._handle, _arg, 1)
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

  fun setSmoothFaces(smoothFaces: Boolean) {
    val _arg = Variant.new(smoothFaces)
    __method_bind.set_smooth_faces.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): CSGSphere = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("CSGSphere".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for CSGSphere" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      CSGSphere(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): CSGSphere = CSGSphere(ptr)
    /**
     * Container for method_bind pointers for CSGSphere
     */
    private object __method_bind {
      val get_material: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGSphere".cstr.ptr,
            "get_material".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_material" }
        }
      val get_radial_segments: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGSphere".cstr.ptr,
            "get_radial_segments".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_radial_segments" }
        }
      val get_radius: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGSphere".cstr.ptr,
            "get_radius".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_radius" }
        }
      val get_rings: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGSphere".cstr.ptr,
            "get_rings".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_rings" }
        }
      val get_smooth_faces: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGSphere".cstr.ptr,
            "get_smooth_faces".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_smooth_faces" }
        }
      val set_material: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGSphere".cstr.ptr,
            "set_material".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_material" }
        }
      val set_radial_segments: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGSphere".cstr.ptr,
            "set_radial_segments".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_radial_segments" }
        }
      val set_radius: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGSphere".cstr.ptr,
            "set_radius".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_radius" }
        }
      val set_rings: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGSphere".cstr.ptr,
            "set_rings".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_rings" }
        }
      val set_smooth_faces: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGSphere".cstr.ptr,
            "set_smooth_faces".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_smooth_faces" }
        }}
  }
}
