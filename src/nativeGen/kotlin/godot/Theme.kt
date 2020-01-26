// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Color
import godot.core.Godot
import godot.core.PoolStringArray
import kotlin.Boolean
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class Theme internal constructor(
  _handle: COpaquePointer
) : Resource(_handle) {
  fun emitThemeChanged() {
    TODO()
  }

  fun clear() {
    TODO()
  }

  fun clearColor() {
    TODO()
  }

  fun clearConstant() {
    TODO()
  }

  fun clearFont() {
    TODO()
  }

  fun clearIcon() {
    TODO()
  }

  fun clearStylebox() {
    TODO()
  }

  fun copyDefaultTheme() {
    TODO()
  }

  fun copyTheme() {
    TODO()
  }

  fun getColor(): Color {
    TODO()
  }

  fun getColorList(): PoolStringArray {
    TODO()
  }

  fun getConstant(): Int {
    TODO()
  }

  fun getConstantList(): PoolStringArray {
    TODO()
  }

  fun getDefaultFont(): Font {
    TODO()
  }

  fun getFont(): Font {
    TODO()
  }

  fun getFontList(): PoolStringArray {
    TODO()
  }

  fun getIcon(): Texture {
    TODO()
  }

  fun getIconList(): PoolStringArray {
    TODO()
  }

  fun getStylebox(): StyleBox {
    TODO()
  }

  fun getStyleboxList(): PoolStringArray {
    TODO()
  }

  fun getStyleboxTypes(): PoolStringArray {
    TODO()
  }

  fun getTypeList(): PoolStringArray {
    TODO()
  }

  fun hasColor(): Boolean {
    TODO()
  }

  fun hasConstant(): Boolean {
    TODO()
  }

  fun hasFont(): Boolean {
    TODO()
  }

  fun hasIcon(): Boolean {
    TODO()
  }

  fun hasStylebox(): Boolean {
    TODO()
  }

  fun setColor() {
    TODO()
  }

  fun setConstant() {
    TODO()
  }

  fun setDefaultFont() {
    TODO()
  }

  fun setFont() {
    TODO()
  }

  fun setIcon() {
    TODO()
  }

  fun setStylebox() {
    TODO()
  }

  companion object {
    fun new(): Theme = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Theme".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton Theme" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Theme(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for Theme
     */
    private object __method_bind {
      val _emit_theme_changed: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
              "_emit_theme_changed".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _emit_theme_changed" }
            }
          }

      val clear: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
              "clear".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clear" }
            }
          }

      val clear_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
              "clear_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clear_color" }
            }
          }

      val clear_constant: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
              "clear_constant".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clear_constant" }
            }
          }

      val clear_font: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
              "clear_font".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clear_font" }
            }
          }

      val clear_icon: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
              "clear_icon".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clear_icon" }
            }
          }

      val clear_stylebox: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
              "clear_stylebox".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clear_stylebox" }
            }
          }

      val copy_default_theme: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
              "copy_default_theme".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method copy_default_theme" }
            }
          }

      val copy_theme: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
              "copy_theme".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method copy_theme" }
            }
          }

      val get_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
              "get_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_color" }
            }
          }

      val get_color_list: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
              "get_color_list".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_color_list" }
            }
          }

      val get_constant: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
              "get_constant".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_constant" }
            }
          }

      val get_constant_list: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
              "get_constant_list".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_constant_list" }
            }
          }

      val get_default_font: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
              "get_default_font".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_default_font" }
            }
          }

      val get_font: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
              "get_font".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_font" }
            }
          }

      val get_font_list: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
              "get_font_list".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_font_list" }
            }
          }

      val get_icon: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
              "get_icon".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_icon" }
            }
          }

      val get_icon_list: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
              "get_icon_list".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_icon_list" }
            }
          }

      val get_stylebox: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
              "get_stylebox".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_stylebox" }
            }
          }

      val get_stylebox_list: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
              "get_stylebox_list".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_stylebox_list" }
            }
          }

      val get_stylebox_types: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
              "get_stylebox_types".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_stylebox_types" }
            }
          }

      val get_type_list: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
              "get_type_list".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_type_list" }
            }
          }

      val has_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
              "has_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_color" }
            }
          }

      val has_constant: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
              "has_constant".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_constant" }
            }
          }

      val has_font: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
              "has_font".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_font" }
            }
          }

      val has_icon: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
              "has_icon".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_icon" }
            }
          }

      val has_stylebox: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
              "has_stylebox".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_stylebox" }
            }
          }

      val set_color: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
              "set_color".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_color" }
            }
          }

      val set_constant: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
              "set_constant".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_constant" }
            }
          }

      val set_default_font: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
              "set_default_font".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_default_font" }
            }
          }

      val set_font: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
              "set_font".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_font" }
            }
          }

      val set_icon: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
              "set_icon".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_icon" }
            }
          }

      val set_stylebox: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Theme".cstr.ptr,
              "set_stylebox".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_stylebox" }
            }
          }
    }
  }
}
