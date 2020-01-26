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

open class MainLoop internal constructor(
  _handle: COpaquePointer
) : Object(_handle) {
  companion object {
    val NotificationCrash: Int = 1012

    val NotificationOsImeUpdate: Int = 1013

    val NotificationOsMemoryWarning: Int = 1009

    val NotificationTranslationChanged: Int = 1010

    val NotificationWmAbout: Int = 1011

    val NotificationWmFocusIn: Int = 1004

    val NotificationWmFocusOut: Int = 1005

    val NotificationWmGoBackRequest: Int = 1007

    val NotificationWmMouseEnter: Int = 1002

    val NotificationWmMouseExit: Int = 1003

    val NotificationWmQuitRequest: Int = 1006

    val NotificationWmUnfocusRequest: Int = 1008

    fun new(): MainLoop = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("MainLoop".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for MainLoop" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      MainLoop(
        fn()
      )
    }}
}
