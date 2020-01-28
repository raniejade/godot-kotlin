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
  var importPath: NodePath
    get() {
       return _getImportPath() 
    }
    set(value) {
      _setImportPath(value)
    }

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

  var pauseMode: Int
    get() {
       return Node.PauseMode.from(getPauseMode()) 
    }
    set(value) {
      setPauseMode(Node.PauseMode.from(value))
    }

  fun addChild(node: Node, legibleUniqueName: Boolean) {
    val _args = VariantArray.new()
    _args.append(node)
    _args.append(legibleUniqueName)
    __method_bind.addChild.call(this._handle, _args.toVariant(), 2)
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
    __method_bind.addChildBelowNode.call(this._handle, _args.toVariant(), 3)
  }

  fun addToGroup(group: String, persistent: Boolean) {
    val _args = VariantArray.new()
    _args.append(group)
    _args.append(persistent)
    __method_bind.addToGroup.call(this._handle, _args.toVariant(), 2)
  }

  fun canProcess(): Boolean {
    val _ret = __method_bind.canProcess.call(this._handle)
    return _ret.asBoolean()
  }

  fun duplicate(flags: Int): Node {
    val _arg = Variant.new(flags)
    val _ret = __method_bind.duplicate.call(this._handle, _arg, 1)
    return _ret.asObject(::Node)!!
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
    parentFirst: Boolean
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

  fun replaceBy(node: Node, keepData: Boolean) {
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

  fun setNetworkMaster(id: Int, recursive: Boolean) {
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
            "addChild".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addChild" }
        }
      val addChildBelowNode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "addChildBelowNode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addChildBelowNode" }
        }
      val addToGroup: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "addToGroup".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addToGroup" }
        }
      val canProcess: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "canProcess".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method canProcess" }
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
            "findNode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method findNode" }
        }
      val findParent: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "findParent".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method findParent" }
        }
      val getChild: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "getChild".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getChild" }
        }
      val getChildCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "getChildCount".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getChildCount" }
        }
      val getChildren: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "getChildren".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getChildren" }
        }
      val getCustomMultiplayer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "getCustomMultiplayer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCustomMultiplayer" }
        }
      val getFilename: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "getFilename".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getFilename" }
        }
      val getGroups: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "getGroups".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getGroups" }
        }
      val getIndex: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "getIndex".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getIndex" }
        }
      val getMultiplayer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "getMultiplayer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getMultiplayer" }
        }
      val getName: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "getName".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getName" }
        }
      val getNetworkMaster: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "getNetworkMaster".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getNetworkMaster" }
        }
      val getNode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "getNode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getNode" }
        }
      val getNodeAndResource: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "getNodeAndResource".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getNodeAndResource" }
        }
      val getNodeOrNull: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "getNodeOrNull".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getNodeOrNull" }
        }
      val getOwner: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "getOwner".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getOwner" }
        }
      val getParent: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "getParent".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getParent" }
        }
      val getPath: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "getPath".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPath" }
        }
      val getPathTo: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "getPathTo".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPathTo" }
        }
      val getPauseMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "getPauseMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPauseMode" }
        }
      val getPhysicsProcessDeltaTime: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "getPhysicsProcessDeltaTime".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPhysicsProcessDeltaTime" }
        }
      val getPositionInParent: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "getPositionInParent".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPositionInParent" }
        }
      val getProcessDeltaTime: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "getProcessDeltaTime".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getProcessDeltaTime" }
        }
      val getSceneInstanceLoadPlaceholder: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "getSceneInstanceLoadPlaceholder".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSceneInstanceLoadPlaceholder" }
        }
      val getTree: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "getTree".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTree" }
        }
      val getViewport: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "getViewport".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getViewport" }
        }
      val hasNode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "hasNode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method hasNode" }
        }
      val hasNodeAndResource: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "hasNodeAndResource".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method hasNodeAndResource" }
        }
      val isAParentOf: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "isAParentOf".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isAParentOf" }
        }
      val isDisplayedFolded: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "isDisplayedFolded".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isDisplayedFolded" }
        }
      val isGreaterThan: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "isGreaterThan".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isGreaterThan" }
        }
      val isInGroup: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "isInGroup".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isInGroup" }
        }
      val isInsideTree: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "isInsideTree".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isInsideTree" }
        }
      val isNetworkMaster: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "isNetworkMaster".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isNetworkMaster" }
        }
      val isPhysicsProcessing: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "isPhysicsProcessing".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isPhysicsProcessing" }
        }
      val isPhysicsProcessingInternal: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "isPhysicsProcessingInternal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isPhysicsProcessingInternal" }
        }
      val isProcessing: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "isProcessing".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isProcessing" }
        }
      val isProcessingInput: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "isProcessingInput".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isProcessingInput" }
        }
      val isProcessingInternal: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "isProcessingInternal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isProcessingInternal" }
        }
      val isProcessingUnhandledInput: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "isProcessingUnhandledInput".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isProcessingUnhandledInput" }
        }
      val isProcessingUnhandledKeyInput: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "isProcessingUnhandledKeyInput".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isProcessingUnhandledKeyInput" }
        }
      val moveChild: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "moveChild".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method moveChild" }
        }
      val printStrayNodes: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "printStrayNodes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method printStrayNodes" }
        }
      val printTree: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "printTree".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method printTree" }
        }
      val printTreePretty: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "printTreePretty".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method printTreePretty" }
        }
      val propagateCall: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "propagateCall".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method propagateCall" }
        }
      val propagateNotification: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "propagateNotification".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method propagateNotification" }
        }
      val queueFree: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "queueFree".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method queueFree" }
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
            "removeAndSkip".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method removeAndSkip" }
        }
      val removeChild: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "removeChild".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method removeChild" }
        }
      val removeFromGroup: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "removeFromGroup".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method removeFromGroup" }
        }
      val replaceBy: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "replaceBy".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method replaceBy" }
        }
      val requestReady: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "requestReady".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method requestReady" }
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
            "rpcConfig".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method rpcConfig" }
        }
      val rpcId: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "rpcId".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method rpcId" }
        }
      val rpcUnreliable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "rpcUnreliable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method rpcUnreliable" }
        }
      val rpcUnreliableId: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "rpcUnreliableId".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method rpcUnreliableId" }
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
            "rsetConfig".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method rsetConfig" }
        }
      val rsetId: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "rsetId".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method rsetId" }
        }
      val rsetUnreliable: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "rsetUnreliable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method rsetUnreliable" }
        }
      val rsetUnreliableId: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "rsetUnreliableId".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method rsetUnreliableId" }
        }
      val setCustomMultiplayer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "setCustomMultiplayer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCustomMultiplayer" }
        }
      val setDisplayFolded: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "setDisplayFolded".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setDisplayFolded" }
        }
      val setFilename: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "setFilename".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setFilename" }
        }
      val setName: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "setName".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setName" }
        }
      val setNetworkMaster: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "setNetworkMaster".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setNetworkMaster" }
        }
      val setOwner: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "setOwner".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setOwner" }
        }
      val setPauseMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "setPauseMode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setPauseMode" }
        }
      val setPhysicsProcess: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "setPhysicsProcess".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setPhysicsProcess" }
        }
      val setPhysicsProcessInternal: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "setPhysicsProcessInternal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setPhysicsProcessInternal" }
        }
      val setProcess: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "setProcess".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setProcess" }
        }
      val setProcessInput: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "setProcessInput".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setProcessInput" }
        }
      val setProcessInternal: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "setProcessInternal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setProcessInternal" }
        }
      val setProcessPriority: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "setProcessPriority".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setProcessPriority" }
        }
      val setProcessUnhandledInput: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "setProcessUnhandledInput".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setProcessUnhandledInput" }
        }
      val setProcessUnhandledKeyInput: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "setProcessUnhandledKeyInput".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setProcessUnhandledKeyInput" }
        }
      val setSceneInstanceLoadPlaceholder: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "setSceneInstanceLoadPlaceholder".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSceneInstanceLoadPlaceholder" }
        }}
  }
}
