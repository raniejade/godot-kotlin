// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class AnimationNodeBlendSpace1D internal constructor(
  _handle: COpaquePointer
) : AnimationRootNode(_handle) {
  fun addBlendPoint() {
    TODO()
  }

  fun treeChanged() {
    TODO()
  }

  fun addBlendPoint() {
    TODO()
  }

  fun getBlendPointCount(): Int {
    TODO()
  }

  fun getBlendPointNode(): AnimationRootNode {
    TODO()
  }

  fun getBlendPointPosition(): Float {
    TODO()
  }

  fun getMaxSpace(): Float {
    TODO()
  }

  fun getMinSpace(): Float {
    TODO()
  }

  fun getSnap(): Float {
    TODO()
  }

  fun getValueLabel(): String {
    TODO()
  }

  fun removeBlendPoint() {
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

  fun setValueLabel() {
    TODO()
  }

  companion object {
    fun new(): AnimationNodeBlendSpace1D = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("AnimationNodeBlendSpace1D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton AnimationNodeBlendSpace1D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      AnimationNodeBlendSpace1D(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for AnimationNodeBlendSpace1D
     */
    private object __method_bind {
      val _add_blend_point: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace1D".cstr.ptr,
              "_add_blend_point".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _add_blend_point" }
            }
          }

      val _tree_changed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace1D".cstr.ptr,
              "_tree_changed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _tree_changed" }
            }
          }

      val add_blend_point: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace1D".cstr.ptr,
              "add_blend_point".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_blend_point" }
            }
          }

      val get_blend_point_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace1D".cstr.ptr,
              "get_blend_point_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_blend_point_count" }
            }
          }

      val get_blend_point_node: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace1D".cstr.ptr,
              "get_blend_point_node".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_blend_point_node" }
            }
          }

      val get_blend_point_position: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace1D".cstr.ptr,
              "get_blend_point_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_blend_point_position" }
            }
          }

      val get_max_space: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace1D".cstr.ptr,
              "get_max_space".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_max_space" }
            }
          }

      val get_min_space: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace1D".cstr.ptr,
              "get_min_space".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_min_space" }
            }
          }

      val get_snap: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace1D".cstr.ptr,
              "get_snap".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_snap" }
            }
          }

      val get_value_label: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace1D".cstr.ptr,
              "get_value_label".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_value_label" }
            }
          }

      val remove_blend_point: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace1D".cstr.ptr,
              "remove_blend_point".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_blend_point" }
            }
          }

      val set_blend_point_node: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace1D".cstr.ptr,
              "set_blend_point_node".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_blend_point_node" }
            }
          }

      val set_blend_point_position: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace1D".cstr.ptr,
              "set_blend_point_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_blend_point_position" }
            }
          }

      val set_max_space: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace1D".cstr.ptr,
              "set_max_space".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_max_space" }
            }
          }

      val set_min_space: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace1D".cstr.ptr,
              "set_min_space".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_min_space" }
            }
          }

      val set_snap: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace1D".cstr.ptr,
              "set_snap".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_snap" }
            }
          }

      val set_value_label: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("AnimationNodeBlendSpace1D".cstr.ptr,
              "set_value_label".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_value_label" }
            }
          }
    }
  }
}
