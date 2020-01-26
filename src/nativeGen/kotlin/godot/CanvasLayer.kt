// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.RID
import godot.core.Transform2D
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class CanvasLayer internal constructor(
  _handle: COpaquePointer
) : Node(_handle) {
  fun getCanvas(): RID {
    TODO()
  }

  fun getCustomViewport(): Node {
    TODO()
  }

  fun getFollowViewportScale(): Float {
    TODO()
  }

  fun getLayer(): Int {
    TODO()
  }

  fun getOffset(): Vector2 {
    TODO()
  }

  fun getRotation(): Float {
    TODO()
  }

  fun getRotationDegrees(): Float {
    TODO()
  }

  fun getScale(): Vector2 {
    TODO()
  }

  fun getTransform(): Transform2D {
    TODO()
  }

  fun isFollowingViewport(): Boolean {
    TODO()
  }

  fun setCustomViewport(viewport: Node) {
    TODO()
  }

  fun setFollowViewport(enable: Boolean) {
    TODO()
  }

  fun setFollowViewportScale(scale: Float) {
    TODO()
  }

  fun setLayer(layer: Int) {
    TODO()
  }

  fun setOffset(offset: Vector2) {
    TODO()
  }

  fun setRotation(radians: Float) {
    TODO()
  }

  fun setRotationDegrees(degrees: Float) {
    TODO()
  }

  fun setScale(scale: Vector2) {
    TODO()
  }

  fun setTransform(transform: Transform2D) {
    TODO()
  }

  companion object {
    fun new(): CanvasLayer = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("CanvasLayer".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton CanvasLayer" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      CanvasLayer(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for CanvasLayer
     */
    private object __method_bind {
      val get_canvas: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasLayer".cstr.ptr,
              "get_canvas".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_canvas" }
            }
          }

      val get_custom_viewport: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasLayer".cstr.ptr,
              "get_custom_viewport".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_custom_viewport" }
            }
          }

      val get_follow_viewport_scale: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasLayer".cstr.ptr,
              "get_follow_viewport_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_follow_viewport_scale" }
            }
          }

      val get_layer: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasLayer".cstr.ptr,
              "get_layer".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_layer" }
            }
          }

      val get_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasLayer".cstr.ptr,
              "get_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_offset" }
            }
          }

      val get_rotation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasLayer".cstr.ptr,
              "get_rotation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_rotation" }
            }
          }

      val get_rotation_degrees: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasLayer".cstr.ptr,
              "get_rotation_degrees".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_rotation_degrees" }
            }
          }

      val get_scale: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasLayer".cstr.ptr,
              "get_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_scale" }
            }
          }

      val get_transform: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasLayer".cstr.ptr,
              "get_transform".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_transform" }
            }
          }

      val is_following_viewport: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasLayer".cstr.ptr,
              "is_following_viewport".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_following_viewport" }
            }
          }

      val set_custom_viewport: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasLayer".cstr.ptr,
              "set_custom_viewport".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_custom_viewport" }
            }
          }

      val set_follow_viewport: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasLayer".cstr.ptr,
              "set_follow_viewport".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_follow_viewport" }
            }
          }

      val set_follow_viewport_scale: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasLayer".cstr.ptr,
              "set_follow_viewport_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_follow_viewport_scale" }
            }
          }

      val set_layer: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasLayer".cstr.ptr,
              "set_layer".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_layer" }
            }
          }

      val set_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasLayer".cstr.ptr,
              "set_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_offset" }
            }
          }

      val set_rotation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasLayer".cstr.ptr,
              "set_rotation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_rotation" }
            }
          }

      val set_rotation_degrees: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasLayer".cstr.ptr,
              "set_rotation_degrees".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_rotation_degrees" }
            }
          }

      val set_scale: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasLayer".cstr.ptr,
              "set_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_scale" }
            }
          }

      val set_transform: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasLayer".cstr.ptr,
              "set_transform".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_transform" }
            }
          }
    }
  }
}
