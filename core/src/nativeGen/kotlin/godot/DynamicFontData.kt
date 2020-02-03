// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class DynamicFontData(
  _handle: COpaquePointer
) : Resource(_handle) {
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

  fun getFontPath(): String {
    val _ret = __method_bind.getFontPath.call(this._handle)
    return _ret.asString()
  }

  fun getHinting(): Hinting {
    val _ret = __method_bind.getHinting.call(this._handle)
    return DynamicFontData.Hinting.from(_ret.asInt())
  }

  fun isAntialiased(): Boolean {
    val _ret = __method_bind.isAntialiased.call(this._handle)
    return _ret.asBoolean()
  }

  fun setAntialiased(antialiased: Boolean) {
    val _arg = Variant.new(antialiased)
    __method_bind.setAntialiased.call(this._handle, listOf(_arg))
  }

  fun setFontPath(path: String) {
    val _arg = Variant.new(path)
    __method_bind.setFontPath.call(this._handle, listOf(_arg))
  }

  fun setHinting(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.setHinting.call(this._handle, listOf(_arg))
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
    fun new(): DynamicFontData = memScoped {
      val fnPtr =
        checkNotNull(Godot.gdnative.godot_get_class_constructor)("DynamicFontData".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for DynamicFontData" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      DynamicFontData(
        fn()
      )
    }
    fun from(ptr: COpaquePointer): DynamicFontData = DynamicFontData(ptr)
    /**
     * Container for method_bind pointers for DynamicFontData
     */
    private object __method_bind {
      val getFontPath: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DynamicFontData".cstr.ptr,
            "get_font_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_font_path" }
        }
      val getHinting: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DynamicFontData".cstr.ptr,
            "get_hinting".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_hinting" }
        }
      val isAntialiased: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DynamicFontData".cstr.ptr,
            "is_antialiased".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method is_antialiased" }
        }
      val setAntialiased: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DynamicFontData".cstr.ptr,
            "set_antialiased".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_antialiased" }
        }
      val setFontPath: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DynamicFontData".cstr.ptr,
            "set_font_path".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_font_path" }
        }
      val setHinting: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DynamicFontData".cstr.ptr,
            "set_hinting".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_hinting" }
        }}
  }
}
