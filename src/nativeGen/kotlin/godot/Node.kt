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
  fun addChild() {
    TODO()
  }

  fun addChildBelowNode() {
    TODO()
  }

  fun addToGroup() {
    TODO()
  }

  fun canProcess(): Boolean {
    TODO()
  }

  fun duplicate(): Node {
    TODO()
  }

  fun findNode(): Node {
    TODO()
  }

  fun findParent(): Node {
    TODO()
  }

  fun getChild(): Node {
    TODO()
  }

  fun getChildCount(): Int {
    TODO()
  }

  fun getChildren(): VariantArray {
    TODO()
  }

  fun getCustomMultiplayer(): MultiplayerAPI {
    TODO()
  }

  fun getFilename(): String {
    TODO()
  }

  fun getGroups(): VariantArray {
    TODO()
  }

  fun getIndex(): Int {
    TODO()
  }

  fun getMultiplayer(): MultiplayerAPI {
    TODO()
  }

  fun getName(): String {
    TODO()
  }

  fun getNetworkMaster(): Int {
    TODO()
  }

  fun getNode(): Node {
    TODO()
  }

  fun getNodeAndResource(): VariantArray {
    TODO()
  }

  fun getNodeOrNull(): Node {
    TODO()
  }

  fun getOwner(): Node {
    TODO()
  }

  fun getParent(): Node {
    TODO()
  }

  fun getPath(): NodePath {
    TODO()
  }

  fun getPathTo(): NodePath {
    TODO()
  }

  fun getPauseMode(): PauseMode {
    TODO()
  }

  fun getPhysicsProcessDeltaTime(): Float {
    TODO()
  }

  fun getPositionInParent(): Int {
    TODO()
  }

  fun getProcessDeltaTime(): Float {
    TODO()
  }

  fun getSceneInstanceLoadPlaceholder(): Boolean {
    TODO()
  }

  fun getTree(): SceneTree {
    TODO()
  }

  fun getViewport(): Viewport {
    TODO()
  }

  fun hasNode(): Boolean {
    TODO()
  }

  fun hasNodeAndResource(): Boolean {
    TODO()
  }

  fun isAParentOf(): Boolean {
    TODO()
  }

  fun isDisplayedFolded(): Boolean {
    TODO()
  }

  fun isGreaterThan(): Boolean {
    TODO()
  }

  fun isInGroup(): Boolean {
    TODO()
  }

  fun isInsideTree(): Boolean {
    TODO()
  }

  fun isNetworkMaster(): Boolean {
    TODO()
  }

  fun isPhysicsProcessing(): Boolean {
    TODO()
  }

  fun isPhysicsProcessingInternal(): Boolean {
    TODO()
  }

  fun isProcessing(): Boolean {
    TODO()
  }

  fun isProcessingInput(): Boolean {
    TODO()
  }

  fun isProcessingInternal(): Boolean {
    TODO()
  }

  fun isProcessingUnhandledInput(): Boolean {
    TODO()
  }

  fun isProcessingUnhandledKeyInput(): Boolean {
    TODO()
  }

  fun moveChild() {
    TODO()
  }

  fun printStrayNodes() {
    TODO()
  }

  fun printTree() {
    TODO()
  }

  fun printTreePretty() {
    TODO()
  }

  fun propagateCall() {
    TODO()
  }

  fun propagateNotification() {
    TODO()
  }

  fun queueFree() {
    TODO()
  }

  fun raise() {
    TODO()
  }

  fun removeAndSkip() {
    TODO()
  }

  fun removeChild() {
    TODO()
  }

  fun removeFromGroup() {
    TODO()
  }

  fun replaceBy() {
    TODO()
  }

  fun requestReady() {
    TODO()
  }

  fun rpc(): Variant {
    TODO()
  }

  fun rpcConfig() {
    TODO()
  }

  fun rpcId(): Variant {
    TODO()
  }

  fun rpcUnreliable(): Variant {
    TODO()
  }

  fun rpcUnreliableId(): Variant {
    TODO()
  }

  fun rset() {
    TODO()
  }

  fun rsetConfig() {
    TODO()
  }

  fun rsetId() {
    TODO()
  }

  fun rsetUnreliable() {
    TODO()
  }

  fun rsetUnreliableId() {
    TODO()
  }

  fun setCustomMultiplayer() {
    TODO()
  }

  fun setDisplayFolded() {
    TODO()
  }

  fun setFilename() {
    TODO()
  }

  fun setName() {
    TODO()
  }

  fun setNetworkMaster() {
    TODO()
  }

  fun setOwner() {
    TODO()
  }

  fun setPauseMode() {
    TODO()
  }

  fun setPhysicsProcess() {
    TODO()
  }

  fun setPhysicsProcessInternal() {
    TODO()
  }

  fun setProcess() {
    TODO()
  }

  fun setProcessInput() {
    TODO()
  }

  fun setProcessInternal() {
    TODO()
  }

  fun setProcessPriority() {
    TODO()
  }

  fun setProcessUnhandledInput() {
    TODO()
  }

  fun setProcessUnhandledKeyInput() {
    TODO()
  }

  fun setSceneInstanceLoadPlaceholder() {
    TODO()
  }

  enum class PauseMode(
    val value: Int
  ) {
    PAUSE_MODE_INHERIT(0),

    PAUSE_MODE_STOP(1),

    PAUSE_MODE_PROCESS(2);
  }

  enum class DuplicateFlags(
    val value: Int
  ) {
    DUPLICATE_SIGNALS(1),

    DUPLICATE_GROUPS(2),

    DUPLICATE_SCRIPTS(4),

    DUPLICATE_USE_INSTANCING(8);
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
