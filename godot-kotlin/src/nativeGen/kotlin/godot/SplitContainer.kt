// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
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

open class SplitContainer(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Container(null) {
  var collapsed: Boolean
    get() {
       return isCollapsed() 
    }
    set(value) {
      setCollapsed(value)
    }

  var draggerVisibility: DraggerVisibility
    get() {
       return getDraggerVisibility() 
    }
    set(value) {
      setDraggerVisibility(value.value)
    }

  var splitOffset: Int
    get() {
       return getSplitOffset() 
    }
    set(value) {
      setSplitOffset(value)
    }

  /**
   * SplitContainer::dragged signal
   */
  val signalDragged: Signal1<Int> = Signal1("dragged")

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun clampSplitOffset() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.clampSplitOffset.call(self._handle, emptyList(), null)
    }
  }

  fun getDraggerVisibility(): DraggerVisibility {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getDraggerVisibility.call(self._handle, emptyList(), _retPtr)
      SplitContainer.DraggerVisibility.from(_ret.value)
    }
  }

  fun getSplitOffset(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getSplitOffset.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isCollapsed(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isCollapsed.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun setCollapsed(collapsed: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setCollapsed.call(self._handle, listOf(collapsed), null)
    }
  }

  fun setDraggerVisibility(mode: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setDraggerVisibility.call(self._handle, listOf(mode), null)
    }
  }

  fun setSplitOffset(offset: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSplitOffset.call(self._handle, listOf(offset), null)
    }
  }

  enum class DraggerVisibility(
    val value: Int
  ) {
    VISIBLE(0),

    HIDDEN(1),

    HIDDEN_COLLAPSED(2);

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
    /**
     * Container for method_bind pointers for SplitContainer
     */
    private object __method_bind {
      val clampSplitOffset: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SplitContainer".cstr.ptr,
              "clamp_split_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clamp_split_offset" }
            }
          }

      val getDraggerVisibility: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SplitContainer".cstr.ptr,
              "get_dragger_visibility".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_dragger_visibility" }
            }
          }

      val getSplitOffset: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SplitContainer".cstr.ptr,
              "get_split_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_split_offset" }
            }
          }

      val isCollapsed: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SplitContainer".cstr.ptr,
              "is_collapsed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_collapsed" }
            }
          }

      val setCollapsed: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SplitContainer".cstr.ptr,
              "set_collapsed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_collapsed" }
            }
          }

      val setDraggerVisibility: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SplitContainer".cstr.ptr,
              "set_dragger_visibility".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_dragger_visibility" }
            }
          }

      val setSplitOffset: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("SplitContainer".cstr.ptr,
              "set_split_offset".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_split_offset" }
            }
          }
    }
  }
}
