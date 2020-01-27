// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
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

open class CSGShape internal constructor(
  _handle: COpaquePointer
) : GeometryInstance(_handle) {
  fun getCollisionLayer(): Int {
    val _ret = __method_bind.get_collision_layer.call(this.toVariant())
    return _ret.asInt()
  }

  fun getCollisionLayerBit(bit: Int): Boolean {
    val _arg = Variant.new(bit)
    val _ret = __method_bind.get_collision_layer_bit.call(this.toVariant(), _arg, 1)
    return _ret.asBool()
  }

  fun getCollisionMask(): Int {
    val _ret = __method_bind.get_collision_mask.call(this.toVariant())
    return _ret.asInt()
  }

  fun getCollisionMaskBit(bit: Int): Boolean {
    val _arg = Variant.new(bit)
    val _ret = __method_bind.get_collision_mask_bit.call(this.toVariant(), _arg, 1)
    return _ret.asBool()
  }

  fun getMeshes(): VariantArray {
    val _ret = __method_bind.get_meshes.call(this.toVariant())
    return _ret.asArray()
  }

  fun getOperation(): Operation {
    val _ret = __method_bind.get_operation.call(this.toVariant())
    return CSGShape.Operation.from(_ret.asInt())
  }

  fun getSnap(): Float {
    val _ret = __method_bind.get_snap.call(this.toVariant())
    return _ret.asFloat()
  }

  fun isCalculatingTangents(): Boolean {
    val _ret = __method_bind.is_calculating_tangents.call(this.toVariant())
    return _ret.asBool()
  }

  fun isRootShape(): Boolean {
    val _ret = __method_bind.is_root_shape.call(this.toVariant())
    return _ret.asBool()
  }

  fun isUsingCollision(): Boolean {
    val _ret = __method_bind.is_using_collision.call(this.toVariant())
    return _ret.asBool()
  }

  fun setCalculateTangents(enabled: Boolean) {
    val _arg = Variant.new(enabled)
    __method_bind.set_calculate_tangents.call(this.toVariant(), _arg, 1)
  }

  fun setCollisionLayer(layer: Int) {
    val _arg = Variant.new(layer)
    __method_bind.set_collision_layer.call(this.toVariant(), _arg, 1)
  }

  fun setCollisionLayerBit(bit: Int, value: Boolean) {
    val _args = VariantArray.new()
    _args.append(bit)
    _args.append(value)
    __method_bind.set_collision_layer_bit.call(this.toVariant(), _args.toVariant(), 2)
  }

  fun setCollisionMask(mask: Int) {
    val _arg = Variant.new(mask)
    __method_bind.set_collision_mask.call(this.toVariant(), _arg, 1)
  }

  fun setCollisionMaskBit(bit: Int, value: Boolean) {
    val _args = VariantArray.new()
    _args.append(bit)
    _args.append(value)
    __method_bind.set_collision_mask_bit.call(this.toVariant(), _args.toVariant(), 2)
  }

  fun setOperation(operation: Int) {
    val _arg = Variant.new(operation)
    __method_bind.set_operation.call(this.toVariant(), _arg, 1)
  }

  fun setSnap(snap: Float) {
    val _arg = Variant.new(snap)
    __method_bind.set_snap.call(this.toVariant(), _arg, 1)
  }

  fun setUseCollision(operation: Boolean) {
    val _arg = Variant.new(operation)
    __method_bind.set_use_collision.call(this.toVariant(), _arg, 1)
  }

  enum class Operation(
    val value: Int
  ) {
    OPERATION_UNION(0),

    OPERATION_INTERSECTION(1),

    OPERATION_SUBTRACTION(2);

    companion object {
      fun from(value: Int): Operation {
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
    val OPERATION_INTERSECTION: Int = 1

    val OPERATION_SUBTRACTION: Int = 2

    val OPERATION_UNION: Int = 0

    /**
     * Container for method_bind pointers for CSGShape
     */
    private object __method_bind {
      val get_collision_layer: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGShape".cstr.ptr,
              "get_collision_layer".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_collision_layer" }
            }
          }

      val get_collision_layer_bit: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGShape".cstr.ptr,
              "get_collision_layer_bit".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_collision_layer_bit" }
            }
          }

      val get_collision_mask: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGShape".cstr.ptr,
              "get_collision_mask".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_collision_mask" }
            }
          }

      val get_collision_mask_bit: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGShape".cstr.ptr,
              "get_collision_mask_bit".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_collision_mask_bit" }
            }
          }

      val get_meshes: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGShape".cstr.ptr,
              "get_meshes".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_meshes" }
            }
          }

      val get_operation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGShape".cstr.ptr,
              "get_operation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_operation" }
            }
          }

      val get_snap: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGShape".cstr.ptr,
              "get_snap".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_snap" }
            }
          }

      val is_calculating_tangents: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGShape".cstr.ptr,
              "is_calculating_tangents".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_calculating_tangents" }
            }
          }

      val is_root_shape: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGShape".cstr.ptr,
              "is_root_shape".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_root_shape" }
            }
          }

      val is_using_collision: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGShape".cstr.ptr,
              "is_using_collision".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_using_collision" }
            }
          }

      val set_calculate_tangents: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGShape".cstr.ptr,
              "set_calculate_tangents".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_calculate_tangents" }
            }
          }

      val set_collision_layer: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGShape".cstr.ptr,
              "set_collision_layer".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_collision_layer" }
            }
          }

      val set_collision_layer_bit: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGShape".cstr.ptr,
              "set_collision_layer_bit".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_collision_layer_bit" }
            }
          }

      val set_collision_mask: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGShape".cstr.ptr,
              "set_collision_mask".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_collision_mask" }
            }
          }

      val set_collision_mask_bit: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGShape".cstr.ptr,
              "set_collision_mask_bit".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_collision_mask_bit" }
            }
          }

      val set_operation: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGShape".cstr.ptr,
              "set_operation".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_operation" }
            }
          }

      val set_snap: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGShape".cstr.ptr,
              "set_snap".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_snap" }
            }
          }

      val set_use_collision: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("CSGShape".cstr.ptr,
              "set_use_collision".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_use_collision" }
            }
          }
    }
  }
}
