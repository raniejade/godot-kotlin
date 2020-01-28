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

open class CSGTorus(
  _handle: COpaquePointer
) : CSGPrimitive(_handle) {
  var innerRadius: Float
    get() {
       return getInnerRadius() 
    }
    set(value) {
      setInnerRadius(value)
    }

  var material: `SpatialMaterial,ShaderMaterial`
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

  fun getInnerRadius(): Float {
    val _ret = __method_bind.getInnerRadius.call(this._handle)
    return _ret.asFloat()
  }

  fun getMaterial(): Material {
    val _ret = __method_bind.getMaterial.call(this._handle)
    return _ret.asObject(::Material)!!
  }

  fun getOuterRadius(): Float {
    val _ret = __method_bind.getOuterRadius.call(this._handle)
    return _ret.asFloat()
  }

  fun getRingSides(): Int {
    val _ret = __method_bind.getRingSides.call(this._handle)
    return _ret.asInt()
  }

  fun getSides(): Int {
    val _ret = __method_bind.getSides.call(this._handle)
    return _ret.asInt()
  }

  fun getSmoothFaces(): Boolean {
    val _ret = __method_bind.getSmoothFaces.call(this._handle)
    return _ret.asBoolean()
  }

  fun setInnerRadius(radius: Float) {
    val _arg = Variant.new(radius)
    __method_bind.setInnerRadius.call(this._handle, _arg, 1)
  }

  fun setMaterial(material: Material) {
    val _arg = Variant.new(material)
    __method_bind.setMaterial.call(this._handle, _arg, 1)
  }

  fun setOuterRadius(radius: Float) {
    val _arg = Variant.new(radius)
    __method_bind.setOuterRadius.call(this._handle, _arg, 1)
  }

  fun setRingSides(sides: Int) {
    val _arg = Variant.new(sides)
    __method_bind.setRingSides.call(this._handle, _arg, 1)
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
      val getInnerRadius: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGTorus".cstr.ptr,
            "getInnerRadius".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getInnerRadius" }
        }
      val getMaterial: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGTorus".cstr.ptr,
            "getMaterial".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getMaterial" }
        }
      val getOuterRadius: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGTorus".cstr.ptr,
            "getOuterRadius".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getOuterRadius" }
        }
      val getRingSides: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGTorus".cstr.ptr,
            "getRingSides".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getRingSides" }
        }
      val getSides: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGTorus".cstr.ptr,
            "getSides".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSides" }
        }
      val getSmoothFaces: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGTorus".cstr.ptr,
            "getSmoothFaces".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSmoothFaces" }
        }
      val setInnerRadius: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGTorus".cstr.ptr,
            "setInnerRadius".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setInnerRadius" }
        }
      val setMaterial: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGTorus".cstr.ptr,
            "setMaterial".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setMaterial" }
        }
      val setOuterRadius: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGTorus".cstr.ptr,
            "setOuterRadius".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setOuterRadius" }
        }
      val setRingSides: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGTorus".cstr.ptr,
            "setRingSides".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setRingSides" }
        }
      val setSides: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGTorus".cstr.ptr,
            "setSides".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSides" }
        }
      val setSmoothFaces: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGTorus".cstr.ptr,
            "setSmoothFaces".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSmoothFaces" }
        }}
  }
}
