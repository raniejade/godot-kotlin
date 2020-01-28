// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Float
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class CollisionShape2D(
  _handle: COpaquePointer
) : Node2D(_handle) {
  var disabled: Boolean
    get() {
       return isDisabled() 
    }
    set(value) {
      setDisabled(value)
    }

  var oneWayCollision: Boolean
    get() {
       return isOneWayCollisionEnabled() 
    }
    set(value) {
      setOneWayCollision(value)
    }

  var oneWayCollisionMargin: Float
    get() {
       return getOneWayCollisionMargin() 
    }
    set(value) {
      setOneWayCollisionMargin(value)
    }

  var shape: Shape2D
    get() {
       return getShape() 
    }
    set(value) {
      setShape(value)
    }

  fun getOneWayCollisionMargin(): Float {
    val _ret = __method_bind.getOneWayCollisionMargin.call(this._handle)
    return _ret.asFloat()
  }

  fun getShape(): Shape2D {
    val _ret = __method_bind.getShape.call(this._handle)
    return _ret.asObject(::Shape2D)!!
  }

  fun isDisabled(): Boolean {
    val _ret = __method_bind.isDisabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun isOneWayCollisionEnabled(): Boolean {
    val _ret = __method_bind.isOneWayCollisionEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun setDisabled(disabled: Boolean) {
    val _arg = Variant.new(disabled)
    __method_bind.setDisabled.call(this._handle, _arg, 1)
  }

  fun setOneWayCollision(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.setOneWayCollision.call(this._handle, _arg, 1)
  }

  fun setOneWayCollisionMargin(margin: Float) {
    val _arg = Variant.new(margin)
    __method_bind.setOneWayCollisionMargin.call(this._handle, _arg, 1)
  }

  fun setShape(shape: Shape2D) {
    val _arg = Variant.new(shape)
    __method_bind.setShape.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): CollisionShape2D = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("CollisionShape2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for CollisionShape2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      CollisionShape2D(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): CollisionShape2D = CollisionShape2D(ptr)
    /**
     * Container for method_bind pointers for CollisionShape2D
     */
    private object __method_bind {
      val getOneWayCollisionMargin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionShape2D".cstr.ptr,
            "get_one_way_collision_margin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_one_way_collision_margin" }
        }
      val getShape: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionShape2D".cstr.ptr,
            "get_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_shape" }
        }
      val isDisabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionShape2D".cstr.ptr,
            "is_disabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_disabled" }
        }
      val isOneWayCollisionEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionShape2D".cstr.ptr,
            "is_one_way_collision_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_one_way_collision_enabled" }
        }
      val setDisabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionShape2D".cstr.ptr,
            "set_disabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_disabled" }
        }
      val setOneWayCollision: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionShape2D".cstr.ptr,
            "set_one_way_collision".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_one_way_collision" }
        }
      val setOneWayCollisionMargin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionShape2D".cstr.ptr,
            "set_one_way_collision_margin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_one_way_collision_margin" }
        }
      val setShape: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionShape2D".cstr.ptr,
            "set_shape".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_shape" }
        }}
  }
}
