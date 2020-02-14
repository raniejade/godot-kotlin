// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.NodePath
import godot.core.Variant
import godot.core.VariantArray
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

open class Node(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Object(null) {
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

  /**
   * Node::ready signal
   */
  val signalReady: Signal0 = Signal0("ready")

  /**
   * Node::renamed signal
   */
  val signalRenamed: Signal0 = Signal0("renamed")

  /**
   * Node::tree_entered signal
   */
  val signalTreeEntered: Signal0 = Signal0("tree_entered")

  /**
   * Node::tree_exited signal
   */
  val signalTreeExited: Signal0 = Signal0("tree_exited")

  /**
   * Node::tree_exiting signal
   */
  val signalTreeExiting: Signal0 = Signal0("tree_exiting")

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  open fun _enter_tree() {
    TODO()
  }

  open fun _exit_tree() {
    TODO()
  }

  open fun _get_configuration_warning(): String {
    TODO()
  }

  open fun _get_editor_description(): String {
    TODO()
  }

  open fun _get_import_path(): NodePath {
    TODO()
  }

  open fun _input(event: InputEvent) {
    TODO()
  }

  open fun _physics_process(delta: Float) {
    TODO()
  }

  open fun _process(delta: Float) {
    TODO()
  }

  open fun _ready() {
    TODO()
  }

  open fun _set_editor_description(editorDescription: String) {
    TODO()
  }

  open fun _set_import_path(importPath: NodePath) {
    TODO()
  }

  open fun _unhandled_input(event: InputEvent) {
    TODO()
  }

  open fun _unhandled_key_input(event: InputEventKey) {
    TODO()
  }

  fun addChild(node: Node, legibleUniqueName: Boolean = false) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(node)
      _args.add(legibleUniqueName)
      __method_bind.addChild.call(self._handle, _args, null)
    }
  }

  fun addChildBelowNode(
    node: Node,
    childNode: Node,
    legibleUniqueName: Boolean = false
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(node)
      _args.add(childNode)
      _args.add(legibleUniqueName)
      __method_bind.addChildBelowNode.call(self._handle, _args, null)
    }
  }

  fun addToGroup(group: String, persistent: Boolean = false) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(group)
      _args.add(persistent)
      __method_bind.addToGroup.call(self._handle, _args, null)
    }
  }

  fun canProcess(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.canProcess.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun duplicate(flags: Int = 15): Node {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Node
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.duplicate.call(self._handle, listOf(flags), _retPtr)
      _ret = objectToType<Node>(_tmp.value!!)
      _ret
    }
  }

  fun findNode(
    mask: String,
    recursive: Boolean = true,
    owned: Boolean = true
  ): Node {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Node
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      val _args = mutableListOf<Any?>()
      _args.add(mask)
      _args.add(recursive)
      _args.add(owned)
      __method_bind.findNode.call(self._handle, _args, _retPtr)
      _ret = objectToType<Node>(_tmp.value!!)
      _ret
    }
  }

  fun findParent(mask: String): Node {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Node
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.findParent.call(self._handle, listOf(mask), _retPtr)
      _ret = objectToType<Node>(_tmp.value!!)
      _ret
    }
  }

  fun getChild(idx: Int): Node {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Node
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getChild.call(self._handle, listOf(idx), _retPtr)
      _ret = objectToType<Node>(_tmp.value!!)
      _ret
    }
  }

  fun getChildCount(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getChildCount.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getChildren(): VariantArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = VariantArray()
      val _retPtr = _ret._value.ptr
      __method_bind.getChildren.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getCustomMultiplayer(): MultiplayerAPI {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: MultiplayerAPI
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getCustomMultiplayer.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<MultiplayerAPI>(_tmp.value!!)
      _ret
    }
  }

  fun getFilename(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getFilename.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getGroups(): VariantArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = VariantArray()
      val _retPtr = _ret._value.ptr
      __method_bind.getGroups.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getIndex(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getIndex.call(self._handle, emptyList(), _retPtr)
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

  fun getNetworkMaster(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getNetworkMaster.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getNode(path: NodePath): Node? {
    val self = this
    return Allocator.allocationScope {
      var _ret: Node? = null
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getNode.call(self._handle, listOf(path), _retPtr)
      if (_tmp.value != null) { _ret = objectToType<Node>(_tmp.value!!) }
      _ret
    }
  }

  fun getNodeAndResource(path: NodePath): VariantArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = VariantArray()
      val _retPtr = _ret._value.ptr
      __method_bind.getNodeAndResource.call(self._handle, listOf(path), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getNodeOrNull(path: NodePath): Node {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Node
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getNodeOrNull.call(self._handle, listOf(path), _retPtr)
      _ret = objectToType<Node>(_tmp.value!!)
      _ret
    }
  }

  fun getOwner(): Node {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Node
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getOwner.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<Node>(_tmp.value!!)
      _ret
    }
  }

  fun getParent(): Node? {
    val self = this
    return Allocator.allocationScope {
      var _ret: Node? = null
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getParent.call(self._handle, emptyList(), _retPtr)
      if (_tmp.value != null) { _ret = objectToType<Node>(_tmp.value!!) }
      _ret
    }
  }

  fun getPath(): NodePath {
    val self = this
    return Allocator.allocationScope {
      val _ret = NodePath()
      val _retPtr = _ret._value.ptr
      __method_bind.getPath.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getPathTo(node: Node): NodePath {
    val self = this
    return Allocator.allocationScope {
      val _ret = NodePath()
      val _retPtr = _ret._value.ptr
      __method_bind.getPathTo.call(self._handle, listOf(node), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getPauseMode(): PauseMode {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getPauseMode.call(self._handle, emptyList(), _retPtr)
      Node.PauseMode.from(_ret.value)
    }
  }

  fun getPhysicsProcessDeltaTime(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getPhysicsProcessDeltaTime.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getPositionInParent(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getPositionInParent.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getProcessDeltaTime(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getProcessDeltaTime.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getProcessPriority(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getProcessPriority.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getSceneInstanceLoadPlaceholder(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getSceneInstanceLoadPlaceholder.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getTree(): SceneTree {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: SceneTree
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getTree.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<SceneTree>(_tmp.value!!)
      _ret
    }
  }

  fun getViewport(): Viewport {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Viewport
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getViewport.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<Viewport>(_tmp.value!!)
      _ret
    }
  }

  fun hasNode(path: NodePath): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.hasNode.call(self._handle, listOf(path), _retPtr)
      _ret.value
    }
  }

  fun hasNodeAndResource(path: NodePath): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.hasNodeAndResource.call(self._handle, listOf(path), _retPtr)
      _ret.value
    }
  }

  fun isAParentOf(node: Node): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isAParentOf.call(self._handle, listOf(node), _retPtr)
      _ret.value
    }
  }

  fun isDisplayedFolded(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isDisplayedFolded.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isGreaterThan(node: Node): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isGreaterThan.call(self._handle, listOf(node), _retPtr)
      _ret.value
    }
  }

  fun isInGroup(group: String): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isInGroup.call(self._handle, listOf(group), _retPtr)
      _ret.value
    }
  }

  fun isInsideTree(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isInsideTree.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isNetworkMaster(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isNetworkMaster.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isPhysicsProcessing(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isPhysicsProcessing.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isPhysicsProcessingInternal(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isPhysicsProcessingInternal.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isProcessing(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isProcessing.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isProcessingInput(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isProcessingInput.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isProcessingInternal(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isProcessingInternal.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isProcessingUnhandledInput(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isProcessingUnhandledInput.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isProcessingUnhandledKeyInput(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isProcessingUnhandledKeyInput.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun moveChild(childNode: Node, toPosition: Int) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(childNode)
      _args.add(toPosition)
      __method_bind.moveChild.call(self._handle, _args, null)
    }
  }

  fun printStrayNodes() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.printStrayNodes.call(self._handle, emptyList(), null)
    }
  }

  fun printTree() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.printTree.call(self._handle, emptyList(), null)
    }
  }

  fun printTreePretty() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.printTreePretty.call(self._handle, emptyList(), null)
    }
  }

  fun propagateCall(
    method: String,
    args: VariantArray,
    parentFirst: Boolean = false
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(method)
      _args.add(args)
      _args.add(parentFirst)
      __method_bind.propagateCall.call(self._handle, _args, null)
    }
  }

  fun propagateNotification(what: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.propagateNotification.call(self._handle, listOf(what), null)
    }
  }

  fun queueFree() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.queueFree.call(self._handle, emptyList(), null)
    }
  }

  fun raise() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.raise.call(self._handle, emptyList(), null)
    }
  }

  fun removeAndSkip() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.removeAndSkip.call(self._handle, emptyList(), null)
    }
  }

  fun removeChild(node: Node) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.removeChild.call(self._handle, listOf(node), null)
    }
  }

  fun removeFromGroup(group: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.removeFromGroup.call(self._handle, listOf(group), null)
    }
  }

  fun replaceBy(node: Node, keepData: Boolean = false) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(node)
      _args.add(keepData)
      __method_bind.replaceBy.call(self._handle, _args, null)
    }
  }

  fun requestReady() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.requestReady.call(self._handle, emptyList(), null)
    }
  }

  fun rpc(method: String, vararg varargs: Any?): Variant {
    val self = this
    return Allocator.allocationScope {
      val _ret = Variant()
      val _retPtr = _ret._value.ptr
      val _args = mutableListOf<Any?>()
      _args.add(method)
      varargs.forEach { _args.add(it) }
      __method_bind.rpc.call(self._handle, _args, _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun rpcConfig(method: String, mode: Int) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(method)
      _args.add(mode)
      __method_bind.rpcConfig.call(self._handle, _args, null)
    }
  }

  fun rpcId(
    peerId: Int,
    method: String,
    vararg varargs: Any?
  ): Variant {
    val self = this
    return Allocator.allocationScope {
      val _ret = Variant()
      val _retPtr = _ret._value.ptr
      val _args = mutableListOf<Any?>()
      _args.add(peerId)
      _args.add(method)
      varargs.forEach { _args.add(it) }
      __method_bind.rpcId.call(self._handle, _args, _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun rpcUnreliable(method: String, vararg varargs: Any?): Variant {
    val self = this
    return Allocator.allocationScope {
      val _ret = Variant()
      val _retPtr = _ret._value.ptr
      val _args = mutableListOf<Any?>()
      _args.add(method)
      varargs.forEach { _args.add(it) }
      __method_bind.rpcUnreliable.call(self._handle, _args, _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun rpcUnreliableId(
    peerId: Int,
    method: String,
    vararg varargs: Any?
  ): Variant {
    val self = this
    return Allocator.allocationScope {
      val _ret = Variant()
      val _retPtr = _ret._value.ptr
      val _args = mutableListOf<Any?>()
      _args.add(peerId)
      _args.add(method)
      varargs.forEach { _args.add(it) }
      __method_bind.rpcUnreliableId.call(self._handle, _args, _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun rset(property: String, value: Variant) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(property)
      _args.add(value)
      __method_bind.rset.call(self._handle, _args, null)
    }
  }

  fun rsetConfig(property: String, mode: Int) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(property)
      _args.add(mode)
      __method_bind.rsetConfig.call(self._handle, _args, null)
    }
  }

  fun rsetId(
    peerId: Int,
    property: String,
    value: Variant
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(peerId)
      _args.add(property)
      _args.add(value)
      __method_bind.rsetId.call(self._handle, _args, null)
    }
  }

  fun rsetUnreliable(property: String, value: Variant) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(property)
      _args.add(value)
      __method_bind.rsetUnreliable.call(self._handle, _args, null)
    }
  }

  fun rsetUnreliableId(
    peerId: Int,
    property: String,
    value: Variant
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(peerId)
      _args.add(property)
      _args.add(value)
      __method_bind.rsetUnreliableId.call(self._handle, _args, null)
    }
  }

  fun setCustomMultiplayer(api: MultiplayerAPI) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setCustomMultiplayer.call(self._handle, listOf(api), null)
    }
  }

  fun setDisplayFolded(fold: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setDisplayFolded.call(self._handle, listOf(fold), null)
    }
  }

  fun setFilename(filename: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setFilename.call(self._handle, listOf(filename), null)
    }
  }

  fun setName(name: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setName.call(self._handle, listOf(name), null)
    }
  }

  fun setNetworkMaster(id: Int, recursive: Boolean = true) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(id)
      _args.add(recursive)
      __method_bind.setNetworkMaster.call(self._handle, _args, null)
    }
  }

  fun setOwner(owner: Node) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setOwner.call(self._handle, listOf(owner), null)
    }
  }

  fun setPauseMode(mode: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setPauseMode.call(self._handle, listOf(mode), null)
    }
  }

  fun setPhysicsProcess(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setPhysicsProcess.call(self._handle, listOf(enable), null)
    }
  }

  fun setPhysicsProcessInternal(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setPhysicsProcessInternal.call(self._handle, listOf(enable), null)
    }
  }

  fun setProcess(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setProcess.call(self._handle, listOf(enable), null)
    }
  }

  fun setProcessInput(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setProcessInput.call(self._handle, listOf(enable), null)
    }
  }

  fun setProcessInternal(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setProcessInternal.call(self._handle, listOf(enable), null)
    }
  }

  fun setProcessPriority(priority: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setProcessPriority.call(self._handle, listOf(priority), null)
    }
  }

  fun setProcessUnhandledInput(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setProcessUnhandledInput.call(self._handle, listOf(enable), null)
    }
  }

  fun setProcessUnhandledKeyInput(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setProcessUnhandledKeyInput.call(self._handle, listOf(enable), null)
    }
  }

  fun setSceneInstanceLoadPlaceholder(loadPlaceholder: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSceneInstanceLoadPlaceholder.call(self._handle, listOf(loadPlaceholder),
          null)
    }
  }

  fun updateConfigurationWarning() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.updateConfigurationWarning.call(self._handle, emptyList(), null)
    }
  }

  enum class PauseMode(
    val value: Int
  ) {
    INHERIT(0),

    STOP(1),

    PROCESS(2);

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
    SIGNALS(1),

    GROUPS(2),

    SCRIPTS(4),

    USE_INSTANCING(8);

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

    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Node".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for Node" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for Node
     */
    private object __method_bind {
      val addChild: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "add_child".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_child" }
        }
      val addChildBelowNode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "add_child_below_node".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_child_below_node" }
        }
      val addToGroup: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "add_to_group".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_to_group" }
        }
      val canProcess: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "can_process".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method can_process" }
        }
      val duplicate: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "duplicate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method duplicate" }
        }
      val findNode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "find_node".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method find_node" }
        }
      val findParent: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "find_parent".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method find_parent" }
        }
      val getChild: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "get_child".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_child" }
        }
      val getChildCount: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "get_child_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_child_count" }
        }
      val getChildren: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "get_children".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_children" }
        }
      val getCustomMultiplayer: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "get_custom_multiplayer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_custom_multiplayer" }
        }
      val getFilename: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "get_filename".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_filename" }
        }
      val getGroups: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "get_groups".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_groups" }
        }
      val getIndex: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "get_index".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_index" }
        }
      val getMultiplayer: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "get_multiplayer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_multiplayer" }
        }
      val getName: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "get_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_name" }
        }
      val getNetworkMaster: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "get_network_master".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_network_master" }
        }
      val getNode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "get_node".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_node" }
        }
      val getNodeAndResource: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "get_node_and_resource".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_node_and_resource" }
        }
      val getNodeOrNull: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "get_node_or_null".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_node_or_null" }
        }
      val getOwner: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "get_owner".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_owner" }
        }
      val getParent: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "get_parent".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_parent" }
        }
      val getPath: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "get_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_path" }
        }
      val getPathTo: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "get_path_to".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_path_to" }
        }
      val getPauseMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "get_pause_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_pause_mode" }
        }
      val getPhysicsProcessDeltaTime: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "get_physics_process_delta_time".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_physics_process_delta_time" }
        }
      val getPositionInParent: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "get_position_in_parent".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_position_in_parent" }
        }
      val getProcessDeltaTime: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "get_process_delta_time".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_process_delta_time" }
        }
      val getProcessPriority: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "get_process_priority".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_process_priority" }
        }
      val getSceneInstanceLoadPlaceholder: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "get_scene_instance_load_placeholder".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method get_scene_instance_load_placeholder" }
        }
      val getTree: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "get_tree".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_tree" }
        }
      val getViewport: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "get_viewport".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_viewport" }
        }
      val hasNode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "has_node".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_node" }
        }
      val hasNodeAndResource: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "has_node_and_resource".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_node_and_resource" }
        }
      val isAParentOf: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "is_a_parent_of".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_a_parent_of" }
        }
      val isDisplayedFolded: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "is_displayed_folded".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_displayed_folded" }
        }
      val isGreaterThan: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "is_greater_than".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_greater_than" }
        }
      val isInGroup: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "is_in_group".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_in_group" }
        }
      val isInsideTree: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "is_inside_tree".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_inside_tree" }
        }
      val isNetworkMaster: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "is_network_master".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_network_master" }
        }
      val isPhysicsProcessing: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "is_physics_processing".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_physics_processing" }
        }
      val isPhysicsProcessingInternal: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "is_physics_processing_internal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_physics_processing_internal" }
        }
      val isProcessing: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "is_processing".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_processing" }
        }
      val isProcessingInput: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "is_processing_input".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_processing_input" }
        }
      val isProcessingInternal: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "is_processing_internal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_processing_internal" }
        }
      val isProcessingUnhandledInput: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "is_processing_unhandled_input".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_processing_unhandled_input" }
        }
      val isProcessingUnhandledKeyInput: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "is_processing_unhandled_key_input".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_processing_unhandled_key_input"
            }
        }
      val moveChild: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "move_child".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method move_child" }
        }
      val printStrayNodes: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "print_stray_nodes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method print_stray_nodes" }
        }
      val printTree: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "print_tree".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method print_tree" }
        }
      val printTreePretty: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "print_tree_pretty".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method print_tree_pretty" }
        }
      val propagateCall: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "propagate_call".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method propagate_call" }
        }
      val propagateNotification: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "propagate_notification".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method propagate_notification" }
        }
      val queueFree: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "queue_free".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method queue_free" }
        }
      val raise: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "raise".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method raise" }
        }
      val removeAndSkip: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "remove_and_skip".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_and_skip" }
        }
      val removeChild: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "remove_child".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_child" }
        }
      val removeFromGroup: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "remove_from_group".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_from_group" }
        }
      val replaceBy: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "replace_by".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method replace_by" }
        }
      val requestReady: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "request_ready".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method request_ready" }
        }
      val rpc: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "rpc".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method rpc" }
        }
      val rpcConfig: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "rpc_config".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method rpc_config" }
        }
      val rpcId: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "rpc_id".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method rpc_id" }
        }
      val rpcUnreliable: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "rpc_unreliable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method rpc_unreliable" }
        }
      val rpcUnreliableId: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "rpc_unreliable_id".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method rpc_unreliable_id" }
        }
      val rset: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "rset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method rset" }
        }
      val rsetConfig: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "rset_config".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method rset_config" }
        }
      val rsetId: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "rset_id".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method rset_id" }
        }
      val rsetUnreliable: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "rset_unreliable".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method rset_unreliable" }
        }
      val rsetUnreliableId: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "rset_unreliable_id".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method rset_unreliable_id" }
        }
      val setCustomMultiplayer: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "set_custom_multiplayer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_custom_multiplayer" }
        }
      val setDisplayFolded: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "set_display_folded".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_display_folded" }
        }
      val setFilename: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "set_filename".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_filename" }
        }
      val setName: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "set_name".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_name" }
        }
      val setNetworkMaster: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "set_network_master".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_network_master" }
        }
      val setOwner: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "set_owner".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_owner" }
        }
      val setPauseMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "set_pause_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_pause_mode" }
        }
      val setPhysicsProcess: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "set_physics_process".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_physics_process" }
        }
      val setPhysicsProcessInternal: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "set_physics_process_internal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_physics_process_internal" }
        }
      val setProcess: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "set_process".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_process" }
        }
      val setProcessInput: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "set_process_input".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_process_input" }
        }
      val setProcessInternal: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "set_process_internal".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_process_internal" }
        }
      val setProcessPriority: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "set_process_priority".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_process_priority" }
        }
      val setProcessUnhandledInput: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "set_process_unhandled_input".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_process_unhandled_input" }
        }
      val setProcessUnhandledKeyInput: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "set_process_unhandled_key_input".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_process_unhandled_key_input" }
        }
      val setSceneInstanceLoadPlaceholder: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "set_scene_instance_load_placeholder".cstr.ptr)
          requireNotNull(ptr) {
            "No method_bind found for method set_scene_instance_load_placeholder" }
        }
      val updateConfigurationWarning: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Node".cstr.ptr,
            "update_configuration_warning".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method update_configuration_warning" }
        }}
  }
}
