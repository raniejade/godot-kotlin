// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.NodePath
import godot.core.Variant
import godot.core.VariantArray
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
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
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
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
    val self = this
    return Allocator.allocationScope {
      val _ret = NodePath()
      val _retPtr = _ret._value.ptr
      __method_bind.getViewportPathInScene.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun setViewportPathInScene(path: NodePath) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setViewportPathInScene.call(self._handle, listOf(path), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
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
      val getViewportPathInScene: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ViewportTexture".cstr.ptr,
              "get_viewport_path_in_scene".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_viewport_path_in_scene" }
            }
          }

      val setViewportPathInScene: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("ViewportTexture".cstr.ptr,
              "set_viewport_path_in_scene".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_viewport_path_in_scene" }
            }
          }
    }
  }
}
