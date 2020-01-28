// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector3
import kotlin.Int
import kotlin.Unit
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

  /**
   * Specialized setter for size
   */
  fun size(cb: Vector3.() -> Unit) {
    val _p = size
    cb(_p)
    size = _p
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
            "get_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_size" }
        }
      val getSubdivideDepth: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CubeMesh".cstr.ptr,
            "get_subdivide_depth".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_subdivide_depth" }
        }
      val getSubdivideHeight: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CubeMesh".cstr.ptr,
            "get_subdivide_height".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_subdivide_height" }
        }
      val getSubdivideWidth: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CubeMesh".cstr.ptr,
            "get_subdivide_width".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_subdivide_width" }
        }
      val setSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CubeMesh".cstr.ptr,
            "set_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_size" }
        }
      val setSubdivideDepth: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CubeMesh".cstr.ptr,
            "set_subdivide_depth".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_subdivide_depth" }
        }
      val setSubdivideHeight: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CubeMesh".cstr.ptr,
            "set_subdivide_height".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_subdivide_height" }
        }
      val setSubdivideWidth: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CubeMesh".cstr.ptr,
            "set_subdivide_width".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_subdivide_width" }
        }}
  }
}
