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

open class PacketPeerGDNative internal constructor(
  _handle: COpaquePointer
) : PacketPeer(_handle) {
  companion object {
    fun new(): PacketPeerGDNative = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("PacketPeerGDNative".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton PacketPeerGDNative" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      PacketPeerGDNative(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): PacketPeerGDNative = PacketPeerGDNative(ptr)
    /**
     * Container for method_bind pointers for PacketPeerGDNative
     */
    private object __method_bind
  }
}
