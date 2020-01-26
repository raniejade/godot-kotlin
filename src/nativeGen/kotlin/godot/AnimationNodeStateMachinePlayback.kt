// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.PoolStringArray
import kotlin.Boolean
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class AnimationNodeStateMachinePlayback internal constructor(
  _handle: COpaquePointer
) : Resource(_handle) {
  fun getCurrentNode(): String {
    TODO()
  }

  fun getTravelPath(): PoolStringArray {
    TODO()
  }

  fun isPlaying(): Boolean {
    TODO()
  }

  fun start(node: String) {
    TODO()
  }

  fun stop() {
    TODO()
  }

  fun travel(to_node: String) {
    TODO()
  }

  companion object {
    fun new(): AnimationNodeStateMachinePlayback = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AnimationNodeStateMachinePlayback".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton AnimationNodeStateMachinePlayback" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      AnimationNodeStateMachinePlayback(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): AnimationNodeStateMachinePlayback =
        AnimationNodeStateMachinePlayback(ptr)
    /**
     * Container for method_bind pointers for AnimationNodeStateMachinePlayback
     */
    private object __method_bind {
      val get_current_node: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachinePlayback".cstr.ptr,
              "get_current_node".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_current_node" }
            }
          }

      val get_travel_path: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachinePlayback".cstr.ptr,
              "get_travel_path".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_travel_path" }
            }
          }

      val is_playing: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachinePlayback".cstr.ptr,
              "is_playing".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_playing" }
            }
          }

      val start: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachinePlayback".cstr.ptr,
              "start".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method start" }
            }
          }

      val stop: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachinePlayback".cstr.ptr,
              "stop".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method stop" }
            }
          }

      val travel: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeStateMachinePlayback".cstr.ptr,
              "travel".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method travel" }
            }
          }
    }
  }
}
