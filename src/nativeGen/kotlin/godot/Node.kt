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

open class Node(
  _handle: COpaquePointer
) : Object(_handle) {
  var customMultiplayer: MultiplayerAPI
    get() {
       return getCustomMultiplayer() 
    }
    set(value) {
      setCustomMultiplayer(value)
    }

  var filename: String
    get() {
       return getFilename() 
    }
    set(value) {
      setFilename(value)
    }

  val multiplayer: MultiplayerAPI
    get() {
       return getMultiplayer() 
    }

  var name: String
    get() {
       return getName() 
    }
    set(value) {
      setName(value)
    }

  var owner: Node
    get() {
       return getOwner() 
    }
    set(value) {
      setOwner(value)
    }

  var pauseMode: PauseMode
    get() {
       return getPauseMode() 
    }
    set(value) {
      setPauseMode(value.value)
    }

  var processPriority: Int
    get() {
       return getProcessPriority() 
    }
    set(value) {
      setProcessPriority(value)
    }

  fun addChild(node: Node, legibleUniqueName: Boolean = false) {
    val _args = VariantArray.new()
    _args.append(node)
    _args.append(legibleUniqueName)
    __method_bind.addChild.call(this._handle, _args.toVariant(), 2)
  }

  fun addChildBelowNode(
    node: Node,
    childNode: Node,
    legibleUniqueName: Boolean = false
  ) {
    val _args = VariantArray.new()
    _args.append(node)
    _args.append(childNode)
    _args.append(legibleUniqueName)
    __method_bind.addChildBelowNode.call(this._handle, _args.toVariant(), 3)
  }

  fun addToGroup(group: String, persistent: Boolean = false) {
    val _args = VariantArray.new()
    _args.append(group)
    _args.append(persistent)
    __method_bind.addToGroup.call(this._handle, _args.toVariant(), 2)
  }

  fun canProcess(): Boolean {
    val _ret = __method_bind.canProcess.call(this._handle)
    return _ret.asBoolean()
  }

  fun duplicate(flags: Int = 15): Node {
    val _arg = Variant.new(flags)
    val _ret = __method_bind.duplicate.call(this._handle, _arg, 1)
    return _ret.asObject(::Node)!!
  }

  fun findNode(
    mask: String,
    recursive: Boolean = true,
    owned: Boolean = true
  ): Node {
    val _args = VariantArray.new()
    _args.append(mask)
    _args.append(recursive)
    _args.append(owned)
    val _ret = __method_bind.findNode.call(this._handle, _args.toVariant(), 3)
    return _ret.asObject(::Node)!!
  }

  fun findParent(mask: String): Node {
    val _arg = Variant.new(mask)
    val _ret = __method_bind.findParent.call(this._handle, _arg, 1)
    return _ret.asObject(::Node)!!
  }

  fun getChild(idx: Int): Node {
    val _arg = Variant.new(idx)
    val _ret = __method_bind.getChild.call(this._handle, _arg, 1)
    return _ret.asObject(::Node)!!
  }

  fun getChildCount(): Int {
    val _ret = __method_bind.getChildCount.call(this._handle)
    return _ret.asInt()
  }

  fun getChildren(): VariantArray {
    val _ret = __method_bind.getChildren.call(this._handle)
    return _ret.asVariantArray()
  }

  fun getCustomMultiplayer(): MultiplayerAPI {
    val _ret = __method_bind.getCustomMultiplayer.call(this._handle)
    return _ret.asObject(::MultiplayerAPI)!!
  }

  fun getFilename(): String {
    val _ret = __method_bind.getFilename.call(this._handle)
    return _ret.asString()
  }

  fun getGroups(): VariantArray {
    val _ret = __method_bind.getGroups.call(this._handle)
    return _ret.asVariantArray()
  }

  fun getIndex(): Int {
    val _ret = __method_bind.getIndex.call(this._handle)
    return _ret.asInt()
  }

  fun getMultiplayer(): MultiplayerAPI {
    val _ret = __method_bind.getMultiplayer.call(this._handle)
    return _ret.asObject(::MultiplayerAPI)!!
  }

  fun getName(): String {
    val _ret = __method_bind.getName.call(this._handle)
    return _ret.asString()
  }

  fun getNetworkMaster(): Int {
    val _ret = __method_bind.getNetworkMaster.call(this._handle)
    return _ret.asInt()
  }

  fun getNode(path: NodePath): Node {
    val _arg = Variant.new(path)
    val _ret = __method_bind.getNode.call(this._handle, _arg, 1)
    return _ret.asObject(::Node)!!
  }

  fun getNodeAndResource(path: NodePath): VariantArray {
    val _arg = Variant.new(path)
    val _ret = __method_bind.getNodeAndResource.call(this._handle, _arg, 1)
    return _ret.asVariantArray()
  }

  fun getNodeOrNull(path: NodePath): Node {
    val _arg = Variant.new(path)
    val _ret = __method_bind.getNodeOrNull.call(this._handle, _arg, 1)
    return _ret.asObject(::Node)!!
  }

  fun getOwner(): Node {
    val _ret = __method_bind.getOwner.call(this._handle)
    return _ret.asObject(::Node)!!
  }

  fun getParent(): Node {
    val _ret = __method_bind.getParent.call(this._handle)
    return _ret.asObject(::Node)!!
  }

  fun getPath(): NodePath {
    val _ret = __method_bind.getPath.call(this._handle)
    return _ret.asNodePath()
  }

  fun getPathTo(node: Node): NodePath {
    val _arg = Variant.new(node)
    val _ret = __method_bind.getPathTo.call(this._handle, _arg, 1)
    return _ret.asNodePath()
  }

  fun getPauseMode(): PauseMode {
    val _ret = __method_bind.getPauseMode.call(this._handle)
    return Node.PauseMode.from(_ret.asInt())
  }

  fun getPhysicsProcessDeltaTime(): Float {
    val _ret = __method_bind.getPhysicsProcessDeltaTime.call(this._handle)
    return _ret.asFloat()
  }

  fun getPositionInParent(): Int {
    val _ret = __method_bind.getPositionInParent.call(this._handle)
    return _ret.asInt()
  }

  fun getProcessDeltaTime(): Float {
    val _ret = __method_bind.getProcessDeltaTime.call(this._handle)
    return _ret.asFloat()
  }

  fun getProcessPriority(): Int {
    val _ret = __method_bind.getProcessPriority.call(this._handle)
    return _ret.asInt()
  }

  fun getSceneInstanceLoadPlaceholder(): Boolean {
    val _ret = __method_bind.getSceneInstanceLoadPlaceholder.call(this._handle)
    return _ret.asBoolean()
  }

  fun getTree(): SceneTree {
    val _ret = __method_bind.getTree.call(this._handle)
    return _ret.asObject(::SceneTree)!!
  }

  fun getViewport(): Viewport {
    val _ret = __method_bind.getViewport.call(this._handle)
    return _ret.asObject(::Viewport)!!
  }

  fun hasNode(path: NodePath): Boolean {
    val _arg = Variant.new(path)
    val _ret = __method_bind.hasNode.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun hasNodeAndResource(path: NodePath): Boolean {
    val _arg = Variant.new(path)
    val _ret = __method_bind.hasNodeAndResource.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun isAParentOf(node: Node): Boolean {
    val _arg = Variant.new(node)
    val _ret = __method_bind.isAParentOf.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun isDisplayedFolded(): Boolean {
    val _ret = __method_bind.isDisplayedFolded.call(this._handle)
    return _ret.asBoolean()
  }

  fun isGreaterThan(node: Node): Boolean {
    val _arg = Variant.new(node)
    val _ret = __method_bind.isGreaterThan.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun isInGroup(group: String): Boolean {
    val _arg = Variant.new(group)
    val _ret = __method_bind.isInGroup.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun isInsideTree(): Boolean {
    val _ret = __method_bind.isInsideTree.call(this._handle)
    return _ret.asBoolean()
  }

  fun isNetworkMaster(): Boolean {
    val _ret = __method_bind.isNetworkMaster.call(this._handle)
    return _ret.asBoolean()
  }

  fun isPhysicsProcessing(): Boolean {
    val _ret = __method_bind.isPhysicsProcessing.call(this._handle)
    return _ret.asBoolean()
  }

  fun isPhysicsProcessingInternal(): Boolean {
    val _ret = __method_bind.isPhysicsProcessingInternal.call(this._handle)
    return _ret.asBoolean()
  }

  fun isProcessing(): Boolean {
    val _ret = __method_bind.isProcessing.call(this._handle)
    return _ret.asBoolean()
  }

  fun isProcessingInput(): Boolean {
    val _ret = __method_bind.isProcessingInput.call(this._handle)
    return _ret.asBoolean()
  }

  fun isProcessingInternal(): Boolean {
    val _ret = __method_bind.isProcessingInternal.call(this._handle)
    return _ret.asBoolean()
  }

  fun isProcessingUnhandledInput(): Boolean {
    val _ret = __method_bind.isProcessingUnhandledInput.call(this._handle)
    return _ret.asBoolean()
  }

  fun isProcessingUnhandledKeyInput(): Boolean {
    val _ret = __method_bind.isProcessingUnhandledKeyInput.call(this._handle)
    return _ret.asBoolean()
  }

  fun moveChild(childNode: Node, toPosition: Int) {
    val _args = VariantArray.new()
    _args.append(childNode)
    _args.append(toPosition)
    __method_bind.moveChild.call(this._handle, _args.toVariant(), 2)
  }

  fun printStrayNodes() {
    __method_bind.printStrayNodes.call(this._handle)
  }

  fun printTree() {
    __method_bind.printTree.call(this._handle)
  }

  fun printTreePretty() {
    __method_bind.printTreePretty.call(this._handle)
  }

  fun propagateCall(
    method: String,
    args: VariantArray,
    parentFirst: Boolean = false
  ) {
    val _args = VariantArray.new()
    _args.append(method)
    _args.append(args)
    _args.append(parentFirst)
    __method_bind.propagateCall.call(this._handle, _args.toVariant(), 3)
  }

  fun propagateNotification(what: Int) {
    val _arg = Variant.new(what)
    __method_bind.propagateNotification.call(this._handle, _arg, 1)
  }

  fun queueFree() {
    __method_bind.queueFree.call(this._handle)
  }

  fun raise() {
    __method_bind.raise.call(this._handle)
  }

  fun removeAndSkip() {
    __method_bind.removeAndSkip.call(this._handle)
  }

  fun removeChild(node: Node) {
    val _arg = Variant.new(node)
    __method_bind.removeChild.call(this._handle, _arg, 1)
  }

  fun removeFromGroup(group: String) {
    val _arg = Variant.new(group)
    __method_bind.removeFromGroup.call(this._handle, _arg, 1)
  }

  fun replaceBy(node: Node, keepData: Boolean = false) {
    val _args = VariantArray.new()
    _args.append(node)
    _args.append(keepData)
    __method_bind.replaceBy.call(this._handle, _args.toVariant(), 2)
  }

  fun requestReady() {
    __method_bind.requestReady.call(this._handle)
  }

  fun rpc(method: String): Variant {
    val _arg = Variant.new(method)
    val _ret = __method_bind.rpc.call(this._handle, _arg, 1)
    return _ret
  }

  fun rpcConfig(method: String, mode: Int) {
    val _args = VariantArray.new()
    _args.append(method)
    _args.append(mode)
    __method_bind.rpcConfig.call(this._handle, _args.toVariant(), 2)
  }

  fun rpcId(peerId: Int, method: String): Variant {
    val _args = VariantArray.new()
    _args.append(peerId)
    _args.append(method)
    val _ret = __method_bind.rpcId.call(this._handle, _args.toVariant(), 2)
    return _ret
  }

  fun rpcUnreliable(method: String): Variant {
    val _arg = Variant.new(method)
    val _ret = __method_bind.rpcUnreliable.call(this._handle, _arg, 1)
    return _ret
  }

  fun rpcUnreliableId(peerId: Int, method: String): Variant {
    val _args = VariantArray.new()
    _args.append(peerId)
    _args.append(method)
    val _ret = __method_bind.rpcUnreliableId.call(this._handle, _args.toVariant(), 2)
    return _ret
  }

  fun rset(property: String, value: Variant) {
    val _args = VariantArray.new()
    _args.append(property)
    _args.append(value)
    __method_bind.rset.call(this._handle, _args.toVariant(), 2)
  }

  fun rsetConfig(property: String, mode: Int) {
    val _args = VariantArray.new()
    _args.append(property)
    _args.append(mode)
    __method_bind.rsetConfig.call(this._handle, _args.toVariant(), 2)
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
    __method_bind.rsetId.call(this._handle, _args.toVariant(), 3)
  }

  fun rsetUnreliable(property: String, value: Variant) {
    val _args = VariantArray.new()
    _args.append(property)
    _args.append(value)
    __method_bind.rsetUnreliable.call(this._handle, _args.toVariant(), 2)
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
    __method_bind.rsetUnreliableId.call(this._handle, _args.toVariant(), 3)
  }

  fun setCustomMultiplayer(api: MultiplayerAPI) {
    val _arg = Variant.new(api)
    __method_bind.setCustomMultiplayer.call(this._handle, _arg, 1)
  }

  fun setDisplayFolded(fold: Boolean) {
    val _arg = Variant.new(fold)
    __method_bind.setDisplayFolded.call(this._handle, _arg, 1)
  }

  fun setFilename(filename: String) {
    val _arg = Variant.new(filename)
    __method_bind.setFilename.call(this._handle, _arg, 1)
  }

  fun setName(name: String) {
    val _arg = Variant.new(name)
    __method_bind.setName.call(this._handle, _arg, 1)
  }

  fun setNetworkMaster(id: Int, recursive: Boolean = true) {
    val _args = VariantArray.new()
    _args.append(id)
    _args.append(recursive)
    __method_bind.setNetworkMaster.call(this._handle, _args.toVariant(), 2)
  }

  fun setOwner(owner: Node) {
    val _arg = Variant.new(owner)
    __method_bind.setOwner.call(this._handle, _arg, 1)
  }

  fun setPauseMode(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.setPauseMode.call(this._handle, _arg, 1)
  }

  fun setPhysicsProcess(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setPhysicsProcess.call(this._handle, _arg, 1)
  }

  fun setPhysicsProcessInternal(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setPhysicsProcessInternal.call(this._handle, _arg, 1)
  }

  fun setProcess(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setProcess.call(this._handle, _arg, 1)
  }

  fun setProcessInput(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setProcessInput.call(this._handle, _arg, 1)
  }

  fun setProcessInternal(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setProcessInternal.call(this._handle, _arg, 1)
  }

  fun setProcessPriority(priority: Int) {
    val _arg = Variant.new(priority)
    __method_bind.setProcessPriority.call(this._handle, _arg, 1)
  }

  fun setProcessUnhandledInput(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setProcessUnhandledInput.call(this._handle, _arg, 1)
  }

  fun setProcessUnhandledKeyInput(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setProcessUnhandledKeyInput.call(this._handle, _arg, 1)
  }

  fun setSceneInstanceLoadPlaceholder(loadPlaceholder: Boolean) {
    val _arg = Variant.new(loadPlaceholder)
    __method_bind.setSceneInstanceLoadPlaceholder.call(this._handle, _arg, 1)
  }

  fun updateConfigurationWarning() {
    __method_bind.updateConfigurationWarning.call(this._handle)
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

    val NOTIFICATION_APP_PAUSED: Int = 1015

    val NOTIFICATION_APP_RESUMED: Int = 1014

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
      requireNotNull(fnPtr) { "No instance found for Node" }
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
      val addChild: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "add_child".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_child" }
        }
      val addChildBelowNode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "add_child_below_node".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_child_below_node" }
        }
      val addToGroup: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "add_to_group".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_to_group" }
        }
      val canProcess: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "can_process".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method can_process" }
        }
      val duplicate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "duplicate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method duplicate" }
        }
      val findNode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "find_node".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method find_node" }
        }
      val findParent: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "find_parent".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method find_parent" }
        }
      val getChild: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "get_child".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_child" }
        }
      val getChildCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "get_child_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_child_count" }
        }
      val getChildren: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "get_children".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_children" }
        }
      val getCustomMultiplayer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "get_custom_multiplayer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_custom_multiplayer" }
        }
      val getFilename: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "get_filename".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_filename" }
        }
      val getGroups: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "get_groups".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_groups" }
        }
      val getIndex: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "get_index".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_index" }
        }
      val getMultiplayer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "get_multiplayer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_multiplayer" }
        }
      val getName: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "get_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_name" }
        }
      val getNetworkMaster: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "get_network_master".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_network_master" }
        }
      val getNode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "get_node".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_node" }
        }
      val getNodeAndResource: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "get_node_and_resource".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_node_and_resource" }
        }
      val getNodeOrNull: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "get_node_or_null".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_node_or_null" }
        }
      val getOwner: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "get_owner".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_owner" }
        }
      val getParent: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "get_parent".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_parent" }
        }
      val getPath: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "get_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_path" }
        }
      val getPathTo: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "get_path_to".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_path_to" }
        }
      val getPauseMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "get_pause_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_pause_mode" }
        }
      val getPhysicsProcessDeltaTime: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "get_physics_process_delta_time".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_physics_process_delta_time" }
        }
      val getPositionInParent: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "get_position_in_parent".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_position_in_parent" }
        }
      val getProcessDeltaTime: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "get_process_delta_time".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_process_delta_time" }
        }
      val getProcessPriority: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "get_process_priority".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_process_priority" }
        }
      val getSceneInstanceLoadPlaceholder: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "get_scene_instance_load_placeholder".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method get_scene_instance_load_placeholder" }
        }
      val getTree: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "get_tree".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_tree" }
        }
      val getViewport: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "get_viewport".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_viewport" }
        }
      val hasNode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "has_node".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_node" }
        }
      val hasNodeAndResource: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "has_node_and_resource".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_node_and_resource" }
        }
      val isAParentOf: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "is_a_parent_of".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_a_parent_of" }
        }
      val isDisplayedFolded: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "is_displayed_folded".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_displayed_folded" }
        }
      val isGreaterThan: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "is_greater_than".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_greater_than" }
        }
      val isInGroup: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "is_in_group".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_in_group" }
        }
      val isInsideTree: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "is_inside_tree".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_inside_tree" }
        }
      val isNetworkMaster: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "is_network_master".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_network_master" }
        }
      val isPhysicsProcessing: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "is_physics_processing".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_physics_processing" }
        }
      val isPhysicsProcessingInternal: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "is_physics_processing_internal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_physics_processing_internal" }
        }
      val isProcessing: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "is_processing".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_processing" }
        }
      val isProcessingInput: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "is_processing_input".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_processing_input" }
        }
      val isProcessingInternal: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "is_processing_internal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_processing_internal" }
        }
      val isProcessingUnhandledInput: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "is_processing_unhandled_input".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_processing_unhandled_input" }
        }
      val isProcessingUnhandledKeyInput: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "is_processing_unhandled_key_input".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_processing_unhandled_key_input"
            }
        }
      val moveChild: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "move_child".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method move_child" }
        }
      val printStrayNodes: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "print_stray_nodes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method print_stray_nodes" }
        }
      val printTree: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "print_tree".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method print_tree" }
        }
      val printTreePretty: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "print_tree_pretty".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method print_tree_pretty" }
        }
      val propagateCall: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "propagate_call".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method propagate_call" }
        }
      val propagateNotification: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "propagate_notification".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method propagate_notification" }
        }
      val queueFree: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "queue_free".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method queue_free" }
        }
      val raise: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "raise".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method raise" }
        }
      val removeAndSkip: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "remove_and_skip".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_and_skip" }
        }
      val removeChild: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "remove_child".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_child" }
        }
      val removeFromGroup: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "remove_from_group".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_from_group" }
        }
      val replaceBy: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "replace_by".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method replace_by" }
        }
      val requestReady: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "request_ready".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method request_ready" }
        }
      val rpc: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "rpc".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method rpc" }
        }
      val rpcConfig: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "rpc_config".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method rpc_config" }
        }
      val rpcId: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "rpc_id".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method rpc_id" }
        }
      val rpcUnreliable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "rpc_unreliable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method rpc_unreliable" }
        }
      val rpcUnreliableId: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "rpc_unreliable_id".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method rpc_unreliable_id" }
        }
      val rset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "rset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method rset" }
        }
      val rsetConfig: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "rset_config".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method rset_config" }
        }
      val rsetId: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "rset_id".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method rset_id" }
        }
      val rsetUnreliable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "rset_unreliable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method rset_unreliable" }
        }
      val rsetUnreliableId: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "rset_unreliable_id".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method rset_unreliable_id" }
        }
      val setCustomMultiplayer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "set_custom_multiplayer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_custom_multiplayer" }
        }
      val setDisplayFolded: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "set_display_folded".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_display_folded" }
        }
      val setFilename: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "set_filename".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_filename" }
        }
      val setName: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "set_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_name" }
        }
      val setNetworkMaster: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "set_network_master".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_network_master" }
        }
      val setOwner: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "set_owner".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_owner" }
        }
      val setPauseMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "set_pause_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_pause_mode" }
        }
      val setPhysicsProcess: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "set_physics_process".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_physics_process" }
        }
      val setPhysicsProcessInternal: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "set_physics_process_internal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_physics_process_internal" }
        }
      val setProcess: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "set_process".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_process" }
        }
      val setProcessInput: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "set_process_input".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_process_input" }
        }
      val setProcessInternal: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "set_process_internal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_process_internal" }
        }
      val setProcessPriority: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "set_process_priority".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_process_priority" }
        }
      val setProcessUnhandledInput: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "set_process_unhandled_input".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_process_unhandled_input" }
        }
      val setProcessUnhandledKeyInput: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "set_process_unhandled_key_input".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_process_unhandled_key_input" }
        }
      val setSceneInstanceLoadPlaceholder: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "set_scene_instance_load_placeholder".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method set_scene_instance_load_placeholder" }
        }
      val updateConfigurationWarning: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "update_configuration_warning".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method update_configuration_warning" }
        }}
  }
}
