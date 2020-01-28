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
            "addValidConnectionType".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addValidConnectionType" }
        }
      val addValidLeftDisconnectType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
            "addValidLeftDisconnectType".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addValidLeftDisconnectType" }
        }
      val addValidRightDisconnectType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
            "addValidRightDisconnectType".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method addValidRightDisconnectType" }
        }
      val clearConnections: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
            "clearConnections".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clearConnections" }
        }
      val connectNode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
            "connectNode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method connectNode" }
        }
      val disconnectNode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
            "disconnectNode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method disconnectNode" }
        }
      val getConnectionList: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
            "getConnectionList".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getConnectionList" }
        }
      val getScrollOfs: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
            "getScrollOfs".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getScrollOfs" }
        }
      val getSnap: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
            "getSnap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSnap" }
        }
      val getZoom: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
            "getZoom".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getZoom" }
        }
      val getZoomHbox: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
            "getZoomHbox".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getZoomHbox" }
        }
      val isNodeConnected: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
            "isNodeConnected".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isNodeConnected" }
        }
      val isRightDisconnectsEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
            "isRightDisconnectsEnabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isRightDisconnectsEnabled" }
        }
      val isUsingSnap: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
            "isUsingSnap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isUsingSnap" }
        }
      val isValidConnectionType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
            "isValidConnectionType".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isValidConnectionType" }
        }
      val removeValidConnectionType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
            "removeValidConnectionType".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method removeValidConnectionType" }
        }
      val removeValidLeftDisconnectType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
            "removeValidLeftDisconnectType".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method removeValidLeftDisconnectType" }
        }
      val removeValidRightDisconnectType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
            "removeValidRightDisconnectType".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method removeValidRightDisconnectType" }
        }
      val setConnectionActivity: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
            "setConnectionActivity".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setConnectionActivity" }
        }
      val setRightDisconnects: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
            "setRightDisconnects".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setRightDisconnects" }
        }
      val setScrollOfs: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
            "setScrollOfs".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setScrollOfs" }
        }
      val setSelected: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
            "setSelected".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSelected" }
        }
      val setSnap: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
            "setSnap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSnap" }
        }
      val setUseSnap: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
            "setUseSnap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setUseSnap" }
        }
      val setZoom: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("GraphEdit".cstr.ptr,
            "setZoom".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setZoom" }
        }}
  }
}
