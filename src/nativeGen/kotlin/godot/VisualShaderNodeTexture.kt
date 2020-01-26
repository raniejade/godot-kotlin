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

open class VisualShaderNodeTexture internal constructor(
  _handle: COpaquePointer
) : VisualShaderNode(_handle) {
  enum class TextureType(
    val value: Int
  ) {
    TYPE_DATA(0),

    TYPE_COLOR(1),

    TYPE_NORMALMAP(2);
  }

  enum class Source(
    val value: Int
  ) {
    SOURCE_TEXTURE(0),

    SOURCE_SCREEN(1),

    SOURCE_2D_TEXTURE(2),

    SOURCE_2D_NORMAL(3);
  }

  companion object {
    val SOURCE_2D_NORMAL: Int = 3

    val SOURCE_2D_TEXTURE: Int = 2

    val SOURCE_SCREEN: Int = 1

    val SOURCE_TEXTURE: Int = 0

    val TYPE_COLOR: Int = 1

    val TYPE_DATA: Int = 0

    val TYPE_NORMALMAP: Int = 2

    fun new(): VisualShaderNodeTexture = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualShaderNodeTexture".cstr.ptr)
      requireNotNull(fnPtr) { "No constructor found for VisualShaderNodeTexture" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualShaderNodeTexture(
        fn()
      )
    }}
}
