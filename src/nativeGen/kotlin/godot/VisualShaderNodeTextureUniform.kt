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

open class VisualShaderNodeTextureUniform(
  _handle: COpaquePointer
) : VisualShaderNodeUniform(_handle) {
  var colorDefault: Int
    get() {
       return VisualShaderNodeTextureUniform.ColorDefault.from(getColorDefault()) 
    }
    set(value) {
      setColorDefault(VisualShaderNodeTextureUniform.ColorDefault.from(value))
    }

  var textureType: Int
    get() {
       return VisualShaderNodeTextureUniform.TextureType.from(getTextureType()) 
    }
    set(value) {
      setTextureType(VisualShaderNodeTextureUniform.TextureType.from(value))
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
    __method_bind.setColorDefault.call(this._handle, _arg, 1)
  }

  fun setTextureType(type: Int) {
    val _arg = Variant.new(type)
    __method_bind.setTextureType.call(this._handle, _arg, 1)
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
      requireNotNull(fnPtr) { "No instance found for VisualShaderNodeTextureUniform" }
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
      val getColorDefault: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeTextureUniform".cstr.ptr,
            "getColorDefault".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getColorDefault" }
        }
      val getTextureType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeTextureUniform".cstr.ptr,
            "getTextureType".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTextureType" }
        }
      val setColorDefault: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeTextureUniform".cstr.ptr,
            "setColorDefault".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setColorDefault" }
        }
      val setTextureType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeTextureUniform".cstr.ptr,
            "setTextureType".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setTextureType" }
        }}
  }
}
