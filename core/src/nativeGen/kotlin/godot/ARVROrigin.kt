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

open class ARVROrigin(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Spatial(null) {
  var worldScale: Float
    get() {
       return getWorldScale() 
    }
    set(value) {
      setWorldScale(value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getWorldScale(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getWorldScale.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun setWorldScale(worldScale: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setWorldScale.call(self._handle, listOf(worldScale), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("ARVROrigin".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for ARVROrigin" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for ARVROrigin
     */
    private object __method_bind {
      val getWorldScale: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVROrigin".cstr.ptr,
            "get_world_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_world_scale" }
        }
      val setWorldScale: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ARVROrigin".cstr.ptr,
            "set_world_scale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_world_scale" }
        }}
  }
}
