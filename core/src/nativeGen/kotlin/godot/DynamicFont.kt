// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Color
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
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

open class DynamicFont(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Font(null) {
  var extraSpacingBottom: Int
    get() {
       return getSpacing(1) 
    }
    set(value) {
      setSpacing(1, value)
    }

  var extraSpacingChar: Int
    get() {
       return getSpacing(2) 
    }
    set(value) {
      setSpacing(2, value)
    }

  var extraSpacingSpace: Int
    get() {
       return getSpacing(3) 
    }
    set(value) {
      setSpacing(3, value)
    }

  var extraSpacingTop: Int
    get() {
       return getSpacing(0) 
    }
    set(value) {
      setSpacing(0, value)
    }

  var fontData: DynamicFontData
    get() {
       return getFontData() 
    }
    set(value) {
      setFontData(value)
    }

  var outlineColor: Color
    get() {
       return getOutlineColor() 
    }
    set(value) {
      setOutlineColor(value)
    }

  var outlineSize: Int
    get() {
       return getOutlineSize() 
    }
    set(value) {
      setOutlineSize(value)
    }

  var size: Int
    get() {
       return getSize() 
    }
    set(value) {
      setSize(value)
    }

  var useFilter: Boolean
    get() {
       return getUseFilter() 
    }
    set(value) {
      setUseFilter(value)
    }

  var useMipmaps: Boolean
    get() {
       return getUseMipmaps() 
    }
    set(value) {
      setUseMipmaps(value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  /**
   * Specialized setter for outlineColor
   */
  fun outlineColor(cb: Color.() -> Unit) {
    val _p = outlineColor
    cb(_p)
    outlineColor = _p
  }

  fun addFallback(data: DynamicFontData) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.addFallback.call(self._handle, listOf(data), null)
    }
  }

  fun getFallback(idx: Int): DynamicFontData {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: DynamicFontData
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getFallback.call(self._handle, listOf(idx), _retPtr)
      _ret = objectToType<DynamicFontData>(_tmp.value!!)
      _ret
    }
  }

  fun getFallbackCount(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getFallbackCount.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getFontData(): DynamicFontData {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: DynamicFontData
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getFontData.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<DynamicFontData>(_tmp.value!!)
      _ret
    }
  }

  fun getOutlineColor(): Color {
    val self = this
    return Allocator.allocationScope {
      val _ret = Color()
      val _retPtr = _ret._value.ptr
      __method_bind.getOutlineColor.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getOutlineSize(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getOutlineSize.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getSize(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getSize.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getSpacing(type: Int): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getSpacing.call(self._handle, listOf(type), _retPtr)
      _ret.value
    }
  }

  fun getUseFilter(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getUseFilter.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getUseMipmaps(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.getUseMipmaps.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun removeFallback(idx: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.removeFallback.call(self._handle, listOf(idx), null)
    }
  }

  fun setFallback(idx: Int, data: DynamicFontData) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(idx)
      _args.add(data)
      __method_bind.setFallback.call(self._handle, _args, null)
    }
  }

  fun setFontData(data: DynamicFontData) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setFontData.call(self._handle, listOf(data), null)
    }
  }

  fun setOutlineColor(color: Color) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setOutlineColor.call(self._handle, listOf(color), null)
    }
  }

  fun setOutlineSize(size: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setOutlineSize.call(self._handle, listOf(size), null)
    }
  }

  fun setSize(data: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setSize.call(self._handle, listOf(data), null)
    }
  }

  fun setSpacing(type: Int, value: Int) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(type)
      _args.add(value)
      __method_bind.setSpacing.call(self._handle, _args, null)
    }
  }

  fun setUseFilter(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setUseFilter.call(self._handle, listOf(enable), null)
    }
  }

  fun setUseMipmaps(enable: Boolean) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setUseMipmaps.call(self._handle, listOf(enable), null)
    }
  }

  enum class SpacingType(
    val value: Int
  ) {
    TOP(0),

    BOTTOM(1),

    CHAR(2),

    SPACE(3);

    companion object {
      fun from(value: Int): SpacingType {
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
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("DynamicFont".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for DynamicFont" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for DynamicFont
     */
    private object __method_bind {
      val addFallback: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DynamicFont".cstr.ptr,
            "add_fallback".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method add_fallback" }
        }
      val getFallback: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DynamicFont".cstr.ptr,
            "get_fallback".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_fallback" }
        }
      val getFallbackCount: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DynamicFont".cstr.ptr,
            "get_fallback_count".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_fallback_count" }
        }
      val getFontData: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DynamicFont".cstr.ptr,
            "get_font_data".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_font_data" }
        }
      val getOutlineColor: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DynamicFont".cstr.ptr,
            "get_outline_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_outline_color" }
        }
      val getOutlineSize: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DynamicFont".cstr.ptr,
            "get_outline_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_outline_size" }
        }
      val getSize: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DynamicFont".cstr.ptr,
            "get_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_size" }
        }
      val getSpacing: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DynamicFont".cstr.ptr,
            "get_spacing".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_spacing" }
        }
      val getUseFilter: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DynamicFont".cstr.ptr,
            "get_use_filter".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_use_filter" }
        }
      val getUseMipmaps: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DynamicFont".cstr.ptr,
            "get_use_mipmaps".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_use_mipmaps" }
        }
      val removeFallback: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DynamicFont".cstr.ptr,
            "remove_fallback".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method remove_fallback" }
        }
      val setFallback: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DynamicFont".cstr.ptr,
            "set_fallback".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_fallback" }
        }
      val setFontData: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DynamicFont".cstr.ptr,
            "set_font_data".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_font_data" }
        }
      val setOutlineColor: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DynamicFont".cstr.ptr,
            "set_outline_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_outline_color" }
        }
      val setOutlineSize: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DynamicFont".cstr.ptr,
            "set_outline_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_outline_size" }
        }
      val setSize: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DynamicFont".cstr.ptr,
            "set_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_size" }
        }
      val setSpacing: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DynamicFont".cstr.ptr,
            "set_spacing".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_spacing" }
        }
      val setUseFilter: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DynamicFont".cstr.ptr,
            "set_use_filter".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_use_filter" }
        }
      val setUseMipmaps: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DynamicFont".cstr.ptr,
            "set_use_mipmaps".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_use_mipmaps" }
        }}
  }
}
