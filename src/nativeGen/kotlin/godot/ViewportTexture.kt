// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.NodePath
import godot.core.Variant
import godot.core.VariantArray
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class ViewportTexture(
  _handle: COpaquePointer
) : Texture(_handle) {
  fun getViewportPathInScene(): NodePath {
    val _ret = __method_bind.get_viewport_path_in_scene.call(this._handle)
    return _ret.asNodePath()
  }

  fun setViewportPathInScene(path: NodePath) {
    val _arg = Variant.new(path)
    __method_bind.set_viewport_path_in_scene.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): ViewportTexture = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("ViewportTexture".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for ViewportTexture" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      ViewportTexture(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): ViewportTexture = ViewportTexture(ptr)
    /**
     * Container for method_bind pointers for ViewportTexture
     */
    private object __method_bind {
      val get_viewport_path_in_scene: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ViewportTexture".cstr.ptr,
            "get_viewport_path_in_scene".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_viewport_path_in_scene" }
        }
      val set_viewport_path_in_scene: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ViewportTexture".cstr.ptr,
            "set_viewport_path_in_scene".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_viewport_path_in_scene" }
        }}
  }
}
