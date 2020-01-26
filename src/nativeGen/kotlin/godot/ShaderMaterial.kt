// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
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
    /**
     * Container for method_bind pointers for ShaderMaterial
     */
    private object __method_bind {
      val _shader_changed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ShaderMaterial".cstr.ptr,
              "_shader_changed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _shader_changed" }
            }
          }

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
