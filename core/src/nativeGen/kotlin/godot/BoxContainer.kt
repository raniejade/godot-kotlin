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

open class BoxContainer(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Container(null) {
  var alignment: AlignMode
    get() {
       return getAlignment() 
    }
    set(value) {
      setAlignment(value.value)
    }

  internal constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun addSpacer(begin: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.addSpacer.call(self._handle, listOf(begin), null)
    }
  }

  fun getAlignment(): AlignMode {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getAlignment.call(self._handle, emptyList(), _retPtr)
      BoxContainer.AlignMode.from(_ret.value)
    }
  }

  fun setAlignment(alignment: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setAlignment.call(self._handle, listOf(alignment), null)
    }
  }

  enum class AlignMode(
    val value: Int
  ) {
    BEGIN(0),

    CENTER(1),

    END(2);

    companion object {
      fun from(value: Int): AlignMode {
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
     * Container for method_bind pointers for BoxContainer
     */
    private object __method_bind {
      val addSpacer: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BoxContainer".cstr.ptr,
            "add_spacer".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_spacer" }
        }
      val getAlignment: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BoxContainer".cstr.ptr,
            "get_alignment".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_alignment" }
        }
      val setAlignment: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BoxContainer".cstr.ptr,
            "set_alignment".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_alignment" }
        }}
  }
}
