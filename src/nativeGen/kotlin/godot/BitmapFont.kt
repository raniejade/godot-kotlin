// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Rect2
import godot.core.Vector2
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

open class BitmapFont internal constructor(
  _handle: COpaquePointer
) : Font(_handle) {
  fun addChar(
    character: Int,
    texture: Int,
    rect: Rect2,
    align: Vector2,
    advance: Float
  ) {
    TODO()
  }

  fun addKerningPair(
    char_a: Int,
    char_b: Int,
    kerning: Int
  ) {
    TODO()
  }

  fun addTexture(texture: Texture) {
    TODO()
  }

  fun clear() {
    TODO()
  }

  fun createFromFnt(path: String): Error {
    TODO()
  }

  fun getCharSize(char: Int, next: Int): Vector2 {
    TODO()
  }

  fun getFallback(): BitmapFont {
    TODO()
  }

  fun getKerningPair(char_a: Int, char_b: Int): Int {
    TODO()
  }

  fun getTexture(idx: Int): Texture {
    TODO()
  }

  fun getTextureCount(): Int {
    TODO()
  }

  fun setAscent(px: Float) {
    TODO()
  }

  fun setDistanceFieldHint(enable: Boolean) {
    TODO()
  }

  fun setFallback(fallback: BitmapFont) {
    TODO()
  }

  fun setHeight(px: Float) {
    TODO()
  }

  companion object {
    fun new(): BitmapFont = memScoped {
      val fnPtr = checkNotNull(Godot.gdnative.godot_get_class_constructor)("BitmapFont".cstr.ptr)
      requireNotNull(fnPtr) { "No instance found for singleton BitmapFont" }
      val fn = fnPtr.reinterpret<CFunction<() -> COpaquePointer>>()
      BitmapFont(
        fn()
      )
    }
    /**
     * Container for method_bind pointers for BitmapFont
     */
    private object __method_bind {
      val add_char: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BitmapFont".cstr.ptr,
              "add_char".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_char" }
            }
          }

      val add_kerning_pair: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BitmapFont".cstr.ptr,
              "add_kerning_pair".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_kerning_pair" }
            }
          }

      val add_texture: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BitmapFont".cstr.ptr,
              "add_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method add_texture" }
            }
          }

      val clear: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BitmapFont".cstr.ptr,
              "clear".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method clear" }
            }
          }

      val create_from_fnt: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BitmapFont".cstr.ptr,
              "create_from_fnt".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method create_from_fnt" }
            }
          }

      val get_char_size: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BitmapFont".cstr.ptr,
              "get_char_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_char_size" }
            }
          }

      val get_fallback: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BitmapFont".cstr.ptr,
              "get_fallback".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_fallback" }
            }
          }

      val get_kerning_pair: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BitmapFont".cstr.ptr,
              "get_kerning_pair".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_kerning_pair" }
            }
          }

      val get_texture: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BitmapFont".cstr.ptr,
              "get_texture".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_texture" }
            }
          }

      val get_texture_count: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BitmapFont".cstr.ptr,
              "get_texture_count".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_texture_count" }
            }
          }

      val set_ascent: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BitmapFont".cstr.ptr,
              "set_ascent".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_ascent" }
            }
          }

      val set_distance_field_hint: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BitmapFont".cstr.ptr,
              "set_distance_field_hint".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_distance_field_hint" }
            }
          }

      val set_fallback: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BitmapFont".cstr.ptr,
              "set_fallback".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_fallback" }
            }
          }

      val set_height: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BitmapFont".cstr.ptr,
              "set_height".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_height" }
            }
          }
    }
  }
}
