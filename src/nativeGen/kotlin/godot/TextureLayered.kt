// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Int
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class TextureLayered internal constructor(
  _handle: COpaquePointer
) : Resource(_handle) {
  fun create(
    width: Int,
    height: Int,
    depth: Int,
    format: Int,
    flags: Int
  ) {
    val _args = VariantArray.new()
    _args.append(width)
    _args.append(height)
    _args.append(depth)
    _args.append(format)
    _args.append(flags)
    val _ret = __method_bind.create.call(this.toVariant(), _args.toVariant(), 5)
    TODO()
  }

  fun getDepth(): Int {
    val _ret = __method_bind.get_depth.call(this.toVariant())
    TODO()
  }

  fun getFlags(): Int {
    val _ret = __method_bind.get_flags.call(this.toVariant())
    TODO()
  }

  fun getFormat(): Image.Format {
    val _ret = __method_bind.get_format.call(this.toVariant())
    TODO()
  }

  fun getHeight(): Int {
    val _ret = __method_bind.get_height.call(this.toVariant())
    TODO()
  }

  fun getLayerData(layer: Int): Image {
    val _args = VariantArray.new()
    _args.append(layer)
    val _ret = __method_bind.get_layer_data.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun getWidth(): Int {
    val _ret = __method_bind.get_width.call(this.toVariant())
    TODO()
  }

  fun setDataPartial(
    image: Image,
    xOffset: Int,
    yOffset: Int,
    layer: Int,
    mipmap: Int
  ) {
    val _args = VariantArray.new()
    _args.append(image)
    _args.append(xOffset)
    _args.append(yOffset)
    _args.append(layer)
    _args.append(mipmap)
    val _ret = __method_bind.set_data_partial.call(this.toVariant(), _args.toVariant(), 5)
    TODO()
  }

  fun setFlags(flags: Int) {
    val _args = VariantArray.new()
    _args.append(flags)
    val _ret = __method_bind.set_flags.call(this.toVariant(), _args.toVariant(), 1)
    TODO()
  }

  fun setLayerData(image: Image, layer: Int) {
    val _args = VariantArray.new()
    _args.append(image)
    _args.append(layer)
    val _ret = __method_bind.set_layer_data.call(this.toVariant(), _args.toVariant(), 2)
    TODO()
  }

  enum class Flags(
    val value: Int
  ) {
    FLAG_MIPMAPS(1),

    FLAG_REPEAT(2),

    FLAG_FILTER(4),

    FLAGS_DEFAULT(4);

    companion object {
      fun from(value: Int): Flags {
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
    val FLAGS_DEFAULT: Int = 4

    val FLAG_FILTER: Int = 4

    val FLAG_MIPMAPS: Int = 1

    val FLAG_REPEAT: Int = 2

    /**
     * Container for method_bind pointers for TextureLayered
     */
    private object __method_bind {
      val create: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureLayered".cstr.ptr,
              "create".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method create" }
            }
          }

      val get_depth: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureLayered".cstr.ptr,
              "get_depth".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_depth" }
            }
          }

      val get_flags: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureLayered".cstr.ptr,
              "get_flags".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_flags" }
            }
          }

      val get_format: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureLayered".cstr.ptr,
              "get_format".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_format" }
            }
          }

      val get_height: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureLayered".cstr.ptr,
              "get_height".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_height" }
            }
          }

      val get_layer_data: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureLayered".cstr.ptr,
              "get_layer_data".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_layer_data" }
            }
          }

      val get_width: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureLayered".cstr.ptr,
              "get_width".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_width" }
            }
          }

      val set_data_partial: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureLayered".cstr.ptr,
              "set_data_partial".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_data_partial" }
            }
          }

      val set_flags: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureLayered".cstr.ptr,
              "set_flags".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_flags" }
            }
          }

      val set_layer_data: CPointer<godot_method_bind> by lazy {
            memScoped {
              val ptr =
              checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureLayered".cstr.ptr,
              "set_layer_data".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method set_layer_data" }
            }
          }
    }
  }
}
