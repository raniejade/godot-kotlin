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

open class NavigationPolygonInstance(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Node2D(null) {
  var enabled: Boolean
    get() {
       return isEnabled() 
    }
    set(value) {
      setEnabled(value)
    }

  var navpoly: NavigationPolygon
    get() {
       return getNavigationPolygon() 
    }
    set(value) {
      setNavigationPolygon(value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  open fun _navpoly_changed() {
    TODO()
  }

  fun getNavigationPolygon(): NavigationPolygon {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: NavigationPolygon
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getNavigationPolygon.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<NavigationPolygon>(_tmp.value!!)
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

  fun setNavigationPolygon(navpoly: NavigationPolygon) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setNavigationPolygon.call(self._handle, listOf(navpoly), null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("NavigationPolygonInstance".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for NavigationPolygonInstance" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for NavigationPolygonInstance
     */
    private object __method_bind {
      val getNavigationPolygon: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationPolygonInstance".cstr.ptr,
              "get_navigation_polygon".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_navigation_polygon" }
            }
          }

      val isEnabled: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationPolygonInstance".cstr.ptr,
              "is_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_enabled" }
            }
          }

      val setEnabled: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationPolygonInstance".cstr.ptr,
              "set_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_enabled" }
            }
          }

      val setNavigationPolygon: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("NavigationPolygonInstance".cstr.ptr,
              "set_navigation_polygon".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_navigation_polygon" }
            }
          }
    }
  }
}
