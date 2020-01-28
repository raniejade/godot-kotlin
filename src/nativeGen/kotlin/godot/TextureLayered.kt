// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Dictionary
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

open class TextureLayered(
  _handle: COpaquePointer
) : Resource(_handle) {
  var data: Dictionary
    get() {
       return _getData() 
    }
    set(value) {
      _setData(value)
    }

  var flags: Int
    get() {
       return getFlags() 
    }
    set(value) {
      setFlags(value)
    }

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
    __method_bind.create.call(this._handle, _args.toVariant(), 5)
  }

  fun getDepth(): Int {
    val _ret = __method_bind.getDepth.call(this._handle)
    return _ret.asInt()
  }

  fun getFlags(): Int {
    val _ret = __method_bind.getFlags.call(this._handle)
    return _ret.asInt()
  }

  fun getFormat(): Image.Format {
    val _ret = __method_bind.getFormat.call(this._handle)
    return Image.Format.from(_ret.asInt())
  }

  fun getHeight(): Int {
    val _ret = __method_bind.getHeight.call(this._handle)
    return _ret.asInt()
  }

  fun getLayerData(layer: Int): Image {
    val _arg = Variant.new(layer)
    val _ret = __method_bind.getLayerData.call(this._handle, _arg, 1)
    return _ret.asObject(::Image)!!
  }

  fun getWidth(): Int {
    val _ret = __method_bind.getWidth.call(this._handle)
    return _ret.asInt()
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
    __method_bind.setDataPartial.call(this._handle, _args.toVariant(), 5)
  }

  fun setFlags(flags: Int) {
    val _arg = Variant.new(flags)
    __method_bind.setFlags.call(this._handle, _arg, 1)
  }

  fun setLayerData(image: Image, layer: Int) {
    val _args = VariantArray.new()
    _args.append(image)
    _args.append(layer)
    __method_bind.setLayerData.call(this._handle, _args.toVariant(), 2)
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
      val create: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureLayered".cstr.ptr,
            "create".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method create" }
        }
      val getDepth: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureLayered".cstr.ptr,
            "getDepth".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getDepth" }
        }
      val getFlags: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureLayered".cstr.ptr,
            "getFlags".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getFlags" }
        }
      val getFormat: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureLayered".cstr.ptr,
            "getFormat".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getFormat" }
        }
      val getHeight: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureLayered".cstr.ptr,
            "getHeight".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getHeight" }
        }
      val getLayerData: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureLayered".cstr.ptr,
            "getLayerData".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getLayerData" }
        }
      val getWidth: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureLayered".cstr.ptr,
            "getWidth".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method getWidth" }
        }
      val setDataPartial: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureLayered".cstr.ptr,
            "setDataPartial".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setDataPartial" }
        }
      val setFlags: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureLayered".cstr.ptr,
            "setFlags".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setFlags" }
        }
      val setLayerData: CPointer<godot_method_bind>
        get() = memScoped {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureLayered".cstr.ptr,
            "setLayerData".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method setLayerData" }
        }}
  }
}
