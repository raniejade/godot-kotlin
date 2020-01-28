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

open class VisualShaderNodeTexture(
  _handle: COpaquePointer
) : VisualShaderNode(_handle) {
  var source: Int
    get() {
       return VisualShaderNodeTexture.Source.from(getSource()) 
    }
    set(value) {
      setSource(VisualShaderNodeTexture.Source.from(value))
    }

  var texture: Texture
    get() {
       return getTexture() 
    }
    set(value) {
      setTexture(value)
    }

  var textureType: Int
    get() {
       return VisualShaderNodeTexture.TextureType.from(getTextureType()) 
    }
    set(value) {
      setTextureType(VisualShaderNodeTexture.TextureType.from(value))
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
    __method_bind.setSource.call(this._handle, _arg, 1)
  }

  fun setTexture(value: Texture) {
    val _arg = Variant.new(value)
    __method_bind.setTexture.call(this._handle, _arg, 1)
  }

  fun setTextureType(value: Int) {
    val _arg = Variant.new(value)
    __method_bind.setTextureType.call(this._handle, _arg, 1)
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
    SOURCE_TEXTURE(0),

    SOURCE_SCREEN(1),

    SOURCE_2D_TEXTURE(2),

    SOURCE_2D_NORMAL(3);

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
      requireNotNull(fnPtr) { "No instance found for VisualShaderNodeTexture" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualShaderNodeTexture(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): VisualShaderNodeTexture = VisualShaderNodeTexture(ptr)
    /**
     * Container for method_bind pointers for VisualShaderNodeTexture
     */
    private object __method_bind {
      val getSource: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeTexture".cstr.ptr,
            "getSource".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getSource" }
        }
      val getTexture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeTexture".cstr.ptr,
            "getTexture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTexture" }
        }
      val getTextureType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeTexture".cstr.ptr,
            "getTextureType".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTextureType" }
        }
      val setSource: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeTexture".cstr.ptr,
            "setSource".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setSource" }
        }
      val setTexture: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeTexture".cstr.ptr,
            "setTexture".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setTexture" }
        }
      val setTextureType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeTexture".cstr.ptr,
            "setTextureType".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setTextureType" }
        }}
  }
}
