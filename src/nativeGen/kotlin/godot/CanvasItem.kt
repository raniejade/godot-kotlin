// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Color
import godot.core.Godot
import godot.core.RID
import godot.core.Rect2
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

open class CanvasItem internal constructor(
  _handle: COpaquePointer
) : Node(_handle) {
  fun drawChar(): Float {
    TODO()
  }

  fun drawCircle() {
    TODO()
  }

  fun drawColoredPolygon() {
    TODO()
  }

  fun drawLine() {
    TODO()
  }

  fun drawMesh() {
    TODO()
  }

  fun drawMultiline() {
    TODO()
  }

  fun drawMultilineColors() {
    TODO()
  }

  fun drawMultimesh() {
    TODO()
  }

  fun drawPolygon() {
    TODO()
  }

  fun drawPolyline() {
    TODO()
  }

  fun drawPolylineColors() {
    TODO()
  }

  fun drawPrimitive() {
    TODO()
  }

  fun drawRect() {
    TODO()
  }

  fun drawSetTransform() {
    TODO()
  }

  fun drawSetTransformMatrix() {
    TODO()
  }

  fun drawString() {
    TODO()
  }

  fun drawStyleBox() {
    TODO()
  }

  fun drawTexture() {
    TODO()
  }

  fun drawTextureRect() {
    TODO()
  }

  fun drawTextureRectRegion() {
    TODO()
  }

  fun forceUpdateTransform() {
    TODO()
  }

  fun getCanvas(): RID {
    TODO()
  }

  fun getCanvasItem(): RID {
    TODO()
  }

  fun getCanvasTransform(): Transform2D {
    TODO()
  }

  fun getGlobalMousePosition(): Vector2 {
    TODO()
  }

  fun getGlobalTransform(): Transform2D {
    TODO()
  }

  fun getGlobalTransformWithCanvas(): Transform2D {
    TODO()
  }

  fun getLightMask(): Int {
    TODO()
  }

  fun getLocalMousePosition(): Vector2 {
    TODO()
  }

  fun getMaterial(): Material {
    TODO()
  }

  fun getModulate(): Color {
    TODO()
  }

  fun getSelfModulate(): Color {
    TODO()
  }

  fun getTransform(): Transform2D {
    TODO()
  }

  fun getUseParentMaterial(): Boolean {
    TODO()
  }

  fun getViewportRect(): Rect2 {
    TODO()
  }

  fun getViewportTransform(): Transform2D {
    TODO()
  }

  fun getWorld2d(): World2D {
    TODO()
  }

  fun hide() {
    TODO()
  }

  fun isDrawBehindParentEnabled(): Boolean {
    TODO()
  }

  fun isLocalTransformNotificationEnabled(): Boolean {
    TODO()
  }

  fun isSetAsToplevel(): Boolean {
    TODO()
  }

  fun isTransformNotificationEnabled(): Boolean {
    TODO()
  }

  fun isVisible(): Boolean {
    TODO()
  }

  fun isVisibleInTree(): Boolean {
    TODO()
  }

  fun makeCanvasPositionLocal(): Vector2 {
    TODO()
  }

  fun makeInputLocal(): InputEvent {
    TODO()
  }

  fun setAsToplevel() {
    TODO()
  }

  fun setDrawBehindParent() {
    TODO()
  }

  fun setLightMask() {
    TODO()
  }

  fun setMaterial() {
    TODO()
  }

  fun setModulate() {
    TODO()
  }

  fun setNotifyLocalTransform() {
    TODO()
  }

  fun setNotifyTransform() {
    TODO()
  }

  fun setSelfModulate() {
    TODO()
  }

  fun setUseParentMaterial() {
    TODO()
  }

  fun setVisible() {
    TODO()
  }

  fun show() {
    TODO()
  }

  fun update() {
    TODO()
  }

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
