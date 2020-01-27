// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
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
    val _ret = __method_bind.align.call(this.toVariant())
    TODO()
  }

  fun clearCurrent() {
    val _ret = __method_bind.clear_current.call(this.toVariant())
    TODO()
  }

  fun forceUpdateScroll() {
    val _ret = __method_bind.force_update_scroll.call(this.toVariant())
    TODO()
  }

  fun getAnchorMode(): AnchorMode {
    val _ret = __method_bind.get_anchor_mode.call(this.toVariant())
    TODO()
  }

  fun getCameraPosition(): Vector2 {
    val _ret = __method_bind.get_camera_position.call(this.toVariant())
    TODO()
  }

  fun getCameraScreenCenter(): Vector2 {
    val _ret = __method_bind.get_camera_screen_center.call(this.toVariant())
    TODO()
  }

  fun getCustomViewport(): Node {
    val _ret = __method_bind.get_custom_viewport.call(this.toVariant())
    TODO()
  }

  fun getDragMargin(margin: Int): Float {
    val _args = VariantArray.new()
    _args.append(margin)
    val _ret = __method_bind.get_drag_margin.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getFollowSmoothing(): Float {
    val _ret = __method_bind.get_follow_smoothing.call(this.toVariant())
    TODO()
  }

  fun getHOffset(): Float {
    val _ret = __method_bind.get_h_offset.call(this.toVariant())
    TODO()
  }

  fun getLimit(margin: Int): Int {
    val _args = VariantArray.new()
    _args.append(margin)
    val _ret = __method_bind.get_limit.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getOffset(): Vector2 {
    val _ret = __method_bind.get_offset.call(this.toVariant())
    TODO()
  }

  fun getProcessMode(): Camera2DProcessMode {
    val _ret = __method_bind.get_process_mode.call(this.toVariant())
    TODO()
  }

  fun getVOffset(): Float {
    val _ret = __method_bind.get_v_offset.call(this.toVariant())
    TODO()
  }

  fun getZoom(): Vector2 {
    val _ret = __method_bind.get_zoom.call(this.toVariant())
    TODO()
  }

  fun isCurrent(): Boolean {
    val _ret = __method_bind.is_current.call(this.toVariant())
    TODO()
  }

  fun isFollowSmoothingEnabled(): Boolean {
    val _ret = __method_bind.is_follow_smoothing_enabled.call(this.toVariant())
    TODO()
  }

  fun isHDragEnabled(): Boolean {
    val _ret = __method_bind.is_h_drag_enabled.call(this.toVariant())
    TODO()
  }

  fun isLimitDrawingEnabled(): Boolean {
    val _ret = __method_bind.is_limit_drawing_enabled.call(this.toVariant())
    TODO()
  }

  fun isLimitSmoothingEnabled(): Boolean {
    val _ret = __method_bind.is_limit_smoothing_enabled.call(this.toVariant())
    TODO()
  }

  fun isMarginDrawingEnabled(): Boolean {
    val _ret = __method_bind.is_margin_drawing_enabled.call(this.toVariant())
    TODO()
  }

  fun isRotating(): Boolean {
    val _ret = __method_bind.is_rotating.call(this.toVariant())
    TODO()
  }

  fun isScreenDrawingEnabled(): Boolean {
    val _ret = __method_bind.is_screen_drawing_enabled.call(this.toVariant())
    TODO()
  }

  fun isVDragEnabled(): Boolean {
    val _ret = __method_bind.is_v_drag_enabled.call(this.toVariant())
    TODO()
  }

  fun makeCurrent() {
    val _ret = __method_bind.make_current.call(this.toVariant())
    TODO()
  }

  fun resetSmoothing() {
    val _ret = __method_bind.reset_smoothing.call(this.toVariant())
    TODO()
  }

  fun setAnchorMode(anchorMode: Int) {
    val _args = VariantArray.new()
    _args.append(anchorMode)
    val _ret = __method_bind.set_anchor_mode.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setCustomViewport(viewport: Node) {
    val _args = VariantArray.new()
    _args.append(viewport)
    val _ret = __method_bind.set_custom_viewport.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setDragMargin(margin: Int, dragMargin: Float) {
    val _args = VariantArray.new()
    _args.append(margin)
    _args.append(dragMargin)
    val _ret = __method_bind.set_drag_margin.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun setEnableFollowSmoothing(followSmoothing: Boolean) {
    val _args = VariantArray.new()
    _args.append(followSmoothing)
    val _ret = __method_bind.set_enable_follow_smoothing.call(this.toVariant(), _args.toVariant(),
        1)
    TODO()
  }

  fun setFollowSmoothing(followSmoothing: Float) {
    val _args = VariantArray.new()
    _args.append(followSmoothing)
    val _ret = __method_bind.set_follow_smoothing.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setHDragEnabled(enabled: Boolean) {
    val _args = VariantArray.new()
    _args.append(enabled)
    val _ret = __method_bind.set_h_drag_enabled.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setHOffset(ofs: Float) {
    val _args = VariantArray.new()
    _args.append(ofs)
    val _ret = __method_bind.set_h_offset.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setLimit(margin: Int, limit: Int) {
    val _args = VariantArray.new()
    _args.append(margin)
    _args.append(limit)
    val _ret = __method_bind.set_limit.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun setLimitDrawingEnabled(limitDrawingEnabled: Boolean) {
    val _args = VariantArray.new()
    _args.append(limitDrawingEnabled)
    val _ret = __method_bind.set_limit_drawing_enabled.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setLimitSmoothingEnabled(limitSmoothingEnabled: Boolean) {
    val _args = VariantArray.new()
    _args.append(limitSmoothingEnabled)
    val _ret = __method_bind.set_limit_smoothing_enabled.call(this.toVariant(), _args.toVariant(),
        1)
    TODO()
  }

  fun setMarginDrawingEnabled(marginDrawingEnabled: Boolean) {
    val _args = VariantArray.new()
    _args.append(marginDrawingEnabled)
    val _ret = __method_bind.set_margin_drawing_enabled.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setOffset(offset: Vector2) {
    val _args = VariantArray.new()
    _args.append(offset)
    val _ret = __method_bind.set_offset.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setProcessMode(mode: Int) {
    val _args = VariantArray.new()
    _args.append(mode)
    val _ret = __method_bind.set_process_mode.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setRotating(rotating: Boolean) {
    val _args = VariantArray.new()
    _args.append(rotating)
    val _ret = __method_bind.set_rotating.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setScreenDrawingEnabled(screenDrawingEnabled: Boolean) {
    val _args = VariantArray.new()
    _args.append(screenDrawingEnabled)
    val _ret = __method_bind.set_screen_drawing_enabled.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setVDragEnabled(enabled: Boolean) {
    val _args = VariantArray.new()
    _args.append(enabled)
    val _ret = __method_bind.set_v_drag_enabled.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setVOffset(ofs: Float) {
    val _args = VariantArray.new()
    _args.append(ofs)
    val _ret = __method_bind.set_v_offset.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setZoom(zoom: Vector2) {
    val _args = VariantArray.new()
    _args.append(zoom)
    val _ret = __method_bind.set_zoom.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  enum class Camera2DProcessMode(
    val value: Int
  ) {
    CAMERA2D_PROCESS_PHYSICS(0),

    CAMERA2D_PROCESS_IDLE(1);

    companion object {
      fun from(value: Int): Camera2DProcessMode {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class AnchorMode(
    val value: Int
  ) {
    ANCHOR_MODE_FIXED_TOP_LEFT(0),

    ANCHOR_MODE_DRAG_CENTER(1);

    companion object {
      fun from(value: Int): AnchorMode {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
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
    fun from(ptr: COpaquePointer): Camera2D = Camera2D(ptr)
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
