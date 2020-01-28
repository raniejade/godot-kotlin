// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Float
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class CSGBox(
  _handle: COpaquePointer
) : CSGPrimitive(_handle) {
  var depth: Float
    get() {
       return getDepth() 
    }
    set(value) {
      setDepth(value)
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

  var width: Float
    get() {
       return getWidth() 
    }
    set(value) {
      setWidth(value)
    }

  fun getDepth(): Float {
    val _ret = __method_bind.getDepth.call(this._handle)
    return _ret.asFloat()
  }

  fun getHeight(): Float {
    val _ret = __method_bind.getHeight.call(this._handle)
    return _ret.asFloat()
  }

  fun getMaterial(): Material {
    val _ret = __method_bind.getMaterial.call(this._handle)
    return _ret.asObject(::Material)!!
  }

  fun getWidth(): Float {
    val _ret = __method_bind.getWidth.call(this._handle)
    return _ret.asFloat()
  }

  fun setDepth(depth: Float) {
    val _arg = Variant.new(depth)
    __method_bind.setDepth.call(this._handle, _arg, 1)
  }

  fun setHeight(height: Float) {
    val _arg = Variant.new(height)
    __method_bind.setHeight.call(this._handle, _arg, 1)
  }

  fun setMaterial(material: Material) {
    val _arg = Variant.new(material)
    __method_bind.setMaterial.call(this._handle, _arg, 1)
  }

  fun setWidth(width: Float) {
    val _arg = Variant.new(width)
    __method_bind.setWidth.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): CSGBox = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("CSGBox".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for CSGBox" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      CSGBox(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): CSGBox = CSGBox(ptr)
    /**
     * Container for method_bind pointers for CSGBox
     */
    private object __method_bind {
      val getDepth: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGBox".cstr.ptr,
            "getDepth".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getDepth" }
        }
      val getHeight: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGBox".cstr.ptr,
            "getHeight".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getHeight" }
        }
      val getMaterial: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGBox".cstr.ptr,
            "getMaterial".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getMaterial" }
        }
      val getWidth: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGBox".cstr.ptr,
            "getWidth".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getWidth" }
        }
      val setDepth: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGBox".cstr.ptr,
            "setDepth".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setDepth" }
        }
      val setHeight: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGBox".cstr.ptr,
            "setHeight".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setHeight" }
        }
      val setMaterial: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGBox".cstr.ptr,
            "setMaterial".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setMaterial" }
        }
      val setWidth: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGBox".cstr.ptr,
            "setWidth".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setWidth" }
        }}
  }
}
