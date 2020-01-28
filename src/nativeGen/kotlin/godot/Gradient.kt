// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Color
import godot.core.Godot
import godot.core.PoolColorArray
import godot.core.PoolRealArray
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Float
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class Gradient(
  _handle: COpaquePointer
) : Resource(_handle) {
  var colors: PoolColorArray
    get() {
       return getColors() 
    }
    set(value) {
      setColors(value)
    }

  var offsets: PoolRealArray
    get() {
       return getOffsets() 
    }
    set(value) {
      setOffsets(value)
    }

  fun addPoint(offset: Float, color: Color) {
    val _args = VariantArray.new()
    _args.append(offset)
    _args.append(color)
    __method_bind.addPoint.call(this._handle, _args.toVariant(), 2)
  }

  fun getColor(point: Int): Color {
    val _arg = Variant.new(point)
    val _ret = __method_bind.getColor.call(this._handle, _arg, 1)
    return _ret.asColor()
  }

  fun getColors(): PoolColorArray {
    val _ret = __method_bind.getColors.call(this._handle)
    return _ret.asPoolColorArray()
  }

  fun getOffset(point: Int): Float {
    val _arg = Variant.new(point)
    val _ret = __method_bind.getOffset.call(this._handle, _arg, 1)
    return _ret.asFloat()
  }

  fun getOffsets(): PoolRealArray {
    val _ret = __method_bind.getOffsets.call(this._handle)
    return _ret.asPoolRealArray()
  }

  fun getPointCount(): Int {
    val _ret = __method_bind.getPointCount.call(this._handle)
    return _ret.asInt()
  }

  fun interpolate(offset: Float): Color {
    val _arg = Variant.new(offset)
    val _ret = __method_bind.interpolate.call(this._handle, _arg, 1)
    return _ret.asColor()
  }

  fun removePoint(offset: Int) {
    val _arg = Variant.new(offset)
    __method_bind.removePoint.call(this._handle, _arg, 1)
  }

  fun setColor(point: Int, color: Color) {
    val _args = VariantArray.new()
    _args.append(point)
    _args.append(color)
    __method_bind.setColor.call(this._handle, _args.toVariant(), 2)
  }

  fun setColors(colors: PoolColorArray) {
    val _arg = Variant.new(colors)
    __method_bind.setColors.call(this._handle, _arg, 1)
  }

  fun setOffset(point: Int, offset: Float) {
    val _args = VariantArray.new()
    _args.append(point)
    _args.append(offset)
    __method_bind.setOffset.call(this._handle, _args.toVariant(), 2)
  }

  fun setOffsets(offsets: PoolRealArray) {
    val _arg = Variant.new(offsets)
    __method_bind.setOffsets.call(this._handle, _arg, 1)
  }

  companion object {
    fun new(): Gradient = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Gradient".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for Gradient" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Gradient(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): Gradient = Gradient(ptr)
    /**
     * Container for method_bind pointers for Gradient
     */
    private object __method_bind {
      val addPoint: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Gradient".cstr.ptr,
            "add_point".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_point" }
        }
      val getColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Gradient".cstr.ptr,
            "get_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_color" }
        }
      val getColors: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Gradient".cstr.ptr,
            "get_colors".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_colors" }
        }
      val getOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Gradient".cstr.ptr,
            "get_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_offset" }
        }
      val getOffsets: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Gradient".cstr.ptr,
            "get_offsets".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_offsets" }
        }
      val getPointCount: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Gradient".cstr.ptr,
            "get_point_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_point_count" }
        }
      val interpolate: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Gradient".cstr.ptr,
            "interpolate".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method interpolate" }
        }
      val removePoint: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Gradient".cstr.ptr,
            "remove_point".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_point" }
        }
      val setColor: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Gradient".cstr.ptr,
            "set_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_color" }
        }
      val setColors: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Gradient".cstr.ptr,
            "set_colors".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_colors" }
        }
      val setOffset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Gradient".cstr.ptr,
            "set_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_offset" }
        }
      val setOffsets: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Gradient".cstr.ptr,
            "set_offsets".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_offsets" }
        }}
  }
}
