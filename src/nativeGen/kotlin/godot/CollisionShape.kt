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

open class CollisionShape(
  _handle: COpaquePointer
) : Spatial(_handle) {
  var disabled: Boolean
    get() {
       return isDisabled() 
    }
    set(value) {
      setDisabled(value)
    }

  var shape: Shape
    get() {
       return getShape() 
    }
    set(value) {
      setShape(value)
    }

  fun getShape(): Shape {
    val _ret = __method_bind.getShape.call(this._handle)
    return _ret.asObject(::Shape)!!
  }

  fun isDisabled(): Boolean {
    val _ret = __method_bind.isDisabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun makeConvexFromBrothers() {
    __method_bind.makeConvexFromBrothers.call(this._handle)
  }

  fun resourceChanged(resource: Resource) {
    val _arg = Variant.new(resource)
    __method_bind.resourceChanged.call(this._handle, _arg, 1)
  }

  fun setDisabled(enable: Boolean) {
    val _arg = Variant.new(enable)
    __method_bind.setDisabled.call(this._handle, _arg, 1)
  }

  fun setShape(shape: Shape) {
    val _arg = Variant.new(shape)
    __method_bind.setShape.call(this._handle, _arg, 1)
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
      val getShape: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionShape".cstr.ptr,
            "get_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_shape" }
        }
      val isDisabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionShape".cstr.ptr,
            "is_disabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_disabled" }
        }
      val makeConvexFromBrothers: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionShape".cstr.ptr,
            "make_convex_from_brothers".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method make_convex_from_brothers" }
        }
      val resourceChanged: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionShape".cstr.ptr,
            "resource_changed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method resource_changed" }
        }
      val setDisabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionShape".cstr.ptr,
            "set_disabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_disabled" }
        }
      val setShape: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionShape".cstr.ptr,
            "set_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_shape" }
        }}
  }
}
