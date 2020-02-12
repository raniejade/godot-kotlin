// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Godot
import godot.core.Variant
import godot.core.VariantArray
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.reflect.KCallable
import kotlinx.cinterop.BooleanVar
import kotlinx.cinterop.CFunction
import kotlinx.cinterop.COpaquePointer
import kotlinx.cinterop.COpaquePointerVar
import kotlinx.cinterop.CPointer
import kotlinx.cinterop.DoubleVar
import kotlinx.cinterop.IntVar
import kotlinx.cinterop.alloc
import kotlinx.cinterop.cstr
import kotlinx.cinterop.invoke
import kotlinx.cinterop.pointed
import kotlinx.cinterop.ptr
import kotlinx.cinterop.readValue
import kotlinx.cinterop.reinterpret
import kotlinx.cinterop.value

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
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(width)
      _args.add(height)
      _args.add(depth)
      _args.add(format)
      _args.add(flags)
      __method_bind.create.call(self._handle, _args, null)
    }
  }

  fun getDepth(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getDepth.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getFlags(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getFlags.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getFormat(): Image.Format {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getFormat.call(self._handle, emptyList(), _retPtr)
      Image.Format.from(_ret.value)
    }
  }

  fun getHeight(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getHeight.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getLayerData(layer: Int): Image {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Image
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getLayerData.call(self._handle, listOf(layer), _retPtr)
      _ret = objectToType<Image>(_tmp.value!!)
      _ret
    }
  }

  fun getWidth(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getWidth.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun setDataPartial(
    image: Image,
    xOffset: Int,
    yOffset: Int,
    layer: Int,
    mipmap: Int = 0
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(image)
      _args.add(xOffset)
      _args.add(yOffset)
      _args.add(layer)
      _args.add(mipmap)
      __method_bind.setDataPartial.call(self._handle, _args, null)
    }
  }

  fun setFlags(flags: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setFlags.call(self._handle, listOf(flags), null)
    }
  }

  fun setLayerData(image: Image, layer: Int) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(image)
      _args.add(layer)
      __method_bind.setLayerData.call(self._handle, _args, null)
    }
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
