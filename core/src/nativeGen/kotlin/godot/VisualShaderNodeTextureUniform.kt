// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class VisualShaderNodeTextureUniform(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : VisualShaderNodeUniform(null) {
  var colorDefault: ColorDefault
    get() {
       return getColorDefault() 
    }
    set(value) {
      setColorDefault(value.value)
    }

  var textureType: TextureType
    get() {
       return getTextureType() 
    }
    set(value) {
      setTextureType(value.value)
    }

  constructor() : this(null) {
    _handle = __new()
  }

  fun getColorDefault(): ColorDefault {
    val _ret = __method_bind.getColorDefault.call(this._handle)
    return VisualShaderNodeTextureUniform.ColorDefault.from(_ret.asInt())
  }

  fun getTextureType(): TextureType {
    val _ret = __method_bind.getTextureType.call(this._handle)
    return VisualShaderNodeTextureUniform.TextureType.from(_ret.asInt())
  }

  fun setColorDefault(type: Int) {
    val _arg = Variant.new(type)
    __method_bind.setColorDefault.call(this._handle, listOf(_arg))
  }

  fun setTextureType(type: Int) {
    val _arg = Variant.new(type)
    __method_bind.setTextureType.call(this._handle, listOf(_arg))
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
    WHITE(0),

    BLACK(1);

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
    internal fun __new(): COpaquePointer = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualShaderNodeTextureUniform".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisualShaderNodeTextureUniform" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for VisualShaderNodeTextureUniform
     */
    private object __method_bind {
      val getColorDefault: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeTextureUniform".cstr.ptr,
            "get_color_default".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_color_default" }
        }
      val getTextureType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeTextureUniform".cstr.ptr,
            "get_texture_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_texture_type" }
        }
      val setColorDefault: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeTextureUniform".cstr.ptr,
            "set_color_default".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_color_default" }
        }
      val setTextureType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeTextureUniform".cstr.ptr,
            "set_texture_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_texture_type" }
        }}
  }
}
