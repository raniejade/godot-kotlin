// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Color
import godot.core.Godot
import godot.core.NodePath
import godot.core.Rect2
import godot.core.Variant
import godot.core.Vector2
import kotlin.Boolean
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

open class Control internal constructor(
  _handle: COpaquePointer
) : CanvasItem(_handle) {
  fun acceptEvent() {
    TODO()
  }

  fun addColorOverride(name: String, color: Color) {
    TODO()
  }

  fun addConstantOverride(name: String, constant: Int) {
    TODO()
  }

  fun addFontOverride(name: String, font: Font) {
    TODO()
  }

  fun addIconOverride(name: String, texture: Texture) {
    TODO()
  }

  fun addShaderOverride(name: String, shader: Shader) {
    TODO()
  }

  fun addStyleboxOverride(name: String, stylebox: StyleBox) {
    TODO()
  }

  fun forceDrag(data: Variant, preview: Control) {
    TODO()
  }

  fun getAnchor(margin: Int): Float {
    TODO()
  }

  fun getBegin(): Vector2 {
    TODO()
  }

  fun getColor(name: String, type: String): Color {
    TODO()
  }

  fun getCombinedMinimumSize(): Vector2 {
    TODO()
  }

  fun getConstant(name: String, type: String): Int {
    TODO()
  }

  fun getCursorShape(position: Vector2): CursorShape {
    TODO()
  }

  fun getCustomMinimumSize(): Vector2 {
    TODO()
  }

  fun getDefaultCursorShape(): CursorShape {
    TODO()
  }

  fun getEnd(): Vector2 {
    TODO()
  }

  fun getFocusMode(): FocusMode {
    TODO()
  }

  fun getFocusNeighbour(margin: Int): NodePath {
    TODO()
  }

  fun getFocusNext(): NodePath {
    TODO()
  }

  fun getFocusOwner(): Control {
    TODO()
  }

  fun getFocusPrevious(): NodePath {
    TODO()
  }

  fun getFont(name: String, type: String): Font {
    TODO()
  }

  fun getGlobalPosition(): Vector2 {
    TODO()
  }

  fun getGlobalRect(): Rect2 {
    TODO()
  }

  fun getHGrowDirection(): GrowDirection {
    TODO()
  }

  fun getHSizeFlags(): Int {
    TODO()
  }

  fun getIcon(name: String, type: String): Texture {
    TODO()
  }

  fun getMargin(margin: Int): Float {
    TODO()
  }

  fun getMinimumSize(): Vector2 {
    TODO()
  }

  fun getMouseFilter(): MouseFilter {
    TODO()
  }

  fun getParentAreaSize(): Vector2 {
    TODO()
  }

  fun getParentControl(): Control {
    TODO()
  }

  fun getPivotOffset(): Vector2 {
    TODO()
  }

  fun getPosition(): Vector2 {
    TODO()
  }

  fun getRect(): Rect2 {
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

  fun getSize(): Vector2 {
    TODO()
  }

  fun getStretchRatio(): Float {
    TODO()
  }

  fun getStylebox(name: String, type: String): StyleBox {
    TODO()
  }

  fun getTheme(): Theme {
    TODO()
  }

  fun getTooltip(at_position: Vector2): String {
    TODO()
  }

  fun getVGrowDirection(): GrowDirection {
    TODO()
  }

  fun getVSizeFlags(): Int {
    TODO()
  }

  fun grabClickFocus() {
    TODO()
  }

  fun grabFocus() {
    TODO()
  }

  fun hasColor(name: String, type: String): Boolean {
    TODO()
  }

  fun hasColorOverride(name: String): Boolean {
    TODO()
  }

  fun hasConstant(name: String, type: String): Boolean {
    TODO()
  }

  fun hasConstantOverride(name: String): Boolean {
    TODO()
  }

  fun hasFocus(): Boolean {
    TODO()
  }

  fun hasFont(name: String, type: String): Boolean {
    TODO()
  }

  fun hasFontOverride(name: String): Boolean {
    TODO()
  }

  fun hasIcon(name: String, type: String): Boolean {
    TODO()
  }

  fun hasIconOverride(name: String): Boolean {
    TODO()
  }

  fun hasShaderOverride(name: String): Boolean {
    TODO()
  }

  fun hasStylebox(name: String, type: String): Boolean {
    TODO()
  }

  fun hasStyleboxOverride(name: String): Boolean {
    TODO()
  }

  fun isClippingContents(): Boolean {
    TODO()
  }

  fun minimumSizeChanged() {
    TODO()
  }

  fun releaseFocus() {
    TODO()
  }

  fun setAnchor(
    margin: Int,
    anchor: Float,
    keep_margin: Boolean,
    push_opposite_anchor: Boolean
  ) {
    TODO()
  }

  fun setAnchorAndMargin(
    margin: Int,
    anchor: Float,
    offset: Float,
    push_opposite_anchor: Boolean
  ) {
    TODO()
  }

  fun setAnchorsAndMarginsPreset(
    preset: Int,
    resize_mode: Int,
    margin: Int
  ) {
    TODO()
  }

  fun setAnchorsPreset(preset: Int, keep_margins: Boolean) {
    TODO()
  }

  fun setBegin(position: Vector2) {
    TODO()
  }

  fun setClipContents(enable: Boolean) {
    TODO()
  }

  fun setCustomMinimumSize(size: Vector2) {
    TODO()
  }

  fun setDefaultCursorShape(shape: Int) {
    TODO()
  }

  fun setDragForwarding(target: Control) {
    TODO()
  }

  fun setDragPreview(control: Control) {
    TODO()
  }

  fun setEnd(position: Vector2) {
    TODO()
  }

  fun setFocusMode(mode: Int) {
    TODO()
  }

  fun setFocusNeighbour(margin: Int, neighbour: NodePath) {
    TODO()
  }

  fun setFocusNext(next: NodePath) {
    TODO()
  }

  fun setFocusPrevious(previous: NodePath) {
    TODO()
  }

  fun setGlobalPosition(position: Vector2, keep_margins: Boolean) {
    TODO()
  }

  fun setHGrowDirection(direction: Int) {
    TODO()
  }

  fun setHSizeFlags(flags: Int) {
    TODO()
  }

  fun setMargin(margin: Int, offset: Float) {
    TODO()
  }

  fun setMarginsPreset(
    preset: Int,
    resize_mode: Int,
    margin: Int
  ) {
    TODO()
  }

  fun setMouseFilter(filter: Int) {
    TODO()
  }

  fun setPivotOffset(pivot_offset: Vector2) {
    TODO()
  }

  fun setPosition(position: Vector2, keep_margins: Boolean) {
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

  fun setSize(size: Vector2, keep_margins: Boolean) {
    TODO()
  }

  fun setStretchRatio(ratio: Float) {
    TODO()
  }

  fun setTheme(theme: Theme) {
    TODO()
  }

  fun setTooltip(tooltip: String) {
    TODO()
  }

  fun setVGrowDirection(direction: Int) {
    TODO()
  }

  fun setVSizeFlags(flags: Int) {
    TODO()
  }

  fun showModal(exclusive: Boolean) {
    TODO()
  }

  fun warpMouse(to_position: Vector2) {
    TODO()
  }

  enum class Anchor(
    val value: Int
  ) {
    ANCHOR_BEGIN(0),

    ANCHOR_END(1);

    companion object {
      fun from(value: Int): Anchor {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class FocusMode(
    val value: Int
  ) {
    FOCUS_NONE(0),

    FOCUS_CLICK(1),

    FOCUS_ALL(2);

    companion object {
      fun from(value: Int): FocusMode {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class LayoutPresetMode(
    val value: Int
  ) {
    PRESET_MODE_MINSIZE(0),

    PRESET_MODE_KEEP_WIDTH(1),

    PRESET_MODE_KEEP_HEIGHT(2),

    PRESET_MODE_KEEP_SIZE(3);

    companion object {
      fun from(value: Int): LayoutPresetMode {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class MouseFilter(
    val value: Int
  ) {
    MOUSE_FILTER_STOP(0),

    MOUSE_FILTER_PASS(1),

    MOUSE_FILTER_IGNORE(2);

    companion object {
      fun from(value: Int): MouseFilter {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class CursorShape(
    val value: Int
  ) {
    CURSOR_ARROW(0),

    CURSOR_IBEAM(1),

    CURSOR_POINTING_HAND(2),

    CURSOR_CROSS(3),

    CURSOR_WAIT(4),

    CURSOR_BUSY(5),

    CURSOR_DRAG(6),

    CURSOR_CAN_DROP(7),

    CURSOR_FORBIDDEN(8),

    CURSOR_VSIZE(9),

    CURSOR_HSIZE(10),

    CURSOR_BDIAGSIZE(11),

    CURSOR_FDIAGSIZE(12),

    CURSOR_MOVE(13),

    CURSOR_VSPLIT(14),

    CURSOR_HSPLIT(15),

    CURSOR_HELP(16);

    companion object {
      fun from(value: Int): CursorShape {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class GrowDirection(
    val value: Int
  ) {
    GROW_DIRECTION_BEGIN(0),

    GROW_DIRECTION_END(1),

    GROW_DIRECTION_BOTH(2);

    companion object {
      fun from(value: Int): GrowDirection {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class SizeFlags(
    val value: Int
  ) {
    SIZE_FILL(1),

    SIZE_EXPAND(2),

    SIZE_EXPAND_FILL(3),

    SIZE_SHRINK_CENTER(4),

    SIZE_SHRINK_END(8);

    companion object {
      fun from(value: Int): SizeFlags {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class LayoutPreset(
    val value: Int
  ) {
    PRESET_TOP_LEFT(0),

    PRESET_TOP_RIGHT(1),

    PRESET_BOTTOM_LEFT(2),

    PRESET_BOTTOM_RIGHT(3),

    PRESET_CENTER_LEFT(4),

    PRESET_CENTER_TOP(5),

    PRESET_CENTER_RIGHT(6),

    PRESET_CENTER_BOTTOM(7),

    PRESET_CENTER(8),

    PRESET_LEFT_WIDE(9),

    PRESET_TOP_WIDE(10),

    PRESET_RIGHT_WIDE(11),

    PRESET_BOTTOM_WIDE(12),

    PRESET_VCENTER_WIDE(13),

    PRESET_HCENTER_WIDE(14),

    PRESET_WIDE(15);

    companion object {
      fun from(value: Int): LayoutPreset {
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
    val ANCHOR_BEGIN: Int = 0

    val ANCHOR_END: Int = 1

    val CURSOR_ARROW: Int = 0

    val CURSOR_BDIAGSIZE: Int = 11

    val CURSOR_BUSY: Int = 5

    val CURSOR_CAN_DROP: Int = 7

    val CURSOR_CROSS: Int = 3

    val CURSOR_DRAG: Int = 6

    val CURSOR_FDIAGSIZE: Int = 12

    val CURSOR_FORBIDDEN: Int = 8

    val CURSOR_HELP: Int = 16

    val CURSOR_HSIZE: Int = 10

    val CURSOR_HSPLIT: Int = 15

    val CURSOR_IBEAM: Int = 1

    val CURSOR_MOVE: Int = 13

    val CURSOR_POINTING_HAND: Int = 2

    val CURSOR_VSIZE: Int = 9

    val CURSOR_VSPLIT: Int = 14

    val CURSOR_WAIT: Int = 4

    val FOCUS_ALL: Int = 2

    val FOCUS_CLICK: Int = 1

    val FOCUS_NONE: Int = 0

    val GROW_DIRECTION_BEGIN: Int = 0

    val GROW_DIRECTION_BOTH: Int = 2

    val GROW_DIRECTION_END: Int = 1

    val MOUSE_FILTER_IGNORE: Int = 2

    val MOUSE_FILTER_PASS: Int = 1

    val MOUSE_FILTER_STOP: Int = 0

    val NOTIFICATION_FOCUS_ENTER: Int = 43

    val NOTIFICATION_FOCUS_EXIT: Int = 44

    val NOTIFICATION_MODAL_CLOSE: Int = 46

    val NOTIFICATION_MOUSE_ENTER: Int = 41

    val NOTIFICATION_MOUSE_EXIT: Int = 42

    val NOTIFICATION_RESIZED: Int = 40

    val NOTIFICATION_SCROLL_BEGIN: Int = 47

    val NOTIFICATION_SCROLL_END: Int = 48

    val NOTIFICATION_THEME_CHANGED: Int = 45

    val PRESET_BOTTOM_LEFT: Int = 2

    val PRESET_BOTTOM_RIGHT: Int = 3

    val PRESET_BOTTOM_WIDE: Int = 12

    val PRESET_CENTER: Int = 8

    val PRESET_CENTER_BOTTOM: Int = 7

    val PRESET_CENTER_LEFT: Int = 4

    val PRESET_CENTER_RIGHT: Int = 6

    val PRESET_CENTER_TOP: Int = 5

    val PRESET_HCENTER_WIDE: Int = 14

    val PRESET_LEFT_WIDE: Int = 9

    val PRESET_MODE_KEEP_HEIGHT: Int = 2

    val PRESET_MODE_KEEP_SIZE: Int = 3

    val PRESET_MODE_KEEP_WIDTH: Int = 1

    val PRESET_MODE_MINSIZE: Int = 0

    val PRESET_RIGHT_WIDE: Int = 11

    val PRESET_TOP_LEFT: Int = 0

    val PRESET_TOP_RIGHT: Int = 1

    val PRESET_TOP_WIDE: Int = 10

    val PRESET_VCENTER_WIDE: Int = 13

    val PRESET_WIDE: Int = 15

    val SIZE_EXPAND: Int = 2

    val SIZE_EXPAND_FILL: Int = 3

    val SIZE_FILL: Int = 1

    val SIZE_SHRINK_CENTER: Int = 4

    val SIZE_SHRINK_END: Int = 8

    fun new(): Control = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Control".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton Control" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Control(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): Control = Control(ptr)
    /**
     * Container for method_bind pointers for Control
     */
    private object __method_bind {
      val accept_event: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
              "accept_event".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method accept_event" }
            }
          }

      val add_color_override: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
              "add_color_override".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_color_override" }
            }
          }

      val add_constant_override: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
              "add_constant_override".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_constant_override" }
            }
          }

      val add_font_override: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
              "add_font_override".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_font_override" }
            }
          }

      val add_icon_override: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
              "add_icon_override".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_icon_override" }
            }
          }

      val add_shader_override: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
              "add_shader_override".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_shader_override" }
            }
          }

      val add_stylebox_override: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
              "add_stylebox_override".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_stylebox_override" }
            }
          }

      val force_drag: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
              "force_drag".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method force_drag" }
            }
          }

      val get_anchor: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
              "get_anchor".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_anchor" }
            }
          }

      val get_begin: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
              "get_begin".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_begin" }
            }
          }

      val get_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
              "get_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_color" }
            }
          }

      val get_combined_minimum_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
              "get_combined_minimum_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_combined_minimum_size" }
            }
          }

      val get_constant: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
              "get_constant".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_constant" }
            }
          }

      val get_cursor_shape: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
              "get_cursor_shape".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_cursor_shape" }
            }
          }

      val get_custom_minimum_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
              "get_custom_minimum_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_custom_minimum_size" }
            }
          }

      val get_default_cursor_shape: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
              "get_default_cursor_shape".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_default_cursor_shape" }
            }
          }

      val get_end: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
              "get_end".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_end" }
            }
          }

      val get_focus_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
              "get_focus_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_focus_mode" }
            }
          }

      val get_focus_neighbour: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
              "get_focus_neighbour".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_focus_neighbour" }
            }
          }

      val get_focus_next: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
              "get_focus_next".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_focus_next" }
            }
          }

      val get_focus_owner: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
              "get_focus_owner".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_focus_owner" }
            }
          }

      val get_focus_previous: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
              "get_focus_previous".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_focus_previous" }
            }
          }

      val get_font: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
              "get_font".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_font" }
            }
          }

      val get_global_position: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
              "get_global_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_global_position" }
            }
          }

      val get_global_rect: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
              "get_global_rect".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_global_rect" }
            }
          }

      val get_h_grow_direction: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
              "get_h_grow_direction".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_h_grow_direction" }
            }
          }

      val get_h_size_flags: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
              "get_h_size_flags".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_h_size_flags" }
            }
          }

      val get_icon: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
              "get_icon".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_icon" }
            }
          }

      val get_margin: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
              "get_margin".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_margin" }
            }
          }

      val get_minimum_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
              "get_minimum_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_minimum_size" }
            }
          }

      val get_mouse_filter: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
              "get_mouse_filter".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_mouse_filter" }
            }
          }

      val get_parent_area_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
              "get_parent_area_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_parent_area_size" }
            }
          }

      val get_parent_control: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
              "get_parent_control".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_parent_control" }
            }
          }

      val get_pivot_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
              "get_pivot_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_pivot_offset" }
            }
          }

      val get_position: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
              "get_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_position" }
            }
          }

      val get_rect: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
              "get_rect".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_rect" }
            }
          }

      val get_rotation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
              "get_rotation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_rotation" }
            }
          }

      val get_rotation_degrees: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
              "get_rotation_degrees".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_rotation_degrees" }
            }
          }

      val get_scale: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
              "get_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_scale" }
            }
          }

      val get_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
              "get_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_size" }
            }
          }

      val get_stretch_ratio: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
              "get_stretch_ratio".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_stretch_ratio" }
            }
          }

      val get_stylebox: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
              "get_stylebox".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_stylebox" }
            }
          }

      val get_theme: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
              "get_theme".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_theme" }
            }
          }

      val get_tooltip: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
              "get_tooltip".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_tooltip" }
            }
          }

      val get_v_grow_direction: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
              "get_v_grow_direction".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_v_grow_direction" }
            }
          }

      val get_v_size_flags: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
              "get_v_size_flags".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_v_size_flags" }
            }
          }

      val grab_click_focus: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
              "grab_click_focus".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method grab_click_focus" }
            }
          }

      val grab_focus: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
              "grab_focus".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method grab_focus" }
            }
          }

      val has_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
              "has_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_color" }
            }
          }

      val has_color_override: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
              "has_color_override".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_color_override" }
            }
          }

      val has_constant: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
              "has_constant".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_constant" }
            }
          }

      val has_constant_override: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
              "has_constant_override".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_constant_override" }
            }
          }

      val has_focus: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
              "has_focus".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_focus" }
            }
          }

      val has_font: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
              "has_font".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_font" }
            }
          }

      val has_font_override: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
              "has_font_override".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_font_override" }
            }
          }

      val has_icon: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
              "has_icon".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_icon" }
            }
          }

      val has_icon_override: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
              "has_icon_override".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_icon_override" }
            }
          }

      val has_shader_override: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
              "has_shader_override".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_shader_override" }
            }
          }

      val has_stylebox: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
              "has_stylebox".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_stylebox" }
            }
          }

      val has_stylebox_override: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
              "has_stylebox_override".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_stylebox_override" }
            }
          }

      val is_clipping_contents: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
              "is_clipping_contents".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_clipping_contents" }
            }
          }

      val minimum_size_changed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
              "minimum_size_changed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method minimum_size_changed" }
            }
          }

      val release_focus: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
              "release_focus".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method release_focus" }
            }
          }

      val set_anchor: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
              "set_anchor".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_anchor" }
            }
          }

      val set_anchor_and_margin: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
              "set_anchor_and_margin".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_anchor_and_margin" }
            }
          }

      val set_anchors_and_margins_preset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
              "set_anchors_and_margins_preset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_anchors_and_margins_preset"
              }
            }
          }

      val set_anchors_preset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
              "set_anchors_preset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_anchors_preset" }
            }
          }

      val set_begin: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
              "set_begin".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_begin" }
            }
          }

      val set_clip_contents: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
              "set_clip_contents".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_clip_contents" }
            }
          }

      val set_custom_minimum_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
              "set_custom_minimum_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_custom_minimum_size" }
            }
          }

      val set_default_cursor_shape: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
              "set_default_cursor_shape".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_default_cursor_shape" }
            }
          }

      val set_drag_forwarding: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
              "set_drag_forwarding".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_drag_forwarding" }
            }
          }

      val set_drag_preview: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
              "set_drag_preview".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_drag_preview" }
            }
          }

      val set_end: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
              "set_end".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_end" }
            }
          }

      val set_focus_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
              "set_focus_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_focus_mode" }
            }
          }

      val set_focus_neighbour: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
              "set_focus_neighbour".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_focus_neighbour" }
            }
          }

      val set_focus_next: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
              "set_focus_next".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_focus_next" }
            }
          }

      val set_focus_previous: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
              "set_focus_previous".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_focus_previous" }
            }
          }

      val set_global_position: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
              "set_global_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_global_position" }
            }
          }

      val set_h_grow_direction: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
              "set_h_grow_direction".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_h_grow_direction" }
            }
          }

      val set_h_size_flags: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
              "set_h_size_flags".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_h_size_flags" }
            }
          }

      val set_margin: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
              "set_margin".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_margin" }
            }
          }

      val set_margins_preset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
              "set_margins_preset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_margins_preset" }
            }
          }

      val set_mouse_filter: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
              "set_mouse_filter".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_mouse_filter" }
            }
          }

      val set_pivot_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
              "set_pivot_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_pivot_offset" }
            }
          }

      val set_position: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
              "set_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_position" }
            }
          }

      val set_rotation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
              "set_rotation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_rotation" }
            }
          }

      val set_rotation_degrees: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
              "set_rotation_degrees".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_rotation_degrees" }
            }
          }

      val set_scale: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
              "set_scale".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_scale" }
            }
          }

      val set_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
              "set_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_size" }
            }
          }

      val set_stretch_ratio: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
              "set_stretch_ratio".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_stretch_ratio" }
            }
          }

      val set_theme: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
              "set_theme".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_theme" }
            }
          }

      val set_tooltip: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
              "set_tooltip".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_tooltip" }
            }
          }

      val set_v_grow_direction: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
              "set_v_grow_direction".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_v_grow_direction" }
            }
          }

      val set_v_size_flags: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
              "set_v_size_flags".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_v_size_flags" }
            }
          }

      val show_modal: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
              "show_modal".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method show_modal" }
            }
          }

      val warp_mouse: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Control".cstr.ptr,
              "warp_mouse".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method warp_mouse" }
            }
          }
    }
  }
}
