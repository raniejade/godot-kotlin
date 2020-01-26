// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.AABB
import godot.core.Godot
import godot.core.RID
import kotlin.Boolean
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class VisualInstance internal constructor(
  _handle: COpaquePointer
) : Spatial(_handle) {
  fun getVisualInstanceRid(): RID {
    TODO()
  }

  fun getAabb(): AABB {
    TODO()
  }

  fun getBase(): RID {
    TODO()
  }

  fun getInstance(): RID {
    TODO()
  }

  fun getLayerMask(): Int {
    TODO()
  }

  fun getLayerMaskBit(): Boolean {
    TODO()
  }

  fun getTransformedAabb(): AABB {
    TODO()
  }

  fun setBase() {
    TODO()
  }

  fun setLayerMask() {
    TODO()
  }

  fun setLayerMaskBit() {
    TODO()
  }

  companion object {
    /**
     * Container for method_bind pointers for VisualInstance
     */
    private object __method_bind {
      val _get_visual_instance_rid: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualInstance".cstr.ptr,
              "_get_visual_instance_rid".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _get_visual_instance_rid" }
            }
          }

      val get_aabb: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualInstance".cstr.ptr,
              "get_aabb".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_aabb" }
            }
          }

      val get_base: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualInstance".cstr.ptr,
              "get_base".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_base" }
            }
          }

      val get_instance: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualInstance".cstr.ptr,
              "get_instance".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_instance" }
            }
          }

      val get_layer_mask: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualInstance".cstr.ptr,
              "get_layer_mask".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_layer_mask" }
            }
          }

      val get_layer_mask_bit: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualInstance".cstr.ptr,
              "get_layer_mask_bit".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_layer_mask_bit" }
            }
          }

      val get_transformed_aabb: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualInstance".cstr.ptr,
              "get_transformed_aabb".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_transformed_aabb" }
            }
          }

      val set_base: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualInstance".cstr.ptr,
              "set_base".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_base" }
            }
          }

      val set_layer_mask: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualInstance".cstr.ptr,
              "set_layer_mask".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_layer_mask" }
            }
          }

      val set_layer_mask_bit: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualInstance".cstr.ptr,
              "set_layer_mask_bit".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_layer_mask_bit" }
            }
          }
    }
  }
}
