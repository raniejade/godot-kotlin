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

open class VisualShaderNodeCubeMap(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : VisualShaderNode(null) {
  var cubeMap: CubeMap
    get() {
       return getCubeMap() 
    }
    set(value) {
      setCubeMap(value)
    }

  var source: Source
    get() {
       return getSource() 
    }
    set(value) {
      setSource(value.value)
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

  fun getCubeMap(): CubeMap {
    val _ret = __method_bind.getCubeMap.call(this._handle)
    return _ret.toAny() as CubeMap
  }

  fun getSource(): Source {
    val _ret = __method_bind.getSource.call(this._handle)
    return VisualShaderNodeCubeMap.Source.from(_ret.asInt())
  }

  fun getTextureType(): TextureType {
    val _ret = __method_bind.getTextureType.call(this._handle)
    return VisualShaderNodeCubeMap.TextureType.from(_ret.asInt())
  }

  fun setCubeMap(value: CubeMap) {
    val _arg = Variant(value)
    __method_bind.setCubeMap.call(this._handle, listOf(_arg))
  }

  fun setSource(value: Int) {
    val _arg = Variant(value)
    __method_bind.setSource.call(this._handle, listOf(_arg))
  }

  fun setTextureType(value: Int) {
    val _arg = Variant(value)
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

    PORT(1);

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
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualShaderNodeCubeMap".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisualShaderNodeCubeMap" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for VisualShaderNodeCubeMap
     */
    private object __method_bind {
      val getCubeMap: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeCubeMap".cstr.ptr,
            "get_cube_map".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_cube_map" }
        }
      val getSource: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeCubeMap".cstr.ptr,
            "get_source".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_source" }
        }
      val getTextureType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeCubeMap".cstr.ptr,
            "get_texture_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_texture_type" }
        }
      val setCubeMap: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeCubeMap".cstr.ptr,
            "set_cube_map".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_cube_map" }
        }
      val setSource: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeCubeMap".cstr.ptr,
            "set_source".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_source" }
        }
      val setTextureType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeCubeMap".cstr.ptr,
            "set_texture_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_texture_type" }
        }}
  }
}
