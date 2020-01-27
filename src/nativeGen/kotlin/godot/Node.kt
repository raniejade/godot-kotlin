// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.NodePath
import godot.core.Variant
import godot.core.VariantArray
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

open class Node internal constructor(
  _handle: COpaquePointer
) : Object(_handle) {
  fun addChild(node: Node, legibleUniqueName: Boolean) {
    val _args = VariantArray.new()
    _args.append(node)
    _args.append(legibleUniqueName)
    val _ret = __method_bind.add_child.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun addChildBelowNode(
    node: Node,
    childNode: Node,
    legibleUniqueName: Boolean
  ) {
    val _args = VariantArray.new()
    _args.append(node)
    _args.append(childNode)
    _args.append(legibleUniqueName)
    val _ret = __method_bind.add_child_below_node.call(this.toVariant(), _args.toVariant(), 3)
    TODO()
  }

  fun addToGroup(group: String, persistent: Boolean) {
    val _args = VariantArray.new()
    _args.append(group)
    _args.append(persistent)
    val _ret = __method_bind.add_to_group.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun canProcess(): Boolean {
    val _ret = __method_bind.can_process.call(this.toVariant())
    TODO()
  }

  fun duplicate(flags: Int): Node {
    val _args = VariantArray.new()
    _args.append(flags)
    val _ret = __method_bind.duplicate.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun findNode(
    mask: String,
    recursive: Boolean,
    owned: Boolean
  ): Node {
    val _args = VariantArray.new()
    _args.append(mask)
    _args.append(recursive)
    _args.append(owned)
    val _ret = __method_bind.find_node.call(this.toVariant(), _args.toVariant(), 3)
    TODO()
  }

  fun findParent(mask: String): Node {
    val _args = VariantArray.new()
    _args.append(mask)
    val _ret = __method_bind.find_parent.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getChild(idx: Int): Node {
    val _args = VariantArray.new()
    _args.append(idx)
    val _ret = __method_bind.get_child.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getChildCount(): Int {
    val _ret = __method_bind.get_child_count.call(this.toVariant())
    TODO()
  }

  fun getChildren(): VariantArray {
    val _ret = __method_bind.get_children.call(this.toVariant())
    TODO()
  }

  fun getCustomMultiplayer(): MultiplayerAPI {
    val _ret = __method_bind.get_custom_multiplayer.call(this.toVariant())
    TODO()
  }

  fun getFilename(): String {
    val _ret = __method_bind.get_filename.call(this.toVariant())
    TODO()
  }

  fun getGroups(): VariantArray {
    val _ret = __method_bind.get_groups.call(this.toVariant())
    TODO()
  }

  fun getIndex(): Int {
    val _ret = __method_bind.get_index.call(this.toVariant())
    TODO()
  }

  fun getMultiplayer(): MultiplayerAPI {
    val _ret = __method_bind.get_multiplayer.call(this.toVariant())
    TODO()
  }

  fun getName(): String {
    val _ret = __method_bind.get_name.call(this.toVariant())
    TODO()
  }

  fun getNetworkMaster(): Int {
    val _ret = __method_bind.get_network_master.call(this.toVariant())
    TODO()
  }

  fun getNode(path: NodePath): Node {
    val _args = VariantArray.new()
    _args.append(path)
    val _ret = __method_bind.get_node.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getNodeAndResource(path: NodePath): VariantArray {
    val _args = VariantArray.new()
    _args.append(path)
    val _ret = __method_bind.get_node_and_resource.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getNodeOrNull(path: NodePath): Node {
    val _args = VariantArray.new()
    _args.append(path)
    val _ret = __method_bind.get_node_or_null.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getOwner(): Node {
    val _ret = __method_bind.get_owner.call(this.toVariant())
    TODO()
  }

  fun getParent(): Node {
    val _ret = __method_bind.get_parent.call(this.toVariant())
    TODO()
  }

  fun getPath(): NodePath {
    val _ret = __method_bind.get_path.call(this.toVariant())
    TODO()
  }

  fun getPathTo(node: Node): NodePath {
    val _args = VariantArray.new()
    _args.append(node)
    val _ret = __method_bind.get_path_to.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getPauseMode(): PauseMode {
    val _ret = __method_bind.get_pause_mode.call(this.toVariant())
    TODO()
  }

  fun getPhysicsProcessDeltaTime(): Float {
    val _ret = __method_bind.get_physics_process_delta_time.call(this.toVariant())
    TODO()
  }

  fun getPositionInParent(): Int {
    val _ret = __method_bind.get_position_in_parent.call(this.toVariant())
    TODO()
  }

  fun getProcessDeltaTime(): Float {
    val _ret = __method_bind.get_process_delta_time.call(this.toVariant())
    TODO()
  }

  fun getSceneInstanceLoadPlaceholder(): Boolean {
    val _ret = __method_bind.get_scene_instance_load_placeholder.call(this.toVariant())
    TODO()
  }

  fun getTree(): SceneTree {
    val _ret = __method_bind.get_tree.call(this.toVariant())
    TODO()
  }

  fun getViewport(): Viewport {
    val _ret = __method_bind.get_viewport.call(this.toVariant())
    TODO()
  }

  fun hasNode(path: NodePath): Boolean {
    val _args = VariantArray.new()
    _args.append(path)
    val _ret = __method_bind.has_node.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun hasNodeAndResource(path: NodePath): Boolean {
    val _args = VariantArray.new()
    _args.append(path)
    val _ret = __method_bind.has_node_and_resource.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun isAParentOf(node: Node): Boolean {
    val _args = VariantArray.new()
    _args.append(node)
    val _ret = __method_bind.is_a_parent_of.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun isDisplayedFolded(): Boolean {
    val _ret = __method_bind.is_displayed_folded.call(this.toVariant())
    TODO()
  }

  fun isGreaterThan(node: Node): Boolean {
    val _args = VariantArray.new()
    _args.append(node)
    val _ret = __method_bind.is_greater_than.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun isInGroup(group: String): Boolean {
    val _args = VariantArray.new()
    _args.append(group)
    val _ret = __method_bind.is_in_group.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun isInsideTree(): Boolean {
    val _ret = __method_bind.is_inside_tree.call(this.toVariant())
    TODO()
  }

  fun isNetworkMaster(): Boolean {
    val _ret = __method_bind.is_network_master.call(this.toVariant())
    TODO()
  }

  fun isPhysicsProcessing(): Boolean {
    val _ret = __method_bind.is_physics_processing.call(this.toVariant())
    TODO()
  }

  fun isPhysicsProcessingInternal(): Boolean {
    val _ret = __method_bind.is_physics_processing_internal.call(this.toVariant())
    TODO()
  }

  fun isProcessing(): Boolean {
    val _ret = __method_bind.is_processing.call(this.toVariant())
    TODO()
  }

  fun isProcessingInput(): Boolean {
    val _ret = __method_bind.is_processing_input.call(this.toVariant())
    TODO()
  }

  fun isProcessingInternal(): Boolean {
    val _ret = __method_bind.is_processing_internal.call(this.toVariant())
    TODO()
  }

  fun isProcessingUnhandledInput(): Boolean {
    val _ret = __method_bind.is_processing_unhandled_input.call(this.toVariant())
    TODO()
  }

  fun isProcessingUnhandledKeyInput(): Boolean {
    val _ret = __method_bind.is_processing_unhandled_key_input.call(this.toVariant())
    TODO()
  }

  fun moveChild(childNode: Node, toPosition: Int) {
    val _args = VariantArray.new()
    _args.append(childNode)
    _args.append(toPosition)
    val _ret = __method_bind.move_child.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun printStrayNodes() {
    val _ret = __method_bind.print_stray_nodes.call(this.toVariant())
    TODO()
  }

  fun printTree() {
    val _ret = __method_bind.print_tree.call(this.toVariant())
    TODO()
  }

  fun printTreePretty() {
    val _ret = __method_bind.print_tree_pretty.call(this.toVariant())
    TODO()
  }

  fun propagateCall(
    method: String,
    args: VariantArray,
    parentFirst: Boolean
  ) {
    val _args = VariantArray.new()
    _args.append(method)
    _args.append(args)
    _args.append(parentFirst)
    val _ret = __method_bind.propagate_call.call(this.toVariant(), _args.toVariant(), 3)
    TODO()
  }

  fun propagateNotification(what: Int) {
    val _args = VariantArray.new()
    _args.append(what)
    val _ret = __method_bind.propagate_notification.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun queueFree() {
    val _ret = __method_bind.queue_free.call(this.toVariant())
    TODO()
  }

  fun raise() {
    val _ret = __method_bind.raise.call(this.toVariant())
    TODO()
  }

  fun removeAndSkip() {
    val _ret = __method_bind.remove_and_skip.call(this.toVariant())
    TODO()
  }

  fun removeChild(node: Node) {
    val _args = VariantArray.new()
    _args.append(node)
    val _ret = __method_bind.remove_child.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun removeFromGroup(group: String) {
    val _args = VariantArray.new()
    _args.append(group)
    val _ret = __method_bind.remove_from_group.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun replaceBy(node: Node, keepData: Boolean) {
    val _args = VariantArray.new()
    _args.append(node)
    _args.append(keepData)
    val _ret = __method_bind.replace_by.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun requestReady() {
    val _ret = __method_bind.request_ready.call(this.toVariant())
    TODO()
  }

  fun rpc(method: String): Variant {
    val _args = VariantArray.new()
    _args.append(method)
    val _ret = __method_bind.rpc.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun rpcConfig(method: String, mode: Int) {
    val _args = VariantArray.new()
    _args.append(method)
    _args.append(mode)
    val _ret = __method_bind.rpc_config.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun rpcId(peerId: Int, method: String): Variant {
    val _args = VariantArray.new()
    _args.append(peerId)
    _args.append(method)
    val _ret = __method_bind.rpc_id.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun rpcUnreliable(method: String): Variant {
    val _args = VariantArray.new()
    _args.append(method)
    val _ret = __method_bind.rpc_unreliable.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun rpcUnreliableId(peerId: Int, method: String): Variant {
    val _args = VariantArray.new()
    _args.append(peerId)
    _args.append(method)
    val _ret = __method_bind.rpc_unreliable_id.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun rset(property: String, value: Variant) {
    val _args = VariantArray.new()
    _args.append(property)
    _args.append(value)
    val _ret = __method_bind.rset.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun rsetConfig(property: String, mode: Int) {
    val _args = VariantArray.new()
    _args.append(property)
    _args.append(mode)
    val _ret = __method_bind.rset_config.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun rsetId(
    peerId: Int,
    property: String,
    value: Variant
  ) {
    val _args = VariantArray.new()
    _args.append(peerId)
    _args.append(property)
    _args.append(value)
    val _ret = __method_bind.rset_id.call(this.toVariant(), _args.toVariant(), 3)
    TODO()
  }

  fun rsetUnreliable(property: String, value: Variant) {
    val _args = VariantArray.new()
    _args.append(property)
    _args.append(value)
    val _ret = __method_bind.rset_unreliable.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun rsetUnreliableId(
    peerId: Int,
    property: String,
    value: Variant
  ) {
    val _args = VariantArray.new()
    _args.append(peerId)
    _args.append(property)
    _args.append(value)
    val _ret = __method_bind.rset_unreliable_id.call(this.toVariant(), _args.toVariant(), 3)
    TODO()
  }

  fun setCustomMultiplayer(api: MultiplayerAPI) {
    val _args = VariantArray.new()
    _args.append(api)
    val _ret = __method_bind.set_custom_multiplayer.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setDisplayFolded(fold: Boolean) {
    val _args = VariantArray.new()
    _args.append(fold)
    val _ret = __method_bind.set_display_folded.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setFilename(filename: String) {
    val _args = VariantArray.new()
    _args.append(filename)
    val _ret = __method_bind.set_filename.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setName(name: String) {
    val _args = VariantArray.new()
    _args.append(name)
    val _ret = __method_bind.set_name.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setNetworkMaster(id: Int, recursive: Boolean) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(recursive)
    val _ret = __method_bind.set_network_master.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun setOwner(owner: Node) {
    val _args = VariantArray.new()
    _args.append(owner)
    val _ret = __method_bind.set_owner.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setPauseMode(mode: Int) {
    val _args = VariantArray.new()
    _args.append(mode)
    val _ret = __method_bind.set_pause_mode.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setPhysicsProcess(enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(enable)
    val _ret = __method_bind.set_physics_process.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setPhysicsProcessInternal(enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(enable)
    val _ret = __method_bind.set_physics_process_internal.call(this.toVariant(), _args.toVariant(),
        1)
    TODO()
  }

  fun setProcess(enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(enable)
    val _ret = __method_bind.set_process.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setProcessInput(enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(enable)
    val _ret = __method_bind.set_process_input.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setProcessInternal(enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(enable)
    val _ret = __method_bind.set_process_internal.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setProcessPriority(priority: Int) {
    val _args = VariantArray.new()
    _args.append(priority)
    val _ret = __method_bind.set_process_priority.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setProcessUnhandledInput(enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(enable)
    val _ret = __method_bind.set_process_unhandled_input.call(this.toVariant(), _args.toVariant(),
        1)
    TODO()
  }

  fun setProcessUnhandledKeyInput(enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(enable)
    val _ret = __method_bind.set_process_unhandled_key_input.call(this.toVariant(),
        _args.toVariant(), 1)
    TODO()
  }

  fun setSceneInstanceLoadPlaceholder(loadPlaceholder: Boolean) {
    val _args = VariantArray.new()
    _args.append(loadPlaceholder)
    val _ret = __method_bind.set_scene_instance_load_placeholder.call(this.toVariant(),
        _args.toVariant(), 1)
    TODO()
  }

  enum class PauseMode(
    val value: Int
  ) {
    PAUSE_MODE_INHERIT(0),

    PAUSE_MODE_STOP(1),

    PAUSE_MODE_PROCESS(2);

    companion object {
      fun from(value: Int): PauseMode {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class DuplicateFlags(
    val value: Int
  ) {
    DUPLICATE_SIGNALS(1),

    DUPLICATE_GROUPS(2),

    DUPLICATE_SCRIPTS(4),

    DUPLICATE_USE_INSTANCING(8);

    companion object {
      fun from(value: Int): DuplicateFlags {
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
    val DUPLICATE_GROUPS: Int = 2

    val DUPLICATE_SCRIPTS: Int = 4

    val DUPLICATE_SIGNALS: Int = 1

    val DUPLICATE_USE_INSTANCING: Int = 8

    val NOTIFICATION_CRASH: Int = 1012

    val NOTIFICATION_DRAG_BEGIN: Int = 21

    val NOTIFICATION_DRAG_END: Int = 22

    val NOTIFICATION_ENTER_TREE: Int = 10

    val NOTIFICATION_EXIT_TREE: Int = 11

    val NOTIFICATION_INSTANCED: Int = 20

    val NOTIFICATION_INTERNAL_PHYSICS_PROCESS: Int = 26

    val NOTIFICATION_INTERNAL_PROCESS: Int = 25

    val NOTIFICATION_MOVED_IN_PARENT: Int = 12

    val NOTIFICATION_OS_IME_UPDATE: Int = 1013

    val NOTIFICATION_OS_MEMORY_WARNING: Int = 1009

    val NOTIFICATION_PARENTED: Int = 18

    val NOTIFICATION_PATH_CHANGED: Int = 23

    val NOTIFICATION_PAUSED: Int = 14

    val NOTIFICATION_PHYSICS_PROCESS: Int = 16

    val NOTIFICATION_PROCESS: Int = 17

    val NOTIFICATION_READY: Int = 13

    val NOTIFICATION_TRANSLATION_CHANGED: Int = 1010

    val NOTIFICATION_UNPARENTED: Int = 19

    val NOTIFICATION_UNPAUSED: Int = 15

    val NOTIFICATION_WM_ABOUT: Int = 1011

    val NOTIFICATION_WM_FOCUS_IN: Int = 1004

    val NOTIFICATION_WM_FOCUS_OUT: Int = 1005

    val NOTIFICATION_WM_GO_BACK_REQUEST: Int = 1007

    val NOTIFICATION_WM_MOUSE_ENTER: Int = 1002

    val NOTIFICATION_WM_MOUSE_EXIT: Int = 1003

    val NOTIFICATION_WM_QUIT_REQUEST: Int = 1006

    val NOTIFICATION_WM_UNFOCUS_REQUEST: Int = 1008

    val PAUSE_MODE_INHERIT: Int = 0

    val PAUSE_MODE_PROCESS: Int = 2

    val PAUSE_MODE_STOP: Int = 1

    fun new(): Node = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Node".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton Node" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Node(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): Node = Node(ptr)
    /**
     * Container for method_bind pointers for Node
     */
    private object __method_bind {
      val add_child: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
              "add_child".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_child" }
            }
          }

      val add_child_below_node: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
              "add_child_below_node".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_child_below_node" }
            }
          }

      val add_to_group: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
              "add_to_group".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_to_group" }
            }
          }

      val can_process: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
              "can_process".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method can_process" }
            }
          }

      val duplicate: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
              "duplicate".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method duplicate" }
            }
          }

      val find_node: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
              "find_node".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method find_node" }
            }
          }

      val find_parent: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
              "find_parent".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method find_parent" }
            }
          }

      val get_child: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
              "get_child".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_child" }
            }
          }

      val get_child_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
              "get_child_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_child_count" }
            }
          }

      val get_children: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
              "get_children".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_children" }
            }
          }

      val get_custom_multiplayer: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
              "get_custom_multiplayer".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_custom_multiplayer" }
            }
          }

      val get_filename: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
              "get_filename".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_filename" }
            }
          }

      val get_groups: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
              "get_groups".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_groups" }
            }
          }

      val get_index: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
              "get_index".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_index" }
            }
          }

      val get_multiplayer: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
              "get_multiplayer".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_multiplayer" }
            }
          }

      val get_name: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
              "get_name".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_name" }
            }
          }

      val get_network_master: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
              "get_network_master".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_network_master" }
            }
          }

      val get_node: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
              "get_node".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_node" }
            }
          }

      val get_node_and_resource: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
              "get_node_and_resource".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_node_and_resource" }
            }
          }

      val get_node_or_null: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
              "get_node_or_null".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_node_or_null" }
            }
          }

      val get_owner: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
              "get_owner".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_owner" }
            }
          }

      val get_parent: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
              "get_parent".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_parent" }
            }
          }

      val get_path: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
              "get_path".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_path" }
            }
          }

      val get_path_to: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
              "get_path_to".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_path_to" }
            }
          }

      val get_pause_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
              "get_pause_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_pause_mode" }
            }
          }

      val get_physics_process_delta_time: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
              "get_physics_process_delta_time".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_physics_process_delta_time"
              }
            }
          }

      val get_position_in_parent: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
              "get_position_in_parent".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_position_in_parent" }
            }
          }

      val get_process_delta_time: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
              "get_process_delta_time".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_process_delta_time" }
            }
          }

      val get_scene_instance_load_placeholder: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
              "get_scene_instance_load_placeholder".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method get_scene_instance_load_placeholder" }
            }
          }

      val get_tree: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
              "get_tree".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_tree" }
            }
          }

      val get_viewport: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
              "get_viewport".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_viewport" }
            }
          }

      val has_node: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
              "has_node".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_node" }
            }
          }

      val has_node_and_resource: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
              "has_node_and_resource".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_node_and_resource" }
            }
          }

      val is_a_parent_of: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
              "is_a_parent_of".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_a_parent_of" }
            }
          }

      val is_displayed_folded: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
              "is_displayed_folded".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_displayed_folded" }
            }
          }

      val is_greater_than: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
              "is_greater_than".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_greater_than" }
            }
          }

      val is_in_group: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
              "is_in_group".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_in_group" }
            }
          }

      val is_inside_tree: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
              "is_inside_tree".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_inside_tree" }
            }
          }

      val is_network_master: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
              "is_network_master".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_network_master" }
            }
          }

      val is_physics_processing: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
              "is_physics_processing".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_physics_processing" }
            }
          }

      val is_physics_processing_internal: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
              "is_physics_processing_internal".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_physics_processing_internal"
              }
            }
          }

      val is_processing: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
              "is_processing".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_processing" }
            }
          }

      val is_processing_input: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
              "is_processing_input".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_processing_input" }
            }
          }

      val is_processing_internal: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
              "is_processing_internal".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_processing_internal" }
            }
          }

      val is_processing_unhandled_input: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
              "is_processing_unhandled_input".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_processing_unhandled_input"
              }
            }
          }

      val is_processing_unhandled_key_input: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
              "is_processing_unhandled_key_input".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method is_processing_unhandled_key_input" }
            }
          }

      val move_child: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
              "move_child".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method move_child" }
            }
          }

      val print_stray_nodes: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
              "print_stray_nodes".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method print_stray_nodes" }
            }
          }

      val print_tree: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
              "print_tree".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method print_tree" }
            }
          }

      val print_tree_pretty: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
              "print_tree_pretty".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method print_tree_pretty" }
            }
          }

      val propagate_call: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
              "propagate_call".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method propagate_call" }
            }
          }

      val propagate_notification: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
              "propagate_notification".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method propagate_notification" }
            }
          }

      val queue_free: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
              "queue_free".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method queue_free" }
            }
          }

      val raise: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
              "raise".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method raise" }
            }
          }

      val remove_and_skip: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
              "remove_and_skip".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_and_skip" }
            }
          }

      val remove_child: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
              "remove_child".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_child" }
            }
          }

      val remove_from_group: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
              "remove_from_group".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_from_group" }
            }
          }

      val replace_by: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
              "replace_by".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method replace_by" }
            }
          }

      val request_ready: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
              "request_ready".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method request_ready" }
            }
          }

      val rpc: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
              "rpc".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method rpc" }
            }
          }

      val rpc_config: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
              "rpc_config".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method rpc_config" }
            }
          }

      val rpc_id: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
              "rpc_id".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method rpc_id" }
            }
          }

      val rpc_unreliable: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
              "rpc_unreliable".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method rpc_unreliable" }
            }
          }

      val rpc_unreliable_id: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
              "rpc_unreliable_id".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method rpc_unreliable_id" }
            }
          }

      val rset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
              "rset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method rset" }
            }
          }

      val rset_config: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
              "rset_config".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method rset_config" }
            }
          }

      val rset_id: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
              "rset_id".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method rset_id" }
            }
          }

      val rset_unreliable: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
              "rset_unreliable".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method rset_unreliable" }
            }
          }

      val rset_unreliable_id: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
              "rset_unreliable_id".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method rset_unreliable_id" }
            }
          }

      val set_custom_multiplayer: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
              "set_custom_multiplayer".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_custom_multiplayer" }
            }
          }

      val set_display_folded: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
              "set_display_folded".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_display_folded" }
            }
          }

      val set_filename: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
              "set_filename".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_filename" }
            }
          }

      val set_name: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
              "set_name".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_name" }
            }
          }

      val set_network_master: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
              "set_network_master".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_network_master" }
            }
          }

      val set_owner: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
              "set_owner".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_owner" }
            }
          }

      val set_pause_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
              "set_pause_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_pause_mode" }
            }
          }

      val set_physics_process: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
              "set_physics_process".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_physics_process" }
            }
          }

      val set_physics_process_internal: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
              "set_physics_process_internal".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_physics_process_internal" }
            }
          }

      val set_process: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
              "set_process".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_process" }
            }
          }

      val set_process_input: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
              "set_process_input".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_process_input" }
            }
          }

      val set_process_internal: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
              "set_process_internal".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_process_internal" }
            }
          }

      val set_process_priority: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
              "set_process_priority".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_process_priority" }
            }
          }

      val set_process_unhandled_input: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
              "set_process_unhandled_input".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_process_unhandled_input" }
            }
          }

      val set_process_unhandled_key_input: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
              "set_process_unhandled_key_input".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method set_process_unhandled_key_input" }
            }
          }

      val set_scene_instance_load_placeholder: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
              "set_scene_instance_load_placeholder".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method set_scene_instance_load_placeholder" }
            }
          }
    }
  }
}
