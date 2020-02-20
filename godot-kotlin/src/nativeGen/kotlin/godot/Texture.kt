// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Color
import godot.core.Godot
import godot.core.RID
import godot.core.Rect2
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import kotlin.Boolean
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

open class Texture(
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

  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun draw(
    canvasItem: RID,
    position: Vector2,
    modulate: Color = Color(1,1,1,1),
    transpose: Boolean = false,
    normalMap: Texture
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(canvasItem)
      _args.add(position)
      _args.add(modulate)
      _args.add(transpose)
      _args.add(normalMap)
      __method_bind.draw.call(self._handle, _args, null)
    }
  }

  fun drawRect(
    canvasItem: RID,
    rect: Rect2,
    tile: Boolean,
    modulate: Color = Color(1,1,1,1),
    transpose: Boolean = false,
    normalMap: Texture
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(canvasItem)
      _args.add(rect)
      _args.add(tile)
      _args.add(modulate)
      _args.add(transpose)
      _args.add(normalMap)
      __method_bind.drawRect.call(self._handle, _args, null)
    }
  }

  fun drawRectRegion(
    canvasItem: RID,
    rect: Rect2,
    srcRect: Rect2,
    modulate: Color = Color(1,1,1,1),
    transpose: Boolean = false,
    normalMap: Texture,
    clipUv: Boolean = true
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(canvasItem)
      _args.add(rect)
      _args.add(srcRect)
      _args.add(modulate)
      _args.add(transpose)
      _args.add(normalMap)
      _args.add(clipUv)
      __method_bind.drawRectRegion.call(self._handle, _args, null)
    }
  }

  fun getData(): Image {
    val self = this
    return Allocator.allocationScope {
      lateinit var _ret: Image
      val _tmp = alloc<COpaquePointerVar>()
      val _retPtr = _tmp.ptr
      __method_bind.getData.call(self._handle, emptyList(), _retPtr)
      _ret = objectToType<Image>(_tmp.value!!)
      _ret
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

  fun getHeight(): Int {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<IntVar>()
      val _retPtr = _ret.ptr
      __method_bind.getHeight.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun getSize(): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getSize.call(self._handle, emptyList(), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
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

  fun hasAlpha(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.hasAlpha.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun setFlags(flags: Int) {
    val self = this
    return Allocator.allocationScope {
      __method_bind.setFlags.call(self._handle, listOf(flags), null)
    }
  }

  enum class Flags(
    val value: Int
  ) {
    FLAG_MIPMAPS(1),

    FLAG_REPEAT(2),

    FLAG_FILTER(4),

    DEFAULT(7),

    FLAG_ANISOTROPIC_FILTER(8),

    FLAG_CONVERT_TO_LINEAR(16),

    FLAG_MIRRORED_REPEAT(32),

    FLAG_VIDEO_SURFACE(2048);

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
     * Container for method_bind pointers for Texture
     */
    private object __method_bind {
      val draw: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Texture".cstr.ptr,
            "draw".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method draw" }
        }
      val drawRect: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Texture".cstr.ptr,
            "draw_rect".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method draw_rect" }
        }
      val drawRectRegion: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Texture".cstr.ptr,
            "draw_rect_region".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method draw_rect_region" }
        }
      val getData: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Texture".cstr.ptr,
            "get_data".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_data" }
        }
      val getFlags: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Texture".cstr.ptr,
            "get_flags".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_flags" }
        }
      val getHeight: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Texture".cstr.ptr,
            "get_height".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_height" }
        }
      val getSize: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Texture".cstr.ptr,
            "get_size".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_size" }
        }
      val getWidth: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Texture".cstr.ptr,
            "get_width".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method get_width" }
        }
      val hasAlpha: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Texture".cstr.ptr,
            "has_alpha".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method has_alpha" }
        }
      val setFlags: CPointer<godot_method_bind>
        get() = Allocator.allocationScope {
          val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Texture".cstr.ptr,
            "set_flags".cstr.ptr)
          requireNotNull(ptr) { "No method_bind found for method set_flags" }
        }}
  }
}
