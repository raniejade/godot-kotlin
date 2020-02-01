// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import godot.core.Vector3
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class Input(
  _handle: COpaquePointer
) : Object(_handle) {
  fun actionPress(action: String, strength: Float = 1.0f) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(action))
    _args.add(Variant.fromAny(strength))
    __method_bind.actionPress.call(this._handle, _args)
  }

  fun actionRelease(action: String) {
    val _arg = Variant.new(action)
    __method_bind.actionRelease.call(this._handle, listOf(_arg))
  }

  fun addJoyMapping(mapping: String, updateExisting: Boolean = false) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(mapping))
    _args.add(Variant.fromAny(updateExisting))
    __method_bind.addJoyMapping.call(this._handle, _args)
  }

  fun getAccelerometer(): Vector3 {
    val _ret = __method_bind.getAccelerometer.call(this._handle)
    return _ret.asVector3()
  }

  fun getActionStrength(action: String): Float {
    val _arg = Variant.new(action)
    val _ret = __method_bind.getActionStrength.call(this._handle, listOf(_arg))
    return _ret.asFloat()
  }

  fun getConnectedJoypads(): VariantArray {
    val _ret = __method_bind.getConnectedJoypads.call(this._handle)
    return _ret.asVariantArray()
  }

  fun getCurrentCursorShape(): CursorShape {
    val _ret = __method_bind.getCurrentCursorShape.call(this._handle)
    return Input.CursorShape.from(_ret.asInt())
  }

  fun getGravity(): Vector3 {
    val _ret = __method_bind.getGravity.call(this._handle)
    return _ret.asVector3()
  }

  fun getGyroscope(): Vector3 {
    val _ret = __method_bind.getGyroscope.call(this._handle)
    return _ret.asVector3()
  }

  fun getJoyAxis(device: Int, axis: Int): Float {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(device))
    _args.add(Variant.fromAny(axis))
    val _ret = __method_bind.getJoyAxis.call(this._handle, _args)
    return _ret.asFloat()
  }

  fun getJoyAxisIndexFromString(axis: String): Int {
    val _arg = Variant.new(axis)
    val _ret = __method_bind.getJoyAxisIndexFromString.call(this._handle, listOf(_arg))
    return _ret.asInt()
  }

  fun getJoyAxisString(axisIndex: Int): String {
    val _arg = Variant.new(axisIndex)
    val _ret = __method_bind.getJoyAxisString.call(this._handle, listOf(_arg))
    return _ret.asString()
  }

  fun getJoyButtonIndexFromString(button: String): Int {
    val _arg = Variant.new(button)
    val _ret = __method_bind.getJoyButtonIndexFromString.call(this._handle, listOf(_arg))
    return _ret.asInt()
  }

  fun getJoyButtonString(buttonIndex: Int): String {
    val _arg = Variant.new(buttonIndex)
    val _ret = __method_bind.getJoyButtonString.call(this._handle, listOf(_arg))
    return _ret.asString()
  }

  fun getJoyGuid(device: Int): String {
    val _arg = Variant.new(device)
    val _ret = __method_bind.getJoyGuid.call(this._handle, listOf(_arg))
    return _ret.asString()
  }

  fun getJoyName(device: Int): String {
    val _arg = Variant.new(device)
    val _ret = __method_bind.getJoyName.call(this._handle, listOf(_arg))
    return _ret.asString()
  }

  fun getJoyVibrationDuration(device: Int): Float {
    val _arg = Variant.new(device)
    val _ret = __method_bind.getJoyVibrationDuration.call(this._handle, listOf(_arg))
    return _ret.asFloat()
  }

  fun getJoyVibrationStrength(device: Int): Vector2 {
    val _arg = Variant.new(device)
    val _ret = __method_bind.getJoyVibrationStrength.call(this._handle, listOf(_arg))
    return _ret.asVector2()
  }

  fun getLastMouseSpeed(): Vector2 {
    val _ret = __method_bind.getLastMouseSpeed.call(this._handle)
    return _ret.asVector2()
  }

  fun getMagnetometer(): Vector3 {
    val _ret = __method_bind.getMagnetometer.call(this._handle)
    return _ret.asVector3()
  }

  fun getMouseButtonMask(): Int {
    val _ret = __method_bind.getMouseButtonMask.call(this._handle)
    return _ret.asInt()
  }

  fun getMouseMode(): MouseMode {
    val _ret = __method_bind.getMouseMode.call(this._handle)
    return Input.MouseMode.from(_ret.asInt())
  }

  fun isActionJustPressed(action: String): Boolean {
    val _arg = Variant.new(action)
    val _ret = __method_bind.isActionJustPressed.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun isActionJustReleased(action: String): Boolean {
    val _arg = Variant.new(action)
    val _ret = __method_bind.isActionJustReleased.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun isActionPressed(action: String): Boolean {
    val _arg = Variant.new(action)
    val _ret = __method_bind.isActionPressed.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun isJoyButtonPressed(device: Int, button: Int): Boolean {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(device))
    _args.add(Variant.fromAny(button))
    val _ret = __method_bind.isJoyButtonPressed.call(this._handle, _args)
    return _ret.asBoolean()
  }

  fun isJoyKnown(device: Int): Boolean {
    val _arg = Variant.new(device)
    val _ret = __method_bind.isJoyKnown.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun isKeyPressed(scancode: Int): Boolean {
    val _arg = Variant.new(scancode)
    val _ret = __method_bind.isKeyPressed.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun isMouseButtonPressed(button: Int): Boolean {
    val _arg = Variant.new(button)
    val _ret = __method_bind.isMouseButtonPressed.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun joyConnectionChanged(
    device: Int,
    connected: Boolean,
    name: String,
    guid: String
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(device))
    _args.add(Variant.fromAny(connected))
    _args.add(Variant.fromAny(name))
    _args.add(Variant.fromAny(guid))
    __method_bind.joyConnectionChanged.call(this._handle, _args)
  }

  fun parseInputEvent(event: InputEvent) {
    val _arg = Variant.new(event)
    __method_bind.parseInputEvent.call(this._handle, listOf(_arg))
  }

  fun removeJoyMapping(guid: String) {
    val _arg = Variant.new(guid)
    __method_bind.removeJoyMapping.call(this._handle, listOf(_arg))
  }

  fun setCustomMouseCursor(
    image: Resource,
    shape: Int = 0,
    hotspot: Vector2 = Vector2.new(0, 0)
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(image))
    _args.add(Variant.fromAny(shape))
    _args.add(Variant.fromAny(hotspot))
    __method_bind.setCustomMouseCursor.call(this._handle, _args)
  }

  fun setDefaultCursorShape(shape: Int = 0) {
    val _arg = Variant.new(shape)
    __method_bind.setDefaultCursorShape.call(this._handle, listOf(_arg))
  }

  fun setMouseMode(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.setMouseMode.call(this._handle, listOf(_arg))
  }

  fun setUseAccumulatedInput(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setUseAccumulatedInput.call(this._handle, listOf(_arg))
  }

  fun startJoyVibration(
    device: Int,
    weakMagnitude: Float,
    strongMagnitude: Float,
    duration: Float = 0.0f
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(device))
    _args.add(Variant.fromAny(weakMagnitude))
    _args.add(Variant.fromAny(strongMagnitude))
    _args.add(Variant.fromAny(duration))
    __method_bind.startJoyVibration.call(this._handle, _args)
  }

  fun stopJoyVibration(device: Int) {
    val _arg = Variant.new(device)
    __method_bind.stopJoyVibration.call(this._handle, listOf(_arg))
  }

  fun vibrateHandheld(durationMs: Int = 500) {
    val _arg = Variant.new(durationMs)
    __method_bind.vibrateHandheld.call(this._handle, listOf(_arg))
  }

  fun warpMousePosition(to: Vector2) {
    val _arg = Variant.new(to)
    __method_bind.warpMousePosition.call(this._handle, listOf(_arg))
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
    val Instance: Input
      get() = memScoped {
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
      val actionPress: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
            "action_press".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method action_press" }
        }
      val actionRelease: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
            "action_release".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method action_release" }
        }
      val addJoyMapping: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
            "add_joy_mapping".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_joy_mapping" }
        }
      val getAccelerometer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
            "get_accelerometer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_accelerometer" }
        }
      val getActionStrength: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
            "get_action_strength".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_action_strength" }
        }
      val getConnectedJoypads: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
            "get_connected_joypads".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_connected_joypads" }
        }
      val getCurrentCursorShape: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
            "get_current_cursor_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_current_cursor_shape" }
        }
      val getGravity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
            "get_gravity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_gravity" }
        }
      val getGyroscope: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
            "get_gyroscope".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_gyroscope" }
        }
      val getJoyAxis: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
            "get_joy_axis".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_joy_axis" }
        }
      val getJoyAxisIndexFromString: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
            "get_joy_axis_index_from_string".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_joy_axis_index_from_string" }
        }
      val getJoyAxisString: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
            "get_joy_axis_string".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_joy_axis_string" }
        }
      val getJoyButtonIndexFromString: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
            "get_joy_button_index_from_string".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_joy_button_index_from_string" }
        }
      val getJoyButtonString: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
            "get_joy_button_string".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_joy_button_string" }
        }
      val getJoyGuid: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
            "get_joy_guid".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_joy_guid" }
        }
      val getJoyName: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
            "get_joy_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_joy_name" }
        }
      val getJoyVibrationDuration: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
            "get_joy_vibration_duration".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_joy_vibration_duration" }
        }
      val getJoyVibrationStrength: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
            "get_joy_vibration_strength".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_joy_vibration_strength" }
        }
      val getLastMouseSpeed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
            "get_last_mouse_speed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_last_mouse_speed" }
        }
      val getMagnetometer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
            "get_magnetometer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_magnetometer" }
        }
      val getMouseButtonMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
            "get_mouse_button_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_mouse_button_mask" }
        }
      val getMouseMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
            "get_mouse_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_mouse_mode" }
        }
      val isActionJustPressed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
            "is_action_just_pressed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_action_just_pressed" }
        }
      val isActionJustReleased: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
            "is_action_just_released".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_action_just_released" }
        }
      val isActionPressed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
            "is_action_pressed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_action_pressed" }
        }
      val isJoyButtonPressed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
            "is_joy_button_pressed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_joy_button_pressed" }
        }
      val isJoyKnown: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
            "is_joy_known".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_joy_known" }
        }
      val isKeyPressed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
            "is_key_pressed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_key_pressed" }
        }
      val isMouseButtonPressed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
            "is_mouse_button_pressed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_mouse_button_pressed" }
        }
      val joyConnectionChanged: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
            "joy_connection_changed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method joy_connection_changed" }
        }
      val parseInputEvent: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
            "parse_input_event".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method parse_input_event" }
        }
      val removeJoyMapping: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
            "remove_joy_mapping".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_joy_mapping" }
        }
      val setCustomMouseCursor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
            "set_custom_mouse_cursor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_custom_mouse_cursor" }
        }
      val setDefaultCursorShape: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
            "set_default_cursor_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_default_cursor_shape" }
        }
      val setMouseMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
            "set_mouse_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_mouse_mode" }
        }
      val setUseAccumulatedInput: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
            "set_use_accumulated_input".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_use_accumulated_input" }
        }
      val startJoyVibration: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
            "start_joy_vibration".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method start_joy_vibration" }
        }
      val stopJoyVibration: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
            "stop_joy_vibration".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method stop_joy_vibration" }
        }
      val vibrateHandheld: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
            "vibrate_handheld".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method vibrate_handheld" }
        }
      val warpMousePosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
            "warp_mouse_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method warp_mouse_position" }
        }}
  }
}
