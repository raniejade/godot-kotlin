// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class VisualShaderNodeTexture internal constructor(
  _handle: COpaquePointer
) : VisualShaderNode(_handle) {
  fun getSource(): VisualShaderNodeTexture.Source {
    TODO()
  }

  fun getTexture(): Texture {
    TODO()
  }

  fun getTextureType(): VisualShaderNodeTexture.TextureType {
    TODO()
  }

  fun setSource() {
    TODO()
  }

  fun setTexture() {
    TODO()
  }

  fun setTextureType() {
    TODO()
  }

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
      requireNotNull(fnPtr) { "No instance found for singleton VisualShaderNodeTexture" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualShaderNodeTexture(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for VisualShaderNodeTexture
     */
    private object __method_bind {
      val get_source: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeTexture".cstr.ptr,
              "get_source".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_source" }
            }
          }

      val get_texture: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeTexture".cstr.ptr,
              "get_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_texture" }
            }
          }

      val get_texture_type: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeTexture".cstr.ptr,
              "get_texture_type".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_texture_type" }
            }
          }

      val set_source: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeTexture".cstr.ptr,
              "set_source".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_source" }
            }
          }

      val set_texture: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeTexture".cstr.ptr,
              "set_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_texture" }
            }
          }

      val set_texture_type: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeTexture".cstr.ptr,
              "set_texture_type".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_texture_type" }
            }
          }
    }
  }
}
