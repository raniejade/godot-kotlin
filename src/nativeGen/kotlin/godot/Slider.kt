// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
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

open class Slider internal constructor(
  _handle: COpaquePointer
) : Range(_handle) {
  fun getTicks(): Int {
    val _ret = __method_bind.get_ticks.call(this.toVariant())
    return _ret.asInt()
  }

  fun getTicksOnBorders(): Boolean {
    val _ret = __method_bind.get_ticks_on_borders.call(this.toVariant())
    return _ret.asBool()
  }

  fun isEditable(): Boolean {
    val _ret = __method_bind.is_editable.call(this.toVariant())
    return _ret.asBool()
  }

  fun isScrollable(): Boolean {
    val _ret = __method_bind.is_scrollable.call(this.toVariant())
    return _ret.asBool()
  }

  fun setEditable(editable: Boolean) {
    val _args = VariantArray.new()
    _args.append(editable)
    __method_bind.set_editable.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setScrollable(scrollable: Boolean) {
    val _args = VariantArray.new()
    _args.append(scrollable)
    __method_bind.set_scrollable.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setTicks(count: Int) {
    val _args = VariantArray.new()
    _args.append(count)
    __method_bind.set_ticks.call(this.toVariant(), _args.toVariant(), 1)
  }

  fun setTicksOnBorders(ticksOnBorder: Boolean) {
    val _args = VariantArray.new()
    _args.append(ticksOnBorder)
    __method_bind.set_ticks_on_borders.call(this.toVariant(), _args.toVariant(), 1)
  }

  companion object {
    /**
     * Container for method_bind pointers for Slider
     */
    private object __method_bind {
      val get_ticks: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Slider".cstr.ptr,
              "get_ticks".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_ticks" }
            }
          }

      val get_ticks_on_borders: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Slider".cstr.ptr,
              "get_ticks_on_borders".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_ticks_on_borders" }
            }
          }

      val is_editable: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Slider".cstr.ptr,
              "is_editable".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_editable" }
            }
          }

      val is_scrollable: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Slider".cstr.ptr,
              "is_scrollable".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_scrollable" }
            }
          }

      val set_editable: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Slider".cstr.ptr,
              "set_editable".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_editable" }
            }
          }

      val set_scrollable: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Slider".cstr.ptr,
              "set_scrollable".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_scrollable" }
            }
          }

      val set_ticks: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Slider".cstr.ptr,
              "set_ticks".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_ticks" }
            }
          }

      val set_ticks_on_borders: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Slider".cstr.ptr,
              "set_ticks_on_borders".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_ticks_on_borders" }
            }
          }
    }
  }
}
