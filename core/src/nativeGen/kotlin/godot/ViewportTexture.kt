// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.NodePath
import godot.core.Variant
import godot.core.VariantArray
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class ViewportTexture(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Texture(null) {
  var viewportPath: NodePath
    get() {
       return getViewportPathInScene() 
    }
    set(value) {
      setViewportPathInScene(value)
    }

  constructor() : this(null) {
    _handle = __new()
  }

  /**
   * Specialized setter for viewportPath
   */
  fun viewportPath(cb: NodePath.() -> Unit) {
    val _p = viewportPath
    cb(_p)
    viewportPath = _p
  }

  fun getViewportPathInScene(): NodePath {
    val _ret = __method_bind.getViewportPathInScene.call(this._handle)
    return _ret.asNodePath()
  }

  fun setViewportPathInScene(path: NodePath) {
    val _arg = Variant(path)
    __method_bind.setViewportPathInScene.call(this._handle, listOf(_arg))
  }

  companion object {
    internal fun __new(): COpaquePointer = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("ViewportTexture".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for ViewportTexture" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for ViewportTexture
     */
    private object __method_bind {
      val getViewportPathInScene: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ViewportTexture".cstr.ptr,
            "get_viewport_path_in_scene".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_viewport_path_in_scene" }
        }
      val setViewportPathInScene: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ViewportTexture".cstr.ptr,
            "set_viewport_path_in_scene".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_viewport_path_in_scene" }
        }}
  }
}
