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

open class DynamicFontData(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Resource(null) {
  var antialiased: Boolean
    get() {
       return isAntialiased() 
    }
    set(value) {
      setAntialiased(value)
    }

  var fontPath: String
    get() {
       return getFontPath() 
    }
    set(value) {
      setFontPath(value)
    }

  var hinting: Hinting
    get() {
       return getHinting() 
    }
    set(value) {
      setHinting(value.value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun getFontPath(): String {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<godot_string>()
      val _retPtr = _ret.ptr
      checkNotNull(Godot.gdnative.godot_string_new)(_retPtr)
      __method_bind.getFontPath.call(self._handle, emptyList(), _retPtr)
      _ret.toKStringAndDestroy()
    }
  }

  fun getHinting(): Hinting {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getHinting.call(self._handle, emptyList(), _retPtr)
      DynamicFontData.Hinting.from(_ret.value)
    }
  }

  fun isAntialiased(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isAntialiased.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun setAntialiased(antialiased: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setAntialiased.call(self._handle, listOf(antialiased), null)
    }
  }

  fun setFontPath(path: String) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setFontPath.call(self._handle, listOf(path), null)
    }
  }

  fun setHinting(mode: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setHinting.call(self._handle, listOf(mode), null)
    }
  }

  enum class Hinting(
    val value: Int
  ) {
    NONE(0),

    LIGHT(1),

    NORMAL(2);

    companion object {
      fun from(value: Int): Hinting {
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
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("DynamicFontData".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for DynamicFontData" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for DynamicFontData
     */
    private object __method_bind {
      val getFontPath: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DynamicFontData".cstr.ptr,
            "get_font_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_font_path" }
        }
      val getHinting: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DynamicFontData".cstr.ptr,
            "get_hinting".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_hinting" }
        }
      val isAntialiased: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DynamicFontData".cstr.ptr,
            "is_antialiased".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_antialiased" }
        }
      val setAntialiased: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DynamicFontData".cstr.ptr,
            "set_antialiased".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_antialiased" }
        }
      val setFontPath: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DynamicFontData".cstr.ptr,
            "set_font_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_font_path" }
        }
      val setHinting: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DynamicFontData".cstr.ptr,
            "set_hinting".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_hinting" }
        }}
  }
}
