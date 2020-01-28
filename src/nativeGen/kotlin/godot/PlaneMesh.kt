// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class PlaneMesh(
  _handle: COpaquePointer
) : PrimitiveMesh(_handle) {
  var size: Vector2
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

  var subdivideWidth: Int
    get() {
       return getSubdivideWidth() 
    }
    set(value) {
      setSubdivideWidth(value)
    }

  fun getSize(): Vector2 {
    val _ret = __method_bind.getSize.call(this._handle)
    return _ret.asVector2()
  }

  fun getSubdivideDepth(): Int {
    val _ret = __method_bind.getSubdivideDepth.call(this._handle)
    return _ret.asInt()
  }

  fun getSubdivideWidth(): Int {
    val _ret = __method_bind.getSubdivideWidth.call(this._handle)
    return _ret.asInt()
  }

  fun setSize(size: Vector2) {
    val _arg = Variant.new(size)
    __method_bind.setSize.call(this._handle, _arg, 1)
  }

  fun setSubdivideDepth(subdivide: Int) {
    val _arg = Variant.new(subdivide)
    __method_bind.setSubdivideDepth.call(this._handle, _arg, 1)
  }

  fun setSubdivideWidth(subdivide: Int) {
    val _arg = Variant.new(subdivide)
    __method_bind.setSubdivideWidth.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): PlaneMesh = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("PlaneMesh".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for PlaneMesh" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      PlaneMesh(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): PlaneMesh = PlaneMesh(ptr)
    /**
     * Container for method_bind pointers for PlaneMesh
     */
    private object __method_bind {
      val getSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PlaneMesh".cstr.ptr,
            "get_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_size" }
        }
      val getSubdivideDepth: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PlaneMesh".cstr.ptr,
            "get_subdivide_depth".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_subdivide_depth" }
        }
      val getSubdivideWidth: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PlaneMesh".cstr.ptr,
            "get_subdivide_width".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_subdivide_width" }
        }
      val setSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PlaneMesh".cstr.ptr,
            "set_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_size" }
        }
      val setSubdivideDepth: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PlaneMesh".cstr.ptr,
            "set_subdivide_depth".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_subdivide_depth" }
        }
      val setSubdivideWidth: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PlaneMesh".cstr.ptr,
            "set_subdivide_width".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_subdivide_width" }
        }}
  }
}
