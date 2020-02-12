// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
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
import kotlin.Suppress
import kotlin.Unit
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

open class OSInternal(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Object(null) {
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

  var lowProcessorUsageModeSleepUsec: Int
    get() {
       return getLowProcessorUsageModeSleepUsec() 
    }
    set(value) {
      setLowProcessorUsageModeSleepUsec(value)
    }

  var maxWindowSize: Vector2
    get() {
       return getMaxWindowSize() 
    }
    set(value) {
      setMaxWindowSize(value)
    }

  var minWindowSize: Vector2
    get() {
       return getMinWindowSize() 
    }
    set(value) {
      setMinWindowSize(value)
    }

  var screenOrientation: OS.ScreenOrientation
    get() {
       return getScreenOrientation() 
    }
    set(value) {
      setScreenOrientation(value.value)
    }

  var vsyncEnabled: Boolean
    get() {
       return isVsyncEnabled() 
    }
    set(value) {
      setUseVsync(value)
    }

  var vsyncViaCompositor: Boolean
    get() {
       return isVsyncViaCompositorEnabled() 
    }
    set(value) {
      setVsyncViaCompositor(value)
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

  /**
   * Specialized setter for maxWindowSize
   */
  fun maxWindowSize(cb: Vector2.() -> Unit) {
    val _p = maxWindowSize
    cb(_p)
    maxWindowSize = _p
  }

  /**
   * Specialized setter for minWindowSize
   */
  fun minWindowSize(cb: Vector2.() -> Unit) {
    val _p = minWindowSize
    cb(_p)
    minWindowSize = _p
  }

  /**
   * Specialized setter for windowPosition
   */
  fun windowPosition(cb: Vector2.() -> Unit) {
    val _p = windowPosition
    cb(_p)
    windowPosition = _p
  }

  /**
   * Specialized setter for windowSize
   */
  fun windowSize(cb: Vector2.() -> Unit) {
    val _p = windowSize
    cb(_p)
    windowSize = _p
  }

  fun alert(text: String, title: String = "Alert!") {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(text)
      _args.add(title)
      __method_bind.alert.call(self._handle, _args, null)
    }
  }

  fun canDraw(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.canDraw.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun canUseThreads(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.canUseThreads.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun centerWindow() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.centerWindow.call(self._handle, emptyList(), null)
    }
  }

  fun closeMidiInputs() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.closeMidiInputs.call(self._handle, emptyList(), null)
    }
  }

  fun delayMsec(msec: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.delayMsec.call(self._handle, listOf(msec), null)
    }
  }

  fun delayUsec(usec: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.delayUsec.call(self._handle, listOf(usec), null)
    }
  }

  fun dumpMemoryToFile(file: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.dumpMemoryToFile.call(self._handle, listOf(file), null)
    }
  }

  fun dumpResourcesToFile(file: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.dumpResourcesToFile.call(self._handle, listOf(file), null)
    }
  }

  fun execute(
    path: String,
    arguments: PoolStringArray,
    blocking: Boolean = true,
    output: VariantArray,
    readStderr: Boolean = false
  ): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(path)
      _args.add(arguments)
      _args.add(blocking)
      _args.add(output)
      _args.add(readStderr)
      __method_bind.execute.call(self._handle, _args, _retPtr)
      _ret.value
    }
  }

  fun findScancodeFromString(string: String): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.findScancodeFromString.call(self._handle, listOf(string), _retPtr)
      _ret.value
    }
  }

  fun getAudioDriverCount(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getAudioDriverCount.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getAudioDriverName(driver: Int): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getAudioDriverName.call(self._handle, listOf(driver), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getBorderlessWindow(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getBorderlessWindow.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getClipboard(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getClipboard.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getCmdlineArgs(): PoolStringArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = PoolStringArray()
      val _retPtr = _ret._value.ptr
      __method_bind.getCmdlineArgs.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getConnectedMidiInputs(): PoolStringArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = PoolStringArray()
      val _retPtr = _ret._value.ptr
      __method_bind.getConnectedMidiInputs.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getCurrentScreen(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getCurrentScreen.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getCurrentVideoDriver(): OS.VideoDriver {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getCurrentVideoDriver.call(self._handle, emptyList(), _retPtr)
      OS.VideoDriver.from(_ret.value)
    }
  }

  fun getDate(utc: Boolean = false): Dictionary {
    val self = this
    return Allocator.allocationScope {
      val _ret = Dictionary()
      val _retPtr = _ret._value.ptr
      __method_bind.getDate.call(self._handle, listOf(utc), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getDatetime(utc: Boolean = false): Dictionary {
    val self = this
    return Allocator.allocationScope {
      val _ret = Dictionary()
      val _retPtr = _ret._value.ptr
      __method_bind.getDatetime.call(self._handle, listOf(utc), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getDatetimeFromUnixTime(unixTimeVal: Int): Dictionary {
    val self = this
    return Allocator.allocationScope {
      val _ret = Dictionary()
      val _retPtr = _ret._value.ptr
      __method_bind.getDatetimeFromUnixTime.call(self._handle, listOf(unixTimeVal), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getDynamicMemoryUsage(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getDynamicMemoryUsage.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getEnvironment(environment: String): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getEnvironment.call(self._handle, listOf(environment), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getExecutablePath(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getExecutablePath.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getExitCode(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getExitCode.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getGrantedPermissions(): PoolStringArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = PoolStringArray()
      val _retPtr = _ret._value.ptr
      __method_bind.getGrantedPermissions.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getImeSelection(): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getImeSelection.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getImeText(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getImeText.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getLatinKeyboardVariant(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getLatinKeyboardVariant.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getLocale(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getLocale.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getLowProcessorUsageModeSleepUsec(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getLowProcessorUsageModeSleepUsec.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getMaxWindowSize(): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getMaxWindowSize.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getMinWindowSize(): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getMinWindowSize.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getModelName(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getModelName.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getName(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getName.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getPowerPercentLeft(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getPowerPercentLeft.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getPowerSecondsLeft(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getPowerSecondsLeft.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getPowerState(): OS.PowerState {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getPowerState.call(self._handle, emptyList(), _retPtr)
      OS.PowerState.from(_ret.value)
    }
  }

  fun getProcessId(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getProcessId.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getProcessorCount(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getProcessorCount.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getRealWindowSize(): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getRealWindowSize.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getScancodeString(code: Int): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getScancodeString.call(self._handle, listOf(code), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getScreenCount(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getScreenCount.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getScreenDpi(screen: Int = -1): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getScreenDpi.call(self._handle, listOf(screen), _retPtr)
      _ret.value
    }
  }

  fun getScreenOrientation(): OS.ScreenOrientation {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getScreenOrientation.call(self._handle, emptyList(), _retPtr)
      OS.ScreenOrientation.from(_ret.value)
    }
  }

  fun getScreenPosition(screen: Int = -1): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getScreenPosition.call(self._handle, listOf(screen), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getScreenSize(screen: Int = -1): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getScreenSize.call(self._handle, listOf(screen), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getSplashTickMsec(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getSplashTickMsec.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getStaticMemoryPeakUsage(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getStaticMemoryPeakUsage.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getStaticMemoryUsage(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getStaticMemoryUsage.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getSystemDir(dir: Int): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getSystemDir.call(self._handle, listOf(dir), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getSystemTimeMsecs(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getSystemTimeMsecs.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getSystemTimeSecs(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getSystemTimeSecs.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getTicksMsec(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getTicksMsec.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getTicksUsec(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getTicksUsec.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getTime(utc: Boolean = false): Dictionary {
    val self = this
    return Allocator.allocationScope {
      val _ret = Dictionary()
      val _retPtr = _ret._value.ptr
      __method_bind.getTime.call(self._handle, listOf(utc), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getTimeZoneInfo(): Dictionary {
    val self = this
    return Allocator.allocationScope {
      val _ret = Dictionary()
      val _retPtr = _ret._value.ptr
      __method_bind.getTimeZoneInfo.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getUniqueId(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getUniqueId.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getUnixTime(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getUnixTime.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getUnixTimeFromDatetime(datetime: Dictionary): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getUnixTimeFromDatetime.call(self._handle, listOf(datetime), _retPtr)
      _ret.value
    }
  }

  fun getUserDataDir(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getUserDataDir.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getVideoDriverCount(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getVideoDriverCount.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getVideoDriverName(driver: Int): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getVideoDriverName.call(self._handle, listOf(driver), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getVirtualKeyboardHeight(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getVirtualKeyboardHeight.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getWindowPerPixelTransparencyEnabled(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getWindowPerPixelTransparencyEnabled.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getWindowPosition(): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getWindowPosition.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getWindowSafeArea(): Rect2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Rect2()
      val _retPtr = _ret._value.ptr
      __method_bind.getWindowSafeArea.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getWindowSize(): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getWindowSize.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun globalMenuAddItem(
    menu: String,
    label: String,
    id: Variant,
    meta: Variant
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(menu)
      _args.add(label)
      _args.add(id)
      _args.add(meta)
      __method_bind.globalMenuAddItem.call(self._handle, _args, null)
    }
  }

  fun globalMenuAddSeparator(menu: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.globalMenuAddSeparator.call(self._handle, listOf(menu), null)
    }
  }

  fun globalMenuClear(menu: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.globalMenuClear.call(self._handle, listOf(menu), null)
    }
  }

  fun globalMenuRemoveItem(menu: String, idx: Int) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(menu)
      _args.add(idx)
      __method_bind.globalMenuRemoveItem.call(self._handle, _args, null)
    }
  }

  fun hasEnvironment(environment: String): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.hasEnvironment.call(self._handle, listOf(environment), _retPtr)
      _ret.value
    }
  }

  fun hasFeature(tagName: String): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.hasFeature.call(self._handle, listOf(tagName), _retPtr)
      _ret.value
    }
  }

  fun hasTouchscreenUiHint(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.hasTouchscreenUiHint.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun hasVirtualKeyboard(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.hasVirtualKeyboard.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun hideVirtualKeyboard() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.hideVirtualKeyboard.call(self._handle, emptyList(), null)
    }
  }

  fun isDebugBuild(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isDebugBuild.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isInLowProcessorUsageMode(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isInLowProcessorUsageMode.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isKeepScreenOn(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isKeepScreenOn.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isOkLeftAndCancelRight(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isOkLeftAndCancelRight.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isScancodeUnicode(code: Int): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isScancodeUnicode.call(self._handle, listOf(code), _retPtr)
      _ret.value
    }
  }

  fun isStdoutVerbose(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isStdoutVerbose.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isUserfsPersistent(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isUserfsPersistent.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isVsyncEnabled(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isVsyncEnabled.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isVsyncViaCompositorEnabled(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isVsyncViaCompositorEnabled.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isWindowAlwaysOnTop(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isWindowAlwaysOnTop.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isWindowFocused(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isWindowFocused.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isWindowFullscreen(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isWindowFullscreen.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isWindowMaximized(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isWindowMaximized.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isWindowMinimized(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isWindowMinimized.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isWindowResizable(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isWindowResizable.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun kill(pid: Int): GDError {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.kill.call(self._handle, listOf(pid), _retPtr)
      GDError.from(_ret.value)
    }
  }

  fun moveWindowToForeground() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.moveWindowToForeground.call(self._handle, emptyList(), null)
    }
  }

  fun nativeVideoIsPlaying(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.nativeVideoIsPlaying.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun nativeVideoPause() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.nativeVideoPause.call(self._handle, emptyList(), null)
    }
  }

  fun nativeVideoPlay(
    path: String,
    volume: Float,
    audioTrack: String,
    subtitleTrack: String
  ): GDError {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(path)
      _args.add(volume)
      _args.add(audioTrack)
      _args.add(subtitleTrack)
      __method_bind.nativeVideoPlay.call(self._handle, _args, _retPtr)
      GDError.from(_ret.value)
    }
  }

  fun nativeVideoStop() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.nativeVideoStop.call(self._handle, emptyList(), null)
    }
  }

  fun nativeVideoUnpause() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.nativeVideoUnpause.call(self._handle, emptyList(), null)
    }
  }

  fun openMidiInputs() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.openMidiInputs.call(self._handle, emptyList(), null)
    }
  }

  fun printAllResources(tofile: String = "") {
    val self = this
    return Allocator.allocationScope {
      __method_bind.printAllResources.call(self._handle, listOf(tofile), null)
    }
  }

  fun printAllTexturesBySize() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.printAllTexturesBySize.call(self._handle, emptyList(), null)
    }
  }

  fun printResourcesByType(types: PoolStringArray) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.printResourcesByType.call(self._handle, listOf(types), null)
    }
  }

  fun printResourcesInUse(short: Boolean = false) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.printResourcesInUse.call(self._handle, listOf(short), null)
    }
  }

  fun requestAttention() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.requestAttention.call(self._handle, emptyList(), null)
    }
  }

  fun requestPermission(name: String): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.requestPermission.call(self._handle, listOf(name), _retPtr)
      _ret.value
    }
  }

  fun requestPermissions(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.requestPermissions.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun setBorderlessWindow(borderless: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setBorderlessWindow.call(self._handle, listOf(borderless), null)
    }
  }

  fun setClipboard(clipboard: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setClipboard.call(self._handle, listOf(clipboard), null)
    }
  }

  fun setCurrentScreen(screen: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setCurrentScreen.call(self._handle, listOf(screen), null)
    }
  }

  fun setExitCode(code: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setExitCode.call(self._handle, listOf(code), null)
    }
  }

  fun setIcon(icon: Image) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setIcon.call(self._handle, listOf(icon), null)
    }
  }

  fun setImeActive(active: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setImeActive.call(self._handle, listOf(active), null)
    }
  }

  fun setImePosition(position: Vector2) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setImePosition.call(self._handle, listOf(position), null)
    }
  }

  fun setKeepScreenOn(enabled: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setKeepScreenOn.call(self._handle, listOf(enabled), null)
    }
  }

  fun setLowProcessorUsageMode(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setLowProcessorUsageMode.call(self._handle, listOf(enable), null)
    }
  }

  fun setLowProcessorUsageModeSleepUsec(usec: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setLowProcessorUsageModeSleepUsec.call(self._handle, listOf(usec), null)
    }
  }

  fun setMaxWindowSize(size: Vector2) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setMaxWindowSize.call(self._handle, listOf(size), null)
    }
  }

  fun setMinWindowSize(size: Vector2) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setMinWindowSize.call(self._handle, listOf(size), null)
    }
  }

  fun setNativeIcon(filename: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setNativeIcon.call(self._handle, listOf(filename), null)
    }
  }

  fun setScreenOrientation(orientation: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setScreenOrientation.call(self._handle, listOf(orientation), null)
    }
  }

  fun setThreadName(name: String): GDError {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.setThreadName.call(self._handle, listOf(name), _retPtr)
      GDError.from(_ret.value)
    }
  }

  fun setUseFileAccessSaveAndSwap(enabled: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setUseFileAccessSaveAndSwap.call(self._handle, listOf(enabled), null)
    }
  }

  fun setUseVsync(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setUseVsync.call(self._handle, listOf(enable), null)
    }
  }

  fun setVsyncViaCompositor(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setVsyncViaCompositor.call(self._handle, listOf(enable), null)
    }
  }

  fun setWindowAlwaysOnTop(enabled: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setWindowAlwaysOnTop.call(self._handle, listOf(enabled), null)
    }
  }

  fun setWindowFullscreen(enabled: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setWindowFullscreen.call(self._handle, listOf(enabled), null)
    }
  }

  fun setWindowMaximized(enabled: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setWindowMaximized.call(self._handle, listOf(enabled), null)
    }
  }

  fun setWindowMinimized(enabled: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setWindowMinimized.call(self._handle, listOf(enabled), null)
    }
  }

  fun setWindowPerPixelTransparencyEnabled(enabled: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setWindowPerPixelTransparencyEnabled.call(self._handle, listOf(enabled), null)
    }
  }

  fun setWindowPosition(position: Vector2) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setWindowPosition.call(self._handle, listOf(position), null)
    }
  }

  fun setWindowResizable(enabled: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setWindowResizable.call(self._handle, listOf(enabled), null)
    }
  }

  fun setWindowSize(size: Vector2) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setWindowSize.call(self._handle, listOf(size), null)
    }
  }

  fun setWindowTitle(title: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setWindowTitle.call(self._handle, listOf(title), null)
    }
  }

  fun shellOpen(uri: String): GDError {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.shellOpen.call(self._handle, listOf(uri), _retPtr)
      GDError.from(_ret.value)
    }
  }

  fun showVirtualKeyboard(existingText: String = "") {
    val self = this
    return Allocator.allocationScope {
      __method_bind.showVirtualKeyboard.call(self._handle, listOf(existingText), null)
    }
  }

  companion object {
    /**
     * Container for method_bind pointers for OS
     */
    private object __method_bind {
      val alert: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "alert".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method alert" }
        }
      val canDraw: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "can_draw".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method can_draw" }
        }
      val canUseThreads: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "can_use_threads".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method can_use_threads" }
        }
      val centerWindow: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "center_window".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method center_window" }
        }
      val closeMidiInputs: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "close_midi_inputs".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method close_midi_inputs" }
        }
      val delayMsec: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "delay_msec".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method delay_msec" }
        }
      val delayUsec: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "delay_usec".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method delay_usec" }
        }
      val dumpMemoryToFile: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "dump_memory_to_file".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method dump_memory_to_file" }
        }
      val dumpResourcesToFile: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "dump_resources_to_file".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method dump_resources_to_file" }
        }
      val execute: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "execute".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method execute" }
        }
      val findScancodeFromString: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "find_scancode_from_string".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method find_scancode_from_string" }
        }
      val getAudioDriverCount: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_audio_driver_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_audio_driver_count" }
        }
      val getAudioDriverName: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_audio_driver_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_audio_driver_name" }
        }
      val getBorderlessWindow: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_borderless_window".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_borderless_window" }
        }
      val getClipboard: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_clipboard".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_clipboard" }
        }
      val getCmdlineArgs: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_cmdline_args".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_cmdline_args" }
        }
      val getConnectedMidiInputs: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_connected_midi_inputs".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_connected_midi_inputs" }
        }
      val getCurrentScreen: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_current_screen".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_current_screen" }
        }
      val getCurrentVideoDriver: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_current_video_driver".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_current_video_driver" }
        }
      val getDate: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_date".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_date" }
        }
      val getDatetime: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_datetime".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_datetime" }
        }
      val getDatetimeFromUnixTime: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_datetime_from_unix_time".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_datetime_from_unix_time" }
        }
      val getDynamicMemoryUsage: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_dynamic_memory_usage".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_dynamic_memory_usage" }
        }
      val getEnvironment: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_environment".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_environment" }
        }
      val getExecutablePath: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_executable_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_executable_path" }
        }
      val getExitCode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_exit_code".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_exit_code" }
        }
      val getGrantedPermissions: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_granted_permissions".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_granted_permissions" }
        }
      val getImeSelection: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_ime_selection".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_ime_selection" }
        }
      val getImeText: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_ime_text".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_ime_text" }
        }
      val getLatinKeyboardVariant: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_latin_keyboard_variant".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_latin_keyboard_variant" }
        }
      val getLocale: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_locale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_locale" }
        }
      val getLowProcessorUsageModeSleepUsec: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_low_processor_usage_mode_sleep_usec".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method get_low_processor_usage_mode_sleep_usec" }
        }
      val getMaxWindowSize: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_max_window_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_max_window_size" }
        }
      val getMinWindowSize: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_min_window_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_min_window_size" }
        }
      val getModelName: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_model_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_model_name" }
        }
      val getName: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_name" }
        }
      val getPowerPercentLeft: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_power_percent_left".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_power_percent_left" }
        }
      val getPowerSecondsLeft: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_power_seconds_left".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_power_seconds_left" }
        }
      val getPowerState: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_power_state".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_power_state" }
        }
      val getProcessId: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_process_id".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_process_id" }
        }
      val getProcessorCount: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_processor_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_processor_count" }
        }
      val getRealWindowSize: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_real_window_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_real_window_size" }
        }
      val getScancodeString: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_scancode_string".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_scancode_string" }
        }
      val getScreenCount: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_screen_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_screen_count" }
        }
      val getScreenDpi: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_screen_dpi".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_screen_dpi" }
        }
      val getScreenOrientation: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_screen_orientation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_screen_orientation" }
        }
      val getScreenPosition: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_screen_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_screen_position" }
        }
      val getScreenSize: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_screen_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_screen_size" }
        }
      val getSplashTickMsec: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_splash_tick_msec".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_splash_tick_msec" }
        }
      val getStaticMemoryPeakUsage: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_static_memory_peak_usage".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_static_memory_peak_usage" }
        }
      val getStaticMemoryUsage: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_static_memory_usage".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_static_memory_usage" }
        }
      val getSystemDir: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_system_dir".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_system_dir" }
        }
      val getSystemTimeMsecs: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_system_time_msecs".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_system_time_msecs" }
        }
      val getSystemTimeSecs: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_system_time_secs".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_system_time_secs" }
        }
      val getTicksMsec: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_ticks_msec".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_ticks_msec" }
        }
      val getTicksUsec: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_ticks_usec".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_ticks_usec" }
        }
      val getTime: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_time".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_time" }
        }
      val getTimeZoneInfo: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_time_zone_info".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_time_zone_info" }
        }
      val getUniqueId: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_unique_id".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_unique_id" }
        }
      val getUnixTime: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_unix_time".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_unix_time" }
        }
      val getUnixTimeFromDatetime: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_unix_time_from_datetime".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_unix_time_from_datetime" }
        }
      val getUserDataDir: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_user_data_dir".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_user_data_dir" }
        }
      val getVideoDriverCount: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_video_driver_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_video_driver_count" }
        }
      val getVideoDriverName: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_video_driver_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_video_driver_name" }
        }
      val getVirtualKeyboardHeight: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_virtual_keyboard_height".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_virtual_keyboard_height" }
        }
      val getWindowPerPixelTransparencyEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_window_per_pixel_transparency_enabled".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method get_window_per_pixel_transparency_enabled" }
        }
      val getWindowPosition: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_window_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_window_position" }
        }
      val getWindowSafeArea: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_window_safe_area".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_window_safe_area" }
        }
      val getWindowSize: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_window_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_window_size" }
        }
      val globalMenuAddItem: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "global_menu_add_item".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method global_menu_add_item" }
        }
      val globalMenuAddSeparator: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "global_menu_add_separator".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method global_menu_add_separator" }
        }
      val globalMenuClear: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "global_menu_clear".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method global_menu_clear" }
        }
      val globalMenuRemoveItem: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "global_menu_remove_item".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method global_menu_remove_item" }
        }
      val hasEnvironment: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "has_environment".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_environment" }
        }
      val hasFeature: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "has_feature".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_feature" }
        }
      val hasTouchscreenUiHint: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "has_touchscreen_ui_hint".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_touchscreen_ui_hint" }
        }
      val hasVirtualKeyboard: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "has_virtual_keyboard".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_virtual_keyboard" }
        }
      val hideVirtualKeyboard: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "hide_virtual_keyboard".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method hide_virtual_keyboard" }
        }
      val isDebugBuild: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "is_debug_build".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_debug_build" }
        }
      val isInLowProcessorUsageMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "is_in_low_processor_usage_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_in_low_processor_usage_mode" }
        }
      val isKeepScreenOn: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "is_keep_screen_on".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_keep_screen_on" }
        }
      val isOkLeftAndCancelRight: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "is_ok_left_and_cancel_right".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_ok_left_and_cancel_right" }
        }
      val isScancodeUnicode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "is_scancode_unicode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_scancode_unicode" }
        }
      val isStdoutVerbose: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "is_stdout_verbose".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_stdout_verbose" }
        }
      val isUserfsPersistent: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "is_userfs_persistent".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_userfs_persistent" }
        }
      val isVsyncEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "is_vsync_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_vsync_enabled" }
        }
      val isVsyncViaCompositorEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "is_vsync_via_compositor_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_vsync_via_compositor_enabled" }
        }
      val isWindowAlwaysOnTop: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "is_window_always_on_top".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_window_always_on_top" }
        }
      val isWindowFocused: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "is_window_focused".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_window_focused" }
        }
      val isWindowFullscreen: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "is_window_fullscreen".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_window_fullscreen" }
        }
      val isWindowMaximized: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "is_window_maximized".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_window_maximized" }
        }
      val isWindowMinimized: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "is_window_minimized".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_window_minimized" }
        }
      val isWindowResizable: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "is_window_resizable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_window_resizable" }
        }
      val kill: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "kill".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method kill" }
        }
      val moveWindowToForeground: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "move_window_to_foreground".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method move_window_to_foreground" }
        }
      val nativeVideoIsPlaying: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "native_video_is_playing".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method native_video_is_playing" }
        }
      val nativeVideoPause: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "native_video_pause".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method native_video_pause" }
        }
      val nativeVideoPlay: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "native_video_play".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method native_video_play" }
        }
      val nativeVideoStop: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "native_video_stop".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method native_video_stop" }
        }
      val nativeVideoUnpause: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "native_video_unpause".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method native_video_unpause" }
        }
      val openMidiInputs: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "open_midi_inputs".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method open_midi_inputs" }
        }
      val printAllResources: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "print_all_resources".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method print_all_resources" }
        }
      val printAllTexturesBySize: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "print_all_textures_by_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method print_all_textures_by_size" }
        }
      val printResourcesByType: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "print_resources_by_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method print_resources_by_type" }
        }
      val printResourcesInUse: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "print_resources_in_use".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method print_resources_in_use" }
        }
      val requestAttention: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "request_attention".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method request_attention" }
        }
      val requestPermission: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "request_permission".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method request_permission" }
        }
      val requestPermissions: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "request_permissions".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method request_permissions" }
        }
      val setBorderlessWindow: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "set_borderless_window".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_borderless_window" }
        }
      val setClipboard: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "set_clipboard".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_clipboard" }
        }
      val setCurrentScreen: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "set_current_screen".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_current_screen" }
        }
      val setExitCode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "set_exit_code".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_exit_code" }
        }
      val setIcon: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "set_icon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_icon" }
        }
      val setImeActive: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "set_ime_active".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_ime_active" }
        }
      val setImePosition: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "set_ime_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_ime_position" }
        }
      val setKeepScreenOn: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "set_keep_screen_on".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_keep_screen_on" }
        }
      val setLowProcessorUsageMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "set_low_processor_usage_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_low_processor_usage_mode" }
        }
      val setLowProcessorUsageModeSleepUsec: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "set_low_processor_usage_mode_sleep_usec".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method set_low_processor_usage_mode_sleep_usec" }
        }
      val setMaxWindowSize: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "set_max_window_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_max_window_size" }
        }
      val setMinWindowSize: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "set_min_window_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_min_window_size" }
        }
      val setNativeIcon: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "set_native_icon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_native_icon" }
        }
      val setScreenOrientation: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "set_screen_orientation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_screen_orientation" }
        }
      val setThreadName: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "set_thread_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_thread_name" }
        }
      val setUseFileAccessSaveAndSwap: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "set_use_file_access_save_and_swap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_use_file_access_save_and_swap"
            }
        }
      val setUseVsync: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "set_use_vsync".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_use_vsync" }
        }
      val setVsyncViaCompositor: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "set_vsync_via_compositor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_vsync_via_compositor" }
        }
      val setWindowAlwaysOnTop: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "set_window_always_on_top".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_window_always_on_top" }
        }
      val setWindowFullscreen: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "set_window_fullscreen".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_window_fullscreen" }
        }
      val setWindowMaximized: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "set_window_maximized".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_window_maximized" }
        }
      val setWindowMinimized: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "set_window_minimized".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_window_minimized" }
        }
      val setWindowPerPixelTransparencyEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "set_window_per_pixel_transparency_enabled".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method set_window_per_pixel_transparency_enabled" }
        }
      val setWindowPosition: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "set_window_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_window_position" }
        }
      val setWindowResizable: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "set_window_resizable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_window_resizable" }
        }
      val setWindowSize: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "set_window_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_window_size" }
        }
      val setWindowTitle: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "set_window_title".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_window_title" }
        }
      val shellOpen: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "shell_open".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method shell_open" }
        }
      val showVirtualKeyboard: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "show_virtual_keyboard".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method show_virtual_keyboard" }
        }}
  }
}

object OS : OSInternal(null) {
  init {
    Allocator.allocationScope {
      val handle = checkNotNull(Godot.gdnative.godot_global_get_singleton)("OS".cstr.ptr)
      requireNotNull(handle) { "No instance found for singleton OS" }
      _handle = handle
    }
  }

  enum class VideoDriver(
    val value: Int
  ) {
    GLES3(0),

    GLES2(1);

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
    DESKTOP(0),

    DCIM(1),

    DOCUMENTS(2),

    DOWNLOADS(3),

    MOVIES(4),

    MUSIC(5),

    PICTURES(6),

    RINGTONES(7);

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
    LANDSCAPE(0),

    PORTRAIT(1),

    REVERSE_LANDSCAPE(2),

    REVERSE_PORTRAIT(3),

    SENSOR_LANDSCAPE(4),

    SENSOR_PORTRAIT(5),

    SENSOR(6);

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
    JANUARY(1),

    FEBRUARY(2),

    MARCH(3),

    APRIL(4),

    MAY(5),

    JUNE(6),

    JULY(7),

    AUGUST(8),

    SEPTEMBER(9),

    OCTOBER(10),

    NOVEMBER(11),

    DECEMBER(12);

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
}
