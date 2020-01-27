// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
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

open class GraphEdit internal constructor(
  _handle: COpaquePointer
) : Control(_handle) {
  fun addValidConnectionType(fromType: Int, toType: Int) {
    val _args = VariantArray.new()
    _args.append(fromType)
    _args.append(toType)
    val _ret = __method_bind.add_valid_connection_type.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun addValidLeftDisconnectType(type: Int) {
    val _args = VariantArray.new()
    _args.append(type)
    val _ret = __method_bind.add_valid_left_disconnect_type.call(this.toVariant(),
        _args.toVariant(), 1)
    TODO()
  }

  fun addValidRightDisconnectType(type: Int) {
    val _args = VariantArray.new()
    _args.append(type)
    val _ret = __method_bind.add_valid_right_disconnect_type.call(this.toVariant(),
        _args.toVariant(), 1)
    TODO()
  }

  fun clearConnections() {
    val _ret = __method_bind.clear_connections.call(this.toVariant())
    TODO()
  }

  fun connectNode(
    from: String,
    fromPort: Int,
    to: String,
    toPort: Int
  ): Error {
    val _args = VariantArray.new()
    _args.append(from)
    _args.append(fromPort)
    _args.append(to)
    _args.append(toPort)
    val _ret = __method_bind.connect_node.call(this.toVariant(), _args.toVariant(), 4)
    TODO()
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
    val _ret = __method_bind.disconnect_node.call(this.toVariant(), _args.toVariant(), 4)
    TODO()
  }

  fun getConnectionList(): VariantArray {
    val _ret = __method_bind.get_connection_list.call(this.toVariant())
    TODO()
  }

  fun getScrollOfs(): Vector2 {
    val _ret = __method_bind.get_scroll_ofs.call(this.toVariant())
    TODO()
  }

  fun getSnap(): Int {
    val _ret = __method_bind.get_snap.call(this.toVariant())
    TODO()
  }

  fun getZoom(): Float {
    val _ret = __method_bind.get_zoom.call(this.toVariant())
    TODO()
  }

  fun getZoomHbox(): HBoxContainer {
    val _ret = __method_bind.get_zoom_hbox.call(this.toVariant())
    TODO()
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
    val _ret = __method_bind.is_node_connected.call(this.toVariant(), _args.toVariant(), 4)
    TODO()
  }

  fun isRightDisconnectsEnabled(): Boolean {
    val _ret = __method_bind.is_right_disconnects_enabled.call(this.toVariant())
    TODO()
  }

  fun isUsingSnap(): Boolean {
    val _ret = __method_bind.is_using_snap.call(this.toVariant())
    TODO()
  }

  fun isValidConnectionType(fromType: Int, toType: Int): Boolean {
    val _args = VariantArray.new()
    _args.append(fromType)
    _args.append(toType)
    val _ret = __method_bind.is_valid_connection_type.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun removeValidConnectionType(fromType: Int, toType: Int) {
    val _args = VariantArray.new()
    _args.append(fromType)
    _args.append(toType)
    val _ret = __method_bind.remove_valid_connection_type.call(this.toVariant(), _args.toVariant(),
        2)
    TODO()
  }

  fun removeValidLeftDisconnectType(type: Int) {
    val _args = VariantArray.new()
    _args.append(type)
    val _ret = __method_bind.remove_valid_left_disconnect_type.call(this.toVariant(),
        _args.toVariant(), 1)
    TODO()
  }

  fun removeValidRightDisconnectType(type: Int) {
    val _args = VariantArray.new()
    _args.append(type)
    val _ret = __method_bind.remove_valid_right_disconnect_type.call(this.toVariant(),
        _args.toVariant(), 1)
    TODO()
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
    val _ret = __method_bind.set_connection_activity.call(this.toVariant(), _args.toVariant(), 5)
    TODO()
  }

  fun setRightDisconnects(enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(enable)
    val _ret = __method_bind.set_right_disconnects.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setScrollOfs(ofs: Vector2) {
    val _args = VariantArray.new()
    _args.append(ofs)
    val _ret = __method_bind.set_scroll_ofs.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setSelected(node: Node) {
    val _args = VariantArray.new()
    _args.append(node)
    val _ret = __method_bind.set_selected.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setSnap(pixels: Int) {
    val _args = VariantArray.new()
    _args.append(pixels)
    val _ret = __method_bind.set_snap.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setUseSnap(enable: Boolean) {
    val _args = VariantArray.new()
    _args.append(enable)
    val _ret = __method_bind.set_use_snap.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setZoom(pZoom: Float) {
    val _args = VariantArray.new()
    _args.append(pZoom)
    val _ret = __method_bind.set_zoom.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  companion object {
    fun new(): GraphEdit = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("GraphEdit".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton GraphEdit" }
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
      val add_valid_connection_type: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
              "add_valid_connection_type".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_valid_connection_type" }
            }
          }

      val add_valid_left_disconnect_type: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
              "add_valid_left_disconnect_type".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_valid_left_disconnect_type"
              }
            }
          }

      val add_valid_right_disconnect_type: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
              "add_valid_right_disconnect_type".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method add_valid_right_disconnect_type" }
            }
          }

      val clear_connections: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
              "clear_connections".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clear_connections" }
            }
          }

      val connect_node: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
              "connect_node".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method connect_node" }
            }
          }

      val disconnect_node: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
              "disconnect_node".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method disconnect_node" }
            }
          }

      val get_connection_list: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
              "get_connection_list".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_connection_list" }
            }
          }

      val get_scroll_ofs: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
              "get_scroll_ofs".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_scroll_ofs" }
            }
          }

      val get_snap: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
              "get_snap".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_snap" }
            }
          }

      val get_zoom: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
              "get_zoom".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_zoom" }
            }
          }

      val get_zoom_hbox: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
              "get_zoom_hbox".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_zoom_hbox" }
            }
          }

      val is_node_connected: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
              "is_node_connected".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_node_connected" }
            }
          }

      val is_right_disconnects_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
              "is_right_disconnects_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_right_disconnects_enabled" }
            }
          }

      val is_using_snap: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
              "is_using_snap".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_using_snap" }
            }
          }

      val is_valid_connection_type: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
              "is_valid_connection_type".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_valid_connection_type" }
            }
          }

      val remove_valid_connection_type: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
              "remove_valid_connection_type".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_valid_connection_type" }
            }
          }

      val remove_valid_left_disconnect_type: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
              "remove_valid_left_disconnect_type".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method remove_valid_left_disconnect_type" }
            }
          }

      val remove_valid_right_disconnect_type: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
              "remove_valid_right_disconnect_type".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method remove_valid_right_disconnect_type" }
            }
          }

      val set_connection_activity: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
              "set_connection_activity".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_connection_activity" }
            }
          }

      val set_right_disconnects: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
              "set_right_disconnects".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_right_disconnects" }
            }
          }

      val set_scroll_ofs: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
              "set_scroll_ofs".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_scroll_ofs" }
            }
          }

      val set_selected: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
              "set_selected".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_selected" }
            }
          }

      val set_snap: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
              "set_snap".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_snap" }
            }
          }

      val set_use_snap: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
              "set_use_snap".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_use_snap" }
            }
          }

      val set_zoom: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
              "set_zoom".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_zoom" }
            }
          }
    }
  }
}
