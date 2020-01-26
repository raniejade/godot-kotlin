// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlin.Boolean
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class CollisionShape internal constructor(
  _handle: COpaquePointer
) : Spatial(_handle) {
  fun getShape(): Shape {
    TODO()
  }

  fun isDisabled(): Boolean {
    TODO()
  }

  fun makeConvexFromBrothers() {
    TODO()
  }

  fun resourceChanged(resource: Resource) {
    TODO()
  }

  fun setDisabled(enable: Boolean) {
    TODO()
  }

  fun setShape(shape: Shape) {
    TODO()
  }

  companion object {
    fun new(): CollisionShape = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("CollisionShape".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton CollisionShape" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      CollisionShape(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for CollisionShape
     */
    private object __method_bind {
      val get_shape: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionShape".cstr.ptr,
              "get_shape".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_shape" }
            }
          }

      val is_disabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionShape".cstr.ptr,
              "is_disabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_disabled" }
            }
          }

      val make_convex_from_brothers: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionShape".cstr.ptr,
              "make_convex_from_brothers".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method make_convex_from_brothers" }
            }
          }

      val resource_changed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionShape".cstr.ptr,
              "resource_changed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method resource_changed" }
            }
          }

      val set_disabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionShape".cstr.ptr,
              "set_disabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_disabled" }
            }
          }

      val set_shape: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionShape".cstr.ptr,
              "set_shape".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_shape" }
            }
          }
    }
  }
}
