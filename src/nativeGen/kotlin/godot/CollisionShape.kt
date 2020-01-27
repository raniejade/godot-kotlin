// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
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
    val _ret = __method_bind.get_shape.call(this.toVariant())
    return _ret.asObject(::Shape)!!
  }

  fun isDisabled(): Boolean {
    val _ret = __method_bind.is_disabled.call(this.toVariant())
    return _ret.asBool()
  }

  fun makeConvexFromBrothers() {
    __method_bind.make_convex_from_brothers.call(this.toVariant())
  }

  fun resourceChanged(resource: Resource) {
    val _arg = Variant.new(resource)
    __method_bind.resource_changed.call(this.toVariant(), _arg, 1)
  }

  fun setDisabled(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.set_disabled.call(this.toVariant(), _arg, 1)
  }

  fun setShape(shape: Shape) {
    val _arg = Variant.new(shape)
    __method_bind.set_shape.call(this.toVariant(), _arg, 1)
  }

  companion object {
    fun new(): CollisionShape = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("CollisionShape".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for CollisionShape" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      CollisionShape(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): CollisionShape = CollisionShape(ptr)
    /**
     * Container for method_bind pointers for CollisionShape
     */
    private object __method_bind {
      val get_shape: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionShape".cstr.ptr,
            "get_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_shape" }
        }
      val is_disabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionShape".cstr.ptr,
            "is_disabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_disabled" }
        }
      val make_convex_from_brothers: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionShape".cstr.ptr,
            "make_convex_from_brothers".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method make_convex_from_brothers" }
        }
      val resource_changed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionShape".cstr.ptr,
            "resource_changed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method resource_changed" }
        }
      val set_disabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionShape".cstr.ptr,
            "set_disabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_disabled" }
        }
      val set_shape: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionShape".cstr.ptr,
            "set_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_shape" }
        }}
  }
}
