// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class CanvasItem internal constructor(
  _handle: COpaquePointer
) : Node(_handle) {
  enum class BlendMode(
    val value: Int
  ) {
    BLEND_MODE_MIX(0),

    BLEND_MODE_ADD(1),

    BLEND_MODE_SUB(2),

    BLEND_MODE_MUL(3),

    BLEND_MODE_PREMULT_ALPHA(4),

    BLEND_MODE_DISABLED(5);
  }

  companion object {
    val BLEND_MODE_ADD: Int = 1

    val BLEND_MODE_DISABLED: Int = 5

    val BLEND_MODE_MIX: Int = 0

    val BLEND_MODE_MUL: Int = 3

    val BLEND_MODE_PREMULT_ALPHA: Int = 4

    val BLEND_MODE_SUB: Int = 2

    val NOTIFICATION_DRAW: Int = 30

    val NOTIFICATION_ENTER_CANVAS: Int = 32

    val NOTIFICATION_EXIT_CANVAS: Int = 33

    val NOTIFICATION_TRANSFORM_CHANGED: Int = 2000

    val NOTIFICATION_VISIBILITY_CHANGED: Int = 31

    /**
     * Container for method_bind pointers for CanvasItem
     */
    private object __method_bind {
      val _draw: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "_draw".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _draw" }
            }
          }

      val _edit_get_pivot: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "_edit_get_pivot".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _edit_get_pivot" }
            }
          }

      val _edit_get_position: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "_edit_get_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _edit_get_position" }
            }
          }

      val _edit_get_rect: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "_edit_get_rect".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _edit_get_rect" }
            }
          }

      val _edit_get_rotation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "_edit_get_rotation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _edit_get_rotation" }
            }
          }

      val _edit_get_scale: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "_edit_get_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _edit_get_scale" }
            }
          }

      val _edit_get_state: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "_edit_get_state".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _edit_get_state" }
            }
          }

      val _edit_set_pivot: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "_edit_set_pivot".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _edit_set_pivot" }
            }
          }

      val _edit_set_position: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "_edit_set_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _edit_set_position" }
            }
          }

      val _edit_set_rect: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "_edit_set_rect".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _edit_set_rect" }
            }
          }

      val _edit_set_rotation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "_edit_set_rotation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _edit_set_rotation" }
            }
          }

      val _edit_set_scale: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "_edit_set_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _edit_set_scale" }
            }
          }

      val _edit_set_state: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "_edit_set_state".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _edit_set_state" }
            }
          }

      val _edit_use_pivot: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "_edit_use_pivot".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _edit_use_pivot" }
            }
          }

      val _edit_use_rect: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "_edit_use_rect".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _edit_use_rect" }
            }
          }

      val _edit_use_rotation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "_edit_use_rotation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _edit_use_rotation" }
            }
          }

      val _is_on_top: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "_is_on_top".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _is_on_top" }
            }
          }

      val _set_on_top: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "_set_on_top".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _set_on_top" }
            }
          }

      val _toplevel_raise_self: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "_toplevel_raise_self".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _toplevel_raise_self" }
            }
          }

      val _update_callback: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "_update_callback".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _update_callback" }
            }
          }

      val draw_char: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "draw_char".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method draw_char" }
            }
          }

      val draw_circle: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "draw_circle".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method draw_circle" }
            }
          }

      val draw_colored_polygon: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "draw_colored_polygon".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method draw_colored_polygon" }
            }
          }

      val draw_line: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "draw_line".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method draw_line" }
            }
          }

      val draw_mesh: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "draw_mesh".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method draw_mesh" }
            }
          }

      val draw_multiline: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "draw_multiline".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method draw_multiline" }
            }
          }

      val draw_multiline_colors: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "draw_multiline_colors".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method draw_multiline_colors" }
            }
          }

      val draw_multimesh: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "draw_multimesh".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method draw_multimesh" }
            }
          }

      val draw_polygon: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "draw_polygon".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method draw_polygon" }
            }
          }

      val draw_polyline: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "draw_polyline".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method draw_polyline" }
            }
          }

      val draw_polyline_colors: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "draw_polyline_colors".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method draw_polyline_colors" }
            }
          }

      val draw_primitive: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "draw_primitive".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method draw_primitive" }
            }
          }

      val draw_rect: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "draw_rect".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method draw_rect" }
            }
          }

      val draw_set_transform: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "draw_set_transform".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method draw_set_transform" }
            }
          }

      val draw_set_transform_matrix: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "draw_set_transform_matrix".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method draw_set_transform_matrix" }
            }
          }

      val draw_string: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "draw_string".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method draw_string" }
            }
          }

      val draw_style_box: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "draw_style_box".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method draw_style_box" }
            }
          }

      val draw_texture: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "draw_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method draw_texture" }
            }
          }

      val draw_texture_rect: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "draw_texture_rect".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method draw_texture_rect" }
            }
          }

      val draw_texture_rect_region: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "draw_texture_rect_region".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method draw_texture_rect_region" }
            }
          }

      val force_update_transform: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "force_update_transform".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method force_update_transform" }
            }
          }

      val get_canvas: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "get_canvas".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_canvas" }
            }
          }

      val get_canvas_item: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "get_canvas_item".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_canvas_item" }
            }
          }

      val get_canvas_transform: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "get_canvas_transform".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_canvas_transform" }
            }
          }

      val get_global_mouse_position: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "get_global_mouse_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_global_mouse_position" }
            }
          }

      val get_global_transform: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "get_global_transform".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_global_transform" }
            }
          }

      val get_global_transform_with_canvas: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "get_global_transform_with_canvas".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method get_global_transform_with_canvas" }
            }
          }

      val get_light_mask: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "get_light_mask".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_light_mask" }
            }
          }

      val get_local_mouse_position: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "get_local_mouse_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_local_mouse_position" }
            }
          }

      val get_material: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "get_material".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_material" }
            }
          }

      val get_modulate: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "get_modulate".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_modulate" }
            }
          }

      val get_self_modulate: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "get_self_modulate".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_self_modulate" }
            }
          }

      val get_transform: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "get_transform".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_transform" }
            }
          }

      val get_use_parent_material: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "get_use_parent_material".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_use_parent_material" }
            }
          }

      val get_viewport_rect: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "get_viewport_rect".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_viewport_rect" }
            }
          }

      val get_viewport_transform: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "get_viewport_transform".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_viewport_transform" }
            }
          }

      val get_world_2d: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "get_world_2d".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_world_2d" }
            }
          }

      val hide: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "hide".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method hide" }
            }
          }

      val is_draw_behind_parent_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "is_draw_behind_parent_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_draw_behind_parent_enabled"
              }
            }
          }

      val is_local_transform_notification_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "is_local_transform_notification_enabled".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method is_local_transform_notification_enabled" }
            }
          }

      val is_set_as_toplevel: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "is_set_as_toplevel".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_set_as_toplevel" }
            }
          }

      val is_transform_notification_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "is_transform_notification_enabled".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method is_transform_notification_enabled" }
            }
          }

      val is_visible: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "is_visible".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_visible" }
            }
          }

      val is_visible_in_tree: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "is_visible_in_tree".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_visible_in_tree" }
            }
          }

      val make_canvas_position_local: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "make_canvas_position_local".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method make_canvas_position_local" }
            }
          }

      val make_input_local: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "make_input_local".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method make_input_local" }
            }
          }

      val set_as_toplevel: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "set_as_toplevel".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_as_toplevel" }
            }
          }

      val set_draw_behind_parent: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "set_draw_behind_parent".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_draw_behind_parent" }
            }
          }

      val set_light_mask: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "set_light_mask".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_light_mask" }
            }
          }

      val set_material: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "set_material".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_material" }
            }
          }

      val set_modulate: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "set_modulate".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_modulate" }
            }
          }

      val set_notify_local_transform: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "set_notify_local_transform".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_notify_local_transform" }
            }
          }

      val set_notify_transform: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "set_notify_transform".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_notify_transform" }
            }
          }

      val set_self_modulate: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "set_self_modulate".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_self_modulate" }
            }
          }

      val set_use_parent_material: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "set_use_parent_material".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_use_parent_material" }
            }
          }

      val set_visible: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "set_visible".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_visible" }
            }
          }

      val show: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "show".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method show" }
            }
          }

      val update: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CanvasItem".cstr.ptr,
              "update".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method update" }
            }
          }
    }
  }
}
