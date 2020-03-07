// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import godot.core.Vector3
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.reflect.KCallable
import kotlinx.cinterop.BooleanVar
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.COpaquePointerVar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.DoubleVar
import kotlinx.cinterop.IntVar
import kotlinx.cinterop.alloc
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.readValue
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.value

open class InputInternal(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Object(null) {
  /**
   * Input::joy_connection_changed signal
   */
  val signalJoyConnectionChanged: Signal2<Int, Boolean> = Signal2("joy_connection_changed")

  fun actionPress(action: String, strength: Float = 1.0f) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(action)
      _args.add(strength)
      __method_bind.actionPress.call(self._handle, _args, null)
    }
  }

  fun actionRelease(action: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.actionRelease.call(self._handle, listOf(action), null)
    }
  }

  fun addJoyMapping(mapping: String, updateExisting: Boolean = false) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(mapping)
      _args.add(updateExisting)
      __method_bind.addJoyMapping.call(self._handle, _args, null)
    }
  }

  fun getAccelerometer(): Vector3 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector3()
      val _retPtr = _ret._value.ptr
      __method_bind.getAccelerometer.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getActionStrength(action: String): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getActionStrength.call(self._handle, listOf(action), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getConnectedJoypads(): VariantArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = VariantArray()
      val _retPtr = _ret._value.ptr
      __method_bind.getConnectedJoypads.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getCurrentCursorShape(): Input.CursorShape {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getCurrentCursorShape.call(self._handle, emptyList(), _retPtr)
      Input.CursorShape.from(_ret.value)
    }
  }

  fun getGravity(): Vector3 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector3()
      val _retPtr = _ret._value.ptr
      __method_bind.getGravity.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getGyroscope(): Vector3 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector3()
      val _retPtr = _ret._value.ptr
      __method_bind.getGyroscope.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getJoyAxis(device: Int, axis: Int): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(device)
      _args.add(axis)
      __method_bind.getJoyAxis.call(self._handle, _args, _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getJoyAxisIndexFromString(axis: String): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getJoyAxisIndexFromString.call(self._handle, listOf(axis), _retPtr)
      _ret.value
    }
  }

  fun getJoyAxisString(axisIndex: Int): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getJoyAxisString.call(self._handle, listOf(axisIndex), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getJoyButtonIndexFromString(button: String): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getJoyButtonIndexFromString.call(self._handle, listOf(button), _retPtr)
      _ret.value
    }
  }

  fun getJoyButtonString(buttonIndex: Int): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getJoyButtonString.call(self._handle, listOf(buttonIndex), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getJoyGuid(device: Int): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getJoyGuid.call(self._handle, listOf(device), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getJoyName(device: Int): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getJoyName.call(self._handle, listOf(device), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getJoyVibrationDuration(device: Int): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getJoyVibrationDuration.call(self._handle, listOf(device), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getJoyVibrationStrength(device: Int): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getJoyVibrationStrength.call(self._handle, listOf(device), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getLastMouseSpeed(): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getLastMouseSpeed.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getMagnetometer(): Vector3 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector3()
      val _retPtr = _ret._value.ptr
      __method_bind.getMagnetometer.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getMouseButtonMask(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getMouseButtonMask.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getMouseMode(): Input.MouseMode {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getMouseMode.call(self._handle, emptyList(), _retPtr)
      Input.MouseMode.from(_ret.value)
    }
  }

  fun isActionJustPressed(action: String): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isActionJustPressed.call(self._handle, listOf(action), _retPtr)
      _ret.value
    }
  }

  fun isActionJustReleased(action: String): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isActionJustReleased.call(self._handle, listOf(action), _retPtr)
      _ret.value
    }
  }

  fun isActionPressed(action: String): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isActionPressed.call(self._handle, listOf(action), _retPtr)
      _ret.value
    }
  }

  fun isJoyButtonPressed(device: Int, button: Int): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(device)
      _args.add(button)
      __method_bind.isJoyButtonPressed.call(self._handle, _args, _retPtr)
      _ret.value
    }
  }

  fun isJoyKnown(device: Int): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isJoyKnown.call(self._handle, listOf(device), _retPtr)
      _ret.value
    }
  }

  fun isKeyPressed(scancode: Int): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isKeyPressed.call(self._handle, listOf(scancode), _retPtr)
      _ret.value
    }
  }

  fun isMouseButtonPressed(button: Int): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isMouseButtonPressed.call(self._handle, listOf(button), _retPtr)
      _ret.value
    }
  }

  fun joyConnectionChanged(
    device: Int,
    connected: Boolean,
    name: String,
    guid: String
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(device)
      _args.add(connected)
      _args.add(name)
      _args.add(guid)
      __method_bind.joyConnectionChanged.call(self._handle, _args, null)
    }
  }

  fun parseInputEvent(event: InputEvent) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.parseInputEvent.call(self._handle, listOf(event), null)
    }
  }

  fun removeJoyMapping(guid: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.removeJoyMapping.call(self._handle, listOf(guid), null)
    }
  }

  fun setCustomMouseCursor(
    image: Resource,
    shape: Int = 0,
    hotspot: Vector2 = Vector2(0, 0)
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(image)
      _args.add(shape)
      _args.add(hotspot)
      __method_bind.setCustomMouseCursor.call(self._handle, _args, null)
    }
  }

  fun setDefaultCursorShape(shape: Int = 0) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setDefaultCursorShape.call(self._handle, listOf(shape), null)
    }
  }

  fun setMouseMode(mode: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setMouseMode.call(self._handle, listOf(mode), null)
    }
  }

  fun setUseAccumulatedInput(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setUseAccumulatedInput.call(self._handle, listOf(enable), null)
    }
  }

  fun startJoyVibration(
    device: Int,
    weakMagnitude: Float,
    strongMagnitude: Float,
    duration: Float = 0.0f
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(device)
      _args.add(weakMagnitude)
      _args.add(strongMagnitude)
      _args.add(duration)
      __method_bind.startJoyVibration.call(self._handle, _args, null)
    }
  }

  fun stopJoyVibration(device: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.stopJoyVibration.call(self._handle, listOf(device), null)
    }
  }

  fun vibrateHandheld(durationMs: Int = 500) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.vibrateHandheld.call(self._handle, listOf(durationMs), null)
    }
  }

  fun warpMousePosition(to: Vector2) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.warpMousePosition.call(self._handle, listOf(to), null)
    }
  }

  companion object {
    /**
     * Container for method_bind pointers for Input
     */
    private object __method_bind {
      val actionPress: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
              "action_press".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method action_press" }
            }
          }

      val actionRelease: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
              "action_release".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method action_release" }
            }
          }

      val addJoyMapping: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
              "add_joy_mapping".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_joy_mapping" }
            }
          }

      val getAccelerometer: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
              "get_accelerometer".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_accelerometer" }
            }
          }

      val getActionStrength: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
              "get_action_strength".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_action_strength" }
            }
          }

      val getConnectedJoypads: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
              "get_connected_joypads".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_connected_joypads" }
            }
          }

      val getCurrentCursorShape: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
              "get_current_cursor_shape".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_current_cursor_shape" }
            }
          }

      val getGravity: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
              "get_gravity".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_gravity" }
            }
          }

      val getGyroscope: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
              "get_gyroscope".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_gyroscope" }
            }
          }

      val getJoyAxis: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
              "get_joy_axis".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_joy_axis" }
            }
          }

      val getJoyAxisIndexFromString: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
              "get_joy_axis_index_from_string".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_joy_axis_index_from_string"
              }
            }
          }

      val getJoyAxisString: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
              "get_joy_axis_string".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_joy_axis_string" }
            }
          }

      val getJoyButtonIndexFromString: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
              "get_joy_button_index_from_string".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method get_joy_button_index_from_string" }
            }
          }

      val getJoyButtonString: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
              "get_joy_button_string".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_joy_button_string" }
            }
          }

      val getJoyGuid: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
              "get_joy_guid".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_joy_guid" }
            }
          }

      val getJoyName: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
              "get_joy_name".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_joy_name" }
            }
          }

      val getJoyVibrationDuration: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
              "get_joy_vibration_duration".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_joy_vibration_duration" }
            }
          }

      val getJoyVibrationStrength: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
              "get_joy_vibration_strength".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_joy_vibration_strength" }
            }
          }

      val getLastMouseSpeed: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
              "get_last_mouse_speed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_last_mouse_speed" }
            }
          }

      val getMagnetometer: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
              "get_magnetometer".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_magnetometer" }
            }
          }

      val getMouseButtonMask: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
              "get_mouse_button_mask".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_mouse_button_mask" }
            }
          }

      val getMouseMode: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
              "get_mouse_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_mouse_mode" }
            }
          }

      val isActionJustPressed: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
              "is_action_just_pressed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_action_just_pressed" }
            }
          }

      val isActionJustReleased: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
              "is_action_just_released".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_action_just_released" }
            }
          }

      val isActionPressed: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
              "is_action_pressed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_action_pressed" }
            }
          }

      val isJoyButtonPressed: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
              "is_joy_button_pressed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_joy_button_pressed" }
            }
          }

      val isJoyKnown: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
              "is_joy_known".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_joy_known" }
            }
          }

      val isKeyPressed: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
              "is_key_pressed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_key_pressed" }
            }
          }

      val isMouseButtonPressed: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
              "is_mouse_button_pressed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_mouse_button_pressed" }
            }
          }

      val joyConnectionChanged: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
              "joy_connection_changed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method joy_connection_changed" }
            }
          }

      val parseInputEvent: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
              "parse_input_event".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method parse_input_event" }
            }
          }

      val removeJoyMapping: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
              "remove_joy_mapping".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_joy_mapping" }
            }
          }

      val setCustomMouseCursor: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
              "set_custom_mouse_cursor".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_custom_mouse_cursor" }
            }
          }

      val setDefaultCursorShape: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
              "set_default_cursor_shape".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_default_cursor_shape" }
            }
          }

      val setMouseMode: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
              "set_mouse_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_mouse_mode" }
            }
          }

      val setUseAccumulatedInput: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
              "set_use_accumulated_input".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_use_accumulated_input" }
            }
          }

      val startJoyVibration: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
              "start_joy_vibration".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method start_joy_vibration" }
            }
          }

      val stopJoyVibration: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
              "stop_joy_vibration".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method stop_joy_vibration" }
            }
          }

      val vibrateHandheld: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
              "vibrate_handheld".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method vibrate_handheld" }
            }
          }

      val warpMousePosition: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Input".cstr.ptr,
              "warp_mouse_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method warp_mouse_position" }
            }
          }
    }
  }
}

object Input : InputInternal(null) {
  init {
    Allocator.allocationScope {
      val handle = checkNotNull(Godot.gdnative.godot_global_get_singleton)("Input".cstr.ptr)
      requireNotNull(handle) { "No instance found for singleton Input" }
      _handle = handle
    }
  }

  enum class MouseMode(
    val value: Int
  ) {
    VISIBLE(0),

    HIDDEN(1),

    CAPTURED(2),

    CONFINED(3);

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
    ARROW(0),

    IBEAM(1),

    POINTING_HAND(2),

    CROSS(3),

    WAIT(4),

    BUSY(5),

    DRAG(6),

    CAN_DROP(7),

    FORBIDDEN(8),

    VSIZE(9),

    HSIZE(10),

    BDIAGSIZE(11),

    FDIAGSIZE(12),

    MOVE(13),

    VSPLIT(14),

    HSPLIT(15),

    HELP(16);

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
}
