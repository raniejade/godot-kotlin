// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.PoolIntArray
import godot.core.VariantArray
import godot.core.Vector2
import kotlin.Int
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
  fun getChars(): PoolIntArray {
    TODO()
  }

  fun getKernings(): PoolIntArray {
    TODO()
  }

  fun getTextures(): VariantArray {
    TODO()
  }

  fun setChars() {
    TODO()
  }

  fun setKernings() {
    TODO()
  }

  fun setTextures() {
    TODO()
  }

  fun addChar() {
    TODO()
  }

  fun addKerningPair() {
    TODO()
  }

  fun addTexture() {
    TODO()
  }

  fun clear() {
    TODO()
  }

  fun createFromFnt(): Error {
    TODO()
  }

  fun getCharSize(): Vector2 {
    TODO()
  }

  fun getFallback(): BitmapFont {
    TODO()
  }

  fun getKerningPair(): Int {
    TODO()
  }

  fun getTexture(): Texture {
    TODO()
  }

  fun getTextureCount(): Int {
    TODO()
  }

  fun setAscent() {
    TODO()
  }

  fun setDistanceFieldHint() {
    TODO()
  }

  fun setFallback() {
    TODO()
  }

  fun setHeight() {
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
      val _get_chars: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BitmapFont".cstr.ptr,
              "_get_chars".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _get_chars" }
            }
          }

      val _get_kernings: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BitmapFont".cstr.ptr,
              "_get_kernings".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _get_kernings" }
            }
          }

      val _get_textures: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BitmapFont".cstr.ptr,
              "_get_textures".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _get_textures" }
            }
          }

      val _set_chars: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BitmapFont".cstr.ptr,
              "_set_chars".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _set_chars" }
            }
          }

      val _set_kernings: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BitmapFont".cstr.ptr,
              "_set_kernings".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _set_kernings" }
            }
          }

      val _set_textures: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("BitmapFont".cstr.ptr,
              "_set_textures".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method _set_textures" }
            }
          }

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
