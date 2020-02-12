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

open class CylinderShape(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Shape(null) {
  var height: Float
    get() {
       return getHeight() 
    }
    set(value) {
      setHeight(value)
    }

  var radius: Float
    get() {
       return getRadius() 
    }
    set(value) {
      setRadius(value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getHeight(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getHeight.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getRadius(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getRadius.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun setHeight(height: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setHeight.call(self._handle, listOf(height), null)
    }
  }

  fun setRadius(radius: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setRadius.call(self._handle, listOf(radius), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("CylinderShape".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for CylinderShape" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for CylinderShape
     */
    private object __method_bind {
      val getHeight: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CylinderShape".cstr.ptr,
            "get_height".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_height" }
        }
      val getRadius: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CylinderShape".cstr.ptr,
            "get_radius".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_radius" }
        }
      val setHeight: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CylinderShape".cstr.ptr,
            "set_height".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_height" }
        }
      val setRadius: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CylinderShape".cstr.ptr,
            "set_radius".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_radius" }
        }}
  }
}
