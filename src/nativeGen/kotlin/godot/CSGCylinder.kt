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

open class CSGCylinder(
  _handle: COpaquePointer
) : CSGPrimitive(_handle) {
  var cone: Boolean
    get() {
       return isCone() 
    }
    set(value) {
      setCone(value)
    }

  var height: Float
    get() {
       return getHeight() 
    }
    set(value) {
      setHeight(value)
    }

  var material: `SpatialMaterial,ShaderMaterial`
    get() {
       return getMaterial() 
    }
    set(value) {
      setMaterial(value)
    }

  var radius: Float
    get() {
       return getRadius() 
    }
    set(value) {
      setRadius(value)
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

  fun getHeight(): Float {
    val _ret = __method_bind.getHeight.call(this._handle)
    return _ret.asFloat()
  }

  fun getMaterial(): Material {
    val _ret = __method_bind.getMaterial.call(this._handle)
    return _ret.asObject(::Material)!!
  }

  fun getRadius(): Float {
    val _ret = __method_bind.getRadius.call(this._handle)
    return _ret.asFloat()
  }

  fun getSides(): Int {
    val _ret = __method_bind.getSides.call(this._handle)
    return _ret.asInt()
  }

  fun getSmoothFaces(): Boolean {
    val _ret = __method_bind.getSmoothFaces.call(this._handle)
    return _ret.asBoolean()
  }

  fun isCone(): Boolean {
    val _ret = __method_bind.isCone.call(this._handle)
    return _ret.asBoolean()
  }

  fun setCone(cone: Boolean) {
    val _arg = Variant.new(cone)
    __method_bind.setCone.call(this._handle, _arg, 1)
  }

  fun setHeight(height: Float) {
    val _arg = Variant.new(height)
    __method_bind.setHeight.call(this._handle, _arg, 1)
  }

  fun setMaterial(material: Material) {
    val _arg = Variant.new(material)
    __method_bind.setMaterial.call(this._handle, _arg, 1)
  }

  fun setRadius(radius: Float) {
    val _arg = Variant.new(radius)
    __method_bind.setRadius.call(this._handle, _arg, 1)
  }

  fun setSides(sides: Int) {
    val _arg = Variant.new(sides)
    __method_bind.setSides.call(this._handle, _arg, 1)
  }

  fun setSmoothFaces(smoothFaces: Boolean) {
    val _arg = Variant.new(smoothFaces)
    __method_bind.setSmoothFaces.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): CSGCylinder = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("CSGCylinder".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for CSGCylinder" }
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
      val getHeight: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGCylinder".cstr.ptr,
            "getHeight".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getHeight" }
        }
      val getMaterial: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGCylinder".cstr.ptr,
            "getMaterial".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getMaterial" }
        }
      val getRadius: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGCylinder".cstr.ptr,
            "getRadius".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getRadius" }
        }
      val getSides: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGCylinder".cstr.ptr,
            "getSides".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSides" }
        }
      val getSmoothFaces: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGCylinder".cstr.ptr,
            "getSmoothFaces".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSmoothFaces" }
        }
      val isCone: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGCylinder".cstr.ptr,
            "isCone".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isCone" }
        }
      val setCone: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGCylinder".cstr.ptr,
            "setCone".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCone" }
        }
      val setHeight: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGCylinder".cstr.ptr,
            "setHeight".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setHeight" }
        }
      val setMaterial: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGCylinder".cstr.ptr,
            "setMaterial".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setMaterial" }
        }
      val setRadius: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGCylinder".cstr.ptr,
            "setRadius".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setRadius" }
        }
      val setSides: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGCylinder".cstr.ptr,
            "setSides".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSides" }
        }
      val setSmoothFaces: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGCylinder".cstr.ptr,
            "setSmoothFaces".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSmoothFaces" }
        }}
  }
}
