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

open class DynamicFontData internal constructor(
  _handle: COpaquePointer
) : Resource(_handle) {
  enum class Hinting(
    val value: Int
  ) {
    HINTING_NONE(0),

    HINTING_LIGHT(1),

    HINTING_NORMAL(2);
  }

  companion object {
    val HINTING_LIGHT: Int = 1

    val HINTING_NONE: Int = 0

    val HINTING_NORMAL: Int = 2

    fun new(): DynamicFontData = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("DynamicFontData".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for DynamicFontData" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      DynamicFontData(
        fn()
      )
    }}
}
