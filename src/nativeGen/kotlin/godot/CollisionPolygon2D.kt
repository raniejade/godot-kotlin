// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.PoolVector2Array
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.Unit
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class CollisionPolygon2D(
  _handle: COpaquePointer
) : Node2D(_handle) {
  var buildMode: BuildMode
    get() {
       return getBuildMode() 
    }
    set(value) {
      setBuildMode(value.value)
    }

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

  var polygon: PoolVector2Array
    get() {
       return getPolygon() 
    }
    set(value) {
      setPolygon(value)
    }

  /**
   * Specialized setter for polygon
   */
  fun polygon(cb: PoolVector2Array.() -> Unit) {
    val _p = polygon
    cb(_p)
    polygon = _p
  }

  fun getBuildMode(): BuildMode {
    val _ret = __method_bind.getBuildMode.call(this._handle)
    return CollisionPolygon2D.BuildMode.from(_ret.asInt())
  }

  fun getOneWayCollisionMargin(): Float {
    val _ret = __method_bind.getOneWayCollisionMargin.call(this._handle)
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

  fun isOneWayCollisionEnabled(): Boolean {
    val _ret = __method_bind.isOneWayCollisionEnabled.call(this._handle)
    return _ret.asBoolean()
  }

  fun setBuildMode(buildMode: Int) {
    val _arg = Variant.new(buildMode)
    __method_bind.setBuildMode.call(this._handle, _arg, 1)
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

  fun setPolygon(polygon: PoolVector2Array) {
    val _arg = Variant.new(polygon)
    __method_bind.setPolygon.call(this._handle, _arg, 1)
  }

  enum class BuildMode(
    val value: Int
  ) {
    BUILD_SOLIDS(0),

    BUILD_SEGMENTS(1);

    companion object {
      fun from(value: Int): BuildMode {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  companion object {
    val BUILD_SEGMENTS: Int = 1

    val BUILD_SOLIDS: Int = 0

    fun new(): CollisionPolygon2D = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("CollisionPolygon2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for CollisionPolygon2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      CollisionPolygon2D(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): CollisionPolygon2D = CollisionPolygon2D(ptr)
    /**
     * Container for method_bind pointers for CollisionPolygon2D
     */
    private object __method_bind {
      val getBuildMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionPolygon2D".cstr.ptr,
            "get_build_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_build_mode" }
        }
      val getOneWayCollisionMargin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionPolygon2D".cstr.ptr,
            "get_one_way_collision_margin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_one_way_collision_margin" }
        }
      val getPolygon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionPolygon2D".cstr.ptr,
            "get_polygon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_polygon" }
        }
      val isDisabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionPolygon2D".cstr.ptr,
            "is_disabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_disabled" }
        }
      val isOneWayCollisionEnabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionPolygon2D".cstr.ptr,
            "is_one_way_collision_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_one_way_collision_enabled" }
        }
      val setBuildMode: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionPolygon2D".cstr.ptr,
            "set_build_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_build_mode" }
        }
      val setDisabled: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionPolygon2D".cstr.ptr,
            "set_disabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_disabled" }
        }
      val setOneWayCollision: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionPolygon2D".cstr.ptr,
            "set_one_way_collision".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_one_way_collision" }
        }
      val setOneWayCollisionMargin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionPolygon2D".cstr.ptr,
            "set_one_way_collision_margin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_one_way_collision_margin" }
        }
      val setPolygon: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionPolygon2D".cstr.ptr,
            "set_polygon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_polygon" }
        }}
  }
}
