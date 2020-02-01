// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Rect2
import godot.core.Variant
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

open class BitMap(
  _handle: COpaquePointer
) : Resource(_handle) {
  fun create(size: Vector2) {
    val _arg = Variant.new(size)
    __method_bind.create.call(this._handle, listOf(_arg))
  }

  fun createFromImageAlpha(image: Image, threshold: Float = 0.1f) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(image))
    _args.add(Variant.fromAny(threshold))
    __method_bind.createFromImageAlpha.call(this._handle, _args)
  }

  fun getBit(position: Vector2): Boolean {
    val _arg = Variant.new(position)
    val _ret = __method_bind.getBit.call(this._handle, listOf(_arg))
    return _ret.asBoolean()
  }

  fun getSize(): Vector2 {
    val _ret = __method_bind.getSize.call(this._handle)
    return _ret.asVector2()
  }

  fun getTrueBitCount(): Int {
    val _ret = __method_bind.getTrueBitCount.call(this._handle)
    return _ret.asInt()
  }

  fun growMask(pixels: Int, rect: Rect2) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(pixels))
    _args.add(Variant.fromAny(rect))
    __method_bind.growMask.call(this._handle, _args)
  }

  fun opaqueToPolygons(rect: Rect2, epsilon: Float = 2.0f): VariantArray {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(rect))
    _args.add(Variant.fromAny(epsilon))
    val _ret = __method_bind.opaqueToPolygons.call(this._handle, _args)
    return _ret.asVariantArray()
  }

  fun setBit(position: Vector2, bit: Boolean) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(position))
    _args.add(Variant.fromAny(bit))
    __method_bind.setBit.call(this._handle, _args)
  }

  fun setBitRect(rect: Rect2, bit: Boolean) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(rect))
    _args.add(Variant.fromAny(bit))
    __method_bind.setBitRect.call(this._handle, _args)
  }

  companion object {
    fun new(): BitMap = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("BitMap".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for BitMap" }
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
      val create: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BitMap".cstr.ptr,
            "create".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method create" }
        }
      val createFromImageAlpha: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BitMap".cstr.ptr,
            "create_from_image_alpha".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method create_from_image_alpha" }
        }
      val getBit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BitMap".cstr.ptr,
            "get_bit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_bit" }
        }
      val getSize: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BitMap".cstr.ptr,
            "get_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_size" }
        }
      val getTrueBitCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BitMap".cstr.ptr,
            "get_true_bit_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_true_bit_count" }
        }
      val growMask: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BitMap".cstr.ptr,
            "grow_mask".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method grow_mask" }
        }
      val opaqueToPolygons: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BitMap".cstr.ptr,
            "opaque_to_polygons".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method opaque_to_polygons" }
        }
      val setBit: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BitMap".cstr.ptr,
            "set_bit".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_bit" }
        }
      val setBitRect: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BitMap".cstr.ptr,
            "set_bit_rect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_bit_rect" }
        }}
  }
}
