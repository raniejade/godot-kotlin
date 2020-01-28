// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class ShaderMaterial(
  _handle: COpaquePointer
) : Material(_handle) {
  var shader: Shader
    get() {
       return getShader() 
    }
    set(value) {
      setShader(value)
    }

  fun getShader(): Shader {
    val _ret = __method_bind.getShader.call(this._handle)
    return _ret.asObject(::Shader)!!
  }

  fun getShaderParam(param: String): Variant {
    val _arg = Variant.new(param)
    val _ret = __method_bind.getShaderParam.call(this._handle, _arg, 1)
    return _ret
  }

  fun propertyCanRevert(name: String): Boolean {
    val _arg = Variant.new(name)
    val _ret = __method_bind.propertyCanRevert.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun propertyGetRevert(name: String): Variant {
    val _arg = Variant.new(name)
    val _ret = __method_bind.propertyGetRevert.call(this._handle, _arg, 1)
    return _ret
  }

  fun setShader(shader: Shader) {
    val _arg = Variant.new(shader)
    __method_bind.setShader.call(this._handle, _arg, 1)
  }

  fun setShaderParam(param: String, value: Variant) {
    val _args = VariantArray.new()
    _args.append(param)
    _args.append(value)
    __method_bind.setShaderParam.call(this._handle, _args.toVariant(), 2)
  }

  companion object {
    fun new(): ShaderMaterial = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("ShaderMaterial".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for ShaderMaterial" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      ShaderMaterial(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): ShaderMaterial = ShaderMaterial(ptr)
    /**
     * Container for method_bind pointers for ShaderMaterial
     */
    private object __method_bind {
      val getShader: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ShaderMaterial".cstr.ptr,
            "getShader".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getShader" }
        }
      val getShaderParam: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ShaderMaterial".cstr.ptr,
            "getShaderParam".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getShaderParam" }
        }
      val propertyCanRevert: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ShaderMaterial".cstr.ptr,
            "propertyCanRevert".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method propertyCanRevert" }
        }
      val propertyGetRevert: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ShaderMaterial".cstr.ptr,
            "propertyGetRevert".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method propertyGetRevert" }
        }
      val setShader: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ShaderMaterial".cstr.ptr,
            "setShader".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setShader" }
        }
      val setShaderParam: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ShaderMaterial".cstr.ptr,
            "setShaderParam".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setShaderParam" }
        }}
  }
}
