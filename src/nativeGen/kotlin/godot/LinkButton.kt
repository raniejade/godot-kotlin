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

open class LinkButton internal constructor(
  _handle: COpaquePointer
) : BaseButton(_handle) {
  companion object {
    val UnderlineModeAlways: Int = 0

    val UnderlineModeNever: Int = 2

    val UnderlineModeOnHover: Int = 1

    fun new(): LinkButton = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("LinkButton".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for LinkButton" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()

      LinkButton(
        fn()
      )
    }}
}
