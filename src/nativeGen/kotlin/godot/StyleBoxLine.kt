// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Color
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
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

open class StyleBoxLine internal constructor(
  _handle: COpaquePointer
) : StyleBox(_handle) {
  fun getColor(): Color {
    val _ret = __method_bind.get_color.call(this.toVariant())
    return _ret.asColor()
  }

  fun getGrowBegin(): Float {
    val _ret = __method_bind.get_grow_begin.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getGrowEnd(): Float {
    val _ret = __method_bind.get_grow_end.call(this.toVariant())
    return _ret.asFloat()
  }

  fun getThickness(): Int {
    val _ret = __method_bind.get_thickness.call(this.toVariant())
    return _ret.asInt()
  }

  fun isVertical(): Boolean {
    val _ret = __method_bind.is_vertical.call(this.toVariant())
    return _ret.asBool()
  }

  fun setColor(color: Color) {
    val _arg = Variant.new(color)
    __method_bind.set_color.call(this.toVariant(), _arg, 1)
  }

  fun setGrowBegin(offset: Float) {
    val _arg = Variant.new(offset)
    __method_bind.set_grow_begin.call(this.toVariant(), _arg, 1)
  }

  fun setGrowEnd(offset: Float) {
    val _arg = Variant.new(offset)
    __method_bind.set_grow_end.call(this.toVariant(), _arg, 1)
  }

  fun setThickness(thickness: Int) {
    val _arg = Variant.new(thickness)
    __method_bind.set_thickness.call(this.toVariant(), _arg, 1)
  }

  fun setVertical(vertical: Boolean) {
    val _arg = Variant.new(vertical)
    __method_bind.set_vertical.call(this.toVariant(), _arg, 1)
  }

  companion object {
    fun new(): StyleBoxLine = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("StyleBoxLine".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for StyleBoxLine" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      StyleBoxLine(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): StyleBoxLine = StyleBoxLine(ptr)
    /**
     * Container for method_bind pointers for StyleBoxLine
     */
    private object __method_bind {
      val get_color: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxLine".cstr.ptr,
            "get_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_color" }
        }
      val get_grow_begin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxLine".cstr.ptr,
            "get_grow_begin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_grow_begin" }
        }
      val get_grow_end: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxLine".cstr.ptr,
            "get_grow_end".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_grow_end" }
        }
      val get_thickness: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxLine".cstr.ptr,
            "get_thickness".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_thickness" }
        }
      val is_vertical: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxLine".cstr.ptr,
            "is_vertical".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_vertical" }
        }
      val set_color: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxLine".cstr.ptr,
            "set_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_color" }
        }
      val set_grow_begin: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxLine".cstr.ptr,
            "set_grow_begin".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_grow_begin" }
        }
      val set_grow_end: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxLine".cstr.ptr,
            "set_grow_end".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_grow_end" }
        }
      val set_thickness: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxLine".cstr.ptr,
            "set_thickness".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_thickness" }
        }
      val set_vertical: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("StyleBoxLine".cstr.ptr,
            "set_vertical".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_vertical" }
        }}
  }
}
