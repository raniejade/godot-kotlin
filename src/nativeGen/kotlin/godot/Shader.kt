// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class Shader internal constructor(
  _handle: COpaquePointer
) : Resource(_handle) {
  enum class Mode(
    val value: Int
  ) {
    MODE_SPATIAL(0),

    MODE_CANVAS_ITEM(1),

    MODE_PARTICLES(2);
  }

  companion object {
    val MODE_CANVAS_ITEM: Int = 1

    val MODE_PARTICLES: Int = 2

    val MODE_SPATIAL: Int = 0

    fun new(): Shader = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Shader".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton Shader" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Shader(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for Shader
     */
    private object __method_bind {
      val get_code: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Shader".cstr.ptr,
              "get_code".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_code" }
            }
          }

      val get_default_texture_param: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Shader".cstr.ptr,
              "get_default_texture_param".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_default_texture_param" }
            }
          }

      val get_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Shader".cstr.ptr,
              "get_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_mode" }
            }
          }

      val has_param: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Shader".cstr.ptr,
              "has_param".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_param" }
            }
          }

      val set_code: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Shader".cstr.ptr,
              "set_code".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_code" }
            }
          }

      val set_default_texture_param: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Shader".cstr.ptr,
              "set_default_texture_param".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_default_texture_param" }
            }
          }
    }
  }
}
