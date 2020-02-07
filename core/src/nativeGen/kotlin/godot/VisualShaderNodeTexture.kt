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

open class VisualShaderNodeTexture(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : VisualShaderNode(null) {
  var source: Source
    get() {
       return getSource() 
    }
    set(value) {
      setSource(value.value)
    }

  var texture: Texture
    get() {
       return getTexture() 
    }
    set(value) {
      setTexture(value)
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

  fun getSource(): Source {
    val _ret = __method_bind.getSource.call(this._handle)
    return VisualShaderNodeTexture.Source.from(_ret.asInt())
  }

  fun getTexture(): Texture {
    val _ret = __method_bind.getTexture.call(this._handle)
    return _ret.asObject(::Texture)!!
  }

  fun getTextureType(): TextureType {
    val _ret = __method_bind.getTextureType.call(this._handle)
    return VisualShaderNodeTexture.TextureType.from(_ret.asInt())
  }

  fun setSource(value: Int) {
    val _arg = Variant.new(value)
    __method_bind.setSource.call(this._handle, listOf(_arg))
  }

  fun setTexture(value: Texture) {
    val _arg = Variant.new(value)
    __method_bind.setTexture.call(this._handle, listOf(_arg))
  }

  fun setTextureType(value: Int) {
    val _arg = Variant.new(value)
    __method_bind.setTextureType.call(this._handle, listOf(_arg))
  }

  enum class TextureType(
    val value: Int
  ) {
    TYPE_DATA(0),

    TYPE_COLOR(1),

    TYPE_NORMALMAP(2);

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

  enum class Source(
    val value: Int
  ) {
    TEXTURE(0),

    SCREEN(1),

    `2D_TEXTURE`(2),

    `2D_NORMAL`(3),

    DEPTH(4),

    PORT(5);

    companion object {
      fun from(value: Int): Source {
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
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualShaderNodeTexture".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisualShaderNodeTexture" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for VisualShaderNodeTexture
     */
    private object __method_bind {
      val getSource: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeTexture".cstr.ptr,
            "get_source".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_source" }
        }
      val getTexture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeTexture".cstr.ptr,
            "get_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_texture" }
        }
      val getTextureType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeTexture".cstr.ptr,
            "get_texture_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_texture_type" }
        }
      val setSource: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeTexture".cstr.ptr,
            "set_source".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_source" }
        }
      val setTexture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeTexture".cstr.ptr,
            "set_texture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_texture" }
        }
      val setTextureType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeTexture".cstr.ptr,
            "set_texture_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_texture_type" }
        }}
  }
}
