// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
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

  fun getShader(): Shader {
    val _ret = __method_bind.getShader.call(this._handle)
    return _ret.toAny() as Shader
  }

  fun getShaderParam(param: String): Variant {
    val _arg = Variant(param)
    val _ret = __method_bind.getShaderParam.call(this._handle, listOf(_arg))
    return _ret
  }

  fun propertyCanRevert(name: String): Boolean {
    val _arg = Variant(name)
    val _ret = __method_bind.propertyCanRevert.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun propertyGetRevert(name: String): Variant {
    val _arg = Variant(name)
    val _ret = __method_bind.propertyGetRevert.call(this._handle, listOf(_arg))
    return _ret
  }

  fun setShader(shader: Shader) {
    val _arg = Variant(shader)
    __method_bind.setShader.call(this._handle, listOf(_arg))
  }

  fun setShaderParam(param: String, value: Variant) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(param))
    _args.add(Variant.fromAny(value))
    __method_bind.setShaderParam.call(this._handle, _args)
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
