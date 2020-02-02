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
import kotlin.Unit
import kotlin.reflect.KCallable
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

  var screenOrientation: ScreenOrientation
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
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(text))
    _args.add(Variant.fromAny(title))
    __method_bind.alert.call(this._handle, _args)
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
    __method_bind.delayMsec.call(this._handle, listOf(_arg))
  }

  fun delayUsec(usec: Int) {
    val _arg = Variant.new(usec)
    __method_bind.delayUsec.call(this._handle, listOf(_arg))
  }

  fun dumpMemoryToFile(file: String) {
    val _arg = Variant.new(file)
    __method_bind.dumpMemoryToFile.call(this._handle, listOf(_arg))
  }

  fun dumpResourcesToFile(file: String) {
    val _arg = Variant.new(file)
    __method_bind.dumpResourcesToFile.call(this._handle, listOf(_arg))
  }

  fun execute(
    path: String,
    arguments: PoolStringArray,
    blocking: Boolean = true,
    output: VariantArray,
    readStderr: Boolean = false
  ): Int {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(path))
    _args.add(Variant.fromAny(arguments))
    _args.add(Variant.fromAny(blocking))
    _args.add(Variant.fromAny(output))
    _args.add(Variant.fromAny(readStderr))
    val _ret = __method_bind.execute.call(this._handle, _args)
    return _ret.asInt()
  }

  fun findScancodeFromString(string: String): Int {
    val _arg = Variant.new(string)
    val _ret = __method_bind.findScancodeFromString.call(this._handle, listOf(_arg))
    return _ret.asInt()
  }

  fun getAudioDriverCount(): Int {
    val _ret = __method_bind.getAudioDriverCount.call(this._handle)
    return _ret.asInt()
  }

  fun getAudioDriverName(driver: Int): String {
    val _arg = Variant.new(driver)
    val _ret = __method_bind.getAudioDriverName.call(this._handle, listOf(_arg))
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

  fun getDate(utc: Boolean = false): Dictionary {
    val _arg = Variant.new(utc)
    val _ret = __method_bind.getDate.call(this._handle, listOf(_arg))
    return _ret.asDictionary()
  }

  fun getDatetime(utc: Boolean = false): Dictionary {
    val _arg = Variant.new(utc)
    val _ret = __method_bind.getDatetime.call(this._handle, listOf(_arg))
    return _ret.asDictionary()
  }

  fun getDatetimeFromUnixTime(unixTimeVal: Int): Dictionary {
    val _arg = Variant.new(unixTimeVal)
    val _ret = __method_bind.getDatetimeFromUnixTime.call(this._handle, listOf(_arg))
    return _ret.asDictionary()
  }

  fun getDynamicMemoryUsage(): Int {
    val _ret = __method_bind.getDynamicMemoryUsage.call(this._handle)
    return _ret.asInt()
  }

  fun getEnvironment(environment: String): String {
    val _arg = Variant.new(environment)
    val _ret = __method_bind.getEnvironment.call(this._handle, listOf(_arg))
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

  fun getGrantedPermissions(): PoolStringArray {
    val _ret = __method_bind.getGrantedPermissions.call(this._handle)
    return _ret.asPoolStringArray()
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

  fun getLowProcessorUsageModeSleepUsec(): Int {
    val _ret = __method_bind.getLowProcessorUsageModeSleepUsec.call(this._handle)
    return _ret.asInt()
  }

  fun getMaxWindowSize(): Vector2 {
    val _ret = __method_bind.getMaxWindowSize.call(this._handle)
    return _ret.asVector2()
  }

  fun getMinWindowSize(): Vector2 {
    val _ret = __method_bind.getMinWindowSize.call(this._handle)
    return _ret.asVector2()
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
    val _ret = __method_bind.getScancodeString.call(this._handle, listOf(_arg))
    return _ret.asString()
  }

  fun getScreenCount(): Int {
    val _ret = __method_bind.getScreenCount.call(this._handle)
    return _ret.asInt()
  }

  fun getScreenDpi(screen: Int = -1): Int {
    val _arg = Variant.new(screen)
    val _ret = __method_bind.getScreenDpi.call(this._handle, listOf(_arg))
    return _ret.asInt()
  }

  fun getScreenOrientation(): ScreenOrientation {
    val _ret = __method_bind.getScreenOrientation.call(this._handle)
    return _OS.ScreenOrientation.from(_ret.asInt())
  }

  fun getScreenPosition(screen: Int = -1): Vector2 {
    val _arg = Variant.new(screen)
    val _ret = __method_bind.getScreenPosition.call(this._handle, listOf(_arg))
    return _ret.asVector2()
  }

  fun getScreenSize(screen: Int = -1): Vector2 {
    val _arg = Variant.new(screen)
    val _ret = __method_bind.getScreenSize.call(this._handle, listOf(_arg))
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
    val _ret = __method_bind.getSystemDir.call(this._handle, listOf(_arg))
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

  fun getTime(utc: Boolean = false): Dictionary {
    val _arg = Variant.new(utc)
    val _ret = __method_bind.getTime.call(this._handle, listOf(_arg))
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
    val _ret = __method_bind.getUnixTimeFromDatetime.call(this._handle, listOf(_arg))
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
    val _ret = __method_bind.getVideoDriverName.call(this._handle, listOf(_arg))
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

  fun globalMenuAddItem(
    menu: String,
    label: String,
    id: Variant,
    meta: Variant
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(menu))
    _args.add(Variant.fromAny(label))
    _args.add(Variant.fromAny(id))
    _args.add(Variant.fromAny(meta))
    __method_bind.globalMenuAddItem.call(this._handle, _args)
  }

  fun globalMenuAddSeparator(menu: String) {
    val _arg = Variant.new(menu)
    __method_bind.globalMenuAddSeparator.call(this._handle, listOf(_arg))
  }

  fun globalMenuClear(menu: String) {
    val _arg = Variant.new(menu)
    __method_bind.globalMenuClear.call(this._handle, listOf(_arg))
  }

  fun globalMenuRemoveItem(menu: String, idx: Int) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(menu))
    _args.add(Variant.fromAny(idx))
    __method_bind.globalMenuRemoveItem.call(this._handle, _args)
  }

  fun hasEnvironment(environment: String): Boolean {
    val _arg = Variant.new(environment)
    val _ret = __method_bind.hasEnvironment.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun hasFeature(tagName: String): Boolean {
    val _arg = Variant.new(tagName)
    val _ret = __method_bind.hasFeature.call(this._handle, listOf(_arg))
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
    val _ret = __method_bind.isScancodeUnicode.call(this._handle, listOf(_arg))
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

  fun isVsyncViaCompositorEnabled(): Boolean {
    val _ret = __method_bind.isVsyncViaCompositorEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun isWindowAlwaysOnTop(): Boolean {
    val _ret = __method_bind.isWindowAlwaysOnTop.call(this._handle)
    return _ret.asBoolean()
  }

  fun isWindowFocused(): Boolean {
    val _ret = __method_bind.isWindowFocused.call(this._handle)
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
    val _ret = __method_bind.kill.call(this._handle, listOf(_arg))
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
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(path))
    _args.add(Variant.fromAny(volume))
    _args.add(Variant.fromAny(audioTrack))
    _args.add(Variant.fromAny(subtitleTrack))
    val _ret = __method_bind.nativeVideoPlay.call(this._handle, _args)
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

  fun printAllResources(tofile: String = "") {
    val _arg = Variant.new(tofile)
    __method_bind.printAllResources.call(this._handle, listOf(_arg))
  }

  fun printAllTexturesBySize() {
    __method_bind.printAllTexturesBySize.call(this._handle)
  }

  fun printResourcesByType(types: PoolStringArray) {
    val _arg = Variant.new(types)
    __method_bind.printResourcesByType.call(this._handle, listOf(_arg))
  }

  fun printResourcesInUse(short: Boolean = false) {
    val _arg = Variant.new(short)
    __method_bind.printResourcesInUse.call(this._handle, listOf(_arg))
  }

  fun requestAttention() {
    __method_bind.requestAttention.call(this._handle)
  }

  fun requestPermission(name: String): Boolean {
    val _arg = Variant.new(name)
    val _ret = __method_bind.requestPermission.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun requestPermissions(): Boolean {
    val _ret = __method_bind.requestPermissions.call(this._handle)
    return _ret.asBoolean()
  }

  fun setBorderlessWindow(borderless: Boolean) {
    val _arg = Variant.new(borderless)
    __method_bind.setBorderlessWindow.call(this._handle, listOf(_arg))
  }

  fun setClipboard(clipboard: String) {
    val _arg = Variant.new(clipboard)
    __method_bind.setClipboard.call(this._handle, listOf(_arg))
  }

  fun setCurrentScreen(screen: Int) {
    val _arg = Variant.new(screen)
    __method_bind.setCurrentScreen.call(this._handle, listOf(_arg))
  }

  fun setExitCode(code: Int) {
    val _arg = Variant.new(code)
    __method_bind.setExitCode.call(this._handle, listOf(_arg))
  }

  fun setIcon(icon: Image) {
    val _arg = Variant.new(icon)
    __method_bind.setIcon.call(this._handle, listOf(_arg))
  }

  fun setImeActive(active: Boolean) {
    val _arg = Variant.new(active)
    __method_bind.setImeActive.call(this._handle, listOf(_arg))
  }

  fun setImePosition(position: Vector2) {
    val _arg = Variant.new(position)
    __method_bind.setImePosition.call(this._handle, listOf(_arg))
  }

  fun setKeepScreenOn(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setKeepScreenOn.call(this._handle, listOf(_arg))
  }

  fun setLowProcessorUsageMode(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setLowProcessorUsageMode.call(this._handle, listOf(_arg))
  }

  fun setLowProcessorUsageModeSleepUsec(usec: Int) {
    val _arg = Variant.new(usec)
    __method_bind.setLowProcessorUsageModeSleepUsec.call(this._handle, listOf(_arg))
  }

  fun setMaxWindowSize(size: Vector2) {
    val _arg = Variant.new(size)
    __method_bind.setMaxWindowSize.call(this._handle, listOf(_arg))
  }

  fun setMinWindowSize(size: Vector2) {
    val _arg = Variant.new(size)
    __method_bind.setMinWindowSize.call(this._handle, listOf(_arg))
  }

  fun setNativeIcon(filename: String) {
    val _arg = Variant.new(filename)
    __method_bind.setNativeIcon.call(this._handle, listOf(_arg))
  }

  fun setScreenOrientation(orientation: Int) {
    val _arg = Variant.new(orientation)
    __method_bind.setScreenOrientation.call(this._handle, listOf(_arg))
  }

  fun setThreadName(name: String): GDError {
    val _arg = Variant.new(name)
    val _ret = __method_bind.setThreadName.call(this._handle, listOf(_arg))
    return GDError.from(_ret.asInt())
  }

  fun setUseFileAccessSaveAndSwap(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setUseFileAccessSaveAndSwap.call(this._handle, listOf(_arg))
  }

  fun setUseVsync(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setUseVsync.call(this._handle, listOf(_arg))
  }

  fun setVsyncViaCompositor(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setVsyncViaCompositor.call(this._handle, listOf(_arg))
  }

  fun setWindowAlwaysOnTop(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setWindowAlwaysOnTop.call(this._handle, listOf(_arg))
  }

  fun setWindowFullscreen(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setWindowFullscreen.call(this._handle, listOf(_arg))
  }

  fun setWindowMaximized(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setWindowMaximized.call(this._handle, listOf(_arg))
  }

  fun setWindowMinimized(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setWindowMinimized.call(this._handle, listOf(_arg))
  }

  fun setWindowPerPixelTransparencyEnabled(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setWindowPerPixelTransparencyEnabled.call(this._handle, listOf(_arg))
  }

  fun setWindowPosition(position: Vector2) {
    val _arg = Variant.new(position)
    __method_bind.setWindowPosition.call(this._handle, listOf(_arg))
  }

  fun setWindowResizable(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setWindowResizable.call(this._handle, listOf(_arg))
  }

  fun setWindowSize(size: Vector2) {
    val _arg = Variant.new(size)
    __method_bind.setWindowSize.call(this._handle, listOf(_arg))
  }

  fun setWindowTitle(title: String) {
    val _arg = Variant.new(title)
    __method_bind.setWindowTitle.call(this._handle, listOf(_arg))
  }

  fun shellOpen(uri: String): GDError {
    val _arg = Variant.new(uri)
    val _ret = __method_bind.shellOpen.call(this._handle, listOf(_arg))
    return GDError.from(_ret.asInt())
  }

  fun showVirtualKeyboard(existingText: String = "") {
    val _arg = Variant.new(existingText)
    __method_bind.showVirtualKeyboard.call(this._handle, listOf(_arg))
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
            "can_draw".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method can_draw" }
        }
      val canUseThreads: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "can_use_threads".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method can_use_threads" }
        }
      val centerWindow: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "center_window".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method center_window" }
        }
      val closeMidiInputs: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "close_midi_inputs".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method close_midi_inputs" }
        }
      val delayMsec: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "delay_msec".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method delay_msec" }
        }
      val delayUsec: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "delay_usec".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method delay_usec" }
        }
      val dumpMemoryToFile: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "dump_memory_to_file".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method dump_memory_to_file" }
        }
      val dumpResourcesToFile: CPointer<godot_method_bind>
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
      val findScancodeFromString: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "find_scancode_from_string".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method find_scancode_from_string" }
        }
      val getAudioDriverCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_audio_driver_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_audio_driver_count" }
        }
      val getAudioDriverName: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_audio_driver_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_audio_driver_name" }
        }
      val getBorderlessWindow: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_borderless_window".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_borderless_window" }
        }
      val getClipboard: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_clipboard".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_clipboard" }
        }
      val getCmdlineArgs: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_cmdline_args".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_cmdline_args" }
        }
      val getConnectedMidiInputs: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_connected_midi_inputs".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_connected_midi_inputs" }
        }
      val getCurrentScreen: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_current_screen".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_current_screen" }
        }
      val getCurrentVideoDriver: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_current_video_driver".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_current_video_driver" }
        }
      val getDate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_date".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_date" }
        }
      val getDatetime: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_datetime".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_datetime" }
        }
      val getDatetimeFromUnixTime: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_datetime_from_unix_time".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_datetime_from_unix_time" }
        }
      val getDynamicMemoryUsage: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_dynamic_memory_usage".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_dynamic_memory_usage" }
        }
      val getEnvironment: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_environment".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_environment" }
        }
      val getExecutablePath: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_executable_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_executable_path" }
        }
      val getExitCode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_exit_code".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_exit_code" }
        }
      val getGrantedPermissions: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_granted_permissions".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_granted_permissions" }
        }
      val getImeSelection: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_ime_selection".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_ime_selection" }
        }
      val getImeText: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_ime_text".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_ime_text" }
        }
      val getLatinKeyboardVariant: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_latin_keyboard_variant".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_latin_keyboard_variant" }
        }
      val getLocale: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_locale".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_locale" }
        }
      val getLowProcessorUsageModeSleepUsec: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_low_processor_usage_mode_sleep_usec".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method get_low_processor_usage_mode_sleep_usec" }
        }
      val getMaxWindowSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_max_window_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_max_window_size" }
        }
      val getMinWindowSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_min_window_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_min_window_size" }
        }
      val getModelName: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_model_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_model_name" }
        }
      val getName: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_name" }
        }
      val getPowerPercentLeft: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_power_percent_left".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_power_percent_left" }
        }
      val getPowerSecondsLeft: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_power_seconds_left".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_power_seconds_left" }
        }
      val getPowerState: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_power_state".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_power_state" }
        }
      val getProcessId: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_process_id".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_process_id" }
        }
      val getProcessorCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_processor_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_processor_count" }
        }
      val getRealWindowSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_real_window_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_real_window_size" }
        }
      val getScancodeString: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_scancode_string".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_scancode_string" }
        }
      val getScreenCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_screen_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_screen_count" }
        }
      val getScreenDpi: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_screen_dpi".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_screen_dpi" }
        }
      val getScreenOrientation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_screen_orientation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_screen_orientation" }
        }
      val getScreenPosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_screen_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_screen_position" }
        }
      val getScreenSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_screen_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_screen_size" }
        }
      val getSplashTickMsec: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_splash_tick_msec".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_splash_tick_msec" }
        }
      val getStaticMemoryPeakUsage: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_static_memory_peak_usage".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_static_memory_peak_usage" }
        }
      val getStaticMemoryUsage: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_static_memory_usage".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_static_memory_usage" }
        }
      val getSystemDir: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_system_dir".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_system_dir" }
        }
      val getSystemTimeMsecs: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_system_time_msecs".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_system_time_msecs" }
        }
      val getSystemTimeSecs: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_system_time_secs".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_system_time_secs" }
        }
      val getTicksMsec: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_ticks_msec".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_ticks_msec" }
        }
      val getTicksUsec: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_ticks_usec".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_ticks_usec" }
        }
      val getTime: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_time".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_time" }
        }
      val getTimeZoneInfo: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_time_zone_info".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_time_zone_info" }
        }
      val getUniqueId: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_unique_id".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_unique_id" }
        }
      val getUnixTime: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_unix_time".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_unix_time" }
        }
      val getUnixTimeFromDatetime: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_unix_time_from_datetime".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_unix_time_from_datetime" }
        }
      val getUserDataDir: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_user_data_dir".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_user_data_dir" }
        }
      val getVideoDriverCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_video_driver_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_video_driver_count" }
        }
      val getVideoDriverName: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_video_driver_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_video_driver_name" }
        }
      val getVirtualKeyboardHeight: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_virtual_keyboard_height".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_virtual_keyboard_height" }
        }
      val getWindowPerPixelTransparencyEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_window_per_pixel_transparency_enabled".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method get_window_per_pixel_transparency_enabled" }
        }
      val getWindowPosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_window_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_window_position" }
        }
      val getWindowSafeArea: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_window_safe_area".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_window_safe_area" }
        }
      val getWindowSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "get_window_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_window_size" }
        }
      val globalMenuAddItem: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "global_menu_add_item".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method global_menu_add_item" }
        }
      val globalMenuAddSeparator: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "global_menu_add_separator".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method global_menu_add_separator" }
        }
      val globalMenuClear: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "global_menu_clear".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method global_menu_clear" }
        }
      val globalMenuRemoveItem: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "global_menu_remove_item".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method global_menu_remove_item" }
        }
      val hasEnvironment: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "has_environment".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_environment" }
        }
      val hasFeature: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "has_feature".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_feature" }
        }
      val hasTouchscreenUiHint: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "has_touchscreen_ui_hint".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_touchscreen_ui_hint" }
        }
      val hasVirtualKeyboard: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "has_virtual_keyboard".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_virtual_keyboard" }
        }
      val hideVirtualKeyboard: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "hide_virtual_keyboard".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method hide_virtual_keyboard" }
        }
      val isDebugBuild: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "is_debug_build".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_debug_build" }
        }
      val isInLowProcessorUsageMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "is_in_low_processor_usage_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_in_low_processor_usage_mode" }
        }
      val isKeepScreenOn: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "is_keep_screen_on".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_keep_screen_on" }
        }
      val isOkLeftAndCancelRight: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "is_ok_left_and_cancel_right".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_ok_left_and_cancel_right" }
        }
      val isScancodeUnicode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "is_scancode_unicode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_scancode_unicode" }
        }
      val isStdoutVerbose: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "is_stdout_verbose".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_stdout_verbose" }
        }
      val isUserfsPersistent: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "is_userfs_persistent".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_userfs_persistent" }
        }
      val isVsyncEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "is_vsync_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_vsync_enabled" }
        }
      val isVsyncViaCompositorEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "is_vsync_via_compositor_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_vsync_via_compositor_enabled" }
        }
      val isWindowAlwaysOnTop: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "is_window_always_on_top".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_window_always_on_top" }
        }
      val isWindowFocused: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "is_window_focused".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_window_focused" }
        }
      val isWindowFullscreen: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "is_window_fullscreen".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_window_fullscreen" }
        }
      val isWindowMaximized: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "is_window_maximized".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_window_maximized" }
        }
      val isWindowMinimized: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "is_window_minimized".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_window_minimized" }
        }
      val isWindowResizable: CPointer<godot_method_bind>
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
      val moveWindowToForeground: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "move_window_to_foreground".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method move_window_to_foreground" }
        }
      val nativeVideoIsPlaying: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "native_video_is_playing".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method native_video_is_playing" }
        }
      val nativeVideoPause: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "native_video_pause".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method native_video_pause" }
        }
      val nativeVideoPlay: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "native_video_play".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method native_video_play" }
        }
      val nativeVideoStop: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "native_video_stop".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method native_video_stop" }
        }
      val nativeVideoUnpause: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "native_video_unpause".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method native_video_unpause" }
        }
      val openMidiInputs: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "open_midi_inputs".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method open_midi_inputs" }
        }
      val printAllResources: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "print_all_resources".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method print_all_resources" }
        }
      val printAllTexturesBySize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "print_all_textures_by_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method print_all_textures_by_size" }
        }
      val printResourcesByType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "print_resources_by_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method print_resources_by_type" }
        }
      val printResourcesInUse: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "print_resources_in_use".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method print_resources_in_use" }
        }
      val requestAttention: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "request_attention".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method request_attention" }
        }
      val requestPermission: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "request_permission".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method request_permission" }
        }
      val requestPermissions: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "request_permissions".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method request_permissions" }
        }
      val setBorderlessWindow: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "set_borderless_window".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_borderless_window" }
        }
      val setClipboard: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "set_clipboard".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_clipboard" }
        }
      val setCurrentScreen: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "set_current_screen".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_current_screen" }
        }
      val setExitCode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "set_exit_code".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_exit_code" }
        }
      val setIcon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "set_icon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_icon" }
        }
      val setImeActive: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "set_ime_active".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_ime_active" }
        }
      val setImePosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "set_ime_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_ime_position" }
        }
      val setKeepScreenOn: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "set_keep_screen_on".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_keep_screen_on" }
        }
      val setLowProcessorUsageMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "set_low_processor_usage_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_low_processor_usage_mode" }
        }
      val setLowProcessorUsageModeSleepUsec: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "set_low_processor_usage_mode_sleep_usec".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method set_low_processor_usage_mode_sleep_usec" }
        }
      val setMaxWindowSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "set_max_window_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_max_window_size" }
        }
      val setMinWindowSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "set_min_window_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_min_window_size" }
        }
      val setNativeIcon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "set_native_icon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_native_icon" }
        }
      val setScreenOrientation: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "set_screen_orientation".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_screen_orientation" }
        }
      val setThreadName: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "set_thread_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_thread_name" }
        }
      val setUseFileAccessSaveAndSwap: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "set_use_file_access_save_and_swap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_use_file_access_save_and_swap"
            }
        }
      val setUseVsync: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "set_use_vsync".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_use_vsync" }
        }
      val setVsyncViaCompositor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "set_vsync_via_compositor".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_vsync_via_compositor" }
        }
      val setWindowAlwaysOnTop: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "set_window_always_on_top".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_window_always_on_top" }
        }
      val setWindowFullscreen: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "set_window_fullscreen".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_window_fullscreen" }
        }
      val setWindowMaximized: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "set_window_maximized".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_window_maximized" }
        }
      val setWindowMinimized: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "set_window_minimized".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_window_minimized" }
        }
      val setWindowPerPixelTransparencyEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "set_window_per_pixel_transparency_enabled".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method set_window_per_pixel_transparency_enabled" }
        }
      val setWindowPosition: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "set_window_position".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_window_position" }
        }
      val setWindowResizable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "set_window_resizable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_window_resizable" }
        }
      val setWindowSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "set_window_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_window_size" }
        }
      val setWindowTitle: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "set_window_title".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_window_title" }
        }
      val shellOpen: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "shell_open".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method shell_open" }
        }
      val showVirtualKeyboard: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("_OS".cstr.ptr,
            "show_virtual_keyboard".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method show_virtual_keyboard" }
        }}
  }
}
