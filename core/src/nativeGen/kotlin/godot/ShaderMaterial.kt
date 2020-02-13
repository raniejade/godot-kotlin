// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
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

open class ShaderMaterial(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Material(null) {
  var shader: Shader
    get() {
       return getShader() 
    }
    set(value) {
      setShader(value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  open fun _shader_changed() {
    TODO()
  }

  fun getShader(): Shader {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Shader
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getShader.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<Shader>(_tmp.value!!)
      _ret
    }
  }

  fun getShaderParam(param: String): Variant {
    val self = this
    return Allocator.allocationScope {
      val _ret = Variant()
      val _retPtr = _ret._value.ptr
      __method_bind.getShaderParam.call(self._handle, listOf(param), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun propertyCanRevert(name: String): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.propertyCanRevert.call(self._handle, listOf(name), _retPtr)
      _ret.value
    }
  }

  fun propertyGetRevert(name: String): Variant {
    val self = this
    return Allocator.allocationScope {
      val _ret = Variant()
      val _retPtr = _ret._value.ptr
      __method_bind.propertyGetRevert.call(self._handle, listOf(name), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun setShader(shader: Shader) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setShader.call(self._handle, listOf(shader), null)
    }
  }

  fun setShaderParam(param: String, value: Variant) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(param)
      _args.add(value)
      __method_bind.setShaderParam.call(self._handle, _args, null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("ShaderMaterial".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for ShaderMaterial" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for ShaderMaterial
     */
    private object __method_bind {
      val getShader: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ShaderMaterial".cstr.ptr,
            "get_shader".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_shader" }
        }
      val getShaderParam: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ShaderMaterial".cstr.ptr,
            "get_shader_param".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_shader_param" }
        }
      val propertyCanRevert: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ShaderMaterial".cstr.ptr,
            "property_can_revert".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method property_can_revert" }
        }
      val propertyGetRevert: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ShaderMaterial".cstr.ptr,
            "property_get_revert".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method property_get_revert" }
        }
      val setShader: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ShaderMaterial".cstr.ptr,
            "set_shader".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_shader" }
        }
      val setShaderParam: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ShaderMaterial".cstr.ptr,
            "set_shader_param".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_shader_param" }
        }}
  }
}
