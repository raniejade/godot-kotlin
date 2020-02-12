// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.PoolVector2Array
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
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

open class CollisionPolygon2D(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Node2D(null) {
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

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
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
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getBuildMode.call(self._handle, emptyList(), _retPtr)
      CollisionPolygon2D.BuildMode.from(_ret.value)
    }
  }

  fun getOneWayCollisionMargin(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getOneWayCollisionMargin.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getPolygon(): PoolVector2Array {
    val self = this
    return Allocator.allocationScope {
      val _ret = PoolVector2Array()
      val _retPtr = _ret._value.ptr
      __method_bind.getPolygon.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun isDisabled(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isDisabled.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isOneWayCollisionEnabled(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isOneWayCollisionEnabled.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun setBuildMode(buildMode: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setBuildMode.call(self._handle, listOf(buildMode), null)
    }
  }

  fun setDisabled(disabled: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setDisabled.call(self._handle, listOf(disabled), null)
    }
  }

  fun setOneWayCollision(enabled: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setOneWayCollision.call(self._handle, listOf(enabled), null)
    }
  }

  fun setOneWayCollisionMargin(margin: Float) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setOneWayCollisionMargin.call(self._handle, listOf(margin), null)
    }
  }

  fun setPolygon(polygon: PoolVector2Array) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setPolygon.call(self._handle, listOf(polygon), null)
    }
  }

  enum class BuildMode(
    val value: Int
  ) {
    SOLIDS(0),

    SEGMENTS(1);

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
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("CollisionPolygon2D".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for CollisionPolygon2D" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for CollisionPolygon2D
     */
    private object __method_bind {
      val getBuildMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionPolygon2D".cstr.ptr,
            "get_build_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_build_mode" }
        }
      val getOneWayCollisionMargin: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionPolygon2D".cstr.ptr,
            "get_one_way_collision_margin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_one_way_collision_margin" }
        }
      val getPolygon: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionPolygon2D".cstr.ptr,
            "get_polygon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_polygon" }
        }
      val isDisabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionPolygon2D".cstr.ptr,
            "is_disabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_disabled" }
        }
      val isOneWayCollisionEnabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionPolygon2D".cstr.ptr,
            "is_one_way_collision_enabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_one_way_collision_enabled" }
        }
      val setBuildMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionPolygon2D".cstr.ptr,
            "set_build_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_build_mode" }
        }
      val setDisabled: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionPolygon2D".cstr.ptr,
            "set_disabled".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_disabled" }
        }
      val setOneWayCollision: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionPolygon2D".cstr.ptr,
            "set_one_way_collision".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_one_way_collision" }
        }
      val setOneWayCollisionMargin: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionPolygon2D".cstr.ptr,
            "set_one_way_collision_margin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_one_way_collision_margin" }
        }
      val setPolygon: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionPolygon2D".cstr.ptr,
            "set_polygon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_polygon" }
        }}
  }
}
