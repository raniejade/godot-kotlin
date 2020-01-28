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

open class SplitContainer(
  _handle: COpaquePointer
) : Container(_handle) {
  fun clampSplitOffset() {
    __method_bind.clamp_split_offset.call(this._handle)
  }

  fun getDraggerVisibility(): DraggerVisibility {
    val _ret = __method_bind.get_dragger_visibility.call(this._handle)
    return SplitContainer.DraggerVisibility.from(_ret.asInt())
  }

  fun getSplitOffset(): Int {
    val _ret = __method_bind.get_split_offset.call(this._handle)
    return _ret.asInt()
  }

  fun isCollapsed(): Boolean {
    val _ret = __method_bind.is_collapsed.call(this._handle)
    return _ret.asBoolean()
  }

  fun setCollapsed(collapsed: Boolean) {
    val _arg = Variant.new(collapsed)
    __method_bind.set_collapsed.call(this._handle, _arg, 1)
  }

  fun setDraggerVisibility(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.set_dragger_visibility.call(this._handle, _arg, 1)
  }

  fun setSplitOffset(offset: Int) {
    val _arg = Variant.new(offset)
    __method_bind.set_split_offset.call(this._handle, _arg, 1)
  }

  enum class DraggerVisibility(
    val value: Int
  ) {
    DRAGGER_VISIBLE(0),

    DRAGGER_HIDDEN(1),

    DRAGGER_HIDDEN_COLLAPSED(2);

    companion object {
      fun from(value: Int): DraggerVisibility {
        for (enumValue in values()) {
          if (enumValue.value == value) {
            return enumValue
          }
        }
        throw AssertionError("""Unsupported enum value: $value""")
      }
    }
  }

  companion object {
    val DRAGGER_HIDDEN: Int = 1

    val DRAGGER_HIDDEN_COLLAPSED: Int = 2

    val DRAGGER_VISIBLE: Int = 0

    /**
     * Container for method_bind pointers for SplitContainer
     */
    private object __method_bind {
      val clamp_split_offset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SplitContainer".cstr.ptr,
            "clamp_split_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clamp_split_offset" }
        }
      val get_dragger_visibility: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SplitContainer".cstr.ptr,
            "get_dragger_visibility".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_dragger_visibility" }
        }
      val get_split_offset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SplitContainer".cstr.ptr,
            "get_split_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_split_offset" }
        }
      val is_collapsed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SplitContainer".cstr.ptr,
            "is_collapsed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_collapsed" }
        }
      val set_collapsed: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SplitContainer".cstr.ptr,
            "set_collapsed".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_collapsed" }
        }
      val set_dragger_visibility: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SplitContainer".cstr.ptr,
            "set_dragger_visibility".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_dragger_visibility" }
        }
      val set_split_offset: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SplitContainer".cstr.ptr,
            "set_split_offset".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_split_offset" }
        }}
  }
}
