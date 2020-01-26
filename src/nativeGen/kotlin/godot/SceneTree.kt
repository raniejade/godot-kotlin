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

open class SceneTree internal constructor(
  _handle: COpaquePointer
) : MainLoop(_handle) {
  companion object {
    val GroupCallDefault: Int = 0

    val GroupCallRealtime: Int = 2

    val GroupCallReverse: Int = 1

    val GroupCallUnique: Int = 4

    val StretchAspectExpand: Int = 4

    val StretchAspectIgnore: Int = 0

    val StretchAspectKeep: Int = 1

    val StretchAspectKeepHeight: Int = 3

    val StretchAspectKeepWidth: Int = 2

    val StretchMode2d: Int = 1

    val StretchModeDisabled: Int = 0

    val StretchModeViewport: Int = 2

    fun new(): SceneTree = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("SceneTree".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for SceneTree" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      SceneTree(
        fn()
      )
    }}
}
