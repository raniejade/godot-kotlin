// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import kotlin.Boolean
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class ShaderMaterial internal constructor(
  _handle: COpaquePointer
) : Material(_handle) {
  fun getShader(): Shader {
    TODO()
  }

  fun getShaderParam(param: String): Variant {
    TODO()
  }

  fun propertyCanRevert(name: String): Boolean {
    TODO()
  }

  fun propertyGetRevert(name: String): Variant {
    TODO()
  }

  fun setShader(shader: Shader) {
    TODO()
  }

  fun setShaderParam(param: String, value: Variant) {
    TODO()
  }

  companion object {
    fun new(): ShaderMaterial = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("ShaderMaterial".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton ShaderMaterial" }
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
      val get_shader: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ShaderMaterial".cstr.ptr,
              "get_shader".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_shader" }
            }
          }

      val get_shader_param: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ShaderMaterial".cstr.ptr,
              "get_shader_param".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_shader_param" }
            }
          }

      val property_can_revert: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ShaderMaterial".cstr.ptr,
              "property_can_revert".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method property_can_revert" }
            }
          }

      val property_get_revert: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ShaderMaterial".cstr.ptr,
              "property_get_revert".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method property_get_revert" }
            }
          }

      val set_shader: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ShaderMaterial".cstr.ptr,
              "set_shader".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_shader" }
            }
          }

      val set_shader_param: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ShaderMaterial".cstr.ptr,
              "set_shader_param".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_shader_param" }
            }
          }
    }
  }
}
