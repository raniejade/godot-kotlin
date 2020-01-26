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

open class Popup internal constructor(
  _handle: COpaquePointer
) : Control(_handle) {
  companion object {
    val NotificationPopupHide: Int = 81

    val NotificationPostPopup: Int = 80

    fun new(): Popup = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Popup".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for Popup" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()

      Popup(
        fn()
      )
    }}
}
