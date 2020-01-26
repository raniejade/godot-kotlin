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

open class ItemList internal constructor(
  _handle: COpaquePointer
) : Control(_handle) {
  enum class SelectMode(
    val value: Int
  ) {
    SELECT_SINGLE(0),

    SELECT_MULTI(1);
  }

  enum class IconMode(
    val value: Int
  ) {
    ICON_MODE_TOP(0),

    ICON_MODE_LEFT(1);
  }

  companion object {
    val ICON_MODE_LEFT: Int = 1

    val ICON_MODE_TOP: Int = 0

    val SELECT_MULTI: Int = 1

    val SELECT_SINGLE: Int = 0

    fun new(): ItemList = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("ItemList".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for ItemList" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      ItemList(
        fn()
      )
    }}
}
