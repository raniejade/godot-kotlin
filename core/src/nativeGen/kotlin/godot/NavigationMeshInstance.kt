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

open class NavigationMeshInstance(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Spatial(null) {
  var enabled: Boolean
    get() {
       return isEnabled() 
    }
    set(value) {
      setEnabled(value)
    }

  var navmesh: NavigationMesh
    get() {
       return getNavigationMesh() 
    }
    set(value) {
      setNavigationMesh(value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getNavigationMesh(): NavigationMesh {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: NavigationMesh
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getNavigationMesh.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<NavigationMesh>(_tmp.value!!)
      _ret
    }
  }

  fun isEnabled(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isEnabled.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun setEnabled(enabled: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setEnabled.call(self._handle, listOf(enabled), null)
    }
  }

  fun setNavigationMesh(navmesh: NavigationMesh) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setNavigationMesh.call(self._handle, listOf(navmesh), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("NavigationMeshInstance".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for NavigationMeshInstance" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for NavigationMeshInstance
     */
    private object __method_bind {
      val getNavigationMesh: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMeshInstance".cstr.ptr,
            "get_navigation_mesh".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_navigation_mesh" }
        }
      val isEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMeshInstance".cstr.ptr,
            "is_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_enabled" }
        }
      val setEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMeshInstance".cstr.ptr,
            "set_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_enabled" }
        }
      val setNavigationMesh: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationMeshInstance".cstr.ptr,
            "set_navigation_mesh".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_navigation_mesh" }
        }}
  }
}
