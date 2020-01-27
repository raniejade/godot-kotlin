// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector3
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class KinematicCollision internal constructor(
  _handle: COpaquePointer
) : Reference(_handle) {
  fun getCollider(): Object {
    val _ret = __method_bind.get_collider.call(this.toVariant())
    return _ret.asObject(::Object)!!
  }

  fun getColliderId(): Int {
    val _ret = __method_bind.get_collider_id.call(this.toVariant())
    return _ret.asInt()
  }

  fun getColliderMetadata(): Variant {
    val _ret = __method_bind.get_collider_metadata.call(this.toVariant())
    return _ret
  }

  fun getColliderShape(): Object {
    val _ret = __method_bind.get_collider_shape.call(this.toVariant())
    return _ret.asObject(::Object)!!
  }

  fun getColliderShapeIndex(): Int {
    val _ret = __method_bind.get_collider_shape_index.call(this.toVariant())
    return _ret.asInt()
  }

  fun getColliderVelocity(): Vector3 {
    val _ret = __method_bind.get_collider_velocity.call(this.toVariant())
    return _ret.asVector3()
  }

  fun getLocalShape(): Object {
    val _ret = __method_bind.get_local_shape.call(this.toVariant())
    return _ret.asObject(::Object)!!
  }

  fun getNormal(): Vector3 {
    val _ret = __method_bind.get_normal.call(this.toVariant())
    return _ret.asVector3()
  }

  fun getPosition(): Vector3 {
    val _ret = __method_bind.get_position.call(this.toVariant())
    return _ret.asVector3()
  }

  fun getRemainder(): Vector3 {
    val _ret = __method_bind.get_remainder.call(this.toVariant())
    return _ret.asVector3()
  }

  fun getTravel(): Vector3 {
    val _ret = __method_bind.get_travel.call(this.toVariant())
    return _ret.asVector3()
  }

  companion object {
    fun new(): KinematicCollision = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("KinematicCollision".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for KinematicCollision" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      KinematicCollision(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): KinematicCollision = KinematicCollision(ptr)
    /**
     * Container for method_bind pointers for KinematicCollision
     */
    private object __method_bind {
      val get_collider: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicCollision".cstr.ptr,
              "get_collider".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_collider" }
            }
          }

      val get_collider_id: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicCollision".cstr.ptr,
              "get_collider_id".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_collider_id" }
            }
          }

      val get_collider_metadata: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicCollision".cstr.ptr,
              "get_collider_metadata".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_collider_metadata" }
            }
          }

      val get_collider_shape: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicCollision".cstr.ptr,
              "get_collider_shape".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_collider_shape" }
            }
          }

      val get_collider_shape_index: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicCollision".cstr.ptr,
              "get_collider_shape_index".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_collider_shape_index" }
            }
          }

      val get_collider_velocity: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicCollision".cstr.ptr,
              "get_collider_velocity".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_collider_velocity" }
            }
          }

      val get_local_shape: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicCollision".cstr.ptr,
              "get_local_shape".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_local_shape" }
            }
          }

      val get_normal: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicCollision".cstr.ptr,
              "get_normal".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_normal" }
            }
          }

      val get_position: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicCollision".cstr.ptr,
              "get_position".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_position" }
            }
          }

      val get_remainder: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicCollision".cstr.ptr,
              "get_remainder".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_remainder" }
            }
          }

      val get_travel: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("KinematicCollision".cstr.ptr,
              "get_travel".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_travel" }
            }
          }
    }
  }
}
