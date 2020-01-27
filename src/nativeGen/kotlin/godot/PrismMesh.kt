// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector3
import kotlin.Float
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class PrismMesh(
  _handle: COpaquePointer
) : PrimitiveMesh(_handle) {
  fun getLeftToRight(): Float {
    val _ret = __method_bind.get_left_to_right.call(this._handle)
    return _ret.asFloat()
  }

  fun getSize(): Vector3 {
    val _ret = __method_bind.get_size.call(this._handle)
    return _ret.asVector3()
  }

  fun getSubdivideDepth(): Int {
    val _ret = __method_bind.get_subdivide_depth.call(this._handle)
    return _ret.asInt()
  }

  fun getSubdivideHeight(): Int {
    val _ret = __method_bind.get_subdivide_height.call(this._handle)
    return _ret.asInt()
  }

  fun getSubdivideWidth(): Int {
    val _ret = __method_bind.get_subdivide_width.call(this._handle)
    return _ret.asInt()
  }

  fun setLeftToRight(leftToRight: Float) {
    val _arg = Variant.new(leftToRight)
    __method_bind.set_left_to_right.call(this._handle, _arg, 1)
  }

  fun setSize(size: Vector3) {
    val _arg = Variant.new(size)
    __method_bind.set_size.call(this._handle, _arg, 1)
  }

  fun setSubdivideDepth(segments: Int) {
    val _arg = Variant.new(segments)
    __method_bind.set_subdivide_depth.call(this._handle, _arg, 1)
  }

  fun setSubdivideHeight(segments: Int) {
    val _arg = Variant.new(segments)
    __method_bind.set_subdivide_height.call(this._handle, _arg, 1)
  }

  fun setSubdivideWidth(segments: Int) {
    val _arg = Variant.new(segments)
    __method_bind.set_subdivide_width.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): PrismMesh = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("PrismMesh".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for PrismMesh" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      PrismMesh(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): PrismMesh = PrismMesh(ptr)
    /**
     * Container for method_bind pointers for PrismMesh
     */
    private object __method_bind {
      val get_left_to_right: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PrismMesh".cstr.ptr,
            "get_left_to_right".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_left_to_right" }
        }
      val get_size: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PrismMesh".cstr.ptr,
            "get_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_size" }
        }
      val get_subdivide_depth: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PrismMesh".cstr.ptr,
            "get_subdivide_depth".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_subdivide_depth" }
        }
      val get_subdivide_height: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PrismMesh".cstr.ptr,
            "get_subdivide_height".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_subdivide_height" }
        }
      val get_subdivide_width: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PrismMesh".cstr.ptr,
            "get_subdivide_width".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_subdivide_width" }
        }
      val set_left_to_right: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PrismMesh".cstr.ptr,
            "set_left_to_right".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_left_to_right" }
        }
      val set_size: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PrismMesh".cstr.ptr,
            "set_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_size" }
        }
      val set_subdivide_depth: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PrismMesh".cstr.ptr,
            "set_subdivide_depth".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_subdivide_depth" }
        }
      val set_subdivide_height: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PrismMesh".cstr.ptr,
            "set_subdivide_height".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_subdivide_height" }
        }
      val set_subdivide_width: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PrismMesh".cstr.ptr,
            "set_subdivide_width".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_subdivide_width" }
        }}
  }
}
