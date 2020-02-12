// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Color
import godot.core.Godot
import godot.core.PoolStringArray
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

open class Theme(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Resource(null) {
  var defaultFont: Font
    get() {
       return getDefaultFont() 
    }
    set(value) {
      setDefaultFont(value)
    }

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun clear() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.clear.call(self._handle, emptyList(), null)
    }
  }

  fun clearColor(name: String, type: String) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(name)
      _args.add(type)
      __method_bind.clearColor.call(self._handle, _args, null)
    }
  }

  fun clearConstant(name: String, type: String) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(name)
      _args.add(type)
      __method_bind.clearConstant.call(self._handle, _args, null)
    }
  }

  fun clearFont(name: String, type: String) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(name)
      _args.add(type)
      __method_bind.clearFont.call(self._handle, _args, null)
    }
  }

  fun clearIcon(name: String, type: String) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(name)
      _args.add(type)
      __method_bind.clearIcon.call(self._handle, _args, null)
    }
  }

  fun clearStylebox(name: String, type: String) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(name)
      _args.add(type)
      __method_bind.clearStylebox.call(self._handle, _args, null)
    }
  }

  fun copyDefaultTheme() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.copyDefaultTheme.call(self._handle, emptyList(), null)
    }
  }

  fun copyTheme(other: Theme) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.copyTheme.call(self._handle, listOf(other), null)
    }
  }

  fun getColor(name: String, type: String): Color {
    val self = this
    return Allocator.allocationScope {
      val _ret = Color()
      val _retPtr = _ret._value.ptr
      val _args = mutableListOf<Any?>()
      _args.add(name)
      _args.add(type)
      __method_bind.getColor.call(self._handle, _args, _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getColorList(type: String): PoolStringArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = PoolStringArray()
      val _retPtr = _ret._value.ptr
      __method_bind.getColorList.call(self._handle, listOf(type), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getConstant(name: String, type: String): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(name)
      _args.add(type)
      __method_bind.getConstant.call(self._handle, _args, _retPtr)
      _ret.value
    }
  }

  fun getConstantList(type: String): PoolStringArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = PoolStringArray()
      val _retPtr = _ret._value.ptr
      __method_bind.getConstantList.call(self._handle, listOf(type), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getDefaultFont(): Font {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Font
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getDefaultFont.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<Font>(_tmp.value!!)
      _ret
    }
  }

  fun getFont(name: String, type: String): Font {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Font
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      val _args = mutableListOf<Any?>()
      _args.add(name)
      _args.add(type)
      __method_bind.getFont.call(self._handle, _args, _retPtr)
      _ret = objectToType<Font>(_tmp.value!!)
      _ret
    }
  }

  fun getFontList(type: String): PoolStringArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = PoolStringArray()
      val _retPtr = _ret._value.ptr
      __method_bind.getFontList.call(self._handle, listOf(type), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getIcon(name: String, type: String): Texture {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Texture
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      val _args = mutableListOf<Any?>()
      _args.add(name)
      _args.add(type)
      __method_bind.getIcon.call(self._handle, _args, _retPtr)
      _ret = objectToType<Texture>(_tmp.value!!)
      _ret
    }
  }

  fun getIconList(type: String): PoolStringArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = PoolStringArray()
      val _retPtr = _ret._value.ptr
      __method_bind.getIconList.call(self._handle, listOf(type), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getStylebox(name: String, type: String): StyleBox {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: StyleBox
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      val _args = mutableListOf<Any?>()
      _args.add(name)
      _args.add(type)
      __method_bind.getStylebox.call(self._handle, _args, _retPtr)
      _ret = objectToType<StyleBox>(_tmp.value!!)
      _ret
    }
  }

  fun getStyleboxList(type: String): PoolStringArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = PoolStringArray()
      val _retPtr = _ret._value.ptr
      __method_bind.getStyleboxList.call(self._handle, listOf(type), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getStyleboxTypes(): PoolStringArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = PoolStringArray()
      val _retPtr = _ret._value.ptr
      __method_bind.getStyleboxTypes.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getTypeList(type: String): PoolStringArray {
    val self = this
    return Allocator.allocationScope {
      val _ret = PoolStringArray()
      val _retPtr = _ret._value.ptr
      __method_bind.getTypeList.call(self._handle, listOf(type), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun hasColor(name: String, type: String): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(name)
      _args.add(type)
      __method_bind.hasColor.call(self._handle, _args, _retPtr)
      _ret.value
    }
  }

  fun hasConstant(name: String, type: String): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(name)
      _args.add(type)
      __method_bind.hasConstant.call(self._handle, _args, _retPtr)
      _ret.value
    }
  }

  fun hasFont(name: String, type: String): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(name)
      _args.add(type)
      __method_bind.hasFont.call(self._handle, _args, _retPtr)
      _ret.value
    }
  }

  fun hasIcon(name: String, type: String): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(name)
      _args.add(type)
      __method_bind.hasIcon.call(self._handle, _args, _retPtr)
      _ret.value
    }
  }

  fun hasStylebox(name: String, type: String): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(name)
      _args.add(type)
      __method_bind.hasStylebox.call(self._handle, _args, _retPtr)
      _ret.value
    }
  }

  fun setColor(
    name: String,
    type: String,
    color: Color
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(name)
      _args.add(type)
      _args.add(color)
      __method_bind.setColor.call(self._handle, _args, null)
    }
  }

  fun setConstant(
    name: String,
    type: String,
    constant: Int
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(name)
      _args.add(type)
      _args.add(constant)
      __method_bind.setConstant.call(self._handle, _args, null)
    }
  }

  fun setDefaultFont(font: Font) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setDefaultFont.call(self._handle, listOf(font), null)
    }
  }

  fun setFont(
    name: String,
    type: String,
    font: Font
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(name)
      _args.add(type)
      _args.add(font)
      __method_bind.setFont.call(self._handle, _args, null)
    }
  }

  fun setIcon(
    name: String,
    type: String,
    texture: Texture
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(name)
      _args.add(type)
      _args.add(texture)
      __method_bind.setIcon.call(self._handle, _args, null)
    }
  }

  fun setStylebox(
    name: String,
    type: String,
    texture: StyleBox
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(name)
      _args.add(type)
      _args.add(texture)
      __method_bind.setStylebox.call(self._handle, _args, null)
    }
  }

  companion object {
    internal fun __new(): COpaquePointer = Allocator.allocationScope {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Theme".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for Theme" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      fn()
    }
    /**
     * Container for method_bind pointers for Theme
     */
    private object __method_bind {
      val clear: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "clear".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear" }
        }
      val clearColor: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "clear_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear_color" }
        }
      val clearConstant: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "clear_constant".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear_constant" }
        }
      val clearFont: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "clear_font".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear_font" }
        }
      val clearIcon: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "clear_icon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear_icon" }
        }
      val clearStylebox: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "clear_stylebox".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method clear_stylebox" }
        }
      val copyDefaultTheme: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "copy_default_theme".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method copy_default_theme" }
        }
      val copyTheme: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "copy_theme".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method copy_theme" }
        }
      val getColor: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "get_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_color" }
        }
      val getColorList: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "get_color_list".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_color_list" }
        }
      val getConstant: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "get_constant".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_constant" }
        }
      val getConstantList: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "get_constant_list".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_constant_list" }
        }
      val getDefaultFont: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "get_default_font".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_default_font" }
        }
      val getFont: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "get_font".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_font" }
        }
      val getFontList: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "get_font_list".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_font_list" }
        }
      val getIcon: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "get_icon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_icon" }
        }
      val getIconList: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "get_icon_list".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_icon_list" }
        }
      val getStylebox: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "get_stylebox".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_stylebox" }
        }
      val getStyleboxList: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "get_stylebox_list".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_stylebox_list" }
        }
      val getStyleboxTypes: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "get_stylebox_types".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_stylebox_types" }
        }
      val getTypeList: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "get_type_list".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_type_list" }
        }
      val hasColor: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "has_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_color" }
        }
      val hasConstant: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "has_constant".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_constant" }
        }
      val hasFont: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "has_font".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_font" }
        }
      val hasIcon: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "has_icon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_icon" }
        }
      val hasStylebox: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "has_stylebox".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_stylebox" }
        }
      val setColor: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "set_color".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_color" }
        }
      val setConstant: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "set_constant".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_constant" }
        }
      val setDefaultFont: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "set_default_font".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_default_font" }
        }
      val setFont: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "set_font".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_font" }
        }
      val setIcon: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "set_icon".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_icon" }
        }
      val setStylebox: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
            "set_stylebox".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_stylebox" }
        }}
  }
}
