// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Float
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class Font internal constructor(
  _handle: COpaquePointer
) : Resource(_handle) {
  fun draw() {
    TODO()
  }

  fun drawChar(): Float {
    TODO()
  }

  fun getAscent(): Float {
    TODO()
  }

  fun getDescent(): Float {
    TODO()
  }

  fun getHeight(): Float {
    TODO()
  }

  fun getStringSize(): Vector2 {
    TODO()
  }

  fun getWordwrapStringSize(): Vector2 {
    TODO()
  }

  fun hasOutline(): Boolean {
    TODO()
  }

  fun isDistanceFieldHint(): Boolean {
    TODO()
  }

  fun updateChanges() {
    TODO()
  }

  companion object {
    /**
     * Container for method_bind pointers for Font
     */
    private object __method_bind {
      val draw: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Font".cstr.ptr,
              "draw".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method draw" }
            }
          }

      val draw_char: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Font".cstr.ptr,
              "draw_char".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method draw_char" }
            }
          }

      val get_ascent: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Font".cstr.ptr,
              "get_ascent".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_ascent" }
            }
          }

      val get_descent: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Font".cstr.ptr,
              "get_descent".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_descent" }
            }
          }

      val get_height: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Font".cstr.ptr,
              "get_height".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_height" }
            }
          }

      val get_string_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Font".cstr.ptr,
              "get_string_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_string_size" }
            }
          }

      val get_wordwrap_string_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Font".cstr.ptr,
              "get_wordwrap_string_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_wordwrap_string_size" }
            }
          }

      val has_outline: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Font".cstr.ptr,
              "has_outline".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_outline" }
            }
          }

      val is_distance_field_hint: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Font".cstr.ptr,
              "is_distance_field_hint".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_distance_field_hint" }
            }
          }

      val update_changes: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Font".cstr.ptr,
              "update_changes".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method update_changes" }
            }
          }
    }
  }
}
