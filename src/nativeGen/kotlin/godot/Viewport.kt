// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.RID
import godot.core.Rect2
import godot.core.Transform2D
import godot.core.Variant
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class Viewport internal constructor(
  _handle: COpaquePointer
) : Node(_handle) {
  fun guiRemoveFocus() {
    TODO()
  }

  fun guiShowTooltip() {
    TODO()
  }

  fun postGuiGrabClickFocus() {
    TODO()
  }

  fun subwindowVisibilityChanged() {
    TODO()
  }

  fun vpInput() {
    TODO()
  }

  fun vpInputText() {
    TODO()
  }

  fun vpUnhandledInput() {
    TODO()
  }

  fun findWorld(): World {
    TODO()
  }

  fun findWorld2d(): World2D {
    TODO()
  }

  fun getCamera(): Camera {
    TODO()
  }

  fun getCanvasTransform(): Transform2D {
    TODO()
  }

  fun getClearMode(): Viewport.ClearMode {
    TODO()
  }

  fun getDebugDraw(): Viewport.DebugDraw {
    TODO()
  }

  fun getFinalTransform(): Transform2D {
    TODO()
  }

  fun getGlobalCanvasTransform(): Transform2D {
    TODO()
  }

  fun getHdr(): Boolean {
    TODO()
  }

  fun getKeep3dLinear(): Boolean {
    TODO()
  }

  fun getModalStackTop(): Control {
    TODO()
  }

  fun getMousePosition(): Vector2 {
    TODO()
  }

  fun getMsaa(): Viewport.MSAA {
    TODO()
  }

  fun getPhysicsObjectPicking(): Boolean {
    TODO()
  }

  fun getRenderInfo(): Int {
    TODO()
  }

  fun getShadowAtlasQuadrantSubdiv(): Viewport.ShadowAtlasQuadrantSubdiv {
    TODO()
  }

  fun getShadowAtlasSize(): Int {
    TODO()
  }

  fun getSize(): Vector2 {
    TODO()
  }

  fun getSizeOverride(): Vector2 {
    TODO()
  }

  fun getTexture(): ViewportTexture {
    TODO()
  }

  fun getUpdateMode(): Viewport.UpdateMode {
    TODO()
  }

  fun getUsage(): Viewport.Usage {
    TODO()
  }

  fun getVflip(): Boolean {
    TODO()
  }

  fun getViewportRid(): RID {
    TODO()
  }

  fun getVisibleRect(): Rect2 {
    TODO()
  }

  fun getWorld(): World {
    TODO()
  }

  fun getWorld2d(): World2D {
    TODO()
  }

  fun guiGetDragData(): Variant {
    TODO()
  }

  fun guiHasModalStack(): Boolean {
    TODO()
  }

  fun guiIsDragging(): Boolean {
    TODO()
  }

  fun hasTransparentBackground(): Boolean {
    TODO()
  }

  fun input() {
    TODO()
  }

  fun is3dDisabled(): Boolean {
    TODO()
  }

  fun isAudioListener(): Boolean {
    TODO()
  }

  fun isAudioListener2d(): Boolean {
    TODO()
  }

  fun isHandlingInputLocally(): Boolean {
    TODO()
  }

  fun isInputDisabled(): Boolean {
    TODO()
  }

  fun isInputHandled(): Boolean {
    TODO()
  }

  fun isSizeOverrideEnabled(): Boolean {
    TODO()
  }

  fun isSizeOverrideStretchEnabled(): Boolean {
    TODO()
  }

  fun isSnapControlsToPixelsEnabled(): Boolean {
    TODO()
  }

  fun isUsingOwnWorld(): Boolean {
    TODO()
  }

  fun isUsingRenderDirectToScreen(): Boolean {
    TODO()
  }

  fun setAsAudioListener() {
    TODO()
  }

  fun setAsAudioListener2d() {
    TODO()
  }

  fun setAttachToScreenRect() {
    TODO()
  }

  fun setCanvasTransform() {
    TODO()
  }

  fun setClearMode() {
    TODO()
  }

  fun setDebugDraw() {
    TODO()
  }

  fun setDisable3d() {
    TODO()
  }

  fun setDisableInput() {
    TODO()
  }

  fun setGlobalCanvasTransform() {
    TODO()
  }

  fun setHandleInputLocally() {
    TODO()
  }

  fun setHdr() {
    TODO()
  }

  fun setInputAsHandled() {
    TODO()
  }

  fun setKeep3dLinear() {
    TODO()
  }

  fun setMsaa() {
    TODO()
  }

  fun setPhysicsObjectPicking() {
    TODO()
  }

  fun setShadowAtlasQuadrantSubdiv() {
    TODO()
  }

  fun setShadowAtlasSize() {
    TODO()
  }

  fun setSize() {
    TODO()
  }

  fun setSizeOverride() {
    TODO()
  }

  fun setSizeOverrideStretch() {
    TODO()
  }

  fun setSnapControlsToPixels() {
    TODO()
  }

  fun setTransparentBackground() {
    TODO()
  }

  fun setUpdateMode() {
    TODO()
  }

  fun setUsage() {
    TODO()
  }

  fun setUseArvr() {
    TODO()
  }

  fun setUseOwnWorld() {
    TODO()
  }

  fun setUseRenderDirectToScreen() {
    TODO()
  }

  fun setVflip() {
    TODO()
  }

  fun setWorld() {
    TODO()
  }

  fun setWorld2d() {
    TODO()
  }

  fun unhandledInput() {
    TODO()
  }

  fun updateWorlds() {
    TODO()
  }

  fun useArvr(): Boolean {
    TODO()
  }

  fun warpMouse() {
    TODO()
  }

  enum class ClearMode(
    val value: Int
  ) {
    CLEAR_MODE_ALWAYS(0),

    CLEAR_MODE_NEVER(1),

    CLEAR_MODE_ONLY_NEXT_FRAME(2);
  }

  enum class RenderInfo(
    val value: Int
  ) {
    RENDER_INFO_OBJECTS_IN_FRAME(0),

    RENDER_INFO_VERTICES_IN_FRAME(1),

    RENDER_INFO_MATERIAL_CHANGES_IN_FRAME(2),

    RENDER_INFO_SHADER_CHANGES_IN_FRAME(3),

    RENDER_INFO_SURFACE_CHANGES_IN_FRAME(4),

    RENDER_INFO_DRAW_CALLS_IN_FRAME(5),

    RENDER_INFO_MAX(6);
  }

  enum class Usage(
    val value: Int
  ) {
    USAGE_2D(0),

    USAGE_2D_NO_SAMPLING(1),

    USAGE_3D(2),

    USAGE_3D_NO_EFFECTS(3);
  }

  enum class DebugDraw(
    val value: Int
  ) {
    DEBUG_DRAW_DISABLED(0),

    DEBUG_DRAW_UNSHADED(1),

    DEBUG_DRAW_OVERDRAW(2),

    DEBUG_DRAW_WIREFRAME(3);
  }

  enum class ShadowAtlasQuadrantSubdiv(
    val value: Int
  ) {
    SHADOW_ATLAS_QUADRANT_SUBDIV_DISABLED(0),

    SHADOW_ATLAS_QUADRANT_SUBDIV_1(1),

    SHADOW_ATLAS_QUADRANT_SUBDIV_4(2),

    SHADOW_ATLAS_QUADRANT_SUBDIV_16(3),

    SHADOW_ATLAS_QUADRANT_SUBDIV_64(4),

    SHADOW_ATLAS_QUADRANT_SUBDIV_256(5),

    SHADOW_ATLAS_QUADRANT_SUBDIV_1024(6),

    SHADOW_ATLAS_QUADRANT_SUBDIV_MAX(7);
  }

  enum class UpdateMode(
    val value: Int
  ) {
    UPDATE_DISABLED(0),

    UPDATE_ONCE(1),

    UPDATE_WHEN_VISIBLE(2),

    UPDATE_ALWAYS(3);
  }

  enum class MSAA(
    val value: Int
  ) {
    MSAA_DISABLED(0),

    MSAA_2X(1),

    MSAA_4X(2),

    MSAA_8X(3),

    MSAA_16X(4);
  }

  companion object {
    val CLEAR_MODE_ALWAYS: Int = 0

    val CLEAR_MODE_NEVER: Int = 1

    val CLEAR_MODE_ONLY_NEXT_FRAME: Int = 2

    val DEBUG_DRAW_DISABLED: Int = 0

    val DEBUG_DRAW_OVERDRAW: Int = 2

    val DEBUG_DRAW_UNSHADED: Int = 1

    val DEBUG_DRAW_WIREFRAME: Int = 3

    val MSAA_16X: Int = 4

    val MSAA_2X: Int = 1

    val MSAA_4X: Int = 2

    val MSAA_8X: Int = 3

    val MSAA_DISABLED: Int = 0

    val RENDER_INFO_DRAW_CALLS_IN_FRAME: Int = 5

    val RENDER_INFO_MATERIAL_CHANGES_IN_FRAME: Int = 2

    val RENDER_INFO_MAX: Int = 6

    val RENDER_INFO_OBJECTS_IN_FRAME: Int = 0

    val RENDER_INFO_SHADER_CHANGES_IN_FRAME: Int = 3

    val RENDER_INFO_SURFACE_CHANGES_IN_FRAME: Int = 4

    val RENDER_INFO_VERTICES_IN_FRAME: Int = 1

    val SHADOW_ATLAS_QUADRANT_SUBDIV_1: Int = 1

    val SHADOW_ATLAS_QUADRANT_SUBDIV_1024: Int = 6

    val SHADOW_ATLAS_QUADRANT_SUBDIV_16: Int = 3

    val SHADOW_ATLAS_QUADRANT_SUBDIV_256: Int = 5

    val SHADOW_ATLAS_QUADRANT_SUBDIV_4: Int = 2

    val SHADOW_ATLAS_QUADRANT_SUBDIV_64: Int = 4

    val SHADOW_ATLAS_QUADRANT_SUBDIV_DISABLED: Int = 0

    val SHADOW_ATLAS_QUADRANT_SUBDIV_MAX: Int = 7

    val UPDATE_ALWAYS: Int = 3

    val UPDATE_DISABLED: Int = 0

    val UPDATE_ONCE: Int = 1

    val UPDATE_WHEN_VISIBLE: Int = 2

    val USAGE_2D: Int = 0

    val USAGE_2D_NO_SAMPLING: Int = 1

    val USAGE_3D: Int = 2

    val USAGE_3D_NO_EFFECTS: Int = 3

    fun new(): Viewport = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Viewport".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton Viewport" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Viewport(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for Viewport
     */
    private object __method_bind {
      val _gui_remove_focus: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
              "_gui_remove_focus".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _gui_remove_focus" }
            }
          }

      val _gui_show_tooltip: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
              "_gui_show_tooltip".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _gui_show_tooltip" }
            }
          }

      val _post_gui_grab_click_focus: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
              "_post_gui_grab_click_focus".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _post_gui_grab_click_focus" }
            }
          }

      val _subwindow_visibility_changed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
              "_subwindow_visibility_changed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _subwindow_visibility_changed"
              }
            }
          }

      val _vp_input: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
              "_vp_input".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _vp_input" }
            }
          }

      val _vp_input_text: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
              "_vp_input_text".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _vp_input_text" }
            }
          }

      val _vp_unhandled_input: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
              "_vp_unhandled_input".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _vp_unhandled_input" }
            }
          }

      val find_world: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
              "find_world".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method find_world" }
            }
          }

      val find_world_2d: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
              "find_world_2d".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method find_world_2d" }
            }
          }

      val get_camera: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
              "get_camera".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_camera" }
            }
          }

      val get_canvas_transform: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
              "get_canvas_transform".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_canvas_transform" }
            }
          }

      val get_clear_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
              "get_clear_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_clear_mode" }
            }
          }

      val get_debug_draw: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
              "get_debug_draw".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_debug_draw" }
            }
          }

      val get_final_transform: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
              "get_final_transform".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_final_transform" }
            }
          }

      val get_global_canvas_transform: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
              "get_global_canvas_transform".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_global_canvas_transform" }
            }
          }

      val get_hdr: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
              "get_hdr".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_hdr" }
            }
          }

      val get_keep_3d_linear: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
              "get_keep_3d_linear".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_keep_3d_linear" }
            }
          }

      val get_modal_stack_top: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
              "get_modal_stack_top".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_modal_stack_top" }
            }
          }

      val get_mouse_position: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
              "get_mouse_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_mouse_position" }
            }
          }

      val get_msaa: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
              "get_msaa".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_msaa" }
            }
          }

      val get_physics_object_picking: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
              "get_physics_object_picking".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_physics_object_picking" }
            }
          }

      val get_render_info: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
              "get_render_info".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_render_info" }
            }
          }

      val get_shadow_atlas_quadrant_subdiv: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
              "get_shadow_atlas_quadrant_subdiv".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method get_shadow_atlas_quadrant_subdiv" }
            }
          }

      val get_shadow_atlas_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
              "get_shadow_atlas_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_shadow_atlas_size" }
            }
          }

      val get_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
              "get_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_size" }
            }
          }

      val get_size_override: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
              "get_size_override".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_size_override" }
            }
          }

      val get_texture: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
              "get_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_texture" }
            }
          }

      val get_update_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
              "get_update_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_update_mode" }
            }
          }

      val get_usage: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
              "get_usage".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_usage" }
            }
          }

      val get_vflip: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
              "get_vflip".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_vflip" }
            }
          }

      val get_viewport_rid: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
              "get_viewport_rid".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_viewport_rid" }
            }
          }

      val get_visible_rect: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
              "get_visible_rect".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_visible_rect" }
            }
          }

      val get_world: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
              "get_world".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_world" }
            }
          }

      val get_world_2d: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
              "get_world_2d".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_world_2d" }
            }
          }

      val gui_get_drag_data: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
              "gui_get_drag_data".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method gui_get_drag_data" }
            }
          }

      val gui_has_modal_stack: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
              "gui_has_modal_stack".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method gui_has_modal_stack" }
            }
          }

      val gui_is_dragging: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
              "gui_is_dragging".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method gui_is_dragging" }
            }
          }

      val has_transparent_background: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
              "has_transparent_background".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_transparent_background" }
            }
          }

      val input: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
              "input".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method input" }
            }
          }

      val is_3d_disabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
              "is_3d_disabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_3d_disabled" }
            }
          }

      val is_audio_listener: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
              "is_audio_listener".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_audio_listener" }
            }
          }

      val is_audio_listener_2d: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
              "is_audio_listener_2d".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_audio_listener_2d" }
            }
          }

      val is_handling_input_locally: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
              "is_handling_input_locally".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_handling_input_locally" }
            }
          }

      val is_input_disabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
              "is_input_disabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_input_disabled" }
            }
          }

      val is_input_handled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
              "is_input_handled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_input_handled" }
            }
          }

      val is_size_override_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
              "is_size_override_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_size_override_enabled" }
            }
          }

      val is_size_override_stretch_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
              "is_size_override_stretch_enabled".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method is_size_override_stretch_enabled" }
            }
          }

      val is_snap_controls_to_pixels_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
              "is_snap_controls_to_pixels_enabled".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method is_snap_controls_to_pixels_enabled" }
            }
          }

      val is_using_own_world: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
              "is_using_own_world".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_using_own_world" }
            }
          }

      val is_using_render_direct_to_screen: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
              "is_using_render_direct_to_screen".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method is_using_render_direct_to_screen" }
            }
          }

      val set_as_audio_listener: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
              "set_as_audio_listener".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_as_audio_listener" }
            }
          }

      val set_as_audio_listener_2d: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
              "set_as_audio_listener_2d".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_as_audio_listener_2d" }
            }
          }

      val set_attach_to_screen_rect: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
              "set_attach_to_screen_rect".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_attach_to_screen_rect" }
            }
          }

      val set_canvas_transform: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
              "set_canvas_transform".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_canvas_transform" }
            }
          }

      val set_clear_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
              "set_clear_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_clear_mode" }
            }
          }

      val set_debug_draw: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
              "set_debug_draw".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_debug_draw" }
            }
          }

      val set_disable_3d: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
              "set_disable_3d".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_disable_3d" }
            }
          }

      val set_disable_input: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
              "set_disable_input".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_disable_input" }
            }
          }

      val set_global_canvas_transform: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
              "set_global_canvas_transform".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_global_canvas_transform" }
            }
          }

      val set_handle_input_locally: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
              "set_handle_input_locally".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_handle_input_locally" }
            }
          }

      val set_hdr: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
              "set_hdr".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_hdr" }
            }
          }

      val set_input_as_handled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
              "set_input_as_handled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_input_as_handled" }
            }
          }

      val set_keep_3d_linear: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
              "set_keep_3d_linear".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_keep_3d_linear" }
            }
          }

      val set_msaa: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
              "set_msaa".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_msaa" }
            }
          }

      val set_physics_object_picking: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
              "set_physics_object_picking".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_physics_object_picking" }
            }
          }

      val set_shadow_atlas_quadrant_subdiv: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
              "set_shadow_atlas_quadrant_subdiv".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method set_shadow_atlas_quadrant_subdiv" }
            }
          }

      val set_shadow_atlas_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
              "set_shadow_atlas_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_shadow_atlas_size" }
            }
          }

      val set_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
              "set_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_size" }
            }
          }

      val set_size_override: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
              "set_size_override".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_size_override" }
            }
          }

      val set_size_override_stretch: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
              "set_size_override_stretch".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_size_override_stretch" }
            }
          }

      val set_snap_controls_to_pixels: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
              "set_snap_controls_to_pixels".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_snap_controls_to_pixels" }
            }
          }

      val set_transparent_background: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
              "set_transparent_background".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_transparent_background" }
            }
          }

      val set_update_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
              "set_update_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_update_mode" }
            }
          }

      val set_usage: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
              "set_usage".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_usage" }
            }
          }

      val set_use_arvr: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
              "set_use_arvr".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_use_arvr" }
            }
          }

      val set_use_own_world: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
              "set_use_own_world".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_use_own_world" }
            }
          }

      val set_use_render_direct_to_screen: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
              "set_use_render_direct_to_screen".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method set_use_render_direct_to_screen" }
            }
          }

      val set_vflip: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
              "set_vflip".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_vflip" }
            }
          }

      val set_world: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
              "set_world".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_world" }
            }
          }

      val set_world_2d: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
              "set_world_2d".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_world_2d" }
            }
          }

      val unhandled_input: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
              "unhandled_input".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method unhandled_input" }
            }
          }

      val update_worlds: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
              "update_worlds".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method update_worlds" }
            }
          }

      val use_arvr: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
              "use_arvr".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method use_arvr" }
            }
          }

      val warp_mouse: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Viewport".cstr.ptr,
              "warp_mouse".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method warp_mouse" }
            }
          }
    }
  }
}
