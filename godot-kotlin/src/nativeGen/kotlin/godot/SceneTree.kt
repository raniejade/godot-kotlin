// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.GDError
import godot.core.Godot
import godot.core.PoolIntArray
import godot.core.PoolStringArray
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import kotlin.Any
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

open class SceneTree(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : MainLoop(null) {
  var currentScene: Node
    get() {
       return getCurrentScene() 
    }
    set(value) {
      setCurrentScene(value)
    }

  var debugCollisionsHint: Boolean
    get() {
       return isDebuggingCollisionsHint() 
    }
    set(value) {
      setDebugCollisionsHint(value)
    }

  var debugNavigationHint: Boolean
    get() {
       return isDebuggingNavigationHint() 
    }
    set(value) {
      setDebugNavigationHint(value)
    }

  var editedSceneRoot: Node
    get() {
       return getEditedSceneRoot() 
    }
    set(value) {
      setEditedSceneRoot(value)
    }

  var multiplayer: MultiplayerAPI
    get() {
       return getMultiplayer() 
    }
    set(value) {
      setMultiplayer(value)
    }

  var multiplayerPoll: Boolean
    get() {
       return isMultiplayerPollEnabled() 
    }
    set(value) {
      setMultiplayerPollEnabled(value)
    }

  var networkPeer: NetworkedMultiplayerPeer
    get() {
       return getNetworkPeer() 
    }
    set(value) {
      setNetworkPeer(value)
    }

  var paused: Boolean
    get() {
       return isPaused() 
    }
    set(value) {
      setPause(value)
    }

  var refuseNewNetworkConnections: Boolean
    get() {
       return isRefusingNewNetworkConnections() 
    }
    set(value) {
      setRefuseNewNetworkConnections(value)
    }

  val root: Viewport
    get() {
       return getRoot() 
    }

  var useFontOversampling: Boolean
    get() {
       return isUsingFontOversampling() 
    }
    set(value) {
      setUseFontOversampling(value)
    }

  /**
   * SceneTree::connected_to_server signal
   */
  val signalConnectedToServer: Signal0 = Signal0("connected_to_server")

  /**
   * SceneTree::connection_failed signal
   */
  val signalConnectionFailed: Signal0 = Signal0("connection_failed")

  /**
   * SceneTree::files_dropped signal
   */
  val signalFilesDropped: Signal2<PoolStringArray, Int> = Signal2("files_dropped")

  /**
   * SceneTree::global_menu_action signal
   */
  val signalGlobalMenuAction: Signal2<Variant, Variant> = Signal2("global_menu_action")

  /**
   * SceneTree::idle_frame signal
   */
  val signalIdleFrame: Signal0 = Signal0("idle_frame")

  /**
   * SceneTree::network_peer_connected signal
   */
  val signalNetworkPeerConnected: Signal1<Int> = Signal1("network_peer_connected")

  /**
   * SceneTree::network_peer_disconnected signal
   */
  val signalNetworkPeerDisconnected: Signal1<Int> = Signal1("network_peer_disconnected")

  /**
   * SceneTree::node_added signal
   */
  val signalNodeAdded: Signal1<Node> = Signal1("node_added")

  /**
   * SceneTree::node_configuration_warning_changed signal
   */
  val signalNodeConfigurationWarningChanged: Signal1<Node> =
      Signal1("node_configuration_warning_changed")

  /**
   * SceneTree::node_removed signal
   */
  val signalNodeRemoved: Signal1<Node> = Signal1("node_removed")

  /**
   * SceneTree::node_renamed signal
   */
  val signalNodeRenamed: Signal1<Node> = Signal1("node_renamed")

  /**
   * SceneTree::physics_frame signal
   */
  val signalPhysicsFrame: Signal0 = Signal0("physics_frame")

  /**
   * SceneTree::screen_resized signal
   */
  val signalScreenResized: Signal0 = Signal0("screen_resized")

  /**
   * SceneTree::server_disconnected signal
   */
  val signalServerDisconnected: Signal0 = Signal0("server_disconnected")

  /**
   * SceneTree::tree_changed signal
   */
  val signalTreeChanged: Signal0 = Signal0("tree_changed")

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  open fun _change_scene(arg0: Node) {
    TODO()
  }

  open fun _connected_to_server() {
    TODO()
  }

  open fun _connection_failed() {
    TODO()
  }

  open fun _network_peer_connected(arg0: Int) {
    TODO()
  }

  open fun _network_peer_disconnected(arg0: Int) {
    TODO()
  }

  open fun _server_disconnected() {
    TODO()
  }

  fun callGroup(
    group: String,
    method: String,
    vararg varargs: Any?
  ): godot.core.Variant {
    val _args = mutableListOf<Variant>()
    _args.add(Variant(group))
    _args.add(Variant(method))
    varargs.forEach { _args.add(Variant.fromAny(it)) }
    val _ret = __method_bind.callGroup.slowcall(this._handle, _args)
    return _ret
  }

  fun callGroupFlags(
    flags: Int,
    group: String,
    method: String,
    vararg varargs: Any?
  ): godot.core.Variant {
    val _args = mutableListOf<Variant>()
    _args.add(Variant(flags))
    _args.add(Variant(group))
    _args.add(Variant(method))
    varargs.forEach { _args.add(Variant.fromAny(it)) }
    val _ret = __method_bind.callGroupFlags.slowcall(this._handle, _args)
    return _ret
  }

  fun changeScene(path: String): GDError {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.changeScene.call(self._handle, listOf(path), _retPtr)
      GDError.from(_ret.value)
    }
  }

  fun changeSceneTo(packedScene: PackedScene): GDError {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.changeSceneTo.call(self._handle, listOf(packedScene), _retPtr)
      GDError.from(_ret.value)
    }
  }

  fun createTimer(timeSec: Float, pauseModeProcess: Boolean = true): SceneTreeTimer {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: SceneTreeTimer
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      val _args = mutableListOf<Any?>()
      _args.add(timeSec)
      _args.add(pauseModeProcess)
      __method_bind.createTimer.call(self._handle, _args, _retPtr)
      _ret = objectToType<SceneTreeTimer>(_tmp.value!!)
      _ret
    }
  }

  fun getCurrentScene(): Node {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Node
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getCurrentScene.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<Node>(_tmp.value!!)
      _ret
    }
  }

  fun getEditedSceneRoot(): Node {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Node
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getEditedSceneRoot.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<Node>(_tmp.value!!)
      _ret
    }
  }

  fun getFrame(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getFrame.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getMultiplayer(): MultiplayerAPI {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: MultiplayerAPI
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getMultiplayer.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<MultiplayerAPI>(_tmp.value!!)
      _ret
    }
  }

  fun getNetworkConnectedPeers(): PoolIntArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = PoolIntArray()
      val _retPtr = _ret._value.ptr
      __method_bind.getNetworkConnectedPeers.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getNetworkPeer(): NetworkedMultiplayerPeer {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: NetworkedMultiplayerPeer
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getNetworkPeer.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<NetworkedMultiplayerPeer>(_tmp.value!!)
      _ret
    }
  }

  fun getNetworkUniqueId(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getNetworkUniqueId.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getNodeCount(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getNodeCount.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getNodesInGroup(group: String): VariantArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = VariantArray()
      val _retPtr = _ret._value.ptr
      __method_bind.getNodesInGroup.call(self._handle, listOf(group), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getRoot(): Viewport {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Viewport
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getRoot.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<Viewport>(_tmp.value!!)
      _ret
    }
  }

  fun getRpcSenderId(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getRpcSenderId.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun hasGroup(name: String): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.hasGroup.call(self._handle, listOf(name), _retPtr)
      _ret.value
    }
  }

  fun hasNetworkPeer(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.hasNetworkPeer.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isDebuggingCollisionsHint(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isDebuggingCollisionsHint.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isDebuggingNavigationHint(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isDebuggingNavigationHint.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isInputHandled(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isInputHandled.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isMultiplayerPollEnabled(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isMultiplayerPollEnabled.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isNetworkServer(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isNetworkServer.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isPaused(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isPaused.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isRefusingNewNetworkConnections(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isRefusingNewNetworkConnections.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isUsingFontOversampling(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isUsingFontOversampling.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun notifyGroup(group: String, notification: Int) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(group)
      _args.add(notification)
      __method_bind.notifyGroup.call(self._handle, _args, null)
    }
  }

  fun notifyGroupFlags(
    callFlags: Int,
    group: String,
    notification: Int
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(callFlags)
      _args.add(group)
      _args.add(notification)
      __method_bind.notifyGroupFlags.call(self._handle, _args, null)
    }
  }

  fun queueDelete(obj: Object) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.queueDelete.call(self._handle, listOf(obj), null)
    }
  }

  fun quit(exitCode: Int = -1) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.quit.call(self._handle, listOf(exitCode), null)
    }
  }

  fun reloadCurrentScene(): GDError {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.reloadCurrentScene.call(self._handle, emptyList(), _retPtr)
      GDError.from(_ret.value)
    }
  }

  fun setAutoAcceptQuit(enabled: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setAutoAcceptQuit.call(self._handle, listOf(enabled), null)
    }
  }

  fun setCurrentScene(childNode: Node) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setCurrentScene.call(self._handle, listOf(childNode), null)
    }
  }

  fun setDebugCollisionsHint(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setDebugCollisionsHint.call(self._handle, listOf(enable), null)
    }
  }

  fun setDebugNavigationHint(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setDebugNavigationHint.call(self._handle, listOf(enable), null)
    }
  }

  fun setEditedSceneRoot(scene: Node) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setEditedSceneRoot.call(self._handle, listOf(scene), null)
    }
  }

  fun setGroup(
    group: String,
    property: String,
    value: godot.core.Variant
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(group)
      _args.add(property)
      _args.add(value)
      __method_bind.setGroup.call(self._handle, _args, null)
    }
  }

  fun setGroupFlags(
    callFlags: Int,
    group: String,
    property: String,
    value: godot.core.Variant
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(callFlags)
      _args.add(group)
      _args.add(property)
      _args.add(value)
      __method_bind.setGroupFlags.call(self._handle, _args, null)
    }
  }

  fun setInputAsHandled() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setInputAsHandled.call(self._handle, emptyList(), null)
    }
  }

  fun setMultiplayer(multiplayer: MultiplayerAPI) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setMultiplayer.call(self._handle, listOf(multiplayer), null)
    }
  }

  fun setMultiplayerPollEnabled(enabled: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setMultiplayerPollEnabled.call(self._handle, listOf(enabled), null)
    }
  }

  fun setNetworkPeer(peer: NetworkedMultiplayerPeer) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setNetworkPeer.call(self._handle, listOf(peer), null)
    }
  }

  fun setPause(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setPause.call(self._handle, listOf(enable), null)
    }
  }

  fun setQuitOnGoBack(enabled: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setQuitOnGoBack.call(self._handle, listOf(enabled), null)
    }
  }

  fun setRefuseNewNetworkConnections(refuse: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setRefuseNewNetworkConnections.call(self._handle, listOf(refuse), null)
    }
  }

  fun setScreenStretch(
    mode: Int,
    aspect: Int,
    minsize: Vector2,
    shrink: Float = 1.0f
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(mode)
      _args.add(aspect)
      _args.add(minsize)
      _args.add(shrink)
      __method_bind.setScreenStretch.call(self._handle, _args, null)
    }
  }

  fun setUseFontOversampling(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setUseFontOversampling.call(self._handle, listOf(enable), null)
    }
  }

  enum class StretchAspect(
    val value: Int
  ) {
    IGNORE(0),

    KEEP(1),

    KEEP_WIDTH(2),

    KEEP_HEIGHT(3),

    EXPAND(4);

    companion object {
      fun from(value: Int): StretchAspect {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class GroupCallFlags(
    val value: Int
  ) {
    DEFAULT(0),

    REVERSE(1),

    REALTIME(2),

    UNIQUE(4);

    companion object {
      fun from(value: Int): GroupCallFlags {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class StretchMode(
    val value: Int
  ) {
    DISABLED(0),

    `2D`(1),

    VIEWPORT(2);

    companion object {
      fun from(value: Int): StretchMode {
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
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("SceneTree".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for SceneTree" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for SceneTree
     */
    private object __method_bind {
      val callGroup: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "call_group".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method call_group" }
            }
          }

      val callGroupFlags: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "call_group_flags".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method call_group_flags" }
            }
          }

      val changeScene: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "change_scene".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method change_scene" }
            }
          }

      val changeSceneTo: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "change_scene_to".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method change_scene_to" }
            }
          }

      val createTimer: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "create_timer".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method create_timer" }
            }
          }

      val getCurrentScene: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "get_current_scene".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_current_scene" }
            }
          }

      val getEditedSceneRoot: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "get_edited_scene_root".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_edited_scene_root" }
            }
          }

      val getFrame: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "get_frame".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_frame" }
            }
          }

      val getMultiplayer: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "get_multiplayer".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_multiplayer" }
            }
          }

      val getNetworkConnectedPeers: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "get_network_connected_peers".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_network_connected_peers" }
            }
          }

      val getNetworkPeer: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "get_network_peer".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_network_peer" }
            }
          }

      val getNetworkUniqueId: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "get_network_unique_id".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_network_unique_id" }
            }
          }

      val getNodeCount: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "get_node_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_node_count" }
            }
          }

      val getNodesInGroup: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "get_nodes_in_group".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_nodes_in_group" }
            }
          }

      val getRoot: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "get_root".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_root" }
            }
          }

      val getRpcSenderId: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "get_rpc_sender_id".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_rpc_sender_id" }
            }
          }

      val hasGroup: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "has_group".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_group" }
            }
          }

      val hasNetworkPeer: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "has_network_peer".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_network_peer" }
            }
          }

      val isDebuggingCollisionsHint: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "is_debugging_collisions_hint".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_debugging_collisions_hint" }
            }
          }

      val isDebuggingNavigationHint: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "is_debugging_navigation_hint".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_debugging_navigation_hint" }
            }
          }

      val isInputHandled: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "is_input_handled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_input_handled" }
            }
          }

      val isMultiplayerPollEnabled: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "is_multiplayer_poll_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_multiplayer_poll_enabled" }
            }
          }

      val isNetworkServer: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "is_network_server".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_network_server" }
            }
          }

      val isPaused: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "is_paused".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_paused" }
            }
          }

      val isRefusingNewNetworkConnections: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "is_refusing_new_network_connections".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method is_refusing_new_network_connections" }
            }
          }

      val isUsingFontOversampling: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "is_using_font_oversampling".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_using_font_oversampling" }
            }
          }

      val notifyGroup: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "notify_group".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method notify_group" }
            }
          }

      val notifyGroupFlags: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "notify_group_flags".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method notify_group_flags" }
            }
          }

      val queueDelete: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "queue_delete".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method queue_delete" }
            }
          }

      val quit: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "quit".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method quit" }
            }
          }

      val reloadCurrentScene: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "reload_current_scene".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method reload_current_scene" }
            }
          }

      val setAutoAcceptQuit: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "set_auto_accept_quit".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_auto_accept_quit" }
            }
          }

      val setCurrentScene: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "set_current_scene".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_current_scene" }
            }
          }

      val setDebugCollisionsHint: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "set_debug_collisions_hint".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_debug_collisions_hint" }
            }
          }

      val setDebugNavigationHint: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "set_debug_navigation_hint".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_debug_navigation_hint" }
            }
          }

      val setEditedSceneRoot: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "set_edited_scene_root".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_edited_scene_root" }
            }
          }

      val setGroup: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "set_group".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_group" }
            }
          }

      val setGroupFlags: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "set_group_flags".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_group_flags" }
            }
          }

      val setInputAsHandled: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "set_input_as_handled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_input_as_handled" }
            }
          }

      val setMultiplayer: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "set_multiplayer".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_multiplayer" }
            }
          }

      val setMultiplayerPollEnabled: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "set_multiplayer_poll_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_multiplayer_poll_enabled" }
            }
          }

      val setNetworkPeer: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "set_network_peer".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_network_peer" }
            }
          }

      val setPause: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "set_pause".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_pause" }
            }
          }

      val setQuitOnGoBack: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "set_quit_on_go_back".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_quit_on_go_back" }
            }
          }

      val setRefuseNewNetworkConnections: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "set_refuse_new_network_connections".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method set_refuse_new_network_connections" }
            }
          }

      val setScreenStretch: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "set_screen_stretch".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_screen_stretch" }
            }
          }

      val setUseFontOversampling: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "set_use_font_oversampling".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_use_font_oversampling" }
            }
          }
    }
  }
}
