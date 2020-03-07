// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
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
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getCode.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getDefaultTextureParam(param: String): Texture {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Texture
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getDefaultTextureParam.call(self._handle, listOf(param), _retPtr)
      _ret = objectToType<Texture>(_tmp.value!!)
      _ret
    }
  }

  fun getMode(): Mode {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getMode.call(self._handle, emptyList(), _retPtr)
      Shader.Mode.from(_ret.value)
    }
  }

  fun hasParam(name: String): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.hasParam.call(self._handle, listOf(name), _retPtr)
      _ret.value
    }
  }

  fun setCode(code: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setCode.call(self._handle, listOf(code), null)
    }
  }

  fun setDefaultTextureParam(param: String, texture: Texture) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(param)
      _args.add(texture)
      __method_bind.setDefaultTextureParam.call(self._handle, _args, null)
    }
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
      val getCode: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Shader".cstr.ptr,
              "get_code".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_code" }
            }
          }

      val getDefaultTextureParam: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Shader".cstr.ptr,
              "get_default_texture_param".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_default_texture_param" }
            }
          }

      val getMode: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Shader".cstr.ptr,
              "get_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_mode" }
            }
          }

      val hasParam: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Shader".cstr.ptr,
              "has_param".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_param" }
            }
          }

      val setCode: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Shader".cstr.ptr,
              "set_code".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_code" }
            }
          }

      val setDefaultTextureParam: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Shader".cstr.ptr,
              "set_default_texture_param".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_default_texture_param" }
            }
          }
    }
  }
}
