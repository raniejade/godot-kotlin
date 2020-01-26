// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import godot.core.Godot
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class UPNPDevice internal constructor(
  _handle: COpaquePointer
) : Reference(_handle) {
  enum class IGDStatus(
    val value: Int
  ) {
    IGD_STATUS_OK(0),

    IGD_STATUS_HTTP_ERROR(1),

    IGD_STATUS_HTTP_EMPTY(2),

    IGD_STATUS_NO_URLS(3),

    IGD_STATUS_NO_IGD(4),

    IGD_STATUS_DISCONNECTED(5),

    IGD_STATUS_UNKNOWN_DEVICE(6),

    IGD_STATUS_INVALID_CONTROL(7),

    IGD_STATUS_MALLOC_ERROR(8),

    IGD_STATUS_UNKNOWN_ERROR(9);
  }

  companion object {
    val IGD_STATUS_DISCONNECTED: Int = 5

    val IGD_STATUS_HTTP_EMPTY: Int = 2

    val IGD_STATUS_HTTP_ERROR: Int = 1

    val IGD_STATUS_INVALID_CONTROL: Int = 7

    val IGD_STATUS_MALLOC_ERROR: Int = 8

    val IGD_STATUS_NO_IGD: Int = 4

    val IGD_STATUS_NO_URLS: Int = 3

    val IGD_STATUS_OK: Int = 0

    val IGD_STATUS_UNKNOWN_DEVICE: Int = 6

    val IGD_STATUS_UNKNOWN_ERROR: Int = 9

    fun new(): UPNPDevice = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("UPNPDevice".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for UPNPDevice" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      UPNPDevice(
        fn()
      )
    }}
}
