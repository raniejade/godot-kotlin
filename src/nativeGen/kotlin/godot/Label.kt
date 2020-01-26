// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import kotlin.Boolean
import kotlin.Float
import kotlin.Int
import kotlin.String
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class Label internal constructor(
  _handle: COpaquePointer
) : Control(_handle) {
  fun getAlign(): Align {
    TODO()
  }

  fun getLineCount(): Int {
    TODO()
  }

  fun getLineHeight(): Int {
    TODO()
  }

  fun getLinesSkipped(): Int {
    TODO()
  }

  fun getMaxLinesVisible(): Int {
    TODO()
  }

  fun getPercentVisible(): Float {
    TODO()
  }

  fun getText(): String {
    TODO()
  }

  fun getTotalCharacterCount(): Int {
    TODO()
  }

  fun getValign(): VAlign {
    TODO()
  }

  fun getVisibleCharacters(): Int {
    TODO()
  }

  fun getVisibleLineCount(): Int {
    TODO()
  }

  fun hasAutowrap(): Boolean {
    TODO()
  }

  fun isClippingText(): Boolean {
    TODO()
  }

  fun isUppercase(): Boolean {
    TODO()
  }

  fun setAlign(align: Int) {
    TODO()
  }

  fun setAutowrap(enable: Boolean) {
    TODO()
  }

  fun setClipText(enable: Boolean) {
    TODO()
  }

  fun setLinesSkipped(lines_skipped: Int) {
    TODO()
  }

  fun setMaxLinesVisible(lines_visible: Int) {
    TODO()
  }

  fun setPercentVisible(percent_visible: Float) {
    TODO()
  }

  fun setText(text: String) {
    TODO()
  }

  fun setUppercase(enable: Boolean) {
    TODO()
  }

  fun setValign(valign: Int) {
    TODO()
  }

  fun setVisibleCharacters(amount: Int) {
    TODO()
  }

  enum class Align(
    val value: Int
  ) {
    ALIGN_LEFT(0),

    ALIGN_CENTER(1),

    ALIGN_RIGHT(2),

    ALIGN_FILL(3);
  }

  enum class VAlign(
    val value: Int
  ) {
    VALIGN_TOP(0),

    VALIGN_CENTER(1),

    VALIGN_BOTTOM(2),

    VALIGN_FILL(3);
  }

  companion object {
    val ALIGN_CENTER: Int = 1

    val ALIGN_FILL: Int = 3

    val ALIGN_LEFT: Int = 0

    val ALIGN_RIGHT: Int = 2

    val VALIGN_BOTTOM: Int = 2

    val VALIGN_CENTER: Int = 1

    val VALIGN_FILL: Int = 3

    val VALIGN_TOP: Int = 0

    fun new(): Label = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("Label".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton Label" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      Label(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for Label
     */
    private object __method_bind {
      val get_align: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Label".cstr.ptr,
              "get_align".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_align" }
            }
          }

      val get_line_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Label".cstr.ptr,
              "get_line_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_line_count" }
            }
          }

      val get_line_height: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Label".cstr.ptr,
              "get_line_height".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_line_height" }
            }
          }

      val get_lines_skipped: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Label".cstr.ptr,
              "get_lines_skipped".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_lines_skipped" }
            }
          }

      val get_max_lines_visible: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Label".cstr.ptr,
              "get_max_lines_visible".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_max_lines_visible" }
            }
          }

      val get_percent_visible: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Label".cstr.ptr,
              "get_percent_visible".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_percent_visible" }
            }
          }

      val get_text: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Label".cstr.ptr,
              "get_text".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_text" }
            }
          }

      val get_total_character_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Label".cstr.ptr,
              "get_total_character_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_total_character_count" }
            }
          }

      val get_valign: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Label".cstr.ptr,
              "get_valign".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_valign" }
            }
          }

      val get_visible_characters: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Label".cstr.ptr,
              "get_visible_characters".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_visible_characters" }
            }
          }

      val get_visible_line_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Label".cstr.ptr,
              "get_visible_line_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_visible_line_count" }
            }
          }

      val has_autowrap: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Label".cstr.ptr,
              "has_autowrap".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_autowrap" }
            }
          }

      val is_clipping_text: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Label".cstr.ptr,
              "is_clipping_text".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_clipping_text" }
            }
          }

      val is_uppercase: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Label".cstr.ptr,
              "is_uppercase".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_uppercase" }
            }
          }

      val set_align: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Label".cstr.ptr,
              "set_align".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_align" }
            }
          }

      val set_autowrap: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Label".cstr.ptr,
              "set_autowrap".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_autowrap" }
            }
          }

      val set_clip_text: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Label".cstr.ptr,
              "set_clip_text".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_clip_text" }
            }
          }

      val set_lines_skipped: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Label".cstr.ptr,
              "set_lines_skipped".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_lines_skipped" }
            }
          }

      val set_max_lines_visible: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Label".cstr.ptr,
              "set_max_lines_visible".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_max_lines_visible" }
            }
          }

      val set_percent_visible: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Label".cstr.ptr,
              "set_percent_visible".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_percent_visible" }
            }
          }

      val set_text: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Label".cstr.ptr,
              "set_text".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_text" }
            }
          }

      val set_uppercase: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Label".cstr.ptr,
              "set_uppercase".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_uppercase" }
            }
          }

      val set_valign: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Label".cstr.ptr,
              "set_valign".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_valign" }
            }
          }

      val set_visible_characters: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Label".cstr.ptr,
              "set_visible_characters".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_visible_characters" }
            }
          }
    }
  }
}
