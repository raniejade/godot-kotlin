// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Transform2D
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

open class Bone2D(
  _handle: COpaquePointer
) : Node2D(_handle) {
  var defaultLength: Float
    get() {
       return getDefaultLength() 
    }
    set(value) {
      setDefaultLength(value)
    }

  var rest: Transform2D
    get() {
       return getRest() 
    }
    set(value) {
      setRest(value)
    }

  fun applyRest() {
    __method_bind.applyRest.call(this._handle)
  }

  fun getDefaultLength(): Float {
    val _ret = __method_bind.getDefaultLength.call(this._handle)
    return _ret.asFloat()
  }

  fun getIndexInSkeleton(): Int {
    val _ret = __method_bind.getIndexInSkeleton.call(this._handle)
    return _ret.asInt()
  }

  fun getRest(): Transform2D {
    val _ret = __method_bind.getRest.call(this._handle)
    return _ret.asTransform2D()
  }

  fun getSkeletonRest(): Transform2D {
    val _ret = __method_bind.getSkeletonRest.call(this._handle)
    return _ret.asTransform2D()
  }

  fun setDefaultLength(defaultLength: Float) {
    val _arg = Variant.new(defaultLength)
    __method_bind.setDefaultLength.call(this._handle, _arg, 1)
  }

  fun setRest(rest: Transform2D) {
    val _arg = Variant.new(rest)
    __method_bind.setRest.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): Bone2D = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Bone2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for Bone2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Bone2D(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): Bone2D = Bone2D(ptr)
    /**
     * Container for method_bind pointers for Bone2D
     */
    private object __method_bind {
      val applyRest: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Bone2D".cstr.ptr,
            "apply_rest".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method apply_rest" }
        }
      val getDefaultLength: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Bone2D".cstr.ptr,
            "get_default_length".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_default_length" }
        }
      val getIndexInSkeleton: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Bone2D".cstr.ptr,
            "get_index_in_skeleton".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_index_in_skeleton" }
        }
      val getRest: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Bone2D".cstr.ptr,
            "get_rest".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_rest" }
        }
      val getSkeletonRest: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Bone2D".cstr.ptr,
            "get_skeleton_rest".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_skeleton_rest" }
        }
      val setDefaultLength: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Bone2D".cstr.ptr,
            "set_default_length".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_default_length" }
        }
      val setRest: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Bone2D".cstr.ptr,
            "set_rest".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_rest" }
        }}
  }
}
