// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.GDError
import godot.core.Godot
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

open class GraphEdit(
  _handle: COpaquePointer
) : Control(_handle) {
  fun addValidConnectionType(fromType: Int, toType: Int) {
    val _args = VariantArray.new()
    _args.append(fromType)
    _args.append(toType)
    __method_bind.add_valid_connection_type.call(this._handle, _args.toVariant(), 2)
  }

  fun addValidLeftDisconnectType(type: Int) {
    val _arg = Variant.new(type)
    __method_bind.add_valid_left_disconnect_type.call(this._handle, _arg, 1)
  }

  fun addValidRightDisconnectType(type: Int) {
    val _arg = Variant.new(type)
    __method_bind.add_valid_right_disconnect_type.call(this._handle, _arg, 1)
  }

  fun clearConnections() {
    __method_bind.clear_connections.call(this._handle)
  }

  fun connectNode(
    from: String,
    fromPort: Int,
    to: String,
    toPort: Int
  ): GDError {
    val _args = VariantArray.new()
    _args.append(from)
    _args.append(fromPort)
    _args.append(to)
    _args.append(toPort)
    val _ret = __method_bind.connect_node.call(this._handle, _args.toVariant(), 4)
    return GDError.from(_ret.asInt())
  }

  fun disconnectNode(
    from: String,
    fromPort: Int,
    to: String,
    toPort: Int
  ) {
    val _args = VariantArray.new()
    _args.append(from)
    _args.append(fromPort)
    _args.append(to)
    _args.append(toPort)
    __method_bind.disconnect_node.call(this._handle, _args.toVariant(), 4)
  }

  fun getConnectionList(): VariantArray {
    val _ret = __method_bind.get_connection_list.call(this._handle)
    return _ret.asVariantArray()
  }

  fun getScrollOfs(): Vector2 {
    val _ret = __method_bind.get_scroll_ofs.call(this._handle)
    return _ret.asVector2()
  }

  fun getSnap(): Int {
    val _ret = __method_bind.get_snap.call(this._handle)
    return _ret.asInt()
  }

  fun getZoom(): Float {
    val _ret = __method_bind.get_zoom.call(this._handle)
    return _ret.asFloat()
  }

  fun getZoomHbox(): HBoxContainer {
    val _ret = __method_bind.get_zoom_hbox.call(this._handle)
    return _ret.asObject(::HBoxContainer)!!
  }

  fun isNodeConnected(
    from: String,
    fromPort: Int,
    to: String,
    toPort: Int
  ): Boolean {
    val _args = VariantArray.new()
    _args.append(from)
    _args.append(fromPort)
    _args.append(to)
    _args.append(toPort)
    val _ret = __method_bind.is_node_connected.call(this._handle, _args.toVariant(), 4)
    return _ret.asBoolean()
  }

  fun isRightDisconnectsEnabled(): Boolean {
    val _ret = __method_bind.is_right_disconnects_enabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun isUsingSnap(): Boolean {
    val _ret = __method_bind.is_using_snap.call(this._handle)
    return _ret.asBoolean()
  }

  fun isValidConnectionType(fromType: Int, toType: Int): Boolean {
    val _args = VariantArray.new()
    _args.append(fromType)
    _args.append(toType)
    val _ret = __method_bind.is_valid_connection_type.call(this._handle, _args.toVariant(), 2)
    return _ret.asBoolean()
  }

  fun removeValidConnectionType(fromType: Int, toType: Int) {
    val _args = VariantArray.new()
    _args.append(fromType)
    _args.append(toType)
    __method_bind.remove_valid_connection_type.call(this._handle, _args.toVariant(), 2)
  }

  fun removeValidLeftDisconnectType(type: Int) {
    val _arg = Variant.new(type)
    __method_bind.remove_valid_left_disconnect_type.call(this._handle, _arg, 1)
  }

  fun removeValidRightDisconnectType(type: Int) {
    val _arg = Variant.new(type)
    __method_bind.remove_valid_right_disconnect_type.call(this._handle, _arg, 1)
  }

  fun setConnectionActivity(
    from: String,
    fromPort: Int,
    to: String,
    toPort: Int,
    amount: Float
  ) {
    val _args = VariantArray.new()
    _args.append(from)
    _args.append(fromPort)
    _args.append(to)
    _args.append(toPort)
    _args.append(amount)
    __method_bind.set_connection_activity.call(this._handle, _args.toVariant(), 5)
  }

  fun setRightDisconnects(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.set_right_disconnects.call(this._handle, _arg, 1)
  }

  fun setScrollOfs(ofs: Vector2) {
    val _arg = Variant.new(ofs)
    __method_bind.set_scroll_ofs.call(this._handle, _arg, 1)
  }

  fun setSelected(node: Node) {
    val _arg = Variant.new(node)
    __method_bind.set_selected.call(this._handle, _arg, 1)
  }

  fun setSnap(pixels: Int) {
    val _arg = Variant.new(pixels)
    __method_bind.set_snap.call(this._handle, _arg, 1)
  }

  fun setUseSnap(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.set_use_snap.call(this._handle, _arg, 1)
  }

  fun setZoom(pZoom: Float) {
    val _arg = Variant.new(pZoom)
    __method_bind.set_zoom.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): GraphEdit = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("GraphEdit".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for GraphEdit" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      GraphEdit(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): GraphEdit = GraphEdit(ptr)
    /**
     * Container for method_bind pointers for GraphEdit
     */
    private object __method_bind {
      val add_valid_connection_type: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
            "add_valid_connection_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_valid_connection_type" }
        }
      val add_valid_left_disconnect_type: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
            "add_valid_left_disconnect_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_valid_left_disconnect_type" }
        }
      val add_valid_right_disconnect_type: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
            "add_valid_right_disconnect_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_valid_right_disconnect_type" }
        }
      val clear_connections: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
            "clear_connections".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear_connections" }
        }
      val connect_node: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
            "connect_node".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method connect_node" }
        }
      val disconnect_node: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
            "disconnect_node".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method disconnect_node" }
        }
      val get_connection_list: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
            "get_connection_list".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_connection_list" }
        }
      val get_scroll_ofs: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
            "get_scroll_ofs".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_scroll_ofs" }
        }
      val get_snap: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
            "get_snap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_snap" }
        }
      val get_zoom: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
            "get_zoom".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_zoom" }
        }
      val get_zoom_hbox: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
            "get_zoom_hbox".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_zoom_hbox" }
        }
      val is_node_connected: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
            "is_node_connected".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_node_connected" }
        }
      val is_right_disconnects_enabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
            "is_right_disconnects_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_right_disconnects_enabled" }
        }
      val is_using_snap: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
            "is_using_snap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_using_snap" }
        }
      val is_valid_connection_type: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
            "is_valid_connection_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_valid_connection_type" }
        }
      val remove_valid_connection_type: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
            "remove_valid_connection_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_valid_connection_type" }
        }
      val remove_valid_left_disconnect_type: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
            "remove_valid_left_disconnect_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_valid_left_disconnect_type"
            }
        }
      val remove_valid_right_disconnect_type: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
            "remove_valid_right_disconnect_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_valid_right_disconnect_type"
            }
        }
      val set_connection_activity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
            "set_connection_activity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_connection_activity" }
        }
      val set_right_disconnects: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
            "set_right_disconnects".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_right_disconnects" }
        }
      val set_scroll_ofs: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
            "set_scroll_ofs".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_scroll_ofs" }
        }
      val set_selected: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
            "set_selected".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_selected" }
        }
      val set_snap: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
            "set_snap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_snap" }
        }
      val set_use_snap: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
            "set_use_snap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_use_snap" }
        }
      val set_zoom: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
            "set_zoom".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_zoom" }
        }}
  }
}
