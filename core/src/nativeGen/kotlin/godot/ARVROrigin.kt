// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Float
import kotlin.String
import kotlin.Suppress
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

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
    val _ret = __method_bind.getWorldScale.call(this._handle)
    return _ret.asFloat()
  }

  fun setWorldScale(worldScale: Float) {
    val _arg = Variant(worldScale)
    __method_bind.setWorldScale.call(this._handle, listOf(_arg))
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
