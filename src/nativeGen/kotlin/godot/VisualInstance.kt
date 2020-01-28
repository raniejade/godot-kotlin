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

open class VisualInstance(
  _handle: COpaquePointer
) : Spatial(_handle) {
  var layers: Int
    get() {
       return getLayerMask() 
    }
    set(value) {
      setLayerMask(value)
    }

  fun getAabb(): AABB {
    val _ret = __method_bind.getAabb.call(this._handle)
    return _ret.asAABB()
  }

  fun getBase(): RID {
    val _ret = __method_bind.getBase.call(this._handle)
    return _ret.asRID()
  }

  fun getInstance(): RID {
    val _ret = __method_bind.getInstance.call(this._handle)
    return _ret.asRID()
  }

  fun getLayerMask(): Int {
    val _ret = __method_bind.getLayerMask.call(this._handle)
    return _ret.asInt()
  }

  fun getLayerMaskBit(layer: Int): Boolean {
    val _arg = Variant.new(layer)
    val _ret = __method_bind.getLayerMaskBit.call(this._handle, _arg, 1)
    return _ret.asBoolean()
  }

  fun getTransformedAabb(): AABB {
    val _ret = __method_bind.getTransformedAabb.call(this._handle)
    return _ret.asAABB()
  }

  fun setBase(base: RID) {
    val _arg = Variant.new(base)
    __method_bind.setBase.call(this._handle, _arg, 1)
  }

  fun setLayerMask(mask: Int) {
    val _arg = Variant.new(mask)
    __method_bind.setLayerMask.call(this._handle, _arg, 1)
  }

  fun setLayerMaskBit(layer: Int, enabled: Boolean) {
    val _args = VariantArray.new()
    _args.append(layer)
    _args.append(enabled)
    __method_bind.setLayerMaskBit.call(this._handle, _args.toVariant(), 2)
  }

  companion object {
    /**
     * Container for method_bind pointers for VisualInstance
     */
    private object __method_bind {
      val getAabb: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualInstance".cstr.ptr,
            "get_aabb".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_aabb" }
        }
      val getBase: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualInstance".cstr.ptr,
            "get_base".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_base" }
        }
      val getInstance: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualInstance".cstr.ptr,
            "get_instance".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_instance" }
        }
      val getLayerMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualInstance".cstr.ptr,
            "get_layer_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_layer_mask" }
        }
      val getLayerMaskBit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualInstance".cstr.ptr,
            "get_layer_mask_bit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_layer_mask_bit" }
        }
      val getTransformedAabb: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualInstance".cstr.ptr,
            "get_transformed_aabb".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_transformed_aabb" }
        }
      val setBase: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualInstance".cstr.ptr,
            "set_base".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_base" }
        }
      val setLayerMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualInstance".cstr.ptr,
            "set_layer_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_layer_mask" }
        }
      val setLayerMaskBit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualInstance".cstr.ptr,
            "set_layer_mask_bit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_layer_mask_bit" }
        }}
  }
}
