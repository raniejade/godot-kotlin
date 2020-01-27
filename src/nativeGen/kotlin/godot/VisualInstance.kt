// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.AABB
import godot.core.Godot
import godot.core.RID
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

open class VisualInstance internal constructor(
  _handle: COpaquePointer
) : Spatial(_handle) {
  fun getAabb(): AABB {
    val _ret = __method_bind.get_aabb.call(this.toVariant())
    return _ret.asAABB()
  }

  fun getBase(): RID {
    val _ret = __method_bind.get_base.call(this.toVariant())
    return _ret.asRID()
  }

  fun getInstance(): RID {
    val _ret = __method_bind.get_instance.call(this.toVariant())
    return _ret.asRID()
  }

  fun getLayerMask(): Int {
    val _ret = __method_bind.get_layer_mask.call(this.toVariant())
    return _ret.asInt()
  }

  fun getLayerMaskBit(layer: Int): Boolean {
    val _args = VariantArray.new()
    _args.append(layer)
    val _ret = __method_bind.get_layer_mask_bit.call(this.toVariant(), _args.toVariant(), 1)
    return _ret.asBool()
  }

  fun getTransformedAabb(): AABB {
    val _ret = __method_bind.get_transformed_aabb.call(this.toVariant())
    return _ret.asAABB()
  }

  fun setBase(base: RID) {
    val _args = VariantArray.new()
    _args.append(base)
    __method_bind.set_base.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setLayerMask(mask: Int) {
    val _args = VariantArray.new()
    _args.append(mask)
    __method_bind.set_layer_mask.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setLayerMaskBit(layer: Int, enabled: Boolean) {
    val _args = VariantArray.new()
    _args.append(layer)
    _args.append(enabled)
    __method_bind.set_layer_mask_bit.call(this.toVariant(), _args.toVariant(), 2)
  }

  companion object {
    /**
     * Container for method_bind pointers for VisualInstance
     */
    private object __method_bind {
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
