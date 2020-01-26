// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Rect2
import godot.core.VariantArray
import godot.core.Vector2
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

open class BitMap internal constructor(
  _handle: COpaquePointer
) : Resource(_handle) {
  fun create(size: Vector2) {
    TODO()
  }

  fun createFromImageAlpha(image: Image, threshold: Float) {
    TODO()
  }

  fun getBit(position: Vector2): Boolean {
    TODO()
  }

  fun getSize(): Vector2 {
    TODO()
  }

  fun getTrueBitCount(): Int {
    TODO()
  }

  fun growMask(pixels: Int, rect: Rect2) {
    TODO()
  }

  fun opaqueToPolygons(rect: Rect2, epsilon: Float): VariantArray {
    TODO()
  }

  fun setBit(position: Vector2, bit: Boolean) {
    TODO()
  }

  fun setBitRect(rect: Rect2, bit: Boolean) {
    TODO()
  }

  companion object {
    fun new(): BitMap = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("BitMap".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton BitMap" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      BitMap(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): BitMap = BitMap(ptr)
    /**
     * Container for method_bind pointers for BitMap
     */
    private object __method_bind {
      val create: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BitMap".cstr.ptr,
              "create".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method create" }
            }
          }

      val create_from_image_alpha: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BitMap".cstr.ptr,
              "create_from_image_alpha".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method create_from_image_alpha" }
            }
          }

      val get_bit: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BitMap".cstr.ptr,
              "get_bit".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_bit" }
            }
          }

      val get_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BitMap".cstr.ptr,
              "get_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_size" }
            }
          }

      val get_true_bit_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BitMap".cstr.ptr,
              "get_true_bit_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_true_bit_count" }
            }
          }

      val grow_mask: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BitMap".cstr.ptr,
              "grow_mask".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method grow_mask" }
            }
          }

      val opaque_to_polygons: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BitMap".cstr.ptr,
              "opaque_to_polygons".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method opaque_to_polygons" }
            }
          }

      val set_bit: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BitMap".cstr.ptr,
              "set_bit".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_bit" }
            }
          }

      val set_bit_rect: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BitMap".cstr.ptr,
              "set_bit_rect".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_bit_rect" }
            }
          }
    }
  }
}
