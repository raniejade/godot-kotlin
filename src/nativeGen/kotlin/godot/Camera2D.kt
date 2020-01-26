// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
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

open class Camera2D internal constructor(
  _handle: COpaquePointer
) : Node2D(_handle) {
  fun align() {
    TODO()
  }

  fun clearCurrent() {
    TODO()
  }

  fun forceUpdateScroll() {
    TODO()
  }

  fun getAnchorMode(): AnchorMode {
    TODO()
  }

  fun getCameraPosition(): Vector2 {
    TODO()
  }

  fun getCameraScreenCenter(): Vector2 {
    TODO()
  }

  fun getCustomViewport(): Node {
    TODO()
  }

  fun getDragMargin(margin: Int): Float {
    TODO()
  }

  fun getFollowSmoothing(): Float {
    TODO()
  }

  fun getHOffset(): Float {
    TODO()
  }

  fun getLimit(margin: Int): Int {
    TODO()
  }

  fun getOffset(): Vector2 {
    TODO()
  }

  fun getProcessMode(): Camera2DProcessMode {
    TODO()
  }

  fun getVOffset(): Float {
    TODO()
  }

  fun getZoom(): Vector2 {
    TODO()
  }

  fun isCurrent(): Boolean {
    TODO()
  }

  fun isFollowSmoothingEnabled(): Boolean {
    TODO()
  }

  fun isHDragEnabled(): Boolean {
    TODO()
  }

  fun isLimitDrawingEnabled(): Boolean {
    TODO()
  }

  fun isLimitSmoothingEnabled(): Boolean {
    TODO()
  }

  fun isMarginDrawingEnabled(): Boolean {
    TODO()
  }

  fun isRotating(): Boolean {
    TODO()
  }

  fun isScreenDrawingEnabled(): Boolean {
    TODO()
  }

  fun isVDragEnabled(): Boolean {
    TODO()
  }

  fun makeCurrent() {
    TODO()
  }

  fun resetSmoothing() {
    TODO()
  }

  fun setAnchorMode(anchor_mode: Int) {
    TODO()
  }

  fun setCustomViewport(viewport: Node) {
    TODO()
  }

  fun setDragMargin(margin: Int, drag_margin: Float) {
    TODO()
  }

  fun setEnableFollowSmoothing(follow_smoothing: Boolean) {
    TODO()
  }

  fun setFollowSmoothing(follow_smoothing: Float) {
    TODO()
  }

  fun setHDragEnabled(enabled: Boolean) {
    TODO()
  }

  fun setHOffset(ofs: Float) {
    TODO()
  }

  fun setLimit(margin: Int, limit: Int) {
    TODO()
  }

  fun setLimitDrawingEnabled(limit_drawing_enabled: Boolean) {
    TODO()
  }

  fun setLimitSmoothingEnabled(limit_smoothing_enabled: Boolean) {
    TODO()
  }

  fun setMarginDrawingEnabled(margin_drawing_enabled: Boolean) {
    TODO()
  }

  fun setOffset(offset: Vector2) {
    TODO()
  }

  fun setProcessMode(mode: Int) {
    TODO()
  }

  fun setRotating(rotating: Boolean) {
    TODO()
  }

  fun setScreenDrawingEnabled(screen_drawing_enabled: Boolean) {
    TODO()
  }

  fun setVDragEnabled(enabled: Boolean) {
    TODO()
  }

  fun setVOffset(ofs: Float) {
    TODO()
  }

  fun setZoom(zoom: Vector2) {
    TODO()
  }

  enum class Camera2DProcessMode(
    val value: Int
  ) {
    CAMERA2D_PROCESS_PHYSICS(0),

    CAMERA2D_PROCESS_IDLE(1);
  }

  enum class AnchorMode(
    val value: Int
  ) {
    ANCHOR_MODE_FIXED_TOP_LEFT(0),

    ANCHOR_MODE_DRAG_CENTER(1);
  }

  companion object {
    val ANCHOR_MODE_DRAG_CENTER: Int = 1

    val ANCHOR_MODE_FIXED_TOP_LEFT: Int = 0

    val CAMERA2D_PROCESS_IDLE: Int = 1

    val CAMERA2D_PROCESS_PHYSICS: Int = 0

    fun new(): Camera2D = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Camera2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton Camera2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Camera2D(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for Camera2D
     */
    private object __method_bind {
      val align: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
              "align".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method align" }
            }
          }

      val clear_current: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
              "clear_current".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clear_current" }
            }
          }

      val force_update_scroll: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
              "force_update_scroll".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method force_update_scroll" }
            }
          }

      val get_anchor_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
              "get_anchor_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_anchor_mode" }
            }
          }

      val get_camera_position: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
              "get_camera_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_camera_position" }
            }
          }

      val get_camera_screen_center: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
              "get_camera_screen_center".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_camera_screen_center" }
            }
          }

      val get_custom_viewport: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
              "get_custom_viewport".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_custom_viewport" }
            }
          }

      val get_drag_margin: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
              "get_drag_margin".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_drag_margin" }
            }
          }

      val get_follow_smoothing: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
              "get_follow_smoothing".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_follow_smoothing" }
            }
          }

      val get_h_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
              "get_h_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_h_offset" }
            }
          }

      val get_limit: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
              "get_limit".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_limit" }
            }
          }

      val get_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
              "get_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_offset" }
            }
          }

      val get_process_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
              "get_process_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_process_mode" }
            }
          }

      val get_v_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
              "get_v_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_v_offset" }
            }
          }

      val get_zoom: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
              "get_zoom".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_zoom" }
            }
          }

      val is_current: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
              "is_current".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_current" }
            }
          }

      val is_follow_smoothing_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
              "is_follow_smoothing_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_follow_smoothing_enabled" }
            }
          }

      val is_h_drag_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
              "is_h_drag_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_h_drag_enabled" }
            }
          }

      val is_limit_drawing_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
              "is_limit_drawing_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_limit_drawing_enabled" }
            }
          }

      val is_limit_smoothing_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
              "is_limit_smoothing_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_limit_smoothing_enabled" }
            }
          }

      val is_margin_drawing_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
              "is_margin_drawing_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_margin_drawing_enabled" }
            }
          }

      val is_rotating: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
              "is_rotating".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_rotating" }
            }
          }

      val is_screen_drawing_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
              "is_screen_drawing_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_screen_drawing_enabled" }
            }
          }

      val is_v_drag_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
              "is_v_drag_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_v_drag_enabled" }
            }
          }

      val make_current: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
              "make_current".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method make_current" }
            }
          }

      val reset_smoothing: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
              "reset_smoothing".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method reset_smoothing" }
            }
          }

      val set_anchor_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
              "set_anchor_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_anchor_mode" }
            }
          }

      val set_custom_viewport: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
              "set_custom_viewport".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_custom_viewport" }
            }
          }

      val set_drag_margin: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
              "set_drag_margin".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_drag_margin" }
            }
          }

      val set_enable_follow_smoothing: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
              "set_enable_follow_smoothing".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_enable_follow_smoothing" }
            }
          }

      val set_follow_smoothing: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
              "set_follow_smoothing".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_follow_smoothing" }
            }
          }

      val set_h_drag_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
              "set_h_drag_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_h_drag_enabled" }
            }
          }

      val set_h_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
              "set_h_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_h_offset" }
            }
          }

      val set_limit: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
              "set_limit".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_limit" }
            }
          }

      val set_limit_drawing_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
              "set_limit_drawing_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_limit_drawing_enabled" }
            }
          }

      val set_limit_smoothing_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
              "set_limit_smoothing_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_limit_smoothing_enabled" }
            }
          }

      val set_margin_drawing_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
              "set_margin_drawing_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_margin_drawing_enabled" }
            }
          }

      val set_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
              "set_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_offset" }
            }
          }

      val set_process_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
              "set_process_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_process_mode" }
            }
          }

      val set_rotating: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
              "set_rotating".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_rotating" }
            }
          }

      val set_screen_drawing_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
              "set_screen_drawing_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_screen_drawing_enabled" }
            }
          }

      val set_v_drag_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
              "set_v_drag_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_v_drag_enabled" }
            }
          }

      val set_v_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
              "set_v_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_v_offset" }
            }
          }

      val set_zoom: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Camera2D".cstr.ptr,
              "set_zoom".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_zoom" }
            }
          }
    }
  }
}
