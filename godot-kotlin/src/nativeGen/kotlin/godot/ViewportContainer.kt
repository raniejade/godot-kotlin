// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Int
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

open class ViewportContainer(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Container(null) {
  var stretch: Boolean
    get() {
       return isStretchEnabled() 
    }
    set(value) {
      setStretch(value)
    }

  var stretchShrink: Int
    get() {
       return getStretchShrink() 
    }
    set(value) {
      setStretchShrink(value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getStretchShrink(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getStretchShrink.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isStretchEnabled(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isStretchEnabled.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun setStretch(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setStretch.call(self._handle, listOf(enable), null)
    }
  }

  fun setStretchShrink(amount: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setStretchShrink.call(self._handle, listOf(amount), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("ViewportContainer".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for ViewportContainer" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for ViewportContainer
     */
    private object __method_bind {
      val getStretchShrink: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ViewportContainer".cstr.ptr,
              "get_stretch_shrink".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_stretch_shrink" }
            }
          }

      val isStretchEnabled: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ViewportContainer".cstr.ptr,
              "is_stretch_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_stretch_enabled" }
            }
          }

      val setStretch: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ViewportContainer".cstr.ptr,
              "set_stretch".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_stretch" }
            }
          }

      val setStretchShrink: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ViewportContainer".cstr.ptr,
              "set_stretch_shrink".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_stretch_shrink" }
            }
          }
    }
  }
}
