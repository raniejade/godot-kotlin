// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.AABB
import godot.core.Allocator
import godot.core.Godot
import godot.core.RID
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.reflect.KCallable
import kotlinx.cinterop.BooleanVar
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.COpaquePointerVar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.DoubleVar
import kotlinx.cinterop.IntVar
import kotlinx.cinterop.alloc
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.readValue
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.value

open class VisualInstance(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Spatial(null) {
  var layers: Int
    get() {
       return getLayerMask() 
    }
    set(value) {
      setLayerMask(value)
    }

  internal constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getAabb(): AABB {
    val self = this
    return Allocator.allocationScope {
      val _ret = AABB()
      val _retPtr = _ret._value.ptr
      __method_bind.getAabb.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getBase(): RID {
    val self = this
    return Allocator.allocationScope {
      val _ret = RID()
      val _retPtr = _ret._value.ptr
      __method_bind.getBase.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getInstance(): RID {
    val self = this
    return Allocator.allocationScope {
      val _ret = RID()
      val _retPtr = _ret._value.ptr
      __method_bind.getInstance.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getLayerMask(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getLayerMask.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getLayerMaskBit(layer: Int): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getLayerMaskBit.call(self._handle, listOf(layer), _retPtr)
      _ret.value
    }
  }

  fun getTransformedAabb(): AABB {
    val self = this
    return Allocator.allocationScope {
      val _ret = AABB()
      val _retPtr = _ret._value.ptr
      __method_bind.getTransformedAabb.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun setBase(base: RID) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setBase.call(self._handle, listOf(base), null)
    }
  }

  fun setLayerMask(mask: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setLayerMask.call(self._handle, listOf(mask), null)
    }
  }

  fun setLayerMaskBit(layer: Int, enabled: Boolean) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(layer)
      _args.add(enabled)
      __method_bind.setLayerMaskBit.call(self._handle, _args, null)
    }
  }

  companion object {
    /**
     * Container for method_bind pointers for VisualInstance
     */
    private object __method_bind {
      val getAabb: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualInstance".cstr.ptr,
            "get_aabb".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_aabb" }
        }
      val getBase: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualInstance".cstr.ptr,
            "get_base".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_base" }
        }
      val getInstance: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualInstance".cstr.ptr,
            "get_instance".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_instance" }
        }
      val getLayerMask: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualInstance".cstr.ptr,
            "get_layer_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_layer_mask" }
        }
      val getLayerMaskBit: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualInstance".cstr.ptr,
            "get_layer_mask_bit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_layer_mask_bit" }
        }
      val getTransformedAabb: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualInstance".cstr.ptr,
            "get_transformed_aabb".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_transformed_aabb" }
        }
      val setBase: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualInstance".cstr.ptr,
            "set_base".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_base" }
        }
      val setLayerMask: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualInstance".cstr.ptr,
            "set_layer_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_layer_mask" }
        }
      val setLayerMaskBit: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("VisualInstance".cstr.ptr,
            "set_layer_mask_bit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_layer_mask_bit" }
        }}
  }
}
