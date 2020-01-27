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

open class CSGCylinder internal constructor(
  _handle: COpaquePointer
) : CSGPrimitive(_handle) {
  fun getHeight(): Float {
    val _ret = __method_bind.get_height.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getMaterial(): Material {
    val _ret = __method_bind.get_material.call(this.toVariant())
    return _ret.asObject(::Material)!!
  }

  fun getRadius(): Float {
    val _ret = __method_bind.get_radius.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getSides(): Int {
    val _ret = __method_bind.get_sides.call(this.toVariant())
    return _ret.asInt()
  }

  fun getSmoothFaces(): Boolean {
    val _ret = __method_bind.get_smooth_faces.call(this.toVariant())
    return _ret.asBool()
  }

  fun isCone(): Boolean {
    val _ret = __method_bind.is_cone.call(this.toVariant())
    return _ret.asBool()
  }

  fun setCone(cone: Boolean) {
    val _args = VariantArray.new()
    _args.append(cone)
    __method_bind.set_cone.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setHeight(height: Float) {
    val _args = VariantArray.new()
    _args.append(height)
    __method_bind.set_height.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setMaterial(material: Material) {
    val _args = VariantArray.new()
    _args.append(material)
    __method_bind.set_material.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setRadius(radius: Float) {
    val _args = VariantArray.new()
    _args.append(radius)
    __method_bind.set_radius.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setSides(sides: Int) {
    val _args = VariantArray.new()
    _args.append(sides)
    __method_bind.set_sides.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setSmoothFaces(smoothFaces: Boolean) {
    val _args = VariantArray.new()
    _args.append(smoothFaces)
    __method_bind.set_smooth_faces.call(this.toVariant(), _args.toVariant(), 1)
  }

  companion object {
    fun new(): CSGCylinder = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("CSGCylinder".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton CSGCylinder" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      CSGCylinder(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): CSGCylinder = CSGCylinder(ptr)
    /**
     * Container for method_bind pointers for CSGCylinder
     */
    private object __method_bind {
      val get_height: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGCylinder".cstr.ptr,
              "get_height".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_height" }
            }
          }

      val get_material: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGCylinder".cstr.ptr,
              "get_material".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_material" }
            }
          }

      val get_radius: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGCylinder".cstr.ptr,
              "get_radius".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_radius" }
            }
          }

      val get_sides: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGCylinder".cstr.ptr,
              "get_sides".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_sides" }
            }
          }

      val get_smooth_faces: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGCylinder".cstr.ptr,
              "get_smooth_faces".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_smooth_faces" }
            }
          }

      val is_cone: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGCylinder".cstr.ptr,
              "is_cone".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_cone" }
            }
          }

      val set_cone: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGCylinder".cstr.ptr,
              "set_cone".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_cone" }
            }
          }

      val set_height: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGCylinder".cstr.ptr,
              "set_height".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_height" }
            }
          }

      val set_material: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGCylinder".cstr.ptr,
              "set_material".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_material" }
            }
          }

      val set_radius: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGCylinder".cstr.ptr,
              "set_radius".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_radius" }
            }
          }

      val set_sides: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGCylinder".cstr.ptr,
              "set_sides".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_sides" }
            }
          }

      val set_smooth_faces: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGCylinder".cstr.ptr,
              "set_smooth_faces".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_smooth_faces" }
            }
          }
    }
  }
}
