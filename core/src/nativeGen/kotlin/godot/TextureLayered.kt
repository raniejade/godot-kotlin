// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.reflect.KCallable
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.memScoped
import kotlinx.cinterop.reinterpret

open class TextureLayered(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Resource(null) {
  var flags: Int
    get() {
       return getFlags() 
    }
    set(value) {
      setFlags(value)
    }

  internal constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun create(
    width: Int,
    height: Int,
    depth: Int,
    format: Int,
    flags: Int = 4
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(width))
    _args.add(Variant.fromAny(height))
    _args.add(Variant.fromAny(depth))
    _args.add(Variant.fromAny(format))
    _args.add(Variant.fromAny(flags))
    __method_bind.create.call(this._handle, _args)
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
    val _arg = Variant(layer)
    val _ret = __method_bind.getLayerData.call(this._handle, listOf(_arg))
    return _ret.toAny() as Image
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
    mipmap: Int = 0
  ) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(image))
    _args.add(Variant.fromAny(xOffset))
    _args.add(Variant.fromAny(yOffset))
    _args.add(Variant.fromAny(layer))
    _args.add(Variant.fromAny(mipmap))
    __method_bind.setDataPartial.call(this._handle, _args)
  }

  fun setFlags(flags: Int) {
    val _arg = Variant(flags)
    __method_bind.setFlags.call(this._handle, listOf(_arg))
  }

  fun setLayerData(image: Image, layer: Int) {
    val _args = mutableListOf<Variant>()
    _args.add(Variant.fromAny(image))
    _args.add(Variant.fromAny(layer))
    __method_bind.setLayerData.call(this._handle, _args)
  }

  enum class Flags(
    val value: Int
  ) {
    FLAG_MIPMAPS(1),

    FLAG_REPEAT(2),

    FLAG_FILTER(4),

    DEFAULT(4);

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
    /**
     * Container for method_bind pointers for TextureLayered
     */
    private object __method_bind {
      val create: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureLayered".cstr.ptr,
            "create".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method create" }
        }
      val getDepth: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureLayered".cstr.ptr,
            "get_depth".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_depth" }
        }
      val getFlags: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureLayered".cstr.ptr,
            "get_flags".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_flags" }
        }
      val getFormat: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureLayered".cstr.ptr,
            "get_format".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_format" }
        }
      val getHeight: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureLayered".cstr.ptr,
            "get_height".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_height" }
        }
      val getLayerData: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureLayered".cstr.ptr,
            "get_layer_data".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_layer_data" }
        }
      val getWidth: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureLayered".cstr.ptr,
            "get_width".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_width" }
        }
      val setDataPartial: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureLayered".cstr.ptr,
            "set_data_partial".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_data_partial" }
        }
      val setFlags: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureLayered".cstr.ptr,
            "set_flags".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_flags" }
        }
      val setLayerData: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr =
            checkNotNull(Godot.gdnative.godot_method_bind_get_method)("TextureLayered".cstr.ptr,
            "set_layer_data".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_layer_data" }
        }}
  }
}
