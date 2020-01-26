// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Color
import godot.core.Godot
import godot.core.PoolStringArray
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

open class Theme internal constructor(
  _handle: COpaquePointer
) : Resource(_handle) {
  fun clear() {
    TODO()
  }

  fun clearColor(name: String, type: String) {
    TODO()
  }

  fun clearConstant(name: String, type: String) {
    TODO()
  }

  fun clearFont(name: String, type: String) {
    TODO()
  }

  fun clearIcon(name: String, type: String) {
    TODO()
  }

  fun clearStylebox(name: String, type: String) {
    TODO()
  }

  fun copyDefaultTheme() {
    TODO()
  }

  fun copyTheme(other: Theme) {
    TODO()
  }

  fun getColor(name: String, type: String): Color {
    TODO()
  }

  fun getColorList(type: String): PoolStringArray {
    TODO()
  }

  fun getConstant(name: String, type: String): Int {
    TODO()
  }

  fun getConstantList(type: String): PoolStringArray {
    TODO()
  }

  fun getDefaultFont(): Font {
    TODO()
  }

  fun getFont(name: String, type: String): Font {
    TODO()
  }

  fun getFontList(type: String): PoolStringArray {
    TODO()
  }

  fun getIcon(name: String, type: String): Texture {
    TODO()
  }

  fun getIconList(type: String): PoolStringArray {
    TODO()
  }

  fun getStylebox(name: String, type: String): StyleBox {
    TODO()
  }

  fun getStyleboxList(type: String): PoolStringArray {
    TODO()
  }

  fun getStyleboxTypes(): PoolStringArray {
    TODO()
  }

  fun getTypeList(type: String): PoolStringArray {
    TODO()
  }

  fun hasColor(name: String, type: String): Boolean {
    TODO()
  }

  fun hasConstant(name: String, type: String): Boolean {
    TODO()
  }

  fun hasFont(name: String, type: String): Boolean {
    TODO()
  }

  fun hasIcon(name: String, type: String): Boolean {
    TODO()
  }

  fun hasStylebox(name: String, type: String): Boolean {
    TODO()
  }

  fun setColor(
    name: String,
    type: String,
    color: Color
  ) {
    TODO()
  }

  fun setConstant(
    name: String,
    type: String,
    constant: Int
  ) {
    TODO()
  }

  fun setDefaultFont(font: Font) {
    TODO()
  }

  fun setFont(
    name: String,
    type: String,
    font: Font
  ) {
    TODO()
  }

  fun setIcon(
    name: String,
    type: String,
    texture: Texture
  ) {
    TODO()
  }

  fun setStylebox(
    name: String,
    type: String,
    texture: StyleBox
  ) {
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
    fun from(ptr: COpaquePointer): Theme = Theme(ptr)
    /**
     * Container for method_bind pointers for Theme
     */
    private object __method_bind {
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
