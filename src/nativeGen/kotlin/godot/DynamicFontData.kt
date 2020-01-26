// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
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

open class DynamicFontData internal constructor(
  _handle: COpaquePointer
) : Resource(_handle) {
  fun getFontPath(): String {
    TODO()
  }

  fun getHinting(): Hinting {
    TODO()
  }

  fun isAntialiased(): Boolean {
    TODO()
  }

  fun setAntialiased(antialiased: Boolean) {
    TODO()
  }

  fun setFontPath(path: String) {
    TODO()
  }

  fun setHinting(mode: Int) {
    TODO()
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
      requireNotNull(fnPtr) { "No instance found for singleton DynamicFontData" }
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
      val get_font_path: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DynamicFontData".cstr.ptr,
              "get_font_path".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_font_path" }
            }
          }

      val get_hinting: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DynamicFontData".cstr.ptr,
              "get_hinting".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_hinting" }
            }
          }

      val is_antialiased: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DynamicFontData".cstr.ptr,
              "is_antialiased".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_antialiased" }
            }
          }

      val set_antialiased: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DynamicFontData".cstr.ptr,
              "set_antialiased".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_antialiased" }
            }
          }

      val set_font_path: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DynamicFontData".cstr.ptr,
              "set_font_path".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_font_path" }
            }
          }

      val set_hinting: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("DynamicFontData".cstr.ptr,
              "set_hinting".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_hinting" }
            }
          }
    }
  }
}
