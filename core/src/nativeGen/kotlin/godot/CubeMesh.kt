// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector3
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.reflect.KCallable
import kotlinx.cinterop.BooleanVar
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.COpaquePointerVar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.DoubleVar
import kotlinx.cinterop.IntVar
import kotlinx.cinterop.alloc
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.readValue
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.value

open class CubeMesh(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : PrimitiveMesh(null) {
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

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
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
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector3()
      val _retPtr = _ret._value.ptr
      __method_bind.getSize.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getSubdivideDepth(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getSubdivideDepth.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getSubdivideHeight(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getSubdivideHeight.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getSubdivideWidth(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getSubdivideWidth.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun setSize(size: Vector3) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSize.call(self._handle, listOf(size), null)
    }
  }

  fun setSubdivideDepth(divisions: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSubdivideDepth.call(self._handle, listOf(divisions), null)
    }
  }

  fun setSubdivideHeight(divisions: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSubdivideHeight.call(self._handle, listOf(divisions), null)
    }
  }

  fun setSubdivideWidth(subdivide: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSubdivideWidth.call(self._handle, listOf(subdivide), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("CubeMesh".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for CubeMesh" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for CubeMesh
     */
    private object __method_bind {
      val getSize: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CubeMesh".cstr.ptr,
            "get_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_size" }
        }
      val getSubdivideDepth: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CubeMesh".cstr.ptr,
            "get_subdivide_depth".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_subdivide_depth" }
        }
      val getSubdivideHeight: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CubeMesh".cstr.ptr,
            "get_subdivide_height".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_subdivide_height" }
        }
      val getSubdivideWidth: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CubeMesh".cstr.ptr,
            "get_subdivide_width".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_subdivide_width" }
        }
      val setSize: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CubeMesh".cstr.ptr,
            "set_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_size" }
        }
      val setSubdivideDepth: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CubeMesh".cstr.ptr,
            "set_subdivide_depth".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_subdivide_depth" }
        }
      val setSubdivideHeight: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CubeMesh".cstr.ptr,
            "set_subdivide_height".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_subdivide_height" }
        }
      val setSubdivideWidth: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CubeMesh".cstr.ptr,
            "set_subdivide_width".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_subdivide_width" }
        }}
  }
}
