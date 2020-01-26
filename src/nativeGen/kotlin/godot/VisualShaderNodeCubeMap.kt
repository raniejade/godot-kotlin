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

open class VisualShaderNodeCubeMap internal constructor(
  _handle: COpaquePointer
) : VisualShaderNode(_handle) {
  fun getCubeMap(): CubeMap {
    TODO()
  }

  fun getTextureType(): TextureType {
    TODO()
  }

  fun setCubeMap(value: CubeMap) {
    TODO()
  }

  fun setTextureType(value: Int) {
    TODO()
  }

  enum class TextureType(
    val value: Int
  ) {
    TYPE_DATA(0),

    TYPE_COLOR(1),

    TYPE_NORMALMAP(2);
  }

  companion object {
    val TYPE_COLOR: Int = 1

    val TYPE_DATA: Int = 0

    val TYPE_NORMALMAP: Int = 2

    fun new(): VisualShaderNodeCubeMap = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("VisualShaderNodeCubeMap".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton VisualShaderNodeCubeMap" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      VisualShaderNodeCubeMap(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for VisualShaderNodeCubeMap
     */
    private object __method_bind {
      val get_cube_map: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeCubeMap".cstr.ptr,
              "get_cube_map".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_cube_map" }
            }
          }

      val get_texture_type: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeCubeMap".cstr.ptr,
              "get_texture_type".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_texture_type" }
            }
          }

      val set_cube_map: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeCubeMap".cstr.ptr,
              "set_cube_map".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_cube_map" }
            }
          }

      val set_texture_type: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualShaderNodeCubeMap".cstr.ptr,
              "set_texture_type".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_texture_type" }
            }
          }
    }
  }
}
