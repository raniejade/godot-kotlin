// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class MultiplayerPeerGDNative internal constructor(
  _handle: COpaquePointer
) : NetworkedMultiplayerPeer(_handle) {
  companion object {
    fun new(): MultiplayerPeerGDNative = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("MultiplayerPeerGDNative".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton MultiplayerPeerGDNative" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      MultiplayerPeerGDNative(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): MultiplayerPeerGDNative = MultiplayerPeerGDNative(ptr)
    /**
     * Container for method_bind pointers for MultiplayerPeerGDNative
     */
    private object __method_bind
  }
}
