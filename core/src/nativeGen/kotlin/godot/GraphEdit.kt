// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.GDError
import godot.core.Godot
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

open class GraphEdit(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Control(null) {
  var rightDisconnects: Boolean
    get() {
       return isRightDisconnectsEnabled() 
    }
    set(value) {
      setRightDisconnects(value)
    }

  var scrollOffset: Vector2
    get() {
       return getScrollOfs() 
    }
    set(value) {
      setScrollOfs(value)
    }

  var snapDistance: Int
    get() {
       return getSnap() 
    }
    set(value) {
      setSnap(value)
    }

  var useSnap: Boolean
    get() {
       return isUsingSnap() 
    }
    set(value) {
      setUseSnap(value)
    }

  var zoom: Float
    get() {
       return getZoom() 
    }
    set(value) {
      setZoom(value)
    }

  /**
   * GraphEdit::_begin_node_move signal
   */
  val signalBeginNodeMove: Signal0 = Signal0("_begin_node_move")

  /**
   * GraphEdit::_end_node_move signal
   */
  val signalEndNodeMove: Signal0 = Signal0("_end_node_move")

  /**
   * GraphEdit::connection_from_empty signal
   */
  val signalConnectionFromEmpty: Signal3<String, Int, Vector2> = Signal3("connection_from_empty")

  /**
   * GraphEdit::connection_request signal
   */
  val signalConnectionRequest: Signal4<String, Int, String, Int> = Signal4("connection_request")

  /**
   * GraphEdit::connection_to_empty signal
   */
  val signalConnectionToEmpty: Signal3<String, Int, Vector2> = Signal3("connection_to_empty")

  /**
   * GraphEdit::copy_nodes_request signal
   */
  val signalCopyNodesRequest: Signal0 = Signal0("copy_nodes_request")

  /**
   * GraphEdit::delete_nodes_request signal
   */
  val signalDeleteNodesRequest: Signal0 = Signal0("delete_nodes_request")

  /**
   * GraphEdit::disconnection_request signal
   */
  val signalDisconnectionRequest: Signal4<String, Int, String, Int> =
      Signal4("disconnection_request")

  /**
   * GraphEdit::duplicate_nodes_request signal
   */
  val signalDuplicateNodesRequest: Signal0 = Signal0("duplicate_nodes_request")

  /**
   * GraphEdit::node_selected signal
   */
  val signalNodeSelected: Signal1<Node> = Signal1("node_selected")

  /**
   * GraphEdit::paste_nodes_request signal
   */
  val signalPasteNodesRequest: Signal0 = Signal0("paste_nodes_request")

  /**
   * GraphEdit::popup_request signal
   */
  val signalPopupRequest: Signal1<Vector2> = Signal1("popup_request")

  /**
   * GraphEdit::scroll_offset_changed signal
   */
  val signalScrollOffsetChanged: Signal1<Vector2> = Signal1("scroll_offset_changed")

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  /**
   * Specialized setter for scrollOffset
   */
  fun scrollOffset(cb: Vector2.() -> Unit) {
    val _p = scrollOffset
    cb(_p)
    scrollOffset = _p
  }

  open fun _connections_layer_draw() {
    TODO()
  }

  open fun _graph_node_moved(arg0: Node) {
    TODO()
  }

  open fun _graph_node_raised(arg0: Node) {
    TODO()
  }

  open fun _scroll_moved(arg0: Float) {
    TODO()
  }

  open fun _snap_toggled() {
    TODO()
  }

  open fun _snap_value_changed(arg0: Float) {
    TODO()
  }

  open fun _top_layer_draw() {
    TODO()
  }

  open fun _top_layer_input(arg0: InputEvent) {
    TODO()
  }

  open fun _update_scroll_offset() {
    TODO()
  }

  open fun _zoom_minus() {
    TODO()
  }

  open fun _zoom_plus() {
    TODO()
  }

  open fun _zoom_reset() {
    TODO()
  }

  fun addValidConnectionType(fromType: Int, toType: Int) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(fromType)
      _args.add(toType)
      __method_bind.addValidConnectionType.call(self._handle, _args, null)
    }
  }

  fun addValidLeftDisconnectType(type: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.addValidLeftDisconnectType.call(self._handle, listOf(type), null)
    }
  }

  fun addValidRightDisconnectType(type: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.addValidRightDisconnectType.call(self._handle, listOf(type), null)
    }
  }

  fun clearConnections() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.clearConnections.call(self._handle, emptyList(), null)
    }
  }

  fun connectNode(
    from: String,
    fromPort: Int,
    to: String,
    toPort: Int
  ): GDError {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(from)
      _args.add(fromPort)
      _args.add(to)
      _args.add(toPort)
      __method_bind.connectNode.call(self._handle, _args, _retPtr)
      GDError.from(_ret.value)
    }
  }

  fun disconnectNode(
    from: String,
    fromPort: Int,
    to: String,
    toPort: Int
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(from)
      _args.add(fromPort)
      _args.add(to)
      _args.add(toPort)
      __method_bind.disconnectNode.call(self._handle, _args, null)
    }
  }

  fun getConnectionList(): VariantArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = VariantArray()
      val _retPtr = _ret._value.ptr
      __method_bind.getConnectionList.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getScrollOfs(): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getScrollOfs.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getSnap(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getSnap.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getZoom(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getZoom.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getZoomHbox(): HBoxContainer {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: HBoxContainer
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getZoomHbox.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<HBoxContainer>(_tmp.value!!)
      _ret
    }
  }

  fun isNodeConnected(
    from: String,
    fromPort: Int,
    to: String,
    toPort: Int
  ): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(from)
      _args.add(fromPort)
      _args.add(to)
      _args.add(toPort)
      __method_bind.isNodeConnected.call(self._handle, _args, _retPtr)
      _ret.value
    }
  }

  fun isRightDisconnectsEnabled(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isRightDisconnectsEnabled.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isUsingSnap(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isUsingSnap.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isValidConnectionType(fromType: Int, toType: Int): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(fromType)
      _args.add(toType)
      __method_bind.isValidConnectionType.call(self._handle, _args, _retPtr)
      _ret.value
    }
  }

  fun removeValidConnectionType(fromType: Int, toType: Int) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(fromType)
      _args.add(toType)
      __method_bind.removeValidConnectionType.call(self._handle, _args, null)
    }
  }

  fun removeValidLeftDisconnectType(type: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.removeValidLeftDisconnectType.call(self._handle, listOf(type), null)
    }
  }

  fun removeValidRightDisconnectType(type: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.removeValidRightDisconnectType.call(self._handle, listOf(type), null)
    }
  }

  fun setConnectionActivity(
    from: String,
    fromPort: Int,
    to: String,
    toPort: Int,
    amount: Float
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(from)
      _args.add(fromPort)
      _args.add(to)
      _args.add(toPort)
      _args.add(amount)
      __method_bind.setConnectionActivity.call(self._handle, _args, null)
    }
  }

  fun setRightDisconnects(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setRightDisconnects.call(self._handle, listOf(enable), null)
    }
  }

  fun setScrollOfs(ofs: Vector2) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setScrollOfs.call(self._handle, listOf(ofs), null)
    }
  }

  fun setSelected(node: Node) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSelected.call(self._handle, listOf(node), null)
    }
  }

  fun setSnap(pixels: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSnap.call(self._handle, listOf(pixels), null)
    }
  }

  fun setUseSnap(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setUseSnap.call(self._handle, listOf(enable), null)
    }
  }

  fun setZoom(pZoom: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setZoom.call(self._handle, listOf(pZoom), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("GraphEdit".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for GraphEdit" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for GraphEdit
     */
    private object __method_bind {
      val addValidConnectionType: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
            "add_valid_connection_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_valid_connection_type" }
        }
      val addValidLeftDisconnectType: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
            "add_valid_left_disconnect_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_valid_left_disconnect_type" }
        }
      val addValidRightDisconnectType: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
            "add_valid_right_disconnect_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_valid_right_disconnect_type" }
        }
      val clearConnections: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
            "clear_connections".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear_connections" }
        }
      val connectNode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
            "connect_node".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method connect_node" }
        }
      val disconnectNode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
            "disconnect_node".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method disconnect_node" }
        }
      val getConnectionList: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
            "get_connection_list".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_connection_list" }
        }
      val getScrollOfs: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
            "get_scroll_ofs".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_scroll_ofs" }
        }
      val getSnap: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
            "get_snap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_snap" }
        }
      val getZoom: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
            "get_zoom".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_zoom" }
        }
      val getZoomHbox: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
            "get_zoom_hbox".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_zoom_hbox" }
        }
      val isNodeConnected: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
            "is_node_connected".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_node_connected" }
        }
      val isRightDisconnectsEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
            "is_right_disconnects_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_right_disconnects_enabled" }
        }
      val isUsingSnap: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
            "is_using_snap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_using_snap" }
        }
      val isValidConnectionType: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
            "is_valid_connection_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_valid_connection_type" }
        }
      val removeValidConnectionType: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
            "remove_valid_connection_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_valid_connection_type" }
        }
      val removeValidLeftDisconnectType: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
            "remove_valid_left_disconnect_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_valid_left_disconnect_type"
            }
        }
      val removeValidRightDisconnectType: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
            "remove_valid_right_disconnect_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_valid_right_disconnect_type"
            }
        }
      val setConnectionActivity: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
            "set_connection_activity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_connection_activity" }
        }
      val setRightDisconnects: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
            "set_right_disconnects".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_right_disconnects" }
        }
      val setScrollOfs: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
            "set_scroll_ofs".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_scroll_ofs" }
        }
      val setSelected: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
            "set_selected".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_selected" }
        }
      val setSnap: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
            "set_snap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_snap" }
        }
      val setUseSnap: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
            "set_use_snap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_use_snap" }
        }
      val setZoom: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
            "set_zoom".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_zoom" }
        }}
  }
}
