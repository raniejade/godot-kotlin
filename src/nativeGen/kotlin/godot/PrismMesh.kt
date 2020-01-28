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
  var leftToRight: Float
    get() {
       return getLeftToRight() 
    }
    set(value) {
      setLeftToRight(value)
    }

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

  fun getLeftToRight(): Float {
    val _ret = __method_bind.getLeftToRight.call(this._handle)
    return _ret.asFloat()
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

  fun setLeftToRight(leftToRight: Float) {
    val _arg = Variant.new(leftToRight)
    __method_bind.setLeftToRight.call(this._handle, _arg, 1)
  }

  fun setSize(size: Vector3) {
    val _arg = Variant.new(size)
    __method_bind.setSize.call(this._handle, _arg, 1)
  }

  fun setSubdivideDepth(segments: Int) {
    val _arg = Variant.new(segments)
    __method_bind.setSubdivideDepth.call(this._handle, _arg, 1)
  }

  fun setSubdivideHeight(segments: Int) {
    val _arg = Variant.new(segments)
    __method_bind.setSubdivideHeight.call(this._handle, _arg, 1)
  }

  fun setSubdivideWidth(segments: Int) {
    val _arg = Variant.new(segments)
    __method_bind.setSubdivideWidth.call(this._handle, _arg, 1)
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
      val getLeftToRight: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PrismMesh".cstr.ptr,
            "getLeftToRight".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getLeftToRight" }
        }
      val getSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PrismMesh".cstr.ptr,
            "getSize".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSize" }
        }
      val getSubdivideDepth: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PrismMesh".cstr.ptr,
            "getSubdivideDepth".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSubdivideDepth" }
        }
      val getSubdivideHeight: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PrismMesh".cstr.ptr,
            "getSubdivideHeight".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSubdivideHeight" }
        }
      val getSubdivideWidth: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PrismMesh".cstr.ptr,
            "getSubdivideWidth".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSubdivideWidth" }
        }
      val setLeftToRight: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PrismMesh".cstr.ptr,
            "setLeftToRight".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setLeftToRight" }
        }
      val setSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PrismMesh".cstr.ptr,
            "setSize".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSize" }
        }
      val setSubdivideDepth: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PrismMesh".cstr.ptr,
            "setSubdivideDepth".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSubdivideDepth" }
        }
      val setSubdivideHeight: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PrismMesh".cstr.ptr,
            "setSubdivideHeight".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSubdivideHeight" }
        }
      val setSubdivideWidth: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PrismMesh".cstr.ptr,
            "setSubdivideWidth".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSubdivideWidth" }
        }}
  }
}
