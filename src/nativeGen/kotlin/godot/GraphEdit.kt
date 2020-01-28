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
import kotlin.Unit
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
   * Specialized setter for scrollOffset
   */
  fun scrollOffset(cb: Vector2.() -> Unit) {
    val _p = scrollOffset
    cb(_p)
    scrollOffset = _p
  }

  fun addValidConnectionType(fromType: Int, toType: Int) {
    val _args = VariantArray.new()
    _args.append(fromType)
    _args.append(toType)
    __method_bind.addValidConnectionType.call(this._handle, _args.toVariant(), 2)
  }

  fun addValidLeftDisconnectType(type: Int) {
    val _arg = Variant.new(type)
    __method_bind.addValidLeftDisconnectType.call(this._handle, _arg, 1)
  }

  fun addValidRightDisconnectType(type: Int) {
    val _arg = Variant.new(type)
    __method_bind.addValidRightDisconnectType.call(this._handle, _arg, 1)
  }

  fun clearConnections() {
    __method_bind.clearConnections.call(this._handle)
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
    val _ret = __method_bind.connectNode.call(this._handle, _args.toVariant(), 4)
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
    __method_bind.disconnectNode.call(this._handle, _args.toVariant(), 4)
  }

  fun getConnectionList(): VariantArray {
    val _ret = __method_bind.getConnectionList.call(this._handle)
    return _ret.asVariantArray()
  }

  fun getScrollOfs(): Vector2 {
    val _ret = __method_bind.getScrollOfs.call(this._handle)
    return _ret.asVector2()
  }

  fun getSnap(): Int {
    val _ret = __method_bind.getSnap.call(this._handle)
    return _ret.asInt()
  }

  fun getZoom(): Float {
    val _ret = __method_bind.getZoom.call(this._handle)
    return _ret.asFloat()
  }

  fun getZoomHbox(): HBoxContainer {
    val _ret = __method_bind.getZoomHbox.call(this._handle)
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
    val _ret = __method_bind.isNodeConnected.call(this._handle, _args.toVariant(), 4)
    return _ret.asBoolean()
  }

  fun isRightDisconnectsEnabled(): Boolean {
    val _ret = __method_bind.isRightDisconnectsEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun isUsingSnap(): Boolean {
    val _ret = __method_bind.isUsingSnap.call(this._handle)
    return _ret.asBoolean()
  }

  fun isValidConnectionType(fromType: Int, toType: Int): Boolean {
    val _args = VariantArray.new()
    _args.append(fromType)
    _args.append(toType)
    val _ret = __method_bind.isValidConnectionType.call(this._handle, _args.toVariant(), 2)
    return _ret.asBoolean()
  }

  fun removeValidConnectionType(fromType: Int, toType: Int) {
    val _args = VariantArray.new()
    _args.append(fromType)
    _args.append(toType)
    __method_bind.removeValidConnectionType.call(this._handle, _args.toVariant(), 2)
  }

  fun removeValidLeftDisconnectType(type: Int) {
    val _arg = Variant.new(type)
    __method_bind.removeValidLeftDisconnectType.call(this._handle, _arg, 1)
  }

  fun removeValidRightDisconnectType(type: Int) {
    val _arg = Variant.new(type)
    __method_bind.removeValidRightDisconnectType.call(this._handle, _arg, 1)
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
    __method_bind.setConnectionActivity.call(this._handle, _args.toVariant(), 5)
  }

  fun setRightDisconnects(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setRightDisconnects.call(this._handle, _arg, 1)
  }

  fun setScrollOfs(ofs: Vector2) {
    val _arg = Variant.new(ofs)
    __method_bind.setScrollOfs.call(this._handle, _arg, 1)
  }

  fun setSelected(node: Node) {
    val _arg = Variant.new(node)
    __method_bind.setSelected.call(this._handle, _arg, 1)
  }

  fun setSnap(pixels: Int) {
    val _arg = Variant.new(pixels)
    __method_bind.setSnap.call(this._handle, _arg, 1)
  }

  fun setUseSnap(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setUseSnap.call(this._handle, _arg, 1)
  }

  fun setZoom(pZoom: Float) {
    val _arg = Variant.new(pZoom)
    __method_bind.setZoom.call(this._handle, _arg, 1)
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
      val addValidConnectionType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
            "add_valid_connection_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_valid_connection_type" }
        }
      val addValidLeftDisconnectType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
            "add_valid_left_disconnect_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_valid_left_disconnect_type" }
        }
      val addValidRightDisconnectType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
            "add_valid_right_disconnect_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_valid_right_disconnect_type" }
        }
      val clearConnections: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
            "clear_connections".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear_connections" }
        }
      val connectNode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
            "connect_node".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method connect_node" }
        }
      val disconnectNode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
            "disconnect_node".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method disconnect_node" }
        }
      val getConnectionList: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
            "get_connection_list".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_connection_list" }
        }
      val getScrollOfs: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
            "get_scroll_ofs".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_scroll_ofs" }
        }
      val getSnap: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
            "get_snap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_snap" }
        }
      val getZoom: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
            "get_zoom".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_zoom" }
        }
      val getZoomHbox: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
            "get_zoom_hbox".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_zoom_hbox" }
        }
      val isNodeConnected: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
            "is_node_connected".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_node_connected" }
        }
      val isRightDisconnectsEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
            "is_right_disconnects_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_right_disconnects_enabled" }
        }
      val isUsingSnap: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
            "is_using_snap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_using_snap" }
        }
      val isValidConnectionType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
            "is_valid_connection_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_valid_connection_type" }
        }
      val removeValidConnectionType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
            "remove_valid_connection_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_valid_connection_type" }
        }
      val removeValidLeftDisconnectType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
            "remove_valid_left_disconnect_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_valid_left_disconnect_type"
            }
        }
      val removeValidRightDisconnectType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
            "remove_valid_right_disconnect_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_valid_right_disconnect_type"
            }
        }
      val setConnectionActivity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
            "set_connection_activity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_connection_activity" }
        }
      val setRightDisconnects: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
            "set_right_disconnects".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_right_disconnects" }
        }
      val setScrollOfs: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
            "set_scroll_ofs".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_scroll_ofs" }
        }
      val setSelected: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
            "set_selected".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_selected" }
        }
      val setSnap: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
            "set_snap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_snap" }
        }
      val setUseSnap: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
            "set_use_snap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_use_snap" }
        }
      val setZoom: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
            "set_zoom".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_zoom" }
        }}
  }
}
