package godot

import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import kotlinx.cinterop.*

fun godot_string.toKStringAndDestroy(): String {
  return Allocator.allocationScope {
    val localPtr = ptr
    val wdstr = (checkNotNull(Godot.gdnative.godot_string_wide_str))(localPtr)!!
    // drop the trailing \0
    // DO NOT CHANGE!
    val ret = wdstr.reinterpret<IntVar>().toKStringFromUtf32().dropLast(1)
    checkNotNull(Godot.gdnative.godot_string_destroy)(localPtr)
    ret
  }
}