// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.PoolVector2Array
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

open class CollisionPolygon(
  _handle: COpaquePointer
) : Spatial(_handle) {
  var depth: Float
    get() {
       return getDepth() 
    }
    set(value) {
      setDepth(value)
    }

  var disabled: Boolean
    get() {
       return isDisabled() 
    }
    set(value) {
      setDisabled(value)
    }

  var polygon: PoolVector2Array
    get() {
       return getPolygon() 
    }
    set(value) {
      setPolygon(value)
    }

  fun getDepth(): Float {
    val _ret = __method_bind.getDepth.call(this._handle)
    return _ret.asFloat()
  }

  fun getPolygon(): PoolVector2Array {
    val _ret = __method_bind.getPolygon.call(this._handle)
    return _ret.asPoolVector2Array()
  }

  fun isDisabled(): Boolean {
    val _ret = __method_bind.isDisabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun setDepth(depth: Float) {
    val _arg = Variant.new(depth)
    __method_bind.setDepth.call(this._handle, _arg, 1)
  }

  fun setDisabled(disabled: Boolean) {
    val _arg = Variant.new(disabled)
    __method_bind.setDisabled.call(this._handle, _arg, 1)
  }

  fun setPolygon(polygon: PoolVector2Array) {
    val _arg = Variant.new(polygon)
    __method_bind.setPolygon.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): CollisionPolygon = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("CollisionPolygon".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for CollisionPolygon" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      CollisionPolygon(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): CollisionPolygon = CollisionPolygon(ptr)
    /**
     * Container for method_bind pointers for CollisionPolygon
     */
    private object __method_bind {
      val getDepth: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionPolygon".cstr.ptr,
            "getDepth".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getDepth" }
        }
      val getPolygon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionPolygon".cstr.ptr,
            "getPolygon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getPolygon" }
        }
      val isDisabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionPolygon".cstr.ptr,
            "isDisabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isDisabled" }
        }
      val setDepth: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionPolygon".cstr.ptr,
            "setDepth".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setDepth" }
        }
      val setDisabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionPolygon".cstr.ptr,
            "setDisabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setDisabled" }
        }
      val setPolygon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionPolygon".cstr.ptr,
            "setPolygon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setPolygon" }
        }}
  }
}
