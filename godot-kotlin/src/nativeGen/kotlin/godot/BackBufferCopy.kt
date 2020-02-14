// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Rect2
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
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

open class BackBufferCopy(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Node2D(null) {
  var copyMode: CopyMode
    get() {
       return getCopyMode() 
    }
    set(value) {
      setCopyMode(value.value)
    }

  var rect: Rect2
    get() {
       return getRect() 
    }
    set(value) {
      setRect(value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  /**
   * Specialized setter for rect
   */
  fun rect(cb: Rect2.() -> Unit) {
    val _p = rect
    cb(_p)
    rect = _p
  }

  fun getCopyMode(): CopyMode {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getCopyMode.call(self._handle, emptyList(), _retPtr)
      BackBufferCopy.CopyMode.from(_ret.value)
    }
  }

  fun getRect(): Rect2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Rect2()
      val _retPtr = _ret._value.ptr
      __method_bind.getRect.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun setCopyMode(copyMode: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setCopyMode.call(self._handle, listOf(copyMode), null)
    }
  }

  fun setRect(rect: Rect2) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setRect.call(self._handle, listOf(rect), null)
    }
  }

  enum class CopyMode(
    val value: Int
  ) {
    DISABLED(0),

    RECT(1),

    VIEWPORT(2);

    companion object {
      fun from(value: Int): CopyMode {
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
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("BackBufferCopy".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for BackBufferCopy" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for BackBufferCopy
     */
    private object __method_bind {
      val getCopyMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BackBufferCopy".cstr.ptr,
            "get_copy_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_copy_mode" }
        }
      val getRect: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BackBufferCopy".cstr.ptr,
            "get_rect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_rect" }
        }
      val setCopyMode: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BackBufferCopy".cstr.ptr,
            "set_copy_mode".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_copy_mode" }
        }
      val setRect: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BackBufferCopy".cstr.ptr,
            "set_rect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_rect" }
        }}
  }
}
