// DO NOT EDIT, THIS FILE IS GENERATED FROM api.json
package godot

import gdnative.godot_method_bind
import gdnative.godot_string
import godot.core.Allocator
import godot.core.Color
import godot.core.Godot
import godot.core.RID
import godot.core.Variant
import godot.core.VariantArray
import godot.core.Vector2
import kotlin.Boolean
import kotlin.Float
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

open class Font(
  @Suppress("UNUSED_PARAMETER")
  __ignore: String?
) : Resource(null) {
  constructor() : this(null) {
    if (Godot.shouldInitHandle()) {
      _handle = __new()
    }
  }

  fun draw(
    canvasItem: RID,
    position: Vector2,
    string: String,
    modulate: Color = Color(1,1,1,1),
    clipW: Int = -1,
    outlineModulate: Color = Color(1,1,1,1)
  ) {
    val self = this
    return Allocator.allocationScope {
      val _args = mutableListOf<Any?>()
      _args.add(canvasItem)
      _args.add(position)
      _args.add(string)
      _args.add(modulate)
      _args.add(clipW)
      _args.add(outlineModulate)
      __method_bind.draw.call(self._handle, _args, null)
    }
  }

  fun drawChar(
    canvasItem: RID,
    position: Vector2,
    char: Int,
    next: Int = -1,
    modulate: Color = Color(1,1,1,1),
    outline: Boolean = false
  ): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      val _args = mutableListOf<Any?>()
      _args.add(canvasItem)
      _args.add(position)
      _args.add(char)
      _args.add(next)
      _args.add(modulate)
      _args.add(outline)
      __method_bind.drawChar.call(self._handle, _args, _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getAscent(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getAscent.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getDescent(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getDescent.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getHeight(): Float {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<DoubleVar>()
      val _retPtr = _ret.ptr
      __method_bind.getHeight.call(self._handle, emptyList(), _retPtr)
      _ret.value.toFloat()
    }
  }

  fun getStringSize(string: String): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      __method_bind.getStringSize.call(self._handle, listOf(string), _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun getWordwrapStringSize(string: String, width: Float): Vector2 {
    val self = this
    return Allocator.allocationScope {
      val _ret = Vector2()
      val _retPtr = _ret._value.ptr
      val _args = mutableListOf<Any?>()
      _args.add(string)
      _args.add(width)
      __method_bind.getWordwrapStringSize.call(self._handle, _args, _retPtr)
      _ret._value = _retPtr.pointed.readValue()
      _ret
    }
  }

  fun hasOutline(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.hasOutline.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun isDistanceFieldHint(): Boolean {
    val self = this
    return Allocator.allocationScope {
      val _ret = alloc<BooleanVar>()
      val _retPtr = _ret.ptr
      __method_bind.isDistanceFieldHint.call(self._handle, emptyList(), _retPtr)
      _ret.value
    }
  }

  fun updateChanges() {
    val self = this
    return Allocator.allocationScope {
      __method_bind.updateChanges.call(self._handle, emptyList(), null)
    }
  }

  companion object {
    /**
     * Container for method_bind pointers for Font
     */
    private object __method_bind {
      val draw: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Font".cstr.ptr,
              "draw".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method draw" }
            }
          }

      val drawChar: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Font".cstr.ptr,
              "draw_char".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method draw_char" }
            }
          }

      val getAscent: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Font".cstr.ptr,
              "get_ascent".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_ascent" }
            }
          }

      val getDescent: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Font".cstr.ptr,
              "get_descent".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_descent" }
            }
          }

      val getHeight: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Font".cstr.ptr,
              "get_height".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_height" }
            }
          }

      val getStringSize: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Font".cstr.ptr,
              "get_string_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_string_size" }
            }
          }

      val getWordwrapStringSize: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Font".cstr.ptr,
              "get_wordwrap_string_size".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method get_wordwrap_string_size" }
            }
          }

      val hasOutline: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Font".cstr.ptr,
              "has_outline".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method has_outline" }
            }
          }

      val isDistanceFieldHint: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Font".cstr.ptr,
              "is_distance_field_hint".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method is_distance_field_hint" }
            }
          }

      val updateChanges: CPointer<godot_method_bind> by lazy {
            Allocator.allocationScope {
              val ptr = checkNotNull(Godot.gdnative.godot_method_bind_get_method)("Font".cstr.ptr,
              "update_changes".cstr.ptr)
              requireNotNull(ptr) { "No method_bind found for method update_changes" }
            }
          }
    }
  }
}
