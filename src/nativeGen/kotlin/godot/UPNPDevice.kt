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
  companion object {
    val IgdStatusDisconnected: Int = 5

    val IgdStatusHttpEmpty: Int = 2

    val IgdStatusHttpError: Int = 1

    val IgdStatusInvalidControl: Int = 7

    val IgdStatusMallocError: Int = 8

    val IgdStatusNoIgd: Int = 4

    val IgdStatusNoUrls: Int = 3

    val IgdStatusOk: Int = 0

    val IgdStatusUnknownDevice: Int = 6

    val IgdStatusUnknownError: Int = 9

    fun new(): UPNPDevice = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("UPNPDevice".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for UPNPDevice" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()

      UPNPDevice(
        fn()
      )
    }}
}
