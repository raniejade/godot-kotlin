// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.reflect.KCallable
import kotlinx.cinterop.BooleanVar
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.COpaquePointerVar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.DoubleVar
import kotlinx.cinterop.IntVar
import kotlinx.cinterop.alloc
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.readValue
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.value

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
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getColorDefault(): ColorDefault {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getColorDefault.call(self._handle, emptyList(), _retPtr)
      VisualShaderNodeTextureUniform.ColorDefault.from(_ret.value)
    }
  }

  fun getTextureType(): TextureType {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getTextureType.call(self._handle, emptyList(), _retPtr)
      VisualShaderNodeTextureUniform.TextureType.from(_ret.value)
    }
  }

  fun setColorDefault(type: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setColorDefault.call(self._handle, listOf(type), null)
    }
  }

  fun setTextureType(type: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setTextureType.call(self._handle, listOf(type), null)
    }
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
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
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
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeTextureUniform".cstr.ptr,
            "get_color_default".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_color_default" }
        }
      val getTextureType: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeTextureUniform".cstr.ptr,
            "get_texture_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_texture_type" }
        }
      val setColorDefault: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeTextureUniform".cstr.ptr,
            "set_color_default".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_color_default" }
        }
      val setTextureType: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeTextureUniform".cstr.ptr,
            "set_texture_type".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_texture_type" }
        }}
  }
}
