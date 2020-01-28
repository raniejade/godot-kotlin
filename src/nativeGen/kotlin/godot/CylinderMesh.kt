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
    __method_bind.setBottomRadius.call(this._handle, _arg, 1)
  }

  fun setHeight(height: Float) {
    val _arg = Variant.new(height)
    __method_bind.setHeight.call(this._handle, _arg, 1)
  }

  fun setRadialSegments(segments: Int) {
    val _arg = Variant.new(segments)
    __method_bind.setRadialSegments.call(this._handle, _arg, 1)
  }

  fun setRings(rings: Int) {
    val _arg = Variant.new(rings)
    __method_bind.setRings.call(this._handle, _arg, 1)
  }

  fun setTopRadius(radius: Float) {
    val _arg = Variant.new(radius)
    __method_bind.setTopRadius.call(this._handle, _arg, 1)
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
            "getBottomRadius".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getBottomRadius" }
        }
      val getHeight: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CylinderMesh".cstr.ptr,
            "getHeight".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getHeight" }
        }
      val getRadialSegments: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CylinderMesh".cstr.ptr,
            "getRadialSegments".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getRadialSegments" }
        }
      val getRings: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CylinderMesh".cstr.ptr,
            "getRings".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getRings" }
        }
      val getTopRadius: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CylinderMesh".cstr.ptr,
            "getTopRadius".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTopRadius" }
        }
      val setBottomRadius: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CylinderMesh".cstr.ptr,
            "setBottomRadius".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setBottomRadius" }
        }
      val setHeight: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CylinderMesh".cstr.ptr,
            "setHeight".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setHeight" }
        }
      val setRadialSegments: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CylinderMesh".cstr.ptr,
            "setRadialSegments".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setRadialSegments" }
        }
      val setRings: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CylinderMesh".cstr.ptr,
            "setRings".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setRings" }
        }
      val setTopRadius: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CylinderMesh".cstr.ptr,
            "setTopRadius".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setTopRadius" }
        }}
  }
}
