// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Rect2
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Float
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

open class BitMap(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Resource(null) {
  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun create(size: Vector2) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.create.call(self._handle, listOf(size), null)
    }
  }

  fun createFromImageAlpha(image: Image, threshold: Float = 0.1f) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(image)
      _args.add(threshold)
      __method_bind.createFromImageAlpha.call(self._handle, _args, null)
    }
  }

  fun getBit(position: Vector2): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getBit.call(self._handle, listOf(position), _retPtr)
      _ret.value
    }
  }

  fun getSize(): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getSize.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getTrueBitCount(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getTrueBitCount.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun growMask(pixels: Int, rect: Rect2) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(pixels)
      _args.add(rect)
      __method_bind.growMask.call(self._handle, _args, null)
    }
  }

  fun opaqueToPolygons(rect: Rect2, epsilon: Float = 2.0f): VariantArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = VariantArray()
      val _retPtr = _ret._value.ptr
      val _args = mutableListOf<Any?>()
      _args.add(rect)
      _args.add(epsilon)
      __method_bind.opaqueToPolygons.call(self._handle, _args, _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun setBit(position: Vector2, bit: Boolean) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(position)
      _args.add(bit)
      __method_bind.setBit.call(self._handle, _args, null)
    }
  }

  fun setBitRect(rect: Rect2, bit: Boolean) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(rect)
      _args.add(bit)
      __method_bind.setBitRect.call(self._handle, _args, null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("BitMap".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for BitMap" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for BitMap
     */
    private object __method_bind {
      val create: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BitMap".cstr.ptr,
            "create".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method create" }
        }
      val createFromImageAlpha: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BitMap".cstr.ptr,
            "create_from_image_alpha".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method create_from_image_alpha" }
        }
      val getBit: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BitMap".cstr.ptr,
            "get_bit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_bit" }
        }
      val getSize: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BitMap".cstr.ptr,
            "get_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_size" }
        }
      val getTrueBitCount: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BitMap".cstr.ptr,
            "get_true_bit_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_true_bit_count" }
        }
      val growMask: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BitMap".cstr.ptr,
            "grow_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method grow_mask" }
        }
      val opaqueToPolygons: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BitMap".cstr.ptr,
            "opaque_to_polygons".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method opaque_to_polygons" }
        }
      val setBit: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BitMap".cstr.ptr,
            "set_bit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_bit" }
        }
      val setBitRect: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BitMap".cstr.ptr,
            "set_bit_rect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_bit_rect" }
        }}
  }
}
