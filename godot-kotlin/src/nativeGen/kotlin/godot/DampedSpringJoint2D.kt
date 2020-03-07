// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Float
import kotlin.String
import kotlin.Suppress
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

open class DampedSpringJoint2D(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Joint2D(null) {
  var damping: Float
    get() {
       return getDamping() 
    }
    set(value) {
      setDamping(value)
    }

  var length: Float
    get() {
       return getLength() 
    }
    set(value) {
      setLength(value)
    }

  var restLength: Float
    get() {
       return getRestLength() 
    }
    set(value) {
      setRestLength(value)
    }

  var stiffness: Float
    get() {
       return getStiffness() 
    }
    set(value) {
      setStiffness(value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getDamping(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getDamping.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getLength(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getLength.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getRestLength(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getRestLength.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getStiffness(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getStiffness.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun setDamping(damping: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setDamping.call(self._handle, listOf(damping), null)
    }
  }

  fun setLength(length: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setLength.call(self._handle, listOf(length), null)
    }
  }

  fun setRestLength(restLength: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setRestLength.call(self._handle, listOf(restLength), null)
    }
  }

  fun setStiffness(stiffness: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setStiffness.call(self._handle, listOf(stiffness), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("DampedSpringJoint2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for DampedSpringJoint2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for DampedSpringJoint2D
     */
    private object __method_bind {
      val getDamping: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DampedSpringJoint2D".cstr.ptr,
              "get_damping".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_damping" }
            }
          }

      val getLength: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DampedSpringJoint2D".cstr.ptr,
              "get_length".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_length" }
            }
          }

      val getRestLength: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DampedSpringJoint2D".cstr.ptr,
              "get_rest_length".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_rest_length" }
            }
          }

      val getStiffness: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DampedSpringJoint2D".cstr.ptr,
              "get_stiffness".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_stiffness" }
            }
          }

      val setDamping: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DampedSpringJoint2D".cstr.ptr,
              "set_damping".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_damping" }
            }
          }

      val setLength: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DampedSpringJoint2D".cstr.ptr,
              "set_length".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_length" }
            }
          }

      val setRestLength: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DampedSpringJoint2D".cstr.ptr,
              "set_rest_length".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_rest_length" }
            }
          }

      val setStiffness: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DampedSpringJoint2D".cstr.ptr,
              "set_stiffness".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_stiffness" }
            }
          }
    }
  }
}
