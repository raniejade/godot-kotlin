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

open class CSGTorus internal constructor(
  _handle: COpaquePointer
) : CSGPrimitive(_handle) {
  fun getInnerRadius(): Float {
    val _ret = __method_bind.get_inner_radius.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getMaterial(): Material {
    val _ret = __method_bind.get_material.call(this.toVariant())
    return _ret.asObject(::Material)!!
  }

  fun getOuterRadius(): Float {
    val _ret = __method_bind.get_outer_radius.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getRingSides(): Int {
    val _ret = __method_bind.get_ring_sides.call(this.toVariant())
    return _ret.asInt()
  }

  fun getSides(): Int {
    val _ret = __method_bind.get_sides.call(this.toVariant())
    return _ret.asInt()
  }

  fun getSmoothFaces(): Boolean {
    val _ret = __method_bind.get_smooth_faces.call(this.toVariant())
    return _ret.asBool()
  }

  fun setInnerRadius(radius: Float) {
    val _arg = Variant.new(radius)
    __method_bind.set_inner_radius.call(this.toVariant(), _arg, 1)
  }

  fun setMaterial(material: Material) {
    val _arg = Variant.new(material)
    __method_bind.set_material.call(this.toVariant(), _arg, 1)
  }

  fun setOuterRadius(radius: Float) {
    val _arg = Variant.new(radius)
    __method_bind.set_outer_radius.call(this.toVariant(), _arg, 1)
  }

  fun setRingSides(sides: Int) {
    val _arg = Variant.new(sides)
    __method_bind.set_ring_sides.call(this.toVariant(), _arg, 1)
  }

  fun setSides(sides: Int) {
    val _arg = Variant.new(sides)
    __method_bind.set_sides.call(this.toVariant(), _arg, 1)
  }

  fun setSmoothFaces(smoothFaces: Boolean) {
    val _arg = Variant.new(smoothFaces)
    __method_bind.set_smooth_faces.call(this.toVariant(), _arg, 1)
  }

  companion object {
    fun new(): CSGTorus = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("CSGTorus".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for CSGTorus" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      CSGTorus(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): CSGTorus = CSGTorus(ptr)
    /**
     * Container for method_bind pointers for CSGTorus
     */
    private object __method_bind {
      val get_inner_radius: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGTorus".cstr.ptr,
            "get_inner_radius".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_inner_radius" }
        }
      val get_material: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGTorus".cstr.ptr,
            "get_material".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_material" }
        }
      val get_outer_radius: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGTorus".cstr.ptr,
            "get_outer_radius".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_outer_radius" }
        }
      val get_ring_sides: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGTorus".cstr.ptr,
            "get_ring_sides".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_ring_sides" }
        }
      val get_sides: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGTorus".cstr.ptr,
            "get_sides".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_sides" }
        }
      val get_smooth_faces: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGTorus".cstr.ptr,
            "get_smooth_faces".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_smooth_faces" }
        }
      val set_inner_radius: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGTorus".cstr.ptr,
            "set_inner_radius".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_inner_radius" }
        }
      val set_material: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGTorus".cstr.ptr,
            "set_material".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_material" }
        }
      val set_outer_radius: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGTorus".cstr.ptr,
            "set_outer_radius".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_outer_radius" }
        }
      val set_ring_sides: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGTorus".cstr.ptr,
            "set_ring_sides".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_ring_sides" }
        }
      val set_sides: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGTorus".cstr.ptr,
            "set_sides".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_sides" }
        }
      val set_smooth_faces: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGTorus".cstr.ptr,
            "set_smooth_faces".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_smooth_faces" }
        }}
  }
}
