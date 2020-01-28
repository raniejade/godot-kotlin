// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Boolean
import kotlin.Int
import kotlin.String
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

  var hinting: Int
    get() {
       return DynamicFontData.Hinting.from(getHinting()) 
    }
    set(value) {
      setHinting(DynamicFontData.Hinting.from(value))
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
    __method_bind.setAntialiased.call(this._handle, _arg, 1)
  }

  fun setFontPath(path: String) {
    val _arg = Variant.new(path)
    __method_bind.setFontPath.call(this._handle, _arg, 1)
  }

  fun setHinting(mode: Int) {
    val _arg = Variant.new(mode)
    __method_bind.setHinting.call(this._handle, _arg, 1)
  }

  enum class Hinting(
    val value: Int
  ) {
    HINTING_NONE(0),

    HINTING_LIGHT(1),

    HINTING_NORMAL(2);

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
    val HINTING_LIGHT: Int = 1

    val HINTING_NONE: Int = 0

    val HINTING_NORMAL: Int = 2

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
            "getFontPath".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getFontPath" }
        }
      val getHinting: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DynamicFontData".cstr.ptr,
            "getHinting".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getHinting" }
        }
      val isAntialiased: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DynamicFontData".cstr.ptr,
            "isAntialiased".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method isAntialiased" }
        }
      val setAntialiased: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DynamicFontData".cstr.ptr,
            "setAntialiased".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setAntialiased" }
        }
      val setFontPath: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DynamicFontData".cstr.ptr,
            "setFontPath".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setFontPath" }
        }
      val setHinting: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DynamicFontData".cstr.ptr,
            "setHinting".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setHinting" }
        }}
  }
}
