// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Plane
import godot.core.Variant
import godot.core.VariantArray
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

open class PlaneShape(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Shape(null) {
  var plane: Plane
    get() {
       return getPlane() 
    }
    set(value) {
      setPlane(value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  /**
   * Specialized setter for plane
   */
  fun plane(cb: Plane.() -> Unit) {
    val _p = plane
    cb(_p)
    plane = _p
  }

  fun getPlane(): Plane {
    val self = this
    return Allocator.allocationScope {
      val _ret = Plane()
      val _retPtr = _ret._value.ptr
      __method_bind.getPlane.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun setPlane(plane: Plane) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setPlane.call(self._handle, listOf(plane), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("PlaneShape".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for PlaneShape" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for PlaneShape
     */
    private object __method_bind {
      val getPlane: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PlaneShape".cstr.ptr,
            "get_plane".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_plane" }
        }
      val setPlane: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PlaneShape".cstr.ptr,
            "set_plane".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_plane" }
        }}
  }
}
