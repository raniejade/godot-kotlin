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

open class CylinderMesh(
  _handle: COpaquePointer
) : PrimitiveMesh(_handle) {
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

  fun getBottomRadius(): Float {
    val _ret = __method_bind.getBottomRadius.call(this._handle)
    return _ret.asFloat()
  }

  fun getHeight(): Float {
    val _ret = __method_bind.getHeight.call(this._handle)
    return _ret.asFloat()
  }

  fun getRadialSegments(): Int {
    val _ret = __method_bind.getRadialSegments.call(this._handle)
    return _ret.asInt()
  }

  fun getRings(): Int {
    val _ret = __method_bind.getRings.call(this._handle)
    return _ret.asInt()
  }

  fun getTopRadius(): Float {
    val _ret = __method_bind.getTopRadius.call(this._handle)
    return _ret.asFloat()
  }

  fun setBottomRadius(radius: Float) {
    val _arg = Variant.new(radius)
    __method_bind.setBottomRadius.call(this._handle, listOf(_arg))
  }

  fun setHeight(height: Float) {
    val _arg = Variant.new(height)
    __method_bind.setHeight.call(this._handle, listOf(_arg))
  }

  fun setRadialSegments(segments: Int) {
    val _arg = Variant.new(segments)
    __method_bind.setRadialSegments.call(this._handle, listOf(_arg))
  }

  fun setRings(rings: Int) {
    val _arg = Variant.new(rings)
    __method_bind.setRings.call(this._handle, listOf(_arg))
  }

  fun setTopRadius(radius: Float) {
    val _arg = Variant.new(radius)
    __method_bind.setTopRadius.call(this._handle, listOf(_arg))
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
      val getBottomRadius: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CylinderMesh".cstr.ptr,
            "get_bottom_radius".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_bottom_radius" }
        }
      val getHeight: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CylinderMesh".cstr.ptr,
            "get_height".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_height" }
        }
      val getRadialSegments: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CylinderMesh".cstr.ptr,
            "get_radial_segments".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_radial_segments" }
        }
      val getRings: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CylinderMesh".cstr.ptr,
            "get_rings".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_rings" }
        }
      val getTopRadius: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CylinderMesh".cstr.ptr,
            "get_top_radius".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_top_radius" }
        }
      val setBottomRadius: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CylinderMesh".cstr.ptr,
            "set_bottom_radius".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_bottom_radius" }
        }
      val setHeight: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CylinderMesh".cstr.ptr,
            "set_height".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_height" }
        }
      val setRadialSegments: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CylinderMesh".cstr.ptr,
            "set_radial_segments".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_radial_segments" }
        }
      val setRings: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CylinderMesh".cstr.ptr,
            "set_rings".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_rings" }
        }
      val setTopRadius: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CylinderMesh".cstr.ptr,
            "set_top_radius".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_top_radius" }
        }}
  }
}
