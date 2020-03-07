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

open class PinJoint2D(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Joint2D(null) {
  var softness: Float
    get() {
       return getSoftness() 
    }
    set(value) {
      setSoftness(value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getSoftness(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getSoftness.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun setSoftness(softness: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSoftness.call(self._handle, listOf(softness), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("PinJoint2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for PinJoint2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for PinJoint2D
     */
    private object __method_bind {
      val getSoftness: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PinJoint2D".cstr.ptr,
              "get_softness".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_softness" }
            }
          }

      val setSoftness: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PinJoint2D".cstr.ptr,
              "set_softness".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_softness" }
            }
          }
    }
  }
}
