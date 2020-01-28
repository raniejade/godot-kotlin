// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Dictionary
import godot.core.GDError
import godot.core.Godot
import godot.core.PoolStringArray
import godot.core.Rect2
import godot.core.Variant
import godot.core.VariantArray
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

open class _OS(
  _handle: COpaquePointer
) : Object(_handle) {
  fun alert(text: String, title: String) {
    val _args = VariantArray.new()
    _args.append(text)
    _args.append(title)
    __method_bind.alert.call(this._handle, _args.toVariant(), 2)
  }

  fun canDraw(): Boolean {
    val _ret = __method_bind.can_draw.call(this._handle)
    return _ret.asBoolean()
  }

  fun canUseThreads(): Boolean {
    val _ret = __method_bind.can_use_threads.call(this._handle)
    return _ret.asBoolean()
  }

  fun centerWindow() {
    __method_bind.center_window.call(this._handle)
  }

  fun closeMidiInputs() {
    __method_bind.close_midi_inputs.call(this._handle)
  }

  fun delayMsec(msec: Int) {
    val _arg = Variant.new(msec)
    __method_bind.delay_msec.call(this._handle, _arg, 1)
  }

  fun delayUsec(usec: Int) {
    val _arg = Variant.new(usec)
    __method_bind.delay_usec.call(this._handle, _arg, 1)
  }

  fun dumpMemoryToFile(file: String) {
    val _arg = Variant.new(file)
    __method_bind.dump_memory_to_file.call(this._handle, _arg, 1)
  }

  fun dumpResourcesToFile(file: String) {
    val _arg = Variant.new(file)
    __method_bind.dump_resources_to_file.call(this._handle, _arg, 1)
  }

  fun execute(
    path: String,
    arguments: PoolStringArray,
    blocking: Boolean,
    output: VariantArray,
    readStderr: Boolean
  ): Int {
    val _args = VariantArray.new()
    _args.append(path)
    _args.append(arguments)
    _args.append(blocking)
    _args.append(output)
    _args.append(readStderr)
    val _ret = __method_bind.execute.call(this._handle, _args.toVariant(), 5)
    return _ret.asInt()
  }

  fun findScancodeFromString(string: String): Int {
    val _arg = Variant.new(string)
    val _ret = __method_bind.find_scancode_from_string.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun getAudioDriverCount(): Int {
    val _ret = __method_bind.get_audio_driver_count.call(this._handle)
    return _ret.asInt()
  }

  fun getAudioDriverName(driver: Int): String {
    val _arg = Variant.new(driver)
    val _ret = __method_bind.get_audio_driver_name.call(this._handle, _arg, 1)
    return _ret.asString()
  }

  fun getBorderlessWindow(): Boolean {
    val _ret = __method_bind.get_borderless_window.call(this._handle)
    return _ret.asBoolean()
  }

  fun getClipboard(): String {
    val _ret = __method_bind.get_clipboard.call(this._handle)
    return _ret.asString()
  }

  fun getCmdlineArgs(): PoolStringArray {
    val _ret = __method_bind.get_cmdline_args.call(this._handle)
    return _ret.asPoolStringArray()
  }

  fun getConnectedMidiInputs(): PoolStringArray {
    val _ret = __method_bind.get_connected_midi_inputs.call(this._handle)
    return _ret.asPoolStringArray()
  }

  fun getCurrentScreen(): Int {
    val _ret = __method_bind.get_current_screen.call(this._handle)
    return _ret.asInt()
  }

  fun getCurrentVideoDriver(): VideoDriver {
    val _ret = __method_bind.get_current_video_driver.call(this._handle)
    return _OS.VideoDriver.from(_ret.asInt())
  }

  fun getDate(utc: Boolean): Dictionary {
    val _arg = Variant.new(utc)
    val _ret = __method_bind.get_date.call(this._handle, _arg, 1)
    return _ret.asDictionary()
  }

  fun getDatetime(utc: Boolean): Dictionary {
    val _arg = Variant.new(utc)
    val _ret = __method_bind.get_datetime.call(this._handle, _arg, 1)
    return _ret.asDictionary()
  }

  fun getDatetimeFromUnixTime(unixTimeVal: Int): Dictionary {
    val _arg = Variant.new(unixTimeVal)
    val _ret = __method_bind.get_datetime_from_unix_time.call(this._handle, _arg, 1)
    return _ret.asDictionary()
  }

  fun getDynamicMemoryUsage(): Int {
    val _ret = __method_bind.get_dynamic_memory_usage.call(this._handle)
    return _ret.asInt()
  }

  fun getEnvironment(environment: String): String {
    val _arg = Variant.new(environment)
    val _ret = __method_bind.get_environment.call(this._handle, _arg, 1)
    return _ret.asString()
  }

  fun getExecutablePath(): String {
    val _ret = __method_bind.get_executable_path.call(this._handle)
    return _ret.asString()
  }

  fun getExitCode(): Int {
    val _ret = __method_bind.get_exit_code.call(this._handle)
    return _ret.asInt()
  }

  fun getImeSelection(): Vector2 {
    val _ret = __method_bind.get_ime_selection.call(this._handle)
    return _ret.asVector2()
  }

  fun getImeText(): String {
    val _ret = __method_bind.get_ime_text.call(this._handle)
    return _ret.asString()
  }

  fun getLatinKeyboardVariant(): String {
    val _ret = __method_bind.get_latin_keyboard_variant.call(this._handle)
    return _ret.asString()
  }

  fun getLocale(): String {
    val _ret = __method_bind.get_locale.call(this._handle)
    return _ret.asString()
  }

  fun getModelName(): String {
    val _ret = __method_bind.get_model_name.call(this._handle)
    return _ret.asString()
  }

  fun getName(): String {
    val _ret = __method_bind.get_name.call(this._handle)
    return _ret.asString()
  }

  fun getPowerPercentLeft(): Int {
    val _ret = __method_bind.get_power_percent_left.call(this._handle)
    return _ret.asInt()
  }

  fun getPowerSecondsLeft(): Int {
    val _ret = __method_bind.get_power_seconds_left.call(this._handle)
    return _ret.asInt()
  }

  fun getPowerState(): PowerState {
    val _ret = __method_bind.get_power_state.call(this._handle)
    return _OS.PowerState.from(_ret.asInt())
  }

  fun getProcessId(): Int {
    val _ret = __method_bind.get_process_id.call(this._handle)
    return _ret.asInt()
  }

  fun getProcessorCount(): Int {
    val _ret = __method_bind.get_processor_count.call(this._handle)
    return _ret.asInt()
  }

  fun getRealWindowSize(): Vector2 {
    val _ret = __method_bind.get_real_window_size.call(this._handle)
    return _ret.asVector2()
  }

  fun getScancodeString(code: Int): String {
    val _arg = Variant.new(code)
    val _ret = __method_bind.get_scancode_string.call(this._handle, _arg, 1)
    return _ret.asString()
  }

  fun getScreenCount(): Int {
    val _ret = __method_bind.get_screen_count.call(this._handle)
    return _ret.asInt()
  }

  fun getScreenDpi(screen: Int): Int {
    val _arg = Variant.new(screen)
    val _ret = __method_bind.get_screen_dpi.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun getScreenOrientation(): ScreenOrientation {
    val _ret = __method_bind.get_screen_orientation.call(this._handle)
    return _OS.ScreenOrientation.from(_ret.asInt())
  }

  fun getScreenPosition(screen: Int): Vector2 {
    val _arg = Variant.new(screen)
    val _ret = __method_bind.get_screen_position.call(this._handle, _arg, 1)
    return _ret.asVector2()
  }

  fun getScreenSize(screen: Int): Vector2 {
    val _arg = Variant.new(screen)
    val _ret = __method_bind.get_screen_size.call(this._handle, _arg, 1)
    return _ret.asVector2()
  }

  fun getSplashTickMsec(): Int {
    val _ret = __method_bind.get_splash_tick_msec.call(this._handle)
    return _ret.asInt()
  }

  fun getStaticMemoryPeakUsage(): Int {
    val _ret = __method_bind.get_static_memory_peak_usage.call(this._handle)
    return _ret.asInt()
  }

  fun getStaticMemoryUsage(): Int {
    val _ret = __method_bind.get_static_memory_usage.call(this._handle)
    return _ret.asInt()
  }

  fun getSystemDir(dir: Int): String {
    val _arg = Variant.new(dir)
    val _ret = __method_bind.get_system_dir.call(this._handle, _arg, 1)
    return _ret.asString()
  }

  fun getSystemTimeMsecs(): Int {
    val _ret = __method_bind.get_system_time_msecs.call(this._handle)
    return _ret.asInt()
  }

  fun getSystemTimeSecs(): Int {
    val _ret = __method_bind.get_system_time_secs.call(this._handle)
    return _ret.asInt()
  }

  fun getTicksMsec(): Int {
    val _ret = __method_bind.get_ticks_msec.call(this._handle)
    return _ret.asInt()
  }

  fun getTicksUsec(): Int {
    val _ret = __method_bind.get_ticks_usec.call(this._handle)
    return _ret.asInt()
  }

  fun getTime(utc: Boolean): Dictionary {
    val _arg = Variant.new(utc)
    val _ret = __method_bind.get_time.call(this._handle, _arg, 1)
    return _ret.asDictionary()
  }

  fun getTimeZoneInfo(): Dictionary {
    val _ret = __method_bind.get_time_zone_info.call(this._handle)
    return _ret.asDictionary()
  }

  fun getUniqueId(): String {
    val _ret = __method_bind.get_unique_id.call(this._handle)
    return _ret.asString()
  }

  fun getUnixTime(): Int {
    val _ret = __method_bind.get_unix_time.call(this._handle)
    return _ret.asInt()
  }

  fun getUnixTimeFromDatetime(datetime: Dictionary): Int {
    val _arg = Variant.new(datetime)
    val _ret = __method_bind.get_unix_time_from_datetime.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun getUserDataDir(): String {
    val _ret = __method_bind.get_user_data_dir.call(this._handle)
    return _ret.asString()
  }

  fun getVideoDriverCount(): Int {
    val _ret = __method_bind.get_video_driver_count.call(this._handle)
    return _ret.asInt()
  }

  fun getVideoDriverName(driver: Int): String {
    val _arg = Variant.new(driver)
    val _ret = __method_bind.get_video_driver_name.call(this._handle, _arg, 1)
    return _ret.asString()
  }

  fun getVirtualKeyboardHeight(): Int {
    val _ret = __method_bind.get_virtual_keyboard_height.call(this._handle)
    return _ret.asInt()
  }

  fun getWindowPerPixelTransparencyEnabled(): Boolean {
    val _ret = __method_bind.get_window_per_pixel_transparency_enabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun getWindowPosition(): Vector2 {
    val _ret = __method_bind.get_window_position.call(this._handle)
    return _ret.asVector2()
  }

  fun getWindowSafeArea(): Rect2 {
    val _ret = __method_bind.get_window_safe_area.call(this._handle)
    return _ret.asRect2()
  }

  fun getWindowSize(): Vector2 {
    val _ret = __method_bind.get_window_size.call(this._handle)
    return _ret.asVector2()
  }

  fun hasEnvironment(environment: String): Boolean {
    val _arg = Variant.new(environment)
    val _ret = __method_bind.has_environment.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun hasFeature(tagName: String): Boolean {
    val _arg = Variant.new(tagName)
    val _ret = __method_bind.has_feature.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun hasTouchscreenUiHint(): Boolean {
    val _ret = __method_bind.has_touchscreen_ui_hint.call(this._handle)
    return _ret.asBoolean()
  }

  fun hasVirtualKeyboard(): Boolean {
    val _ret = __method_bind.has_virtual_keyboard.call(this._handle)
    return _ret.asBoolean()
  }

  fun hideVirtualKeyboard() {
    __method_bind.hide_virtual_keyboard.call(this._handle)
  }

  fun isDebugBuild(): Boolean {
    val _ret = __method_bind.is_debug_build.call(this._handle)
    return _ret.asBoolean()
  }

  fun isInLowProcessorUsageMode(): Boolean {
    val _ret = __method_bind.is_in_low_processor_usage_mode.call(this._handle)
    return _ret.asBoolean()
  }

  fun isKeepScreenOn(): Boolean {
    val _ret = __method_bind.is_keep_screen_on.call(this._handle)
    return _ret.asBoolean()
  }

  fun isOkLeftAndCancelRight(): Boolean {
    val _ret = __method_bind.is_ok_left_and_cancel_right.call(this._handle)
    return _ret.asBoolean()
  }

  fun isScancodeUnicode(code: Int): Boolean {
    val _arg = Variant.new(code)
    val _ret = __method_bind.is_scancode_unicode.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun isStdoutVerbose(): Boolean {
    val _ret = __method_bind.is_stdout_verbose.call(this._handle)
    return _ret.asBoolean()
  }

  fun isUserfsPersistent(): Boolean {
    val _ret = __method_bind.is_userfs_persistent.call(this._handle)
    return _ret.asBoolean()
  }

  fun isVsyncEnabled(): Boolean {
    val _ret = __method_bind.is_vsync_enabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun isWindowAlwaysOnTop(): Boolean {
    val _ret = __method_bind.is_window_always_on_top.call(this._handle)
    return _ret.asBoolean()
  }

  fun isWindowFullscreen(): Boolean {
    val _ret = __method_bind.is_window_fullscreen.call(this._handle)
    return _ret.asBoolean()
  }

  fun isWindowMaximized(): Boolean {
    val _ret = __method_bind.is_window_maximized.call(this._handle)
    return _ret.asBoolean()
  }

  fun isWindowMinimized(): Boolean {
    val _ret = __method_bind.is_window_minimized.call(this._handle)
    return _ret.asBoolean()
  }

  fun isWindowResizable(): Boolean {
    val _ret = __method_bind.is_window_resizable.call(this._handle)
    return _ret.asBoolean()
  }

  fun kill(pid: Int): GDError {
    val _arg = Variant.new(pid)
    val _ret = __method_bind.kill.call(this._handle, _arg, 1)
    return GDError.from(_ret.asInt())
  }

  fun moveWindowToForeground() {
    __method_bind.move_window_to_foreground.call(this._handle)
  }

  fun nativeVideoIsPlaying(): Boolean {
    val _ret = __method_bind.native_video_is_playing.call(this._handle)
    return _ret.asBoolean()
  }

  fun nativeVideoPause() {
    __method_bind.native_video_pause.call(this._handle)
  }

  fun nativeVideoPlay(
    path: String,
    volume: Float,
    audioTrack: String,
    subtitleTrack: String
  ): GDError {
    val _args = VariantArray.new()
    _args.append(path)
    _args.append(volume)
    _args.append(audioTrack)
    _args.append(subtitleTrack)
    val _ret = __method_bind.native_video_play.call(this._handle, _args.toVariant(), 4)
    return GDError.from(_ret.asInt())
  }

  fun nativeVideoStop() {
    __method_bind.native_video_stop.call(this._handle)
  }

  fun nativeVideoUnpause() {
    __method_bind.native_video_unpause.call(this._handle)
  }

  fun openMidiInputs() {
    __method_bind.open_midi_inputs.call(this._handle)
  }

  fun printAllResources(tofile: String) {
    val _arg = Variant.new(tofile)
    __method_bind.print_all_resources.call(this._handle, _arg, 1)
  }

  fun printAllTexturesBySize() {
    __method_bind.print_all_textures_by_size.call(this._handle)
  }

  fun printResourcesByType(types: PoolStringArray) {
    val _arg = Variant.new(types)
    __method_bind.print_resources_by_type.call(this._handle, _arg, 1)
  }

  fun printResourcesInUse(short: Boolean) {
    val _arg = Variant.new(short)
    __method_bind.print_resources_in_use.call(this._handle, _arg, 1)
  }

  fun requestAttention() {
    __method_bind.request_attention.call(this._handle)
  }

  fun requestPermission(name: String): Boolean {
    val _arg = Variant.new(name)
    val _ret = __method_bind.request_permission.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun setBorderlessWindow(borderless: Boolean) {
    val _arg = Variant.new(borderless)
    __method_bind.set_borderless_window.call(this._handle, _arg, 1)
  }

  fun setClipboard(clipboard: String) {
    val _arg = Variant.new(clipboard)
    __method_bind.set_clipboard.call(this._handle, _arg, 1)
  }

  fun setCurrentScreen(screen: Int) {
    val _arg = Variant.new(screen)
    __method_bind.set_current_screen.call(this._handle, _arg, 1)
  }

  fun setExitCode(code: Int) {
    val _arg = Variant.new(code)
    __method_bind.set_exit_code.call(this._handle, _arg, 1)
  }

  fun setIcon(icon: Image) {
    val _arg = Variant.new(icon)
    __method_bind.set_icon.call(this._handle, _arg, 1)
  }

  fun setImeActive(active: Boolean) {
    val _arg = Variant.new(active)
    __method_bind.set_ime_active.call(this._handle, _arg, 1)
  }

  fun setImePosition(position: Vector2) {
    val _arg = Variant.new(position)
    __method_bind.set_ime_position.call(this._handle, _arg, 1)
  }

  fun setKeepScreenOn(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.set_keep_screen_on.call(this._handle, _arg, 1)
  }

  fun setLowProcessorUsageMode(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.set_low_processor_usage_mode.call(this._handle, _arg, 1)
  }

  fun setNativeIcon(filename: String) {
    val _arg = Variant.new(filename)
    __method_bind.set_native_icon.call(this._handle, _arg, 1)
  }

  fun setScreenOrientation(orientation: Int) {
    val _arg = Variant.new(orientation)
    __method_bind.set_screen_orientation.call(this._handle, _arg, 1)
  }

  fun setThreadName(name: String): GDError {
    val _arg = Variant.new(name)
    val _ret = __method_bind.set_thread_name.call(this._handle, _arg, 1)
    return GDError.from(_ret.asInt())
  }

  fun setUseFileAccessSaveAndSwap(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.set_use_file_access_save_and_swap.call(this._handle, _arg, 1)
  }

  fun setUseVsync(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.set_use_vsync.call(this._handle, _arg, 1)
  }

  fun setWindowAlwaysOnTop(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.set_window_always_on_top.call(this._handle, _arg, 1)
  }

  fun setWindowFullscreen(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.set_window_fullscreen.call(this._handle, _arg, 1)
  }

  fun setWindowMaximized(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.set_window_maximized.call(this._handle, _arg, 1)
  }

  fun setWindowMinimized(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.set_window_minimized.call(this._handle, _arg, 1)
  }

  fun setWindowPerPixelTransparencyEnabled(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.set_window_per_pixel_transparency_enabled.call(this._handle, _arg, 1)
  }

  fun setWindowPosition(position: Vector2) {
    val _arg = Variant.new(position)
    __method_bind.set_window_position.call(this._handle, _arg, 1)
  }

  fun setWindowResizable(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.set_window_resizable.call(this._handle, _arg, 1)
  }

  fun setWindowSize(size: Vector2) {
    val _arg = Variant.new(size)
    __method_bind.set_window_size.call(this._handle, _arg, 1)
  }

  fun setWindowTitle(title: String) {
    val _arg = Variant.new(title)
    __method_bind.set_window_title.call(this._handle, _arg, 1)
  }

  fun shellOpen(uri: String): GDError {
    val _arg = Variant.new(uri)
    val _ret = __method_bind.shell_open.call(this._handle, _arg, 1)
    return GDError.from(_ret.asInt())
  }

  fun showVirtualKeyboard(existingText: String) {
    val _arg = Variant.new(existingText)
    __method_bind.show_virtual_keyboard.call(this._handle, _arg, 1)
  }

  enum class VideoDriver(
    val value: Int
  ) {
    VIDEO_DRIVER_GLES3(0),

    VIDEO_DRIVER_GLES2(1);

    companion object {
      fun from(value: Int): VideoDriver {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class SystemDir(
    val value: Int
  ) {
    SYSTEM_DIR_DESKTOP(0),

    SYSTEM_DIR_DCIM(1),

    SYSTEM_DIR_DOCUMENTS(2),

    SYSTEM_DIR_DOWNLOADS(3),

    SYSTEM_DIR_MOVIES(4),

    SYSTEM_DIR_MUSIC(5),

    SYSTEM_DIR_PICTURES(6),

    SYSTEM_DIR_RINGTONES(7);

    companion object {
      fun from(value: Int): SystemDir {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class ScreenOrientation(
    val value: Int
  ) {
    SCREEN_ORIENTATION_LANDSCAPE(0),

    SCREEN_ORIENTATION_PORTRAIT(1),

    SCREEN_ORIENTATION_REVERSE_LANDSCAPE(2),

    SCREEN_ORIENTATION_REVERSE_PORTRAIT(3),

    SCREEN_ORIENTATION_SENSOR_LANDSCAPE(4),

    SCREEN_ORIENTATION_SENSOR_PORTRAIT(5),

    SCREEN_ORIENTATION_SENSOR(6);

    companion object {
      fun from(value: Int): ScreenOrientation {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class PowerState(
    val value: Int
  ) {
    POWERSTATE_UNKNOWN(0),

    POWERSTATE_ON_BATTERY(1),

    POWERSTATE_NO_BATTERY(2),

    POWERSTATE_CHARGING(3),

    POWERSTATE_CHARGED(4);

    companion object {
      fun from(value: Int): PowerState {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class Month(
    val value: Int
  ) {
    MONTH_JANUARY(1),

    MONTH_FEBRUARY(2),

    MONTH_MARCH(3),

    MONTH_APRIL(4),

    MONTH_MAY(5),

    MONTH_JUNE(6),

    MONTH_JULY(7),

    MONTH_AUGUST(8),

    MONTH_SEPTEMBER(9),

    MONTH_OCTOBER(10),

    MONTH_NOVEMBER(11),

    MONTH_DECEMBER(12);

    companion object {
      fun from(value: Int): Month {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class Weekday(
    val value: Int
  ) {
    DAY_SUNDAY(0),

    DAY_MONDAY(1),

    DAY_TUESDAY(2),

    DAY_WEDNESDAY(3),

    DAY_THURSDAY(4),

    DAY_FRIDAY(5),

    DAY_SATURDAY(6);

    companion object {
      fun from(value: Int): Weekday {
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
    val Instance: _OS
      get() = memScoped {
        val handle = checkNotNull(Godot.gdnative.godot_global_get_singleton)("_OS".cstr.ptr)
        requireNotNull(handle) { "No instance found for singleton _OS" }
        _OS(
          handle
        )
      }
    val DAY_FRIDAY: Int = 5

    val DAY_MONDAY: Int = 1

    val DAY_SATURDAY: Int = 6

    val DAY_SUNDAY: Int = 0

    val DAY_THURSDAY: Int = 4

    val DAY_TUESDAY: Int = 2

    val DAY_WEDNESDAY: Int = 3

    val MONTH_APRIL: Int = 4

    val MONTH_AUGUST: Int = 8

    val MONTH_DECEMBER: Int = 12

    val MONTH_FEBRUARY: Int = 2

    val MONTH_JANUARY: Int = 1

    val MONTH_JULY: Int = 7

    val MONTH_JUNE: Int = 6

    val MONTH_MARCH: Int = 3

    val MONTH_MAY: Int = 5

    val MONTH_NOVEMBER: Int = 11

    val MONTH_OCTOBER: Int = 10

    val MONTH_SEPTEMBER: Int = 9

    val POWERSTATE_CHARGED: Int = 4

    val POWERSTATE_CHARGING: Int = 3

    val POWERSTATE_NO_BATTERY: Int = 2

    val POWERSTATE_ON_BATTERY: Int = 1

    val POWERSTATE_UNKNOWN: Int = 0

    val SCREEN_ORIENTATION_LANDSCAPE: Int = 0

    val SCREEN_ORIENTATION_PORTRAIT: Int = 1

    val SCREEN_ORIENTATION_REVERSE_LANDSCAPE: Int = 2

    val SCREEN_ORIENTATION_REVERSE_PORTRAIT: Int = 3

    val SCREEN_ORIENTATION_SENSOR: Int = 6

    val SCREEN_ORIENTATION_SENSOR_LANDSCAPE: Int = 4

    val SCREEN_ORIENTATION_SENSOR_PORTRAIT: Int = 5

    val SYSTEM_DIR_DCIM: Int = 1

    val SYSTEM_DIR_DESKTOP: Int = 0

    val SYSTEM_DIR_DOCUMENTS: Int = 2

    val SYSTEM_DIR_DOWNLOADS: Int = 3

    val SYSTEM_DIR_MOVIES: Int = 4

    val SYSTEM_DIR_MUSIC: Int = 5

    val SYSTEM_DIR_PICTURES: Int = 6

    val SYSTEM_DIR_RINGTONES: Int = 7

    val VIDEO_DRIVER_GLES2: Int = 1

    val VIDEO_DRIVER_GLES3: Int = 0

    /**
     * Container for method_bind pointers for _OS
     */
    private object __method_bind {
      val alert: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "alert".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method alert" }
        }
      val can_draw: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "can_draw".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method can_draw" }
        }
      val can_use_threads: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "can_use_threads".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method can_use_threads" }
        }
      val center_window: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "center_window".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method center_window" }
        }
      val close_midi_inputs: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "close_midi_inputs".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method close_midi_inputs" }
        }
      val delay_msec: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "delay_msec".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method delay_msec" }
        }
      val delay_usec: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "delay_usec".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method delay_usec" }
        }
      val dump_memory_to_file: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "dump_memory_to_file".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method dump_memory_to_file" }
        }
      val dump_resources_to_file: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "dump_resources_to_file".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method dump_resources_to_file" }
        }
      val execute: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "execute".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method execute" }
        }
      val find_scancode_from_string: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "find_scancode_from_string".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method find_scancode_from_string" }
        }
      val get_audio_driver_count: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_audio_driver_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_audio_driver_count" }
        }
      val get_audio_driver_name: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_audio_driver_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_audio_driver_name" }
        }
      val get_borderless_window: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_borderless_window".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_borderless_window" }
        }
      val get_clipboard: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_clipboard".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_clipboard" }
        }
      val get_cmdline_args: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_cmdline_args".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_cmdline_args" }
        }
      val get_connected_midi_inputs: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_connected_midi_inputs".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_connected_midi_inputs" }
        }
      val get_current_screen: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_current_screen".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_current_screen" }
        }
      val get_current_video_driver: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_current_video_driver".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_current_video_driver" }
        }
      val get_date: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_date".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_date" }
        }
      val get_datetime: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_datetime".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_datetime" }
        }
      val get_datetime_from_unix_time: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_datetime_from_unix_time".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_datetime_from_unix_time" }
        }
      val get_dynamic_memory_usage: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_dynamic_memory_usage".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_dynamic_memory_usage" }
        }
      val get_environment: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_environment".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_environment" }
        }
      val get_executable_path: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_executable_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_executable_path" }
        }
      val get_exit_code: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_exit_code".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_exit_code" }
        }
      val get_ime_selection: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_ime_selection".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_ime_selection" }
        }
      val get_ime_text: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_ime_text".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_ime_text" }
        }
      val get_latin_keyboard_variant: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_latin_keyboard_variant".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_latin_keyboard_variant" }
        }
      val get_locale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_locale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_locale" }
        }
      val get_model_name: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_model_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_model_name" }
        }
      val get_name: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_name" }
        }
      val get_power_percent_left: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_power_percent_left".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_power_percent_left" }
        }
      val get_power_seconds_left: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_power_seconds_left".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_power_seconds_left" }
        }
      val get_power_state: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_power_state".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_power_state" }
        }
      val get_process_id: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_process_id".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_process_id" }
        }
      val get_processor_count: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_processor_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_processor_count" }
        }
      val get_real_window_size: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_real_window_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_real_window_size" }
        }
      val get_scancode_string: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_scancode_string".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_scancode_string" }
        }
      val get_screen_count: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_screen_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_screen_count" }
        }
      val get_screen_dpi: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_screen_dpi".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_screen_dpi" }
        }
      val get_screen_orientation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_screen_orientation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_screen_orientation" }
        }
      val get_screen_position: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_screen_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_screen_position" }
        }
      val get_screen_size: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_screen_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_screen_size" }
        }
      val get_splash_tick_msec: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_splash_tick_msec".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_splash_tick_msec" }
        }
      val get_static_memory_peak_usage: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_static_memory_peak_usage".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_static_memory_peak_usage" }
        }
      val get_static_memory_usage: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_static_memory_usage".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_static_memory_usage" }
        }
      val get_system_dir: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_system_dir".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_system_dir" }
        }
      val get_system_time_msecs: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_system_time_msecs".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_system_time_msecs" }
        }
      val get_system_time_secs: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_system_time_secs".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_system_time_secs" }
        }
      val get_ticks_msec: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_ticks_msec".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_ticks_msec" }
        }
      val get_ticks_usec: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_ticks_usec".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_ticks_usec" }
        }
      val get_time: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_time".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_time" }
        }
      val get_time_zone_info: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_time_zone_info".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_time_zone_info" }
        }
      val get_unique_id: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_unique_id".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_unique_id" }
        }
      val get_unix_time: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_unix_time".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_unix_time" }
        }
      val get_unix_time_from_datetime: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_unix_time_from_datetime".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_unix_time_from_datetime" }
        }
      val get_user_data_dir: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_user_data_dir".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_user_data_dir" }
        }
      val get_video_driver_count: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_video_driver_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_video_driver_count" }
        }
      val get_video_driver_name: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_video_driver_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_video_driver_name" }
        }
      val get_virtual_keyboard_height: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_virtual_keyboard_height".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_virtual_keyboard_height" }
        }
      val get_window_per_pixel_transparency_enabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_window_per_pixel_transparency_enabled".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method get_window_per_pixel_transparency_enabled" }
        }
      val get_window_position: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_window_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_window_position" }
        }
      val get_window_safe_area: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_window_safe_area".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_window_safe_area" }
        }
      val get_window_size: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_window_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_window_size" }
        }
      val has_environment: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "has_environment".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_environment" }
        }
      val has_feature: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "has_feature".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_feature" }
        }
      val has_touchscreen_ui_hint: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "has_touchscreen_ui_hint".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_touchscreen_ui_hint" }
        }
      val has_virtual_keyboard: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "has_virtual_keyboard".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_virtual_keyboard" }
        }
      val hide_virtual_keyboard: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "hide_virtual_keyboard".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method hide_virtual_keyboard" }
        }
      val is_debug_build: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "is_debug_build".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_debug_build" }
        }
      val is_in_low_processor_usage_mode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "is_in_low_processor_usage_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_in_low_processor_usage_mode" }
        }
      val is_keep_screen_on: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "is_keep_screen_on".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_keep_screen_on" }
        }
      val is_ok_left_and_cancel_right: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "is_ok_left_and_cancel_right".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_ok_left_and_cancel_right" }
        }
      val is_scancode_unicode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "is_scancode_unicode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_scancode_unicode" }
        }
      val is_stdout_verbose: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "is_stdout_verbose".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_stdout_verbose" }
        }
      val is_userfs_persistent: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "is_userfs_persistent".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_userfs_persistent" }
        }
      val is_vsync_enabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "is_vsync_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_vsync_enabled" }
        }
      val is_window_always_on_top: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "is_window_always_on_top".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_window_always_on_top" }
        }
      val is_window_fullscreen: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "is_window_fullscreen".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_window_fullscreen" }
        }
      val is_window_maximized: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "is_window_maximized".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_window_maximized" }
        }
      val is_window_minimized: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "is_window_minimized".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_window_minimized" }
        }
      val is_window_resizable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "is_window_resizable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_window_resizable" }
        }
      val kill: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "kill".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method kill" }
        }
      val move_window_to_foreground: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "move_window_to_foreground".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method move_window_to_foreground" }
        }
      val native_video_is_playing: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "native_video_is_playing".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method native_video_is_playing" }
        }
      val native_video_pause: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "native_video_pause".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method native_video_pause" }
        }
      val native_video_play: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "native_video_play".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method native_video_play" }
        }
      val native_video_stop: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "native_video_stop".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method native_video_stop" }
        }
      val native_video_unpause: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "native_video_unpause".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method native_video_unpause" }
        }
      val open_midi_inputs: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "open_midi_inputs".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method open_midi_inputs" }
        }
      val print_all_resources: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "print_all_resources".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method print_all_resources" }
        }
      val print_all_textures_by_size: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "print_all_textures_by_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method print_all_textures_by_size" }
        }
      val print_resources_by_type: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "print_resources_by_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method print_resources_by_type" }
        }
      val print_resources_in_use: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "print_resources_in_use".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method print_resources_in_use" }
        }
      val request_attention: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "request_attention".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method request_attention" }
        }
      val request_permission: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "request_permission".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method request_permission" }
        }
      val set_borderless_window: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "set_borderless_window".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_borderless_window" }
        }
      val set_clipboard: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "set_clipboard".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_clipboard" }
        }
      val set_current_screen: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "set_current_screen".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_current_screen" }
        }
      val set_exit_code: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "set_exit_code".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_exit_code" }
        }
      val set_icon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "set_icon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_icon" }
        }
      val set_ime_active: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "set_ime_active".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_ime_active" }
        }
      val set_ime_position: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "set_ime_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_ime_position" }
        }
      val set_keep_screen_on: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "set_keep_screen_on".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_keep_screen_on" }
        }
      val set_low_processor_usage_mode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "set_low_processor_usage_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_low_processor_usage_mode" }
        }
      val set_native_icon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "set_native_icon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_native_icon" }
        }
      val set_screen_orientation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "set_screen_orientation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_screen_orientation" }
        }
      val set_thread_name: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "set_thread_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_thread_name" }
        }
      val set_use_file_access_save_and_swap: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "set_use_file_access_save_and_swap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_use_file_access_save_and_swap"
            }
        }
      val set_use_vsync: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "set_use_vsync".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_use_vsync" }
        }
      val set_window_always_on_top: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "set_window_always_on_top".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_window_always_on_top" }
        }
      val set_window_fullscreen: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "set_window_fullscreen".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_window_fullscreen" }
        }
      val set_window_maximized: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "set_window_maximized".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_window_maximized" }
        }
      val set_window_minimized: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "set_window_minimized".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_window_minimized" }
        }
      val set_window_per_pixel_transparency_enabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "set_window_per_pixel_transparency_enabled".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method set_window_per_pixel_transparency_enabled" }
        }
      val set_window_position: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "set_window_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_window_position" }
        }
      val set_window_resizable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "set_window_resizable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_window_resizable" }
        }
      val set_window_size: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "set_window_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_window_size" }
        }
      val set_window_title: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "set_window_title".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_window_title" }
        }
      val shell_open: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "shell_open".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method shell_open" }
        }
      val show_virtual_keyboard: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "show_virtual_keyboard".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method show_virtual_keyboard" }
        }}
  }
}
