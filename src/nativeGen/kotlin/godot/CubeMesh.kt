// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector3
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class CubeMesh(
  _handle: COpaquePointer
) : PrimitiveMesh(_handle) {
  var size: Vector3
    get() {
       return getSize() 
    }
    set(value) {
      setSize(value)
    }

  var subdivideDepth: Int
    get() {
       return getSubdivideDepth() 
    }
    set(value) {
      setSubdivideDepth(value)
    }

  var subdivideHeight: Int
    get() {
       return getSubdivideHeight() 
    }
    set(value) {
      setSubdivideHeight(value)
    }

  var subdivideWidth: Int
    get() {
       return getSubdivideWidth() 
    }
    set(value) {
      setSubdivideWidth(value)
    }

  fun getSize(): Vector3 {
    val _ret = __method_bind.getSize.call(this._handle)
    return _ret.asVector3()
  }

  fun getSubdivideDepth(): Int {
    val _ret = __method_bind.getSubdivideDepth.call(this._handle)
    return _ret.asInt()
  }

  fun getSubdivideHeight(): Int {
    val _ret = __method_bind.getSubdivideHeight.call(this._handle)
    return _ret.asInt()
  }

  fun getSubdivideWidth(): Int {
    val _ret = __method_bind.getSubdivideWidth.call(this._handle)
    return _ret.asInt()
  }

  fun setSize(size: Vector3) {
    val _arg = Variant.new(size)
    __method_bind.setSize.call(this._handle, _arg, 1)
  }

  fun setSubdivideDepth(divisions: Int) {
    val _arg = Variant.new(divisions)
    __method_bind.setSubdivideDepth.call(this._handle, _arg, 1)
  }

  fun setSubdivideHeight(divisions: Int) {
    val _arg = Variant.new(divisions)
    __method_bind.setSubdivideHeight.call(this._handle, _arg, 1)
  }

  fun setSubdivideWidth(subdivide: Int) {
    val _arg = Variant.new(subdivide)
    __method_bind.setSubdivideWidth.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): CubeMesh = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("CubeMesh".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for CubeMesh" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      CubeMesh(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): CubeMesh = CubeMesh(ptr)
    /**
     * Container for method_bind pointers for CubeMesh
     */
    private object __method_bind {
      val getSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CubeMesh".cstr.ptr,
            "getSize".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSize" }
        }
      val getSubdivideDepth: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CubeMesh".cstr.ptr,
            "getSubdivideDepth".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSubdivideDepth" }
        }
      val getSubdivideHeight: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CubeMesh".cstr.ptr,
            "getSubdivideHeight".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSubdivideHeight" }
        }
      val getSubdivideWidth: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CubeMesh".cstr.ptr,
            "getSubdivideWidth".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSubdivideWidth" }
        }
      val setSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CubeMesh".cstr.ptr,
            "setSize".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSize" }
        }
      val setSubdivideDepth: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CubeMesh".cstr.ptr,
            "setSubdivideDepth".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSubdivideDepth" }
        }
      val setSubdivideHeight: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CubeMesh".cstr.ptr,
            "setSubdivideHeight".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSubdivideHeight" }
        }
      val setSubdivideWidth: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CubeMesh".cstr.ptr,
            "setSubdivideWidth".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSubdivideWidth" }
        }}
  }
}
