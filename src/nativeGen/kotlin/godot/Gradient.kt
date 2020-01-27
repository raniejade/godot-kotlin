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

open class Gradient internal constructor(
  _handle: COpaquePointer
) : Resource(_handle) {
  fun addPoint(offset: Float, color: Color) {
    val _args = VariantArray.new()
    _args.append(offset)
    _args.append(color)
    val _ret = __method_bind.add_point.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun getColor(point: Int): Color {
    val _args = VariantArray.new()
    _args.append(point)
    val _ret = __method_bind.get_color.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getColors(): PoolColorArray {
    val _ret = __method_bind.get_colors.call(this.toVariant())
    TODO()
  }

  fun getOffset(point: Int): Float {
    val _args = VariantArray.new()
    _args.append(point)
    val _ret = __method_bind.get_offset.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getOffsets(): PoolRealArray {
    val _ret = __method_bind.get_offsets.call(this.toVariant())
    TODO()
  }

  fun getPointCount(): Int {
    val _ret = __method_bind.get_point_count.call(this.toVariant())
    TODO()
  }

  fun interpolate(offset: Float): Color {
    val _args = VariantArray.new()
    _args.append(offset)
    val _ret = __method_bind.interpolate.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun removePoint(offset: Int) {
    val _args = VariantArray.new()
    _args.append(offset)
    val _ret = __method_bind.remove_point.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setColor(point: Int, color: Color) {
    val _args = VariantArray.new()
    _args.append(point)
    _args.append(color)
    val _ret = __method_bind.set_color.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun setColors(colors: PoolColorArray) {
    val _args = VariantArray.new()
    _args.append(colors)
    val _ret = __method_bind.set_colors.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setOffset(point: Int, offset: Float) {
    val _args = VariantArray.new()
    _args.append(point)
    _args.append(offset)
    val _ret = __method_bind.set_offset.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  fun setOffsets(offsets: PoolRealArray) {
    val _args = VariantArray.new()
    _args.append(offsets)
    val _ret = __method_bind.set_offsets.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  companion object {
    fun new(): Gradient = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Gradient".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton Gradient" }
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
      val add_point: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Gradient".cstr.ptr,
              "add_point".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_point" }
            }
          }

      val get_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Gradient".cstr.ptr,
              "get_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_color" }
            }
          }

      val get_colors: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Gradient".cstr.ptr,
              "get_colors".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_colors" }
            }
          }

      val get_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Gradient".cstr.ptr,
              "get_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_offset" }
            }
          }

      val get_offsets: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Gradient".cstr.ptr,
              "get_offsets".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_offsets" }
            }
          }

      val get_point_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Gradient".cstr.ptr,
              "get_point_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_point_count" }
            }
          }

      val interpolate: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Gradient".cstr.ptr,
              "interpolate".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method interpolate" }
            }
          }

      val remove_point: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Gradient".cstr.ptr,
              "remove_point".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method remove_point" }
            }
          }

      val set_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Gradient".cstr.ptr,
              "set_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_color" }
            }
          }

      val set_colors: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Gradient".cstr.ptr,
              "set_colors".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_colors" }
            }
          }

      val set_offset: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Gradient".cstr.ptr,
              "set_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_offset" }
            }
          }

      val set_offsets: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Gradient".cstr.ptr,
              "set_offsets".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_offsets" }
            }
          }
    }
  }
}
