// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Dictionary
import godot.core.Godot
import godot.core.VariantArray
import godot.core.Vector2
import kotlin.Boolean
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
  fun getData(): Dictionary {
    TODO()
  }

  fun setData() {
    TODO()
  }

  fun create() {
    TODO()
  }

  fun createFromImageAlpha() {
    TODO()
  }

  fun getBit(): Boolean {
    TODO()
  }

  fun getSize(): Vector2 {
    TODO()
  }

  fun getTrueBitCount(): Int {
    TODO()
  }

  fun growMask() {
    TODO()
  }

  fun opaqueToPolygons(): VariantArray {
    TODO()
  }

  fun setBit() {
    TODO()
  }

  fun setBitRect() {
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
    /**
     * Container for method_bind pointers for BitMap
     */
    private object __method_bind {
      val _get_data: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BitMap".cstr.ptr,
              "_get_data".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _get_data" }
            }
          }

      val _set_data: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BitMap".cstr.ptr,
              "_set_data".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _set_data" }
            }
          }

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
