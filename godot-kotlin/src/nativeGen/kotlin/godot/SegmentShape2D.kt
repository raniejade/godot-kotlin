// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
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

open class SegmentShape2D(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Shape2D(null) {
  var a: Vector2
    get() {
       return getA() 
    }
    set(value) {
      setA(value)
    }

  var b: Vector2
    get() {
       return getB() 
    }
    set(value) {
      setB(value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  /**
   * Specialized setter for a
   */
  fun a(cb: Vector2.() -> Unit) {
    val _p = a
    cb(_p)
    a = _p
  }

  /**
   * Specialized setter for b
   */
  fun b(cb: Vector2.() -> Unit) {
    val _p = b
    cb(_p)
    b = _p
  }

  fun getA(): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getA.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getB(): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getB.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun setA(a: Vector2) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setA.call(self._handle, listOf(a), null)
    }
  }

  fun setB(b: Vector2) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setB.call(self._handle, listOf(b), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("SegmentShape2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for SegmentShape2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for SegmentShape2D
     */
    private object __method_bind {
      val getA: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SegmentShape2D".cstr.ptr,
              "get_a".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_a" }
            }
          }

      val getB: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SegmentShape2D".cstr.ptr,
              "get_b".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_b" }
            }
          }

      val setA: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SegmentShape2D".cstr.ptr,
              "set_a".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_a" }
            }
          }

      val setB: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SegmentShape2D".cstr.ptr,
              "set_b".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_b" }
            }
          }
    }
  }
}
