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
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class CollisionPolygon2D internal constructor(
  _handle: COpaquePointer
) : Node2D(_handle) {
  fun getBuildMode(): BuildMode {
    val _ret = __method_bind.get_build_mode.call(this.toVariant())
    TODO()
  }

  fun getOneWayCollisionMargin(): Float {
    val _ret = __method_bind.get_one_way_collision_margin.call(this.toVariant())
    TODO()
  }

  fun getPolygon(): PoolVector2Array {
    val _ret = __method_bind.get_polygon.call(this.toVariant())
    TODO()
  }

  fun isDisabled(): Boolean {
    val _ret = __method_bind.is_disabled.call(this.toVariant())
    TODO()
  }

  fun isOneWayCollisionEnabled(): Boolean {
    val _ret = __method_bind.is_one_way_collision_enabled.call(this.toVariant())
    TODO()
  }

  fun setBuildMode(buildMode: Int) {
    val _args = VariantArray.new()
    _args.append(buildMode)
    val _ret = __method_bind.set_build_mode.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setDisabled(disabled: Boolean) {
    val _args = VariantArray.new()
    _args.append(disabled)
    val _ret = __method_bind.set_disabled.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setOneWayCollision(enabled: Boolean) {
    val _args = VariantArray.new()
    _args.append(enabled)
    val _ret = __method_bind.set_one_way_collision.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setOneWayCollisionMargin(margin: Float) {
    val _args = VariantArray.new()
    _args.append(margin)
    val _ret = __method_bind.set_one_way_collision_margin.call(this.toVariant(), _args.toVariant(),
        1)
    TODO()
  }

  fun setPolygon(polygon: PoolVector2Array) {
    val _args = VariantArray.new()
    _args.append(polygon)
    val _ret = __method_bind.set_polygon.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
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
      requireNotNull(fnPtr) { "No instance found for singleton CollisionPolygon2D" }
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
      val get_build_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionPolygon2D".cstr.ptr,
              "get_build_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_build_mode" }
            }
          }

      val get_one_way_collision_margin: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionPolygon2D".cstr.ptr,
              "get_one_way_collision_margin".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_one_way_collision_margin" }
            }
          }

      val get_polygon: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionPolygon2D".cstr.ptr,
              "get_polygon".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_polygon" }
            }
          }

      val is_disabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionPolygon2D".cstr.ptr,
              "is_disabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_disabled" }
            }
          }

      val is_one_way_collision_enabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionPolygon2D".cstr.ptr,
              "is_one_way_collision_enabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_one_way_collision_enabled" }
            }
          }

      val set_build_mode: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionPolygon2D".cstr.ptr,
              "set_build_mode".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_build_mode" }
            }
          }

      val set_disabled: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionPolygon2D".cstr.ptr,
              "set_disabled".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_disabled" }
            }
          }

      val set_one_way_collision: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionPolygon2D".cstr.ptr,
              "set_one_way_collision".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_one_way_collision" }
            }
          }

      val set_one_way_collision_margin: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionPolygon2D".cstr.ptr,
              "set_one_way_collision_margin".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_one_way_collision_margin" }
            }
          }

      val set_polygon: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CollisionPolygon2D".cstr.ptr,
              "set_polygon".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_polygon" }
            }
          }
    }
  }
}
