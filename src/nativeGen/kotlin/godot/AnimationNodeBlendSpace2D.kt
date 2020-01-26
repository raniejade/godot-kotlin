// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class AnimationNodeBlendSpace2D internal constructor(
  _handle: COpaquePointer
) : AnimationRootNode(_handle) {
  fun addBlendPoint() {
    TODO()
  }

  fun addTriangle() {
    TODO()
  }

  fun getAutoTriangles(): Boolean {
    TODO()
  }

  fun getBlendMode(): BlendMode {
    TODO()
  }

  fun getBlendPointCount(): Int {
    TODO()
  }

  fun getBlendPointNode(): AnimationRootNode {
    TODO()
  }

  fun getBlendPointPosition(): Vector2 {
    TODO()
  }

  fun getMaxSpace(): Vector2 {
    TODO()
  }

  fun getMinSpace(): Vector2 {
    TODO()
  }

  fun getSnap(): Vector2 {
    TODO()
  }

  fun getTriangleCount(): Int {
    TODO()
  }

  fun getTrianglePoint(): Int {
    TODO()
  }

  fun getXLabel(): String {
    TODO()
  }

  fun getYLabel(): String {
    TODO()
  }

  fun removeBlendPoint() {
    TODO()
  }

  fun removeTriangle() {
    TODO()
  }

  fun setAutoTriangles() {
    TODO()
  }

  fun setBlendMode() {
    TODO()
  }

  fun setBlendPointNode() {
    TODO()
  }

  fun setBlendPointPosition() {
    TODO()
  }

  fun setMaxSpace() {
    TODO()
  }

  fun setMinSpace() {
    TODO()
  }

  fun setSnap() {
    TODO()
  }

  fun setXLabel() {
    TODO()
  }

  fun setYLabel() {
    TODO()
  }

  enum class BlendMode(
    val value: Int
  ) {
    BLEND_MODE_INTERPOLATED(0),

    BLEND_MODE_DISCRETE(1),

    BLEND_MODE_DISCRETE_CARRY(2);
  }

  companion object {
    val BLEND_MODE_DISCRETE: Int = 1

    val BLEND_MODE_DISCRETE_CARRY: Int = 2

    val BLEND_MODE_INTERPOLATED: Int = 0

    fun new(): AnimationNodeBlendSpace2D = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AnimationNodeBlendSpace2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton AnimationNodeBlendSpace2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      AnimationNodeBlendSpace2D(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for AnimationNodeBlendSpace2D
     */
    private object __method_bind {
      val add_blend_point: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
              "add_blend_point".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_blend_point" }
            }
          }

      val add_triangle: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
              "add_triangle".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_triangle" }
            }
          }

      val get_auto_triangles: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
              "get_auto_triangles".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_auto_triangles" }
            }
          }

      val get_blend_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
              "get_blend_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_blend_mode" }
            }
          }

      val get_blend_point_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
              "get_blend_point_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_blend_point_count" }
            }
          }

      val get_blend_point_node: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
              "get_blend_point_node".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_blend_point_node" }
            }
          }

      val get_blend_point_position: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
              "get_blend_point_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_blend_point_position" }
            }
          }

      val get_max_space: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
              "get_max_space".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_max_space" }
            }
          }

      val get_min_space: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
              "get_min_space".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_min_space" }
            }
          }

      val get_snap: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
              "get_snap".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_snap" }
            }
          }

      val get_triangle_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
              "get_triangle_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_triangle_count" }
            }
          }

      val get_triangle_point: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
              "get_triangle_point".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_triangle_point" }
            }
          }

      val get_x_label: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
              "get_x_label".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_x_label" }
            }
          }

      val get_y_label: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
              "get_y_label".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_y_label" }
            }
          }

      val remove_blend_point: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
              "remove_blend_point".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_blend_point" }
            }
          }

      val remove_triangle: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
              "remove_triangle".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_triangle" }
            }
          }

      val set_auto_triangles: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
              "set_auto_triangles".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_auto_triangles" }
            }
          }

      val set_blend_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
              "set_blend_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_blend_mode" }
            }
          }

      val set_blend_point_node: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
              "set_blend_point_node".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_blend_point_node" }
            }
          }

      val set_blend_point_position: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
              "set_blend_point_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_blend_point_position" }
            }
          }

      val set_max_space: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
              "set_max_space".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_max_space" }
            }
          }

      val set_min_space: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
              "set_min_space".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_min_space" }
            }
          }

      val set_snap: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
              "set_snap".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_snap" }
            }
          }

      val set_x_label: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
              "set_x_label".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_x_label" }
            }
          }

      val set_y_label: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace2D".cstr.ptr,
              "set_y_label".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_y_label" }
            }
          }
    }
  }
}
