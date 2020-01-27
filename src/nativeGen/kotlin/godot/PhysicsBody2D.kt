// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class PhysicsBody2D internal constructor(
  _handle: COpaquePointer
) : CollisionObject2D(_handle) {
  fun addCollisionExceptionWith(body: Node) {
    val _args = VariantArray.new()
    _args.append(body)
    val _ret = __method_bind.add_collision_exception_with.call(this.toVariant(), _args.toVariant(),
        1)
    TODO()
  }

  fun getCollisionExceptions(): VariantArray {
    val _ret = __method_bind.get_collision_exceptions.call(this.toVariant())
    TODO()
  }

  fun getCollisionLayer(): Int {
    val _ret = __method_bind.get_collision_layer.call(this.toVariant())
    TODO()
  }

  fun getCollisionLayerBit(bit: Int): Boolean {
    val _args = VariantArray.new()
    _args.append(bit)
    val _ret = __method_bind.get_collision_layer_bit.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getCollisionMask(): Int {
    val _ret = __method_bind.get_collision_mask.call(this.toVariant())
    TODO()
  }

  fun getCollisionMaskBit(bit: Int): Boolean {
    val _args = VariantArray.new()
    _args.append(bit)
    val _ret = __method_bind.get_collision_mask_bit.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun removeCollisionExceptionWith(body: Node) {
    val _args = VariantArray.new()
    _args.append(body)
    val _ret = __method_bind.remove_collision_exception_with.call(this.toVariant(),
        _args.toVariant(), 1)
    TODO()
  }

  fun setCollisionLayer(layer: Int) {
    val _args = VariantArray.new()
    _args.append(layer)
    val _ret = __method_bind.set_collision_layer.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setCollisionLayerBit(bit: Int, value: Boolean) {
    val _args = VariantArray.new()
    _args.append(bit)
    _args.append(value)
    val _ret = __method_bind.set_collision_layer_bit.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun setCollisionMask(mask: Int) {
    val _args = VariantArray.new()
    _args.append(mask)
    val _ret = __method_bind.set_collision_mask.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setCollisionMaskBit(bit: Int, value: Boolean) {
    val _args = VariantArray.new()
    _args.append(bit)
    _args.append(value)
    val _ret = __method_bind.set_collision_mask_bit.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  companion object {
    /**
     * Container for method_bind pointers for PhysicsBody2D
     */
    private object __method_bind {
      val add_collision_exception_with: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsBody2D".cstr.ptr,
              "add_collision_exception_with".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_collision_exception_with" }
            }
          }

      val get_collision_exceptions: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsBody2D".cstr.ptr,
              "get_collision_exceptions".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_collision_exceptions" }
            }
          }

      val get_collision_layer: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsBody2D".cstr.ptr,
              "get_collision_layer".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_collision_layer" }
            }
          }

      val get_collision_layer_bit: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsBody2D".cstr.ptr,
              "get_collision_layer_bit".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_collision_layer_bit" }
            }
          }

      val get_collision_mask: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsBody2D".cstr.ptr,
              "get_collision_mask".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_collision_mask" }
            }
          }

      val get_collision_mask_bit: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsBody2D".cstr.ptr,
              "get_collision_mask_bit".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_collision_mask_bit" }
            }
          }

      val remove_collision_exception_with: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsBody2D".cstr.ptr,
              "remove_collision_exception_with".cstr.ptr)
              requireNotNull(ptr) {
              "No method_bind found for method remove_collision_exception_with" }
            }
          }

      val set_collision_layer: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsBody2D".cstr.ptr,
              "set_collision_layer".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_collision_layer" }
            }
          }

      val set_collision_layer_bit: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsBody2D".cstr.ptr,
              "set_collision_layer_bit".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_collision_layer_bit" }
            }
          }

      val set_collision_mask: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsBody2D".cstr.ptr,
              "set_collision_mask".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_collision_mask" }
            }
          }

      val set_collision_mask_bit: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("PhysicsBody2D".cstr.ptr,
              "set_collision_mask_bit".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_collision_mask_bit" }
            }
          }
    }
  }
}
