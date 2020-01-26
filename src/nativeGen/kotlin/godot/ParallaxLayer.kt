// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class ParallaxLayer internal constructor(
  _handle: COpaquePointer
) : Node2D(_handle) {
  companion object {
    fun new(): ParallaxLayer = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("ParallaxLayer".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton ParallaxLayer" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      ParallaxLayer(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for ParallaxLayer
     */
    private object __method_bind {
      val get_mirroring: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParallaxLayer".cstr.ptr,
              "get_mirroring".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_mirroring" }
            }
          }

      val get_motion_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParallaxLayer".cstr.ptr,
              "get_motion_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_motion_offset" }
            }
          }

      val get_motion_scale: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParallaxLayer".cstr.ptr,
              "get_motion_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_motion_scale" }
            }
          }

      val set_mirroring: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParallaxLayer".cstr.ptr,
              "set_mirroring".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_mirroring" }
            }
          }

      val set_motion_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParallaxLayer".cstr.ptr,
              "set_motion_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_motion_offset" }
            }
          }

      val set_motion_scale: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ParallaxLayer".cstr.ptr,
              "set_motion_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_motion_scale" }
            }
          }
    }
  }
}
