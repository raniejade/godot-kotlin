// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
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
    TODO()
  }

  fun getCollisionLayerBit(): Boolean {
    TODO()
  }

  fun getCollisionMask(): Int {
    TODO()
  }

  fun getCollisionMaskBit(): Boolean {
    TODO()
  }

  fun getMeshes(): VariantArray {
    TODO()
  }

  fun getOperation(): Operation {
    TODO()
  }

  fun getSnap(): Float {
    TODO()
  }

  fun isCalculatingTangents(): Boolean {
    TODO()
  }

  fun isRootShape(): Boolean {
    TODO()
  }

  fun isUsingCollision(): Boolean {
    TODO()
  }

  fun setCalculateTangents() {
    TODO()
  }

  fun setCollisionLayer() {
    TODO()
  }

  fun setCollisionLayerBit() {
    TODO()
  }

  fun setCollisionMask() {
    TODO()
  }

  fun setCollisionMaskBit() {
    TODO()
  }

  fun setOperation() {
    TODO()
  }

  fun setSnap() {
    TODO()
  }

  fun setUseCollision() {
    TODO()
  }

  enum class Operation(
    val value: Int
  ) {
    OPERATION_UNION(0),

    OPERATION_INTERSECTION(1),

    OPERATION_SUBTRACTION(2);
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
