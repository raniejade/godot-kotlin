// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import kotlin.Float
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

open class LineShape2D(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Shape2D(null) {
  var d: Float
    get() {
       return getD() 
    }
    set(value) {
      setD(value)
    }

  var normal: Vector2
    get() {
       return getNormal() 
    }
    set(value) {
      setNormal(value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  /**
   * Specialized setter for normal
   */
  fun normal(cb: Vector2.() -> Unit) {
    val _p = normal
    cb(_p)
    normal = _p
  }

  fun getD(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getD.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getNormal(): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getNormal.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun setD(d: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setD.call(self._handle, listOf(d), null)
    }
  }

  fun setNormal(normal: Vector2) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setNormal.call(self._handle, listOf(normal), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("LineShape2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for LineShape2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for LineShape2D
     */
    private object __method_bind {
      val getD: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineShape2D".cstr.ptr,
            "get_d".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_d" }
        }
      val getNormal: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineShape2D".cstr.ptr,
            "get_normal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_normal" }
        }
      val setD: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineShape2D".cstr.ptr,
            "set_d".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_d" }
        }
      val setNormal: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("LineShape2D".cstr.ptr,
            "set_normal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_normal" }
        }}
  }
}
