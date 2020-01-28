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

open class VisualShaderNodeCubeMap(
  _handle: COpaquePointer
) : VisualShaderNode(_handle) {
  var cubeMap: CubeMap
    get() {
       return getCubeMap() 
    }
    set(value) {
      setCubeMap(value)
    }

  var textureType: Int
    get() {
       return VisualShaderNodeCubeMap.TextureType.from(getTextureType()) 
    }
    set(value) {
      setTextureType(VisualShaderNodeCubeMap.TextureType.from(value))
    }

  fun getCubeMap(): CubeMap {
    val _ret = __method_bind.getCubeMap.call(this._handle)
    return _ret.asObject(::CubeMap)!!
  }

  fun getTextureType(): TextureType {
    val _ret = __method_bind.getTextureType.call(this._handle)
    return VisualShaderNodeCubeMap.TextureType.from(_ret.asInt())
  }

  fun setCubeMap(value: CubeMap) {
    val _arg = Variant.new(value)
    __method_bind.setCubeMap.call(this._handle, _arg, 1)
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

  companion object {
    val TYPE_COLOR: Int = 1

    val TYPE_DATA: Int = 0

    val TYPE_NORMALMAP: Int = 2

    fun new(): VisualShaderNodeCubeMap = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualShaderNodeCubeMap".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for VisualShaderNodeCubeMap" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualShaderNodeCubeMap(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): VisualShaderNodeCubeMap = VisualShaderNodeCubeMap(ptr)
    /**
     * Container for method_bind pointers for VisualShaderNodeCubeMap
     */
    private object __method_bind {
      val getCubeMap: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeCubeMap".cstr.ptr,
            "getCubeMap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getCubeMap" }
        }
      val getTextureType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeCubeMap".cstr.ptr,
            "getTextureType".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getTextureType" }
        }
      val setCubeMap: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeCubeMap".cstr.ptr,
            "setCubeMap".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setCubeMap" }
        }
      val setTextureType: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeCubeMap".cstr.ptr,
            "setTextureType".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setTextureType" }
        }}
  }
}
