// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
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

open class Shader(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Resource(null) {
  var code: String
    get() {
       return getCode() 
    }
    set(value) {
      setCode(value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getCode(): String {
    val _ret = __method_bind.getCode.call(this._handle)
    return _ret.asString()
  }

  fun getDefaultTextureParam(param: String): Texture {
    val _arg = Variant(param)
    val _ret = __method_bind.getDefaultTextureParam.call(this._handle, listOf(_arg))
    return _ret.toAny() as Texture
  }

  fun getMode(): Mode {
    val _ret = __method_bind.getMode.call(this._handle)
    return Shader.Mode.from(_ret.asInt())
  }

  fun hasParam(name: String): Boolean {
    val _arg = Variant(name)
    val _ret = __method_bind.hasParam.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun setCode(code: String) {
    val _arg = Variant(code)
    __method_bind.setCode.call(this._handle, listOf(_arg))
  }

  fun setDefaultTextureParam(param: String, texture: Texture) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(param))
    _args.add(Variant.fromAny(texture))
    __method_bind.setDefaultTextureParam.call(this._handle, _args)
  }

  enum class Mode(
    val value: Int
  ) {
    SPATIAL(0),

    CANVAS_ITEM(1),

    PARTICLES(2);

    companion object {
      fun from(value: Int): Mode {
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
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Shader".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for Shader" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for Shader
     */
    private object __method_bind {
      val getCode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Shader".cstr.ptr,
            "get_code".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_code" }
        }
      val getDefaultTextureParam: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Shader".cstr.ptr,
            "get_default_texture_param".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_default_texture_param" }
        }
      val getMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Shader".cstr.ptr,
            "get_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_mode" }
        }
      val hasParam: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Shader".cstr.ptr,
            "has_param".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_param" }
        }
      val setCode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Shader".cstr.ptr,
            "set_code".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_code" }
        }
      val setDefaultTextureParam: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Shader".cstr.ptr,
            "set_default_texture_param".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_default_texture_param" }
        }}
  }
}
