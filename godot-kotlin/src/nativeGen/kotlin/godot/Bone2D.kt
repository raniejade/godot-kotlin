// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Transform2D
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Float
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

open class Bone2D(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Node2D(null) {
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

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  /**
   * Specialized setter for rest
   */
  fun rest(cb: Transform2D.() -> Unit) {
    val _p = rest
    cb(_p)
    rest = _p
  }

  fun applyRest() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.applyRest.call(self._handle, emptyList(), null)
    }
  }

  fun getDefaultLength(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getDefaultLength.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getIndexInSkeleton(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getIndexInSkeleton.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getRest(): Transform2D {
    val self = this
    return Allocator.allocationScope {
      val _ret = Transform2D()
      val _retPtr = _ret._value.ptr
      __method_bind.getRest.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getSkeletonRest(): Transform2D {
    val self = this
    return Allocator.allocationScope {
      val _ret = Transform2D()
      val _retPtr = _ret._value.ptr
      __method_bind.getSkeletonRest.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun setDefaultLength(defaultLength: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setDefaultLength.call(self._handle, listOf(defaultLength), null)
    }
  }

  fun setRest(rest: Transform2D) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setRest.call(self._handle, listOf(rest), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Bone2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for Bone2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for Bone2D
     */
    private object __method_bind {
      val applyRest: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Bone2D".cstr.ptr,
              "apply_rest".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method apply_rest" }
            }
          }

      val getDefaultLength: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Bone2D".cstr.ptr,
              "get_default_length".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_default_length" }
            }
          }

      val getIndexInSkeleton: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Bone2D".cstr.ptr,
              "get_index_in_skeleton".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_index_in_skeleton" }
            }
          }

      val getRest: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Bone2D".cstr.ptr,
              "get_rest".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_rest" }
            }
          }

      val getSkeletonRest: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Bone2D".cstr.ptr,
              "get_skeleton_rest".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_skeleton_rest" }
            }
          }

      val setDefaultLength: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Bone2D".cstr.ptr,
              "set_default_length".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_default_length" }
            }
          }

      val setRest: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Bone2D".cstr.ptr,
              "set_rest".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_rest" }
            }
          }
    }
  }
}
