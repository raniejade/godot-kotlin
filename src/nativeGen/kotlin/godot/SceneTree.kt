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

open class SceneTree internal constructor(
  _handle: COpaquePointer
) : MainLoop(_handle) {
  fun callGroup(group: String, method: String): Variant {
    val _args = VariantArray.new()
    _args.append(group)
    _args.append(method)
    val _ret = __method_bind.call_group.call(this.toVariant(), _args.toVariant(), 2)
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
    val _ret = __method_bind.call_group_flags.call(this.toVariant(), _args.toVariant(), 3)
    return _ret
  }

  fun changeScene(path: String): GDError {
    val _args = VariantArray.new()
    _args.append(path)
    val _ret = __method_bind.change_scene.call(this.toVariant(), _args.toVariant(), 1)
    return GDError.from(_ret.asInt())
  }

  fun changeSceneTo(packedScene: PackedScene): GDError {
    val _args = VariantArray.new()
    _args.append(packedScene)
    val _ret = __method_bind.change_scene_to.call(this.toVariant(), _args.toVariant(), 1)
    return GDError.from(_ret.asInt())
  }

  fun createTimer(timeSec: Float, pauseModeProcess: Boolean): SceneTreeTimer {
    val _args = VariantArray.new()
    _args.append(timeSec)
    _args.append(pauseModeProcess)
    val _ret = __method_bind.create_timer.call(this.toVariant(), _args.toVariant(), 2)
    return _ret.asObject(::SceneTreeTimer)!!
  }

  fun getCurrentScene(): Node {
    val _ret = __method_bind.get_current_scene.call(this.toVariant())
    return _ret.asObject(::Node)!!
  }

  fun getEditedSceneRoot(): Node {
    val _ret = __method_bind.get_edited_scene_root.call(this.toVariant())
    return _ret.asObject(::Node)!!
  }

  fun getFrame(): Int {
    val _ret = __method_bind.get_frame.call(this.toVariant())
    return _ret.asInt()
  }

  fun getMultiplayer(): MultiplayerAPI {
    val _ret = __method_bind.get_multiplayer.call(this.toVariant())
    return _ret.asObject(::MultiplayerAPI)!!
  }

  fun getNetworkConnectedPeers(): PoolIntArray {
    val _ret = __method_bind.get_network_connected_peers.call(this.toVariant())
    return _ret.asPoolIntArray()
  }

  fun getNetworkPeer(): NetworkedMultiplayerPeer {
    val _ret = __method_bind.get_network_peer.call(this.toVariant())
    return _ret.asObject(::NetworkedMultiplayerPeer)!!
  }

  fun getNetworkUniqueId(): Int {
    val _ret = __method_bind.get_network_unique_id.call(this.toVariant())
    return _ret.asInt()
  }

  fun getNodeCount(): Int {
    val _ret = __method_bind.get_node_count.call(this.toVariant())
    return _ret.asInt()
  }

  fun getNodesInGroup(group: String): VariantArray {
    val _args = VariantArray.new()
    _args.append(group)
    val _ret = __method_bind.get_nodes_in_group.call(this.toVariant(), _args.toVariant(), 1)
    return _ret.asArray()
  }

  fun getRoot(): Viewport {
    val _ret = __method_bind.get_root.call(this.toVariant())
    return _ret.asObject(::Viewport)!!
  }

  fun getRpcSenderId(): Int {
    val _ret = __method_bind.get_rpc_sender_id.call(this.toVariant())
    return _ret.asInt()
  }

  fun hasGroup(name: String): Boolean {
    val _args = VariantArray.new()
    _args.append(name)
    val _ret = __method_bind.has_group.call(this.toVariant(), _args.toVariant(), 1)
    return _ret.asBool()
  }

  fun hasNetworkPeer(): Boolean {
    val _ret = __method_bind.has_network_peer.call(this.toVariant())
    return _ret.asBool()
  }

  fun isDebuggingCollisionsHint(): Boolean {
    val _ret = __method_bind.is_debugging_collisions_hint.call(this.toVariant())
    return _ret.asBool()
  }

  fun isDebuggingNavigationHint(): Boolean {
    val _ret = __method_bind.is_debugging_navigation_hint.call(this.toVariant())
    return _ret.asBool()
  }

  fun isInputHandled(): Boolean {
    val _ret = __method_bind.is_input_handled.call(this.toVariant())
    return _ret.asBool()
  }

  fun isMultiplayerPollEnabled(): Boolean {
    val _ret = __method_bind.is_multiplayer_poll_enabled.call(this.toVariant())
    return _ret.asBool()
  }

  fun isNetworkServer(): Boolean {
    val _ret = __method_bind.is_network_server.call(this.toVariant())
    return _ret.asBool()
  }

  fun isPaused(): Boolean {
    val _ret = __method_bind.is_paused.call(this.toVariant())
    return _ret.asBool()
  }

  fun isRefusingNewNetworkConnections(): Boolean {
    val _ret = __method_bind.is_refusing_new_network_connections.call(this.toVariant())
    return _ret.asBool()
  }

  fun isUsingFontOversampling(): Boolean {
    val _ret = __method_bind.is_using_font_oversampling.call(this.toVariant())
    return _ret.asBool()
  }

  fun notifyGroup(group: String, notification: Int) {
    val _args = VariantArray.new()
    _args.append(group)
    _args.append(notification)
    __method_bind.notify_group.call(this.toVariant(), _args.toVariant(), 2)
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
    __method_bind.notify_group_flags.call(this.toVariant(), _args.toVariant(), 3)
  }

  fun queueDelete(obj: Object) {
    val _args = VariantArray.new()
    _args.append(obj)
    __method_bind.queue_delete.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun quit() {
    __method_bind.quit.call(this.toVariant())
  }

  fun reloadCurrentScene(): GDError {
    val _ret = __method_bind.reload_current_scene.call(this.toVariant())
    return GDError.from(_ret.asInt())
  }

  fun setAutoAcceptQuit(enabled: Boolean) {
    val _args = VariantArray.new()
    _args.append(enabled)
    __method_bind.set_auto_accept_quit.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setCurrentScene(childNode: Node) {
    val _args = VariantArray.new()
    _args.append(childNode)
    __method_bind.set_current_scene.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setDebugCollisionsHint(enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(enable)
    __method_bind.set_debug_collisions_hint.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setDebugNavigationHint(enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(enable)
    __method_bind.set_debug_navigation_hint.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setEditedSceneRoot(scene: Node) {
    val _args = VariantArray.new()
    _args.append(scene)
    __method_bind.set_edited_scene_root.call(this.toVariant(), _args.toVariant(), 1)
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
    __method_bind.set_group.call(this.toVariant(), _args.toVariant(), 3)
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
    __method_bind.set_group_flags.call(this.toVariant(), _args.toVariant(), 4)
  }

  fun setInputAsHandled() {
    __method_bind.set_input_as_handled.call(this.toVariant())
  }

  fun setMultiplayer(multiplayer: MultiplayerAPI) {
    val _args = VariantArray.new()
    _args.append(multiplayer)
    __method_bind.set_multiplayer.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setMultiplayerPollEnabled(enabled: Boolean) {
    val _args = VariantArray.new()
    _args.append(enabled)
    __method_bind.set_multiplayer_poll_enabled.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setNetworkPeer(peer: NetworkedMultiplayerPeer) {
    val _args = VariantArray.new()
    _args.append(peer)
    __method_bind.set_network_peer.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setPause(enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(enable)
    __method_bind.set_pause.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setQuitOnGoBack(enabled: Boolean) {
    val _args = VariantArray.new()
    _args.append(enabled)
    __method_bind.set_quit_on_go_back.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setRefuseNewNetworkConnections(refuse: Boolean) {
    val _args = VariantArray.new()
    _args.append(refuse)
    __method_bind.set_refuse_new_network_connections.call(this.toVariant(), _args.toVariant(), 1)
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
    __method_bind.set_screen_stretch.call(this.toVariant(), _args.toVariant(), 4)
  }

  fun setUseFontOversampling(enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(enable)
    __method_bind.set_use_font_oversampling.call(this.toVariant(), _args.toVariant(), 1)
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
      requireNotNull(fnPtr) { "No instance found for singleton SceneTree" }
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
      val call_group: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "call_group".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method call_group" }
            }
          }

      val call_group_flags: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "call_group_flags".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method call_group_flags" }
            }
          }

      val change_scene: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "change_scene".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method change_scene" }
            }
          }

      val change_scene_to: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "change_scene_to".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method change_scene_to" }
            }
          }

      val create_timer: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "create_timer".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method create_timer" }
            }
          }

      val get_current_scene: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "get_current_scene".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_current_scene" }
            }
          }

      val get_edited_scene_root: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "get_edited_scene_root".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_edited_scene_root" }
            }
          }

      val get_frame: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "get_frame".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_frame" }
            }
          }

      val get_multiplayer: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "get_multiplayer".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_multiplayer" }
            }
          }

      val get_network_connected_peers: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "get_network_connected_peers".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_network_connected_peers" }
            }
          }

      val get_network_peer: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "get_network_peer".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_network_peer" }
            }
          }

      val get_network_unique_id: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "get_network_unique_id".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_network_unique_id" }
            }
          }

      val get_node_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "get_node_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_node_count" }
            }
          }

      val get_nodes_in_group: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "get_nodes_in_group".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_nodes_in_group" }
            }
          }

      val get_root: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "get_root".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_root" }
            }
          }

      val get_rpc_sender_id: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "get_rpc_sender_id".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_rpc_sender_id" }
            }
          }

      val has_group: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "has_group".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_group" }
            }
          }

      val has_network_peer: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "has_network_peer".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_network_peer" }
            }
          }

      val is_debugging_collisions_hint: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "is_debugging_collisions_hint".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_debugging_collisions_hint" }
            }
          }

      val is_debugging_navigation_hint: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "is_debugging_navigation_hint".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_debugging_navigation_hint" }
            }
          }

      val is_input_handled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "is_input_handled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_input_handled" }
            }
          }

      val is_multiplayer_poll_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "is_multiplayer_poll_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_multiplayer_poll_enabled" }
            }
          }

      val is_network_server: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "is_network_server".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_network_server" }
            }
          }

      val is_paused: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "is_paused".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_paused" }
            }
          }

      val is_refusing_new_network_connections: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "is_refusing_new_network_connections".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method is_refusing_new_network_connections" }
            }
          }

      val is_using_font_oversampling: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "is_using_font_oversampling".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_using_font_oversampling" }
            }
          }

      val notify_group: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "notify_group".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method notify_group" }
            }
          }

      val notify_group_flags: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "notify_group_flags".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method notify_group_flags" }
            }
          }

      val queue_delete: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "queue_delete".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method queue_delete" }
            }
          }

      val quit: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "quit".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method quit" }
            }
          }

      val reload_current_scene: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "reload_current_scene".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method reload_current_scene" }
            }
          }

      val set_auto_accept_quit: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "set_auto_accept_quit".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_auto_accept_quit" }
            }
          }

      val set_current_scene: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "set_current_scene".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_current_scene" }
            }
          }

      val set_debug_collisions_hint: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "set_debug_collisions_hint".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_debug_collisions_hint" }
            }
          }

      val set_debug_navigation_hint: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "set_debug_navigation_hint".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_debug_navigation_hint" }
            }
          }

      val set_edited_scene_root: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "set_edited_scene_root".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_edited_scene_root" }
            }
          }

      val set_group: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "set_group".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_group" }
            }
          }

      val set_group_flags: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "set_group_flags".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_group_flags" }
            }
          }

      val set_input_as_handled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "set_input_as_handled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_input_as_handled" }
            }
          }

      val set_multiplayer: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "set_multiplayer".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_multiplayer" }
            }
          }

      val set_multiplayer_poll_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "set_multiplayer_poll_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_multiplayer_poll_enabled" }
            }
          }

      val set_network_peer: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "set_network_peer".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_network_peer" }
            }
          }

      val set_pause: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "set_pause".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_pause" }
            }
          }

      val set_quit_on_go_back: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "set_quit_on_go_back".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_quit_on_go_back" }
            }
          }

      val set_refuse_new_network_connections: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "set_refuse_new_network_connections".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method set_refuse_new_network_connections" }
            }
          }

      val set_screen_stretch: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "set_screen_stretch".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_screen_stretch" }
            }
          }

      val set_use_font_oversampling: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SceneTree".cstr.ptr,
              "set_use_font_oversampling".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_use_font_oversampling" }
            }
          }
    }
  }
}
