// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.GDError
import godot.core.Godot
import godot.core.PoolByteArray
import godot.core.PoolIntArray
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class MultiplayerAPI(
  _handle: COpaquePointer
) : Reference(_handle) {
  var allowObjectDecoding: Boolean
    get() {
       return isObjectDecodingAllowed() 
    }
    set(value) {
      setAllowObjectDecoding(value)
    }

  var networkPeer: NetworkedMultiplayerPeer
    get() {
       return getNetworkPeer() 
    }
    set(value) {
      setNetworkPeer(value)
    }

  var refuseNewNetworkConnections: Boolean
    get() {
       return isRefusingNewNetworkConnections() 
    }
    set(value) {
      setRefuseNewNetworkConnections(value)
    }

  fun clear() {
    __method_bind.clear.call(this._handle)
  }

  fun getNetworkConnectedPeers(): PoolIntArray {
    val _ret = __method_bind.getNetworkConnectedPeers.call(this._handle)
    return _ret.asPoolIntArray()
  }

  fun getNetworkPeer(): NetworkedMultiplayerPeer {
    val _ret = __method_bind.getNetworkPeer.call(this._handle)
    return _ret.asObject(::NetworkedMultiplayerPeer)!!
  }

  fun getNetworkUniqueId(): Int {
    val _ret = __method_bind.getNetworkUniqueId.call(this._handle)
    return _ret.asInt()
  }

  fun getRpcSenderId(): Int {
    val _ret = __method_bind.getRpcSenderId.call(this._handle)
    return _ret.asInt()
  }

  fun hasNetworkPeer(): Boolean {
    val _ret = __method_bind.hasNetworkPeer.call(this._handle)
    return _ret.asBoolean()
  }

  fun isNetworkServer(): Boolean {
    val _ret = __method_bind.isNetworkServer.call(this._handle)
    return _ret.asBoolean()
  }

  fun isObjectDecodingAllowed(): Boolean {
    val _ret = __method_bind.isObjectDecodingAllowed.call(this._handle)
    return _ret.asBoolean()
  }

  fun isRefusingNewNetworkConnections(): Boolean {
    val _ret = __method_bind.isRefusingNewNetworkConnections.call(this._handle)
    return _ret.asBoolean()
  }

  fun poll() {
    __method_bind.poll.call(this._handle)
  }

  fun sendBytes(
    bytes: PoolByteArray,
    id: Int,
    mode: Int
  ): GDError {
    val _args = VariantArray.new()
    _args.append(bytes)
    _args.append(id)
    _args.append(mode)
    val _ret = __method_bind.sendBytes.call(this._handle, _args.toVariant(), 3)
    return GDError.from(_ret.asInt())
  }

  fun setAllowObjectDecoding(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setAllowObjectDecoding.call(this._handle, _arg, 1)
  }

  fun setNetworkPeer(peer: NetworkedMultiplayerPeer) {
    val _arg = Variant.new(peer)
    __method_bind.setNetworkPeer.call(this._handle, _arg, 1)
  }

  fun setRefuseNewNetworkConnections(refuse: Boolean) {
    val _arg = Variant.new(refuse)
    __method_bind.setRefuseNewNetworkConnections.call(this._handle, _arg, 1)
  }

  fun setRootNode(node: Node) {
    val _arg = Variant.new(node)
    __method_bind.setRootNode.call(this._handle, _arg, 1)
  }

  enum class RPCMode(
    val value: Int
  ) {
    RPC_MODE_DISABLED(0),

    RPC_MODE_REMOTE(1),

    RPC_MODE_MASTER(2),

    RPC_MODE_PUPPET(3),

    RPC_MODE_SLAVE(3),

    RPC_MODE_REMOTESYNC(4),

    RPC_MODE_SYNC(4),

    RPC_MODE_MASTERSYNC(5),

    RPC_MODE_PUPPETSYNC(6);

    companion object {
      fun from(value: Int): RPCMode {
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
    val RPC_MODE_DISABLED: Int = 0

    val RPC_MODE_MASTER: Int = 2

    val RPC_MODE_MASTERSYNC: Int = 5

    val RPC_MODE_PUPPET: Int = 3

    val RPC_MODE_PUPPETSYNC: Int = 6

    val RPC_MODE_REMOTE: Int = 1

    val RPC_MODE_REMOTESYNC: Int = 4

    val RPC_MODE_SLAVE: Int = 3

    val RPC_MODE_SYNC: Int = 4

    fun new(): MultiplayerAPI = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("MultiplayerAPI".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for MultiplayerAPI" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      MultiplayerAPI(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): MultiplayerAPI = MultiplayerAPI(ptr)
    /**
     * Container for method_bind pointers for MultiplayerAPI
     */
    private object __method_bind {
      val clear: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiplayerAPI".cstr.ptr,
            "clear".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear" }
        }
      val getNetworkConnectedPeers: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiplayerAPI".cstr.ptr,
            "getNetworkConnectedPeers".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getNetworkConnectedPeers" }
        }
      val getNetworkPeer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiplayerAPI".cstr.ptr,
            "getNetworkPeer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getNetworkPeer" }
        }
      val getNetworkUniqueId: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiplayerAPI".cstr.ptr,
            "getNetworkUniqueId".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getNetworkUniqueId" }
        }
      val getRpcSenderId: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiplayerAPI".cstr.ptr,
            "getRpcSenderId".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getRpcSenderId" }
        }
      val hasNetworkPeer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiplayerAPI".cstr.ptr,
            "hasNetworkPeer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method hasNetworkPeer" }
        }
      val isNetworkServer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiplayerAPI".cstr.ptr,
            "isNetworkServer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isNetworkServer" }
        }
      val isObjectDecodingAllowed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiplayerAPI".cstr.ptr,
            "isObjectDecodingAllowed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isObjectDecodingAllowed" }
        }
      val isRefusingNewNetworkConnections: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiplayerAPI".cstr.ptr,
            "isRefusingNewNetworkConnections".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isRefusingNewNetworkConnections" }
        }
      val poll: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiplayerAPI".cstr.ptr,
            "poll".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method poll" }
        }
      val sendBytes: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiplayerAPI".cstr.ptr,
            "sendBytes".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method sendBytes" }
        }
      val setAllowObjectDecoding: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiplayerAPI".cstr.ptr,
            "setAllowObjectDecoding".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setAllowObjectDecoding" }
        }
      val setNetworkPeer: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiplayerAPI".cstr.ptr,
            "setNetworkPeer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setNetworkPeer" }
        }
      val setRefuseNewNetworkConnections: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiplayerAPI".cstr.ptr,
            "setRefuseNewNetworkConnections".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setRefuseNewNetworkConnections" }
        }
      val setRootNode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("MultiplayerAPI".cstr.ptr,
            "setRootNode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setRootNode" }
        }}
  }
}
