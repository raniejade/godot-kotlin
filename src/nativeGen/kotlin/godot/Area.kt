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

open class Area internal constructor(
  _handle: COpaquePointer
) : CollisionObject(_handle) {
  companion object {
    val SpaceOverrideCombine: Int = 1

    val SpaceOverrideCombineReplace: Int = 2

    val SpaceOverrideDisabled: Int = 0

    val SpaceOverrideReplace: Int = 3

    val SpaceOverrideReplaceCombine: Int = 4

    fun new(): Area = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Area".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for Area" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()

      Area(
        fn()
      )
    }}
}
