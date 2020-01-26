// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.VariantArray
import godot.core.Vector2
import godot.core.Vector3
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

open class Input internal constructor(
  _handle: COpaquePointer
) : Object(_handle) {
  fun actionPress(action: String, strength: Float) {
    TODO()
  }

  fun actionRelease(action: String) {
    TODO()
  }

  fun addJoyMapping(mapping: String, update_existing: Boolean) {
    TODO()
  }

  fun getAccelerometer(): Vector3 {
    TODO()
  }

  fun getActionStrength(action: String): Float {
    TODO()
  }

  fun getConnectedJoypads(): VariantArray {
    TODO()
  }

  fun getCurrentCursorShape(): CursorShape {
    TODO()
  }

  fun getGravity(): Vector3 {
    TODO()
  }

  fun getGyroscope(): Vector3 {
    TODO()
  }

  fun getJoyAxis(device: Int, axis: Int): Float {
    TODO()
  }

  fun getJoyAxisIndexFromString(axis: String): Int {
    TODO()
  }

  fun getJoyAxisString(axis_index: Int): String {
    TODO()
  }

  fun getJoyButtonIndexFromString(button: String): Int {
    TODO()
  }

  fun getJoyButtonString(button_index: Int): String {
    TODO()
  }

  fun getJoyGuid(device: Int): String {
    TODO()
  }

  fun getJoyName(device: Int): String {
    TODO()
  }

  fun getJoyVibrationDuration(device: Int): Float {
    TODO()
  }

  fun getJoyVibrationStrength(device: Int): Vector2 {
    TODO()
  }

  fun getLastMouseSpeed(): Vector2 {
    TODO()
  }

  fun getMagnetometer(): Vector3 {
    TODO()
  }

  fun getMouseButtonMask(): Int {
    TODO()
  }

  fun getMouseMode(): MouseMode {
    TODO()
  }

  fun isActionJustPressed(action: String): Boolean {
    TODO()
  }

  fun isActionJustReleased(action: String): Boolean {
    TODO()
  }

  fun isActionPressed(action: String): Boolean {
    TODO()
  }

  fun isJoyButtonPressed(device: Int, button: Int): Boolean {
    TODO()
  }

  fun isJoyKnown(device: Int): Boolean {
    TODO()
  }

  fun isKeyPressed(scancode: Int): Boolean {
    TODO()
  }

  fun isMouseButtonPressed(button: Int): Boolean {
    TODO()
  }

  fun joyConnectionChanged(
    device: Int,
    connected: Boolean,
    name: String,
    guid: String
  ) {
    TODO()
  }

  fun parseInputEvent(event: InputEvent) {
    TODO()
  }

  fun removeJoyMapping(guid: String) {
    TODO()
  }

  fun setCustomMouseCursor(
    image: Resource,
    shape: Int,
    hotspot: Vector2
  ) {
    TODO()
  }

  fun setDefaultCursorShape(shape: Int) {
    TODO()
  }

  fun setMouseMode(mode: Int) {
    TODO()
  }

  fun setUseAccumulatedInput(enable: Boolean) {
    TODO()
  }

  fun startJoyVibration(
    device: Int,
    weak_magnitude: Float,
    strong_magnitude: Float,
    duration: Float
  ) {
    TODO()
  }

  fun stopJoyVibration(device: Int) {
    TODO()
  }

  fun warpMousePosition(to: Vector2) {
    TODO()
  }

  enum class MouseMode(
    val value: Int
  ) {
    MOUSE_MODE_VISIBLE(0),

    MOUSE_MODE_HIDDEN(1),

    MOUSE_MODE_CAPTURED(2),

    MOUSE_MODE_CONFINED(3);

    companion object {
      fun from(value: Int): MouseMode {
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

  companion object {
    val Instance: Input = memScoped {
          val handle = checkNotNull(Godot.gdnative.godot_global_get_singleton)("Input".cstr.ptr)
          requireNotNull(handle) { "No instance found for singleton Input" }
          Input(
            handle
          )
        }

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

    val MOUSE_MODE_CAPTURED: Int = 2

    val MOUSE_MODE_CONFINED: Int = 3

    val MOUSE_MODE_HIDDEN: Int = 1

    val MOUSE_MODE_VISIBLE: Int = 0

    /**
     * Container for method_bind pointers for Input
     */
    private object __method_bind {
      val action_press: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
              "action_press".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method action_press" }
            }
          }

      val action_release: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
              "action_release".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method action_release" }
            }
          }

      val add_joy_mapping: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
              "add_joy_mapping".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_joy_mapping" }
            }
          }

      val get_accelerometer: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
              "get_accelerometer".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_accelerometer" }
            }
          }

      val get_action_strength: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
              "get_action_strength".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_action_strength" }
            }
          }

      val get_connected_joypads: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
              "get_connected_joypads".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_connected_joypads" }
            }
          }

      val get_current_cursor_shape: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
              "get_current_cursor_shape".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_current_cursor_shape" }
            }
          }

      val get_gravity: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
              "get_gravity".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_gravity" }
            }
          }

      val get_gyroscope: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
              "get_gyroscope".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_gyroscope" }
            }
          }

      val get_joy_axis: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
              "get_joy_axis".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_joy_axis" }
            }
          }

      val get_joy_axis_index_from_string: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
              "get_joy_axis_index_from_string".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_joy_axis_index_from_string"
              }
            }
          }

      val get_joy_axis_string: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
              "get_joy_axis_string".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_joy_axis_string" }
            }
          }

      val get_joy_button_index_from_string: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
              "get_joy_button_index_from_string".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method get_joy_button_index_from_string" }
            }
          }

      val get_joy_button_string: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
              "get_joy_button_string".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_joy_button_string" }
            }
          }

      val get_joy_guid: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
              "get_joy_guid".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_joy_guid" }
            }
          }

      val get_joy_name: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
              "get_joy_name".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_joy_name" }
            }
          }

      val get_joy_vibration_duration: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
              "get_joy_vibration_duration".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_joy_vibration_duration" }
            }
          }

      val get_joy_vibration_strength: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
              "get_joy_vibration_strength".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_joy_vibration_strength" }
            }
          }

      val get_last_mouse_speed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
              "get_last_mouse_speed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_last_mouse_speed" }
            }
          }

      val get_magnetometer: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
              "get_magnetometer".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_magnetometer" }
            }
          }

      val get_mouse_button_mask: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
              "get_mouse_button_mask".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_mouse_button_mask" }
            }
          }

      val get_mouse_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
              "get_mouse_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_mouse_mode" }
            }
          }

      val is_action_just_pressed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
              "is_action_just_pressed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_action_just_pressed" }
            }
          }

      val is_action_just_released: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
              "is_action_just_released".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_action_just_released" }
            }
          }

      val is_action_pressed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
              "is_action_pressed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_action_pressed" }
            }
          }

      val is_joy_button_pressed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
              "is_joy_button_pressed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_joy_button_pressed" }
            }
          }

      val is_joy_known: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
              "is_joy_known".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_joy_known" }
            }
          }

      val is_key_pressed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
              "is_key_pressed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_key_pressed" }
            }
          }

      val is_mouse_button_pressed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
              "is_mouse_button_pressed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_mouse_button_pressed" }
            }
          }

      val joy_connection_changed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
              "joy_connection_changed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method joy_connection_changed" }
            }
          }

      val parse_input_event: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
              "parse_input_event".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method parse_input_event" }
            }
          }

      val remove_joy_mapping: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
              "remove_joy_mapping".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_joy_mapping" }
            }
          }

      val set_custom_mouse_cursor: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
              "set_custom_mouse_cursor".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_custom_mouse_cursor" }
            }
          }

      val set_default_cursor_shape: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
              "set_default_cursor_shape".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_default_cursor_shape" }
            }
          }

      val set_mouse_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
              "set_mouse_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_mouse_mode" }
            }
          }

      val set_use_accumulated_input: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
              "set_use_accumulated_input".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_use_accumulated_input" }
            }
          }

      val start_joy_vibration: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
              "start_joy_vibration".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method start_joy_vibration" }
            }
          }

      val stop_joy_vibration: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
              "stop_joy_vibration".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method stop_joy_vibration" }
            }
          }

      val warp_mouse_position: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
              "warp_mouse_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method warp_mouse_position" }
            }
          }
    }
  }
}
