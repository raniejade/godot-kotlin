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

open class RectangleShape2D(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Shape2D(null) {
  var extents: Vector2
    get() {
       return getExtents() 
    }
    set(value) {
      setExtents(value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  /**
   * Specialized setter for extents
   */
  fun extents(cb: Vector2.() -> Unit) {
    val _p = extents
    cb(_p)
    extents = _p
  }

  fun getExtents(): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getExtents.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun setExtents(extents: Vector2) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setExtents.call(self._handle, listOf(extents), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("RectangleShape2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for RectangleShape2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for RectangleShape2D
     */
    private object __method_bind {
      val getExtents: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RectangleShape2D".cstr.ptr,
            "get_extents".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_extents" }
        }
      val setExtents: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("RectangleShape2D".cstr.ptr,
            "set_extents".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_extents" }
        }}
  }
}
