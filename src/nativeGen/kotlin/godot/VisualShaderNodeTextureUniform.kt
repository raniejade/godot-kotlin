// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class VisualShaderNodeTextureUniform internal constructor(
  _handle: COpaquePointer
) : VisualShaderNodeUniform(_handle) {
  fun getColorDefault(): ColorDefault {
    val _ret = __method_bind.get_color_default.call(this.toVariant())
    return VisualShaderNodeTextureUniform.ColorDefault.from(_ret.asInt())
  }

  fun getTextureType(): TextureType {
    val _ret = __method_bind.get_texture_type.call(this.toVariant())
    return VisualShaderNodeTextureUniform.TextureType.from(_ret.asInt())
  }

  fun setColorDefault(type: Int) {
    val _args = VariantArray.new()
    _args.append(type)
    __method_bind.set_color_default.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setTextureType(type: Int) {
    val _args = VariantArray.new()
    _args.append(type)
    __method_bind.set_texture_type.call(this.toVariant(), _args.toVariant(), 1)
  }

  enum class TextureType(
    val value: Int
  ) {
    TYPE_DATA(0),

    TYPE_COLOR(1),

    TYPE_NORMALMAP(2),

    TYPE_ANISO(3);

    companion object {
      fun from(value: Int): TextureType {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  enum class ColorDefault(
    val value: Int
  ) {
    COLOR_DEFAULT_WHITE(0),

    COLOR_DEFAULT_BLACK(1);

    companion object {
      fun from(value: Int): ColorDefault {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  companion object {
    val COLOR_DEFAULT_BLACK: Int = 1

    val COLOR_DEFAULT_WHITE: Int = 0

    val TYPE_ANISO: Int = 3

    val TYPE_COLOR: Int = 1

    val TYPE_DATA: Int = 0

    val TYPE_NORMALMAP: Int = 2

    fun new(): VisualShaderNodeTextureUniform = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualShaderNodeTextureUniform".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton VisualShaderNodeTextureUniform" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualShaderNodeTextureUniform(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): VisualShaderNodeTextureUniform =
        VisualShaderNodeTextureUniform(ptr)
    /**
     * Container for method_bind pointers for VisualShaderNodeTextureUniform
     */
    private object __method_bind {
      val get_color_default: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeTextureUniform".cstr.ptr,
              "get_color_default".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_color_default" }
            }
          }

      val get_texture_type: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeTextureUniform".cstr.ptr,
              "get_texture_type".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_texture_type" }
            }
          }

      val set_color_default: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeTextureUniform".cstr.ptr,
              "set_color_default".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_color_default" }
            }
          }

      val set_texture_type: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeTextureUniform".cstr.ptr,
              "set_texture_type".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_texture_type" }
            }
          }
    }
  }
}
