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
  var clipboard: String
    get() {
       return getClipboard() 
    }
    set(value) {
      setClipboard(value)
    }

  var currentScreen: Int
    get() {
       return getCurrentScreen() 
    }
    set(value) {
      setCurrentScreen(value)
    }

  var exitCode: Int
    get() {
       return getExitCode() 
    }
    set(value) {
      setExitCode(value)
    }

  var keepScreenOn: Boolean
    get() {
       return isKeepScreenOn() 
    }
    set(value) {
      setKeepScreenOn(value)
    }

  var lowProcessorUsageMode: Boolean
    get() {
       return isInLowProcessorUsageMode() 
    }
    set(value) {
      setLowProcessorUsageMode(value)
    }

  var screenOrientation: Int
    get() {
       return _OS.ScreenOrientation.from(getScreenOrientation()) 
    }
    set(value) {
      setScreenOrientation(_OS.ScreenOrientation.from(value))
    }

  var vsyncEnabled: Boolean
    get() {
       return isVsyncEnabled() 
    }
    set(value) {
      setUseVsync(value)
    }

  var windowBorderless: Boolean
    get() {
       return getBorderlessWindow() 
    }
    set(value) {
      setBorderlessWindow(value)
    }

  var windowFullscreen: Boolean
    get() {
       return isWindowFullscreen() 
    }
    set(value) {
      setWindowFullscreen(value)
    }

  var windowMaximized: Boolean
    get() {
       return isWindowMaximized() 
    }
    set(value) {
      setWindowMaximized(value)
    }

  var windowMinimized: Boolean
    get() {
       return isWindowMinimized() 
    }
    set(value) {
      setWindowMinimized(value)
    }

  var windowPerPixelTransparencyEnabled: Boolean
    get() {
       return getWindowPerPixelTransparencyEnabled() 
    }
    set(value) {
      setWindowPerPixelTransparencyEnabled(value)
    }

  var windowPosition: Vector2
    get() {
       return getWindowPosition() 
    }
    set(value) {
      setWindowPosition(value)
    }

  var windowResizable: Boolean
    get() {
       return isWindowResizable() 
    }
    set(value) {
      setWindowResizable(value)
    }

  var windowSize: Vector2
    get() {
       return getWindowSize() 
    }
    set(value) {
      setWindowSize(value)
    }

  fun alert(text: String, title: String) {
    val _args = VariantArray.new()
    _args.append(text)
    _args.append(title)
    __method_bind.alert.call(this._handle, _args.toVariant(), 2)
  }

  fun canDraw(): Boolean {
    val _ret = __method_bind.canDraw.call(this._handle)
    return _ret.asBoolean()
  }

  fun canUseThreads(): Boolean {
    val _ret = __method_bind.canUseThreads.call(this._handle)
    return _ret.asBoolean()
  }

  fun centerWindow() {
    __method_bind.centerWindow.call(this._handle)
  }

  fun closeMidiInputs() {
    __method_bind.closeMidiInputs.call(this._handle)
  }

  fun delayMsec(msec: Int) {
    val _arg = Variant.new(msec)
    __method_bind.delayMsec.call(this._handle, _arg, 1)
  }

  fun delayUsec(usec: Int) {
    val _arg = Variant.new(usec)
    __method_bind.delayUsec.call(this._handle, _arg, 1)
  }

  fun dumpMemoryToFile(file: String) {
    val _arg = Variant.new(file)
    __method_bind.dumpMemoryToFile.call(this._handle, _arg, 1)
  }

  fun dumpResourcesToFile(file: String) {
    val _arg = Variant.new(file)
    __method_bind.dumpResourcesToFile.call(this._handle, _arg, 1)
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
    val _ret = __method_bind.findScancodeFromString.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun getAudioDriverCount(): Int {
    val _ret = __method_bind.getAudioDriverCount.call(this._handle)
    return _ret.asInt()
  }

  fun getAudioDriverName(driver: Int): String {
    val _arg = Variant.new(driver)
    val _ret = __method_bind.getAudioDriverName.call(this._handle, _arg, 1)
    return _ret.asString()
  }

  fun getBorderlessWindow(): Boolean {
    val _ret = __method_bind.getBorderlessWindow.call(this._handle)
    return _ret.asBoolean()
  }

  fun getClipboard(): String {
    val _ret = __method_bind.getClipboard.call(this._handle)
    return _ret.asString()
  }

  fun getCmdlineArgs(): PoolStringArray {
    val _ret = __method_bind.getCmdlineArgs.call(this._handle)
    return _ret.asPoolStringArray()
  }

  fun getConnectedMidiInputs(): PoolStringArray {
    val _ret = __method_bind.getConnectedMidiInputs.call(this._handle)
    return _ret.asPoolStringArray()
  }

  fun getCurrentScreen(): Int {
    val _ret = __method_bind.getCurrentScreen.call(this._handle)
    return _ret.asInt()
  }

  fun getCurrentVideoDriver(): VideoDriver {
    val _ret = __method_bind.getCurrentVideoDriver.call(this._handle)
    return _OS.VideoDriver.from(_ret.asInt())
  }

  fun getDate(utc: Boolean): Dictionary {
    val _arg = Variant.new(utc)
    val _ret = __method_bind.getDate.call(this._handle, _arg, 1)
    return _ret.asDictionary()
  }

  fun getDatetime(utc: Boolean): Dictionary {
    val _arg = Variant.new(utc)
    val _ret = __method_bind.getDatetime.call(this._handle, _arg, 1)
    return _ret.asDictionary()
  }

  fun getDatetimeFromUnixTime(unixTimeVal: Int): Dictionary {
    val _arg = Variant.new(unixTimeVal)
    val _ret = __method_bind.getDatetimeFromUnixTime.call(this._handle, _arg, 1)
    return _ret.asDictionary()
  }

  fun getDynamicMemoryUsage(): Int {
    val _ret = __method_bind.getDynamicMemoryUsage.call(this._handle)
    return _ret.asInt()
  }

  fun getEnvironment(environment: String): String {
    val _arg = Variant.new(environment)
    val _ret = __method_bind.getEnvironment.call(this._handle, _arg, 1)
    return _ret.asString()
  }

  fun getExecutablePath(): String {
    val _ret = __method_bind.getExecutablePath.call(this._handle)
    return _ret.asString()
  }

  fun getExitCode(): Int {
    val _ret = __method_bind.getExitCode.call(this._handle)
    return _ret.asInt()
  }

  fun getImeSelection(): Vector2 {
    val _ret = __method_bind.getImeSelection.call(this._handle)
    return _ret.asVector2()
  }

  fun getImeText(): String {
    val _ret = __method_bind.getImeText.call(this._handle)
    return _ret.asString()
  }

  fun getLatinKeyboardVariant(): String {
    val _ret = __method_bind.getLatinKeyboardVariant.call(this._handle)
    return _ret.asString()
  }

  fun getLocale(): String {
    val _ret = __method_bind.getLocale.call(this._handle)
    return _ret.asString()
  }

  fun getModelName(): String {
    val _ret = __method_bind.getModelName.call(this._handle)
    return _ret.asString()
  }

  fun getName(): String {
    val _ret = __method_bind.getName.call(this._handle)
    return _ret.asString()
  }

  fun getPowerPercentLeft(): Int {
    val _ret = __method_bind.getPowerPercentLeft.call(this._handle)
    return _ret.asInt()
  }

  fun getPowerSecondsLeft(): Int {
    val _ret = __method_bind.getPowerSecondsLeft.call(this._handle)
    return _ret.asInt()
  }

  fun getPowerState(): PowerState {
    val _ret = __method_bind.getPowerState.call(this._handle)
    return _OS.PowerState.from(_ret.asInt())
  }

  fun getProcessId(): Int {
    val _ret = __method_bind.getProcessId.call(this._handle)
    return _ret.asInt()
  }

  fun getProcessorCount(): Int {
    val _ret = __method_bind.getProcessorCount.call(this._handle)
    return _ret.asInt()
  }

  fun getRealWindowSize(): Vector2 {
    val _ret = __method_bind.getRealWindowSize.call(this._handle)
    return _ret.asVector2()
  }

  fun getScancodeString(code: Int): String {
    val _arg = Variant.new(code)
    val _ret = __method_bind.getScancodeString.call(this._handle, _arg, 1)
    return _ret.asString()
  }

  fun getScreenCount(): Int {
    val _ret = __method_bind.getScreenCount.call(this._handle)
    return _ret.asInt()
  }

  fun getScreenDpi(screen: Int): Int {
    val _arg = Variant.new(screen)
    val _ret = __method_bind.getScreenDpi.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun getScreenOrientation(): ScreenOrientation {
    val _ret = __method_bind.getScreenOrientation.call(this._handle)
    return _OS.ScreenOrientation.from(_ret.asInt())
  }

  fun getScreenPosition(screen: Int): Vector2 {
    val _arg = Variant.new(screen)
    val _ret = __method_bind.getScreenPosition.call(this._handle, _arg, 1)
    return _ret.asVector2()
  }

  fun getScreenSize(screen: Int): Vector2 {
    val _arg = Variant.new(screen)
    val _ret = __method_bind.getScreenSize.call(this._handle, _arg, 1)
    return _ret.asVector2()
  }

  fun getSplashTickMsec(): Int {
    val _ret = __method_bind.getSplashTickMsec.call(this._handle)
    return _ret.asInt()
  }

  fun getStaticMemoryPeakUsage(): Int {
    val _ret = __method_bind.getStaticMemoryPeakUsage.call(this._handle)
    return _ret.asInt()
  }

  fun getStaticMemoryUsage(): Int {
    val _ret = __method_bind.getStaticMemoryUsage.call(this._handle)
    return _ret.asInt()
  }

  fun getSystemDir(dir: Int): String {
    val _arg = Variant.new(dir)
    val _ret = __method_bind.getSystemDir.call(this._handle, _arg, 1)
    return _ret.asString()
  }

  fun getSystemTimeMsecs(): Int {
    val _ret = __method_bind.getSystemTimeMsecs.call(this._handle)
    return _ret.asInt()
  }

  fun getSystemTimeSecs(): Int {
    val _ret = __method_bind.getSystemTimeSecs.call(this._handle)
    return _ret.asInt()
  }

  fun getTicksMsec(): Int {
    val _ret = __method_bind.getTicksMsec.call(this._handle)
    return _ret.asInt()
  }

  fun getTicksUsec(): Int {
    val _ret = __method_bind.getTicksUsec.call(this._handle)
    return _ret.asInt()
  }

  fun getTime(utc: Boolean): Dictionary {
    val _arg = Variant.new(utc)
    val _ret = __method_bind.getTime.call(this._handle, _arg, 1)
    return _ret.asDictionary()
  }

  fun getTimeZoneInfo(): Dictionary {
    val _ret = __method_bind.getTimeZoneInfo.call(this._handle)
    return _ret.asDictionary()
  }

  fun getUniqueId(): String {
    val _ret = __method_bind.getUniqueId.call(this._handle)
    return _ret.asString()
  }

  fun getUnixTime(): Int {
    val _ret = __method_bind.getUnixTime.call(this._handle)
    return _ret.asInt()
  }

  fun getUnixTimeFromDatetime(datetime: Dictionary): Int {
    val _arg = Variant.new(datetime)
    val _ret = __method_bind.getUnixTimeFromDatetime.call(this._handle, _arg, 1)
    return _ret.asInt()
  }

  fun getUserDataDir(): String {
    val _ret = __method_bind.getUserDataDir.call(this._handle)
    return _ret.asString()
  }

  fun getVideoDriverCount(): Int {
    val _ret = __method_bind.getVideoDriverCount.call(this._handle)
    return _ret.asInt()
  }

  fun getVideoDriverName(driver: Int): String {
    val _arg = Variant.new(driver)
    val _ret = __method_bind.getVideoDriverName.call(this._handle, _arg, 1)
    return _ret.asString()
  }

  fun getVirtualKeyboardHeight(): Int {
    val _ret = __method_bind.getVirtualKeyboardHeight.call(this._handle)
    return _ret.asInt()
  }

  fun getWindowPerPixelTransparencyEnabled(): Boolean {
    val _ret = __method_bind.getWindowPerPixelTransparencyEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun getWindowPosition(): Vector2 {
    val _ret = __method_bind.getWindowPosition.call(this._handle)
    return _ret.asVector2()
  }

  fun getWindowSafeArea(): Rect2 {
    val _ret = __method_bind.getWindowSafeArea.call(this._handle)
    return _ret.asRect2()
  }

  fun getWindowSize(): Vector2 {
    val _ret = __method_bind.getWindowSize.call(this._handle)
    return _ret.asVector2()
  }

  fun hasEnvironment(environment: String): Boolean {
    val _arg = Variant.new(environment)
    val _ret = __method_bind.hasEnvironment.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun hasFeature(tagName: String): Boolean {
    val _arg = Variant.new(tagName)
    val _ret = __method_bind.hasFeature.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun hasTouchscreenUiHint(): Boolean {
    val _ret = __method_bind.hasTouchscreenUiHint.call(this._handle)
    return _ret.asBoolean()
  }

  fun hasVirtualKeyboard(): Boolean {
    val _ret = __method_bind.hasVirtualKeyboard.call(this._handle)
    return _ret.asBoolean()
  }

  fun hideVirtualKeyboard() {
    __method_bind.hideVirtualKeyboard.call(this._handle)
  }

  fun isDebugBuild(): Boolean {
    val _ret = __method_bind.isDebugBuild.call(this._handle)
    return _ret.asBoolean()
  }

  fun isInLowProcessorUsageMode(): Boolean {
    val _ret = __method_bind.isInLowProcessorUsageMode.call(this._handle)
    return _ret.asBoolean()
  }

  fun isKeepScreenOn(): Boolean {
    val _ret = __method_bind.isKeepScreenOn.call(this._handle)
    return _ret.asBoolean()
  }

  fun isOkLeftAndCancelRight(): Boolean {
    val _ret = __method_bind.isOkLeftAndCancelRight.call(this._handle)
    return _ret.asBoolean()
  }

  fun isScancodeUnicode(code: Int): Boolean {
    val _arg = Variant.new(code)
    val _ret = __method_bind.isScancodeUnicode.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun isStdoutVerbose(): Boolean {
    val _ret = __method_bind.isStdoutVerbose.call(this._handle)
    return _ret.asBoolean()
  }

  fun isUserfsPersistent(): Boolean {
    val _ret = __method_bind.isUserfsPersistent.call(this._handle)
    return _ret.asBoolean()
  }

  fun isVsyncEnabled(): Boolean {
    val _ret = __method_bind.isVsyncEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun isWindowAlwaysOnTop(): Boolean {
    val _ret = __method_bind.isWindowAlwaysOnTop.call(this._handle)
    return _ret.asBoolean()
  }

  fun isWindowFullscreen(): Boolean {
    val _ret = __method_bind.isWindowFullscreen.call(this._handle)
    return _ret.asBoolean()
  }

  fun isWindowMaximized(): Boolean {
    val _ret = __method_bind.isWindowMaximized.call(this._handle)
    return _ret.asBoolean()
  }

  fun isWindowMinimized(): Boolean {
    val _ret = __method_bind.isWindowMinimized.call(this._handle)
    return _ret.asBoolean()
  }

  fun isWindowResizable(): Boolean {
    val _ret = __method_bind.isWindowResizable.call(this._handle)
    return _ret.asBoolean()
  }

  fun kill(pid: Int): GDError {
    val _arg = Variant.new(pid)
    val _ret = __method_bind.kill.call(this._handle, _arg, 1)
    return GDError.from(_ret.asInt())
  }

  fun moveWindowToForeground() {
    __method_bind.moveWindowToForeground.call(this._handle)
  }

  fun nativeVideoIsPlaying(): Boolean {
    val _ret = __method_bind.nativeVideoIsPlaying.call(this._handle)
    return _ret.asBoolean()
  }

  fun nativeVideoPause() {
    __method_bind.nativeVideoPause.call(this._handle)
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
    val _ret = __method_bind.nativeVideoPlay.call(this._handle, _args.toVariant(), 4)
    return GDError.from(_ret.asInt())
  }

  fun nativeVideoStop() {
    __method_bind.nativeVideoStop.call(this._handle)
  }

  fun nativeVideoUnpause() {
    __method_bind.nativeVideoUnpause.call(this._handle)
  }

  fun openMidiInputs() {
    __method_bind.openMidiInputs.call(this._handle)
  }

  fun printAllResources(tofile: String) {
    val _arg = Variant.new(tofile)
    __method_bind.printAllResources.call(this._handle, _arg, 1)
  }

  fun printAllTexturesBySize() {
    __method_bind.printAllTexturesBySize.call(this._handle)
  }

  fun printResourcesByType(types: PoolStringArray) {
    val _arg = Variant.new(types)
    __method_bind.printResourcesByType.call(this._handle, _arg, 1)
  }

  fun printResourcesInUse(short: Boolean) {
    val _arg = Variant.new(short)
    __method_bind.printResourcesInUse.call(this._handle, _arg, 1)
  }

  fun requestAttention() {
    __method_bind.requestAttention.call(this._handle)
  }

  fun requestPermission(name: String): Boolean {
    val _arg = Variant.new(name)
    val _ret = __method_bind.requestPermission.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun setBorderlessWindow(borderless: Boolean) {
    val _arg = Variant.new(borderless)
    __method_bind.setBorderlessWindow.call(this._handle, _arg, 1)
  }

  fun setClipboard(clipboard: String) {
    val _arg = Variant.new(clipboard)
    __method_bind.setClipboard.call(this._handle, _arg, 1)
  }

  fun setCurrentScreen(screen: Int) {
    val _arg = Variant.new(screen)
    __method_bind.setCurrentScreen.call(this._handle, _arg, 1)
  }

  fun setExitCode(code: Int) {
    val _arg = Variant.new(code)
    __method_bind.setExitCode.call(this._handle, _arg, 1)
  }

  fun setIcon(icon: Image) {
    val _arg = Variant.new(icon)
    __method_bind.setIcon.call(this._handle, _arg, 1)
  }

  fun setImeActive(active: Boolean) {
    val _arg = Variant.new(active)
    __method_bind.setImeActive.call(this._handle, _arg, 1)
  }

  fun setImePosition(position: Vector2) {
    val _arg = Variant.new(position)
    __method_bind.setImePosition.call(this._handle, _arg, 1)
  }

  fun setKeepScreenOn(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setKeepScreenOn.call(this._handle, _arg, 1)
  }

  fun setLowProcessorUsageMode(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setLowProcessorUsageMode.call(this._handle, _arg, 1)
  }

  fun setNativeIcon(filename: String) {
    val _arg = Variant.new(filename)
    __method_bind.setNativeIcon.call(this._handle, _arg, 1)
  }

  fun setScreenOrientation(orientation: Int) {
    val _arg = Variant.new(orientation)
    __method_bind.setScreenOrientation.call(this._handle, _arg, 1)
  }

  fun setThreadName(name: String): GDError {
    val _arg = Variant.new(name)
    val _ret = __method_bind.setThreadName.call(this._handle, _arg, 1)
    return GDError.from(_ret.asInt())
  }

  fun setUseFileAccessSaveAndSwap(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setUseFileAccessSaveAndSwap.call(this._handle, _arg, 1)
  }

  fun setUseVsync(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setUseVsync.call(this._handle, _arg, 1)
  }

  fun setWindowAlwaysOnTop(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setWindowAlwaysOnTop.call(this._handle, _arg, 1)
  }

  fun setWindowFullscreen(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setWindowFullscreen.call(this._handle, _arg, 1)
  }

  fun setWindowMaximized(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setWindowMaximized.call(this._handle, _arg, 1)
  }

  fun setWindowMinimized(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setWindowMinimized.call(this._handle, _arg, 1)
  }

  fun setWindowPerPixelTransparencyEnabled(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setWindowPerPixelTransparencyEnabled.call(this._handle, _arg, 1)
  }

  fun setWindowPosition(position: Vector2) {
    val _arg = Variant.new(position)
    __method_bind.setWindowPosition.call(this._handle, _arg, 1)
  }

  fun setWindowResizable(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setWindowResizable.call(this._handle, _arg, 1)
  }

  fun setWindowSize(size: Vector2) {
    val _arg = Variant.new(size)
    __method_bind.setWindowSize.call(this._handle, _arg, 1)
  }

  fun setWindowTitle(title: String) {
    val _arg = Variant.new(title)
    __method_bind.setWindowTitle.call(this._handle, _arg, 1)
  }

  fun shellOpen(uri: String): GDError {
    val _arg = Variant.new(uri)
    val _ret = __method_bind.shellOpen.call(this._handle, _arg, 1)
    return GDError.from(_ret.asInt())
  }

  fun showVirtualKeyboard(existingText: String) {
    val _arg = Variant.new(existingText)
    __method_bind.showVirtualKeyboard.call(this._handle, _arg, 1)
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
      val canDraw: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "canDraw".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canDraw" }
        }
      val canUseThreads: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "canUseThreads".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canUseThreads" }
        }
      val centerWindow: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "centerWindow".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method centerWindow" }
        }
      val closeMidiInputs: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "closeMidiInputs".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method closeMidiInputs" }
        }
      val delayMsec: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "delayMsec".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method delayMsec" }
        }
      val delayUsec: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "delayUsec".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method delayUsec" }
        }
      val dumpMemoryToFile: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "dumpMemoryToFile".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method dumpMemoryToFile" }
        }
      val dumpResourcesToFile: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "dumpResourcesToFile".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method dumpResourcesToFile" }
        }
      val execute: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "execute".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method execute" }
        }
      val findScancodeFromString: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "findScancodeFromString".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method findScancodeFromString" }
        }
      val getAudioDriverCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "getAudioDriverCount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getAudioDriverCount" }
        }
      val getAudioDriverName: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "getAudioDriverName".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getAudioDriverName" }
        }
      val getBorderlessWindow: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "getBorderlessWindow".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getBorderlessWindow" }
        }
      val getClipboard: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "getClipboard".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getClipboard" }
        }
      val getCmdlineArgs: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "getCmdlineArgs".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCmdlineArgs" }
        }
      val getConnectedMidiInputs: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "getConnectedMidiInputs".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getConnectedMidiInputs" }
        }
      val getCurrentScreen: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "getCurrentScreen".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCurrentScreen" }
        }
      val getCurrentVideoDriver: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "getCurrentVideoDriver".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCurrentVideoDriver" }
        }
      val getDate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "getDate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getDate" }
        }
      val getDatetime: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "getDatetime".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getDatetime" }
        }
      val getDatetimeFromUnixTime: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "getDatetimeFromUnixTime".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getDatetimeFromUnixTime" }
        }
      val getDynamicMemoryUsage: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "getDynamicMemoryUsage".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getDynamicMemoryUsage" }
        }
      val getEnvironment: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "getEnvironment".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getEnvironment" }
        }
      val getExecutablePath: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "getExecutablePath".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getExecutablePath" }
        }
      val getExitCode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "getExitCode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getExitCode" }
        }
      val getImeSelection: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "getImeSelection".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getImeSelection" }
        }
      val getImeText: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "getImeText".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getImeText" }
        }
      val getLatinKeyboardVariant: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "getLatinKeyboardVariant".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getLatinKeyboardVariant" }
        }
      val getLocale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "getLocale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getLocale" }
        }
      val getModelName: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "getModelName".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getModelName" }
        }
      val getName: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "getName".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getName" }
        }
      val getPowerPercentLeft: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "getPowerPercentLeft".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPowerPercentLeft" }
        }
      val getPowerSecondsLeft: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "getPowerSecondsLeft".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPowerSecondsLeft" }
        }
      val getPowerState: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "getPowerState".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPowerState" }
        }
      val getProcessId: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "getProcessId".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getProcessId" }
        }
      val getProcessorCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "getProcessorCount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getProcessorCount" }
        }
      val getRealWindowSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "getRealWindowSize".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getRealWindowSize" }
        }
      val getScancodeString: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "getScancodeString".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getScancodeString" }
        }
      val getScreenCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "getScreenCount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getScreenCount" }
        }
      val getScreenDpi: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "getScreenDpi".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getScreenDpi" }
        }
      val getScreenOrientation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "getScreenOrientation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getScreenOrientation" }
        }
      val getScreenPosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "getScreenPosition".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getScreenPosition" }
        }
      val getScreenSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "getScreenSize".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getScreenSize" }
        }
      val getSplashTickMsec: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "getSplashTickMsec".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSplashTickMsec" }
        }
      val getStaticMemoryPeakUsage: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "getStaticMemoryPeakUsage".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getStaticMemoryPeakUsage" }
        }
      val getStaticMemoryUsage: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "getStaticMemoryUsage".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getStaticMemoryUsage" }
        }
      val getSystemDir: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "getSystemDir".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSystemDir" }
        }
      val getSystemTimeMsecs: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "getSystemTimeMsecs".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSystemTimeMsecs" }
        }
      val getSystemTimeSecs: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "getSystemTimeSecs".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSystemTimeSecs" }
        }
      val getTicksMsec: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "getTicksMsec".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTicksMsec" }
        }
      val getTicksUsec: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "getTicksUsec".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTicksUsec" }
        }
      val getTime: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "getTime".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTime" }
        }
      val getTimeZoneInfo: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "getTimeZoneInfo".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTimeZoneInfo" }
        }
      val getUniqueId: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "getUniqueId".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getUniqueId" }
        }
      val getUnixTime: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "getUnixTime".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getUnixTime" }
        }
      val getUnixTimeFromDatetime: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "getUnixTimeFromDatetime".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getUnixTimeFromDatetime" }
        }
      val getUserDataDir: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "getUserDataDir".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getUserDataDir" }
        }
      val getVideoDriverCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "getVideoDriverCount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getVideoDriverCount" }
        }
      val getVideoDriverName: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "getVideoDriverName".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getVideoDriverName" }
        }
      val getVirtualKeyboardHeight: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "getVirtualKeyboardHeight".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getVirtualKeyboardHeight" }
        }
      val getWindowPerPixelTransparencyEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "getWindowPerPixelTransparencyEnabled".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method getWindowPerPixelTransparencyEnabled" }
        }
      val getWindowPosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "getWindowPosition".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getWindowPosition" }
        }
      val getWindowSafeArea: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "getWindowSafeArea".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getWindowSafeArea" }
        }
      val getWindowSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "getWindowSize".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getWindowSize" }
        }
      val hasEnvironment: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "hasEnvironment".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method hasEnvironment" }
        }
      val hasFeature: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "hasFeature".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method hasFeature" }
        }
      val hasTouchscreenUiHint: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "hasTouchscreenUiHint".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method hasTouchscreenUiHint" }
        }
      val hasVirtualKeyboard: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "hasVirtualKeyboard".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method hasVirtualKeyboard" }
        }
      val hideVirtualKeyboard: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "hideVirtualKeyboard".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method hideVirtualKeyboard" }
        }
      val isDebugBuild: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "isDebugBuild".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isDebugBuild" }
        }
      val isInLowProcessorUsageMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "isInLowProcessorUsageMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isInLowProcessorUsageMode" }
        }
      val isKeepScreenOn: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "isKeepScreenOn".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isKeepScreenOn" }
        }
      val isOkLeftAndCancelRight: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "isOkLeftAndCancelRight".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isOkLeftAndCancelRight" }
        }
      val isScancodeUnicode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "isScancodeUnicode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isScancodeUnicode" }
        }
      val isStdoutVerbose: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "isStdoutVerbose".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isStdoutVerbose" }
        }
      val isUserfsPersistent: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "isUserfsPersistent".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isUserfsPersistent" }
        }
      val isVsyncEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "isVsyncEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isVsyncEnabled" }
        }
      val isWindowAlwaysOnTop: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "isWindowAlwaysOnTop".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isWindowAlwaysOnTop" }
        }
      val isWindowFullscreen: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "isWindowFullscreen".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isWindowFullscreen" }
        }
      val isWindowMaximized: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "isWindowMaximized".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isWindowMaximized" }
        }
      val isWindowMinimized: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "isWindowMinimized".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isWindowMinimized" }
        }
      val isWindowResizable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "isWindowResizable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isWindowResizable" }
        }
      val kill: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "kill".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method kill" }
        }
      val moveWindowToForeground: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "moveWindowToForeground".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method moveWindowToForeground" }
        }
      val nativeVideoIsPlaying: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "nativeVideoIsPlaying".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method nativeVideoIsPlaying" }
        }
      val nativeVideoPause: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "nativeVideoPause".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method nativeVideoPause" }
        }
      val nativeVideoPlay: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "nativeVideoPlay".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method nativeVideoPlay" }
        }
      val nativeVideoStop: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "nativeVideoStop".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method nativeVideoStop" }
        }
      val nativeVideoUnpause: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "nativeVideoUnpause".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method nativeVideoUnpause" }
        }
      val openMidiInputs: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "openMidiInputs".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method openMidiInputs" }
        }
      val printAllResources: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "printAllResources".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method printAllResources" }
        }
      val printAllTexturesBySize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "printAllTexturesBySize".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method printAllTexturesBySize" }
        }
      val printResourcesByType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "printResourcesByType".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method printResourcesByType" }
        }
      val printResourcesInUse: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "printResourcesInUse".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method printResourcesInUse" }
        }
      val requestAttention: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "requestAttention".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method requestAttention" }
        }
      val requestPermission: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "requestPermission".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method requestPermission" }
        }
      val setBorderlessWindow: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "setBorderlessWindow".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setBorderlessWindow" }
        }
      val setClipboard: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "setClipboard".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setClipboard" }
        }
      val setCurrentScreen: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "setCurrentScreen".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCurrentScreen" }
        }
      val setExitCode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "setExitCode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setExitCode" }
        }
      val setIcon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "setIcon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setIcon" }
        }
      val setImeActive: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "setImeActive".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setImeActive" }
        }
      val setImePosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "setImePosition".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setImePosition" }
        }
      val setKeepScreenOn: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "setKeepScreenOn".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setKeepScreenOn" }
        }
      val setLowProcessorUsageMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "setLowProcessorUsageMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setLowProcessorUsageMode" }
        }
      val setNativeIcon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "setNativeIcon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setNativeIcon" }
        }
      val setScreenOrientation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "setScreenOrientation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setScreenOrientation" }
        }
      val setThreadName: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "setThreadName".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setThreadName" }
        }
      val setUseFileAccessSaveAndSwap: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "setUseFileAccessSaveAndSwap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setUseFileAccessSaveAndSwap" }
        }
      val setUseVsync: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "setUseVsync".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setUseVsync" }
        }
      val setWindowAlwaysOnTop: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "setWindowAlwaysOnTop".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setWindowAlwaysOnTop" }
        }
      val setWindowFullscreen: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "setWindowFullscreen".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setWindowFullscreen" }
        }
      val setWindowMaximized: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "setWindowMaximized".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setWindowMaximized" }
        }
      val setWindowMinimized: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "setWindowMinimized".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setWindowMinimized" }
        }
      val setWindowPerPixelTransparencyEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "setWindowPerPixelTransparencyEnabled".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method setWindowPerPixelTransparencyEnabled" }
        }
      val setWindowPosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "setWindowPosition".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setWindowPosition" }
        }
      val setWindowResizable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "setWindowResizable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setWindowResizable" }
        }
      val setWindowSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "setWindowSize".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setWindowSize" }
        }
      val setWindowTitle: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "setWindowTitle".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setWindowTitle" }
        }
      val shellOpen: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "shellOpen".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method shellOpen" }
        }
      val showVirtualKeyboard: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "showVirtualKeyboard".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method showVirtualKeyboard" }
        }}
  }
}
