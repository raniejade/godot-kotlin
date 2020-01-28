// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.GDError
import godot.core.Godot
import godot.core.PoolIntArray
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

open class SceneTree(
  _handle: COpaquePointer
) : MainLoop(_handle) {
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

  fun callGroup(group: String, method: String): Variant {
    val _args = VariantArray.new()
    _args.append(group)
    _args.append(method)
    val _ret = __method_bind.callGroup.call(this._handle, _args.toVariant(), 2)
    return _ret
  }

  fun callGroupFlags(
    flags: Int,
    group: String,
    method: String
  ): Variant {
    val _args = VariantArray.new()
    _args.append(flags)
    _args.append(group)
    _args.append(method)
    val _ret = __method_bind.callGroupFlags.call(this._handle, _args.toVariant(), 3)
    return _ret
  }

  fun changeScene(path: String): GDError {
    val _arg = Variant.new(path)
    val _ret = __method_bind.changeScene.call(this._handle, _arg, 1)
    return GDError.from(_ret.asInt())
  }

  fun changeSceneTo(packedScene: PackedScene): GDError {
    val _arg = Variant.new(packedScene)
    val _ret = __method_bind.changeSceneTo.call(this._handle, _arg, 1)
    return GDError.from(_ret.asInt())
  }

  fun createTimer(timeSec: Float, pauseModeProcess: Boolean): SceneTreeTimer {
    val _args = VariantArray.new()
    _args.append(timeSec)
    _args.append(pauseModeProcess)
    val _ret = __method_bind.createTimer.call(this._handle, _args.toVariant(), 2)
    return _ret.asObject(::SceneTreeTimer)!!
  }

  fun getCurrentScene(): Node {
    val _ret = __method_bind.getCurrentScene.call(this._handle)
    return _ret.asObject(::Node)!!
  }

  fun getEditedSceneRoot(): Node {
    val _ret = __method_bind.getEditedSceneRoot.call(this._handle)
    return _ret.asObject(::Node)!!
  }

  fun getFrame(): Int {
    val _ret = __method_bind.getFrame.call(this._handle)
    return _ret.asInt()
  }

  fun getMultiplayer(): MultiplayerAPI {
    val _ret = __method_bind.getMultiplayer.call(this._handle)
    return _ret.asObject(::MultiplayerAPI)!!
  }

  fun getNetworkConnectedPeers(): PoolIntArray {
    val _ret = __method_bind.getNetworkConnectedPeers.call(this._handle)
    return _ret.asPoolIntArray()
  }

  fun getNetworkPeer(): NetworkedMultiplayerPeer {
    val _ret = __method_bind.getNetworkPeer.call(this._handle)
    return _ret.asObject(::NetworkedMultiplayerPeer)!!
  }

  fun getNetworkUniqueId(): Int {
    val _ret = __method_bind.getNetworkUniqueId.call(this._handle)
    return _ret.asInt()
  }

  fun getNodeCount(): Int {
    val _ret = __method_bind.getNodeCount.call(this._handle)
    return _ret.asInt()
  }

  fun getNodesInGroup(group: String): VariantArray {
    val _arg = Variant.new(group)
    val _ret = __method_bind.getNodesInGroup.call(this._handle, _arg, 1)
    return _ret.asVariantArray()
  }

  fun getRoot(): Viewport {
    val _ret = __method_bind.getRoot.call(this._handle)
    return _ret.asObject(::Viewport)!!
  }

  fun getRpcSenderId(): Int {
    val _ret = __method_bind.getRpcSenderId.call(this._handle)
    return _ret.asInt()
  }

  fun hasGroup(name: String): Boolean {
    val _arg = Variant.new(name)
    val _ret = __method_bind.hasGroup.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun hasNetworkPeer(): Boolean {
    val _ret = __method_bind.hasNetworkPeer.call(this._handle)
    return _ret.asBoolean()
  }

  fun isDebuggingCollisionsHint(): Boolean {
    val _ret = __method_bind.isDebuggingCollisionsHint.call(this._handle)
    return _ret.asBoolean()
  }

  fun isDebuggingNavigationHint(): Boolean {
    val _ret = __method_bind.isDebuggingNavigationHint.call(this._handle)
    return _ret.asBoolean()
  }

  fun isInputHandled(): Boolean {
    val _ret = __method_bind.isInputHandled.call(this._handle)
    return _ret.asBoolean()
  }

  fun isMultiplayerPollEnabled(): Boolean {
    val _ret = __method_bind.isMultiplayerPollEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun isNetworkServer(): Boolean {
    val _ret = __method_bind.isNetworkServer.call(this._handle)
    return _ret.asBoolean()
  }

  fun isPaused(): Boolean {
    val _ret = __method_bind.isPaused.call(this._handle)
    return _ret.asBoolean()
  }

  fun isRefusingNewNetworkConnections(): Boolean {
    val _ret = __method_bind.isRefusingNewNetworkConnections.call(this._handle)
    return _ret.asBoolean()
  }

  fun isUsingFontOversampling(): Boolean {
    val _ret = __method_bind.isUsingFontOversampling.call(this._handle)
    return _ret.asBoolean()
  }

  fun notifyGroup(group: String, notification: Int) {
    val _args = VariantArray.new()
    _args.append(group)
    _args.append(notification)
    __method_bind.notifyGroup.call(this._handle, _args.toVariant(), 2)
  }

  fun notifyGroupFlags(
    callFlags: Int,
    group: String,
    notification: Int
  ) {
    val _args = VariantArray.new()
    _args.append(callFlags)
    _args.append(group)
    _args.append(notification)
    __method_bind.notifyGroupFlags.call(this._handle, _args.toVariant(), 3)
  }

  fun queueDelete(obj: Object) {
    val _arg = Variant.new(obj)
    __method_bind.queueDelete.call(this._handle, _arg, 1)
  }

  fun quit() {
    __method_bind.quit.call(this._handle)
  }

  fun reloadCurrentScene(): GDError {
    val _ret = __method_bind.reloadCurrentScene.call(this._handle)
    return GDError.from(_ret.asInt())
  }

  fun setAutoAcceptQuit(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setAutoAcceptQuit.call(this._handle, _arg, 1)
  }

  fun setCurrentScene(childNode: Node) {
    val _arg = Variant.new(childNode)
    __method_bind.setCurrentScene.call(this._handle, _arg, 1)
  }

  fun setDebugCollisionsHint(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setDebugCollisionsHint.call(this._handle, _arg, 1)
  }

  fun setDebugNavigationHint(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setDebugNavigationHint.call(this._handle, _arg, 1)
  }

  fun setEditedSceneRoot(scene: Node) {
    val _arg = Variant.new(scene)
    __method_bind.setEditedSceneRoot.call(this._handle, _arg, 1)
  }

  fun setGroup(
    group: String,
    property: String,
    value: Variant
  ) {
    val _args = VariantArray.new()
    _args.append(group)
    _args.append(property)
    _args.append(value)
    __method_bind.setGroup.call(this._handle, _args.toVariant(), 3)
  }

  fun setGroupFlags(
    callFlags: Int,
    group: String,
    property: String,
    value: Variant
  ) {
    val _args = VariantArray.new()
    _args.append(callFlags)
    _args.append(group)
    _args.append(property)
    _args.append(value)
    __method_bind.setGroupFlags.call(this._handle, _args.toVariant(), 4)
  }

  fun setInputAsHandled() {
    __method_bind.setInputAsHandled.call(this._handle)
  }

  fun setMultiplayer(multiplayer: MultiplayerAPI) {
    val _arg = Variant.new(multiplayer)
    __method_bind.setMultiplayer.call(this._handle, _arg, 1)
  }

  fun setMultiplayerPollEnabled(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setMultiplayerPollEnabled.call(this._handle, _arg, 1)
  }

  fun setNetworkPeer(peer: NetworkedMultiplayerPeer) {
    val _arg = Variant.new(peer)
    __method_bind.setNetworkPeer.call(this._handle, _arg, 1)
  }

  fun setPause(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setPause.call(this._handle, _arg, 1)
  }

  fun setQuitOnGoBack(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setQuitOnGoBack.call(this._handle, _arg, 1)
  }

  fun setRefuseNewNetworkConnections(refuse: Boolean) {
    val _arg = Variant.new(refuse)
    __method_bind.setRefuseNewNetworkConnections.call(this._handle, _arg, 1)
  }

  fun setScreenStretch(
    mode: Int,
    aspect: Int,
    minsize: Vector2,
    shrink: Float
  ) {
    val _args = VariantArray.new()
    _args.append(mode)
    _args.append(aspect)
    _args.append(minsize)
    _args.append(shrink)
    __method_bind.setScreenStretch.call(this._handle, _args.toVariant(), 4)
  }

  fun setUseFontOversampling(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setUseFontOversampling.call(this._handle, _arg, 1)
  }

  enum class StretchAspect(
    val value: Int
  ) {
    STRETCH_ASPECT_IGNORE(0),

    STRETCH_ASPECT_KEEP(1),

    STRETCH_ASPECT_KEEP_WIDTH(2),

    STRETCH_ASPECT_KEEP_HEIGHT(3),

    STRETCH_ASPECT_EXPAND(4);

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
    GROUP_CALL_DEFAULT(0),

    GROUP_CALL_REVERSE(1),

    GROUP_CALL_REALTIME(2),

    GROUP_CALL_UNIQUE(4);

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
    STRETCH_MODE_DISABLED(0),

    STRETCH_MODE_2D(1),

    STRETCH_MODE_VIEWPORT(2);

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
    val GROUP_CALL_DEFAULT: Int = 0

    val GROUP_CALL_REALTIME: Int = 2

    val GROUP_CALL_REVERSE: Int = 1

    val GROUP_CALL_UNIQUE: Int = 4

    val STRETCH_ASPECT_EXPAND: Int = 4

    val STRETCH_ASPECT_IGNORE: Int = 0

    val STRETCH_ASPECT_KEEP: Int = 1

    val STRETCH_ASPECT_KEEP_HEIGHT: Int = 3

    val STRETCH_ASPECT_KEEP_WIDTH: Int = 2

    val STRETCH_MODE_2D: Int = 1

    val STRETCH_MODE_DISABLED: Int = 0

    val STRETCH_MODE_VIEWPORT: Int = 2

    fun new(): SceneTree = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("SceneTree".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for SceneTree" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      SceneTree(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): SceneTree = SceneTree(ptr)
    /**
     * Container for method_bind pointers for SceneTree
     */
    private object __method_bind {
      val callGroup: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
            "call_group".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method call_group" }
        }
      val callGroupFlags: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
            "call_group_flags".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method call_group_flags" }
        }
      val changeScene: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
            "change_scene".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method change_scene" }
        }
      val changeSceneTo: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
            "change_scene_to".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method change_scene_to" }
        }
      val createTimer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
            "create_timer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method create_timer" }
        }
      val getCurrentScene: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
            "get_current_scene".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_current_scene" }
        }
      val getEditedSceneRoot: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
            "get_edited_scene_root".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_edited_scene_root" }
        }
      val getFrame: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
            "get_frame".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_frame" }
        }
      val getMultiplayer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
            "get_multiplayer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_multiplayer" }
        }
      val getNetworkConnectedPeers: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
            "get_network_connected_peers".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_network_connected_peers" }
        }
      val getNetworkPeer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
            "get_network_peer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_network_peer" }
        }
      val getNetworkUniqueId: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
            "get_network_unique_id".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_network_unique_id" }
        }
      val getNodeCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
            "get_node_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_node_count" }
        }
      val getNodesInGroup: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
            "get_nodes_in_group".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_nodes_in_group" }
        }
      val getRoot: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
            "get_root".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_root" }
        }
      val getRpcSenderId: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
            "get_rpc_sender_id".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_rpc_sender_id" }
        }
      val hasGroup: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
            "has_group".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_group" }
        }
      val hasNetworkPeer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
            "has_network_peer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_network_peer" }
        }
      val isDebuggingCollisionsHint: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
            "is_debugging_collisions_hint".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_debugging_collisions_hint" }
        }
      val isDebuggingNavigationHint: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
            "is_debugging_navigation_hint".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_debugging_navigation_hint" }
        }
      val isInputHandled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
            "is_input_handled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_input_handled" }
        }
      val isMultiplayerPollEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
            "is_multiplayer_poll_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_multiplayer_poll_enabled" }
        }
      val isNetworkServer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
            "is_network_server".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_network_server" }
        }
      val isPaused: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
            "is_paused".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_paused" }
        }
      val isRefusingNewNetworkConnections: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
            "is_refusing_new_network_connections".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method is_refusing_new_network_connections" }
        }
      val isUsingFontOversampling: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
            "is_using_font_oversampling".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_using_font_oversampling" }
        }
      val notifyGroup: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
            "notify_group".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method notify_group" }
        }
      val notifyGroupFlags: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
            "notify_group_flags".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method notify_group_flags" }
        }
      val queueDelete: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
            "queue_delete".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method queue_delete" }
        }
      val quit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
            "quit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method quit" }
        }
      val reloadCurrentScene: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
            "reload_current_scene".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method reload_current_scene" }
        }
      val setAutoAcceptQuit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
            "set_auto_accept_quit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_auto_accept_quit" }
        }
      val setCurrentScene: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
            "set_current_scene".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_current_scene" }
        }
      val setDebugCollisionsHint: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
            "set_debug_collisions_hint".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_debug_collisions_hint" }
        }
      val setDebugNavigationHint: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
            "set_debug_navigation_hint".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_debug_navigation_hint" }
        }
      val setEditedSceneRoot: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
            "set_edited_scene_root".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_edited_scene_root" }
        }
      val setGroup: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
            "set_group".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_group" }
        }
      val setGroupFlags: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
            "set_group_flags".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_group_flags" }
        }
      val setInputAsHandled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
            "set_input_as_handled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_input_as_handled" }
        }
      val setMultiplayer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
            "set_multiplayer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_multiplayer" }
        }
      val setMultiplayerPollEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
            "set_multiplayer_poll_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_multiplayer_poll_enabled" }
        }
      val setNetworkPeer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
            "set_network_peer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_network_peer" }
        }
      val setPause: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
            "set_pause".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_pause" }
        }
      val setQuitOnGoBack: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
            "set_quit_on_go_back".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_quit_on_go_back" }
        }
      val setRefuseNewNetworkConnections: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
            "set_refuse_new_network_connections".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_refuse_new_network_connections"
            }
        }
      val setScreenStretch: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
            "set_screen_stretch".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_screen_stretch" }
        }
      val setUseFontOversampling: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
            "set_use_font_oversampling".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_use_font_oversampling" }
        }}
  }
}
