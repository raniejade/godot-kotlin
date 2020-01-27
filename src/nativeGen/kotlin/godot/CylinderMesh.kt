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

open class CylinderMesh internal constructor(
  _handle: COpaquePointer
) : PrimitiveMesh(_handle) {
  fun getBottomRadius(): Float {
    val _ret = __method_bind.get_bottom_radius.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getHeight(): Float {
    val _ret = __method_bind.get_height.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getRadialSegments(): Int {
    val _ret = __method_bind.get_radial_segments.call(this.toVariant())
    return _ret.asInt()
  }

  fun getRings(): Int {
    val _ret = __method_bind.get_rings.call(this.toVariant())
    return _ret.asInt()
  }

  fun getTopRadius(): Float {
    val _ret = __method_bind.get_top_radius.call(this.toVariant())
    return _ret.asFloat()
  }

  fun setBottomRadius(radius: Float) {
    val _arg = Variant.new(radius)
    __method_bind.set_bottom_radius.call(this.toVariant(), _arg, 1)
  }

  fun setHeight(height: Float) {
    val _arg = Variant.new(height)
    __method_bind.set_height.call(this.toVariant(), _arg, 1)
  }

  fun setRadialSegments(segments: Int) {
    val _arg = Variant.new(segments)
    __method_bind.set_radial_segments.call(this.toVariant(), _arg, 1)
  }

  fun setRings(rings: Int) {
    val _arg = Variant.new(rings)
    __method_bind.set_rings.call(this.toVariant(), _arg, 1)
  }

  fun setTopRadius(radius: Float) {
    val _arg = Variant.new(radius)
    __method_bind.set_top_radius.call(this.toVariant(), _arg, 1)
  }

  companion object {
    fun new(): CylinderMesh = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("CylinderMesh".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for CylinderMesh" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      CylinderMesh(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): CylinderMesh = CylinderMesh(ptr)
    /**
     * Container for method_bind pointers for CylinderMesh
     */
    private object __method_bind {
      val get_bottom_radius: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CylinderMesh".cstr.ptr,
              "get_bottom_radius".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_bottom_radius" }
            }
          }

      val get_height: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CylinderMesh".cstr.ptr,
              "get_height".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_height" }
            }
          }

      val get_radial_segments: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CylinderMesh".cstr.ptr,
              "get_radial_segments".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_radial_segments" }
            }
          }

      val get_rings: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CylinderMesh".cstr.ptr,
              "get_rings".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_rings" }
            }
          }

      val get_top_radius: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CylinderMesh".cstr.ptr,
              "get_top_radius".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_top_radius" }
            }
          }

      val set_bottom_radius: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CylinderMesh".cstr.ptr,
              "set_bottom_radius".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_bottom_radius" }
            }
          }

      val set_height: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CylinderMesh".cstr.ptr,
              "set_height".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_height" }
            }
          }

      val set_radial_segments: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CylinderMesh".cstr.ptr,
              "set_radial_segments".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_radial_segments" }
            }
          }

      val set_rings: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CylinderMesh".cstr.ptr,
              "set_rings".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_rings" }
            }
          }

      val set_top_radius: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CylinderMesh".cstr.ptr,
              "set_top_radius".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_top_radius" }
            }
          }
    }
  }
}
